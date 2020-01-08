package edu.neu.madcourse.numad20s_xiaojinhe;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private final static Random RANDOM = new Random();

    /** Display name and email when About button is clicked. */
    public void displayNameAndEmail(View view) {
        TextView textView = findViewById(R.id.aboutView);
        textView.setText(R.string.name_and_email);
    }

    /** Generate and display a random number in the given range when Generate button is clicked. */
    public void generateRandomNum(View view) {
        EditText numberRange = findViewById(R.id.numberText);
        TextView textView = findViewById(R.id.textView);
        if (numberRange.getText().toString().isEmpty()) {
            textView.setText(R.string.welcome_string);
        } else {
            int upperLimit = Integer.valueOf(numberRange.getText().toString());
            textView.setText(getString(R.string.random_number, RANDOM.nextInt(upperLimit)));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
