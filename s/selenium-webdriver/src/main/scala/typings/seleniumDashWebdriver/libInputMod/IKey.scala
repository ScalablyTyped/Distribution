package typings.seleniumDashWebdriver.libInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKey extends js.Object {
  var ADD: String
  var ALT: String
  var ARROW_DOWN: String
  var ARROW_LEFT: String
  var ARROW_RIGHT: String
  var ARROW_UP: String
  var BACK_SPACE: String
  var CANCEL: String
  var CLEAR: String
  var COMMAND: String
  var CONTROL: String
  var DECIMAL: String
  var DELETE: String
  var DIVIDE: String
  var DOWN: String
  var END: String
  var ENTER: String
  var EQUALS: String
  var ESCAPE: String
  var F1: String
  var F10: String
  var F11: String
  var F12: String
    // function keys
  var F2: String
  var F3: String
  var F4: String
  var F5: String
  var F6: String
  var F7: String
  var F8: String
  var F9: String
    // ^break
  var HELP: String
  var HOME: String
  var INSERT: String
  var LEFT: String
    // Apple command key
  var META: String
  var MULTIPLY: String
  var NULL: String
  var NUMPAD0: String
    // number pad keys
  var NUMPAD1: String
  var NUMPAD2: String
  var NUMPAD3: String
  var NUMPAD4: String
  var NUMPAD5: String
  var NUMPAD6: String
  var NUMPAD7: String
  var NUMPAD8: String
  var NUMPAD9: String
  var PAGE_DOWN: String
  var PAGE_UP: String
  var PAUSE: String
  var RETURN: String
  var RIGHT: String
  var SEMICOLON: String
  var SEPARATOR: String
  var SHIFT: String
  var SPACE: String
  var SUBTRACT: String
  var TAB: String
  var UP: String
       // alias for Windows key
  /**
    * Simulate pressing many keys at once in a 'chord'. Takes a sequence of
    * keys or strings, appends each of the values to a string,
    * and adds the chord termination key ({@link Key.NULL}) and returns
    * the resulting string.
    *
    * Note: when the low-level webdriver key handlers see Keys.NULL, active
    * modifier keys (CTRL/ALT/SHIFT/etc) release via a keyup event.
    *
    * @param {...string} var_args The key sequence to concatenate.
    * @return {string} The null-terminated key sequence.
    */
  def chord(var_args: (String | IKey)*): String
}

object IKey {
  @scala.inline
  def apply(
    ADD: String,
    ALT: String,
    ARROW_DOWN: String,
    ARROW_LEFT: String,
    ARROW_RIGHT: String,
    ARROW_UP: String,
    BACK_SPACE: String,
    CANCEL: String,
    CLEAR: String,
    COMMAND: String,
    CONTROL: String,
    DECIMAL: String,
    DELETE: String,
    DIVIDE: String,
    DOWN: String,
    END: String,
    ENTER: String,
    EQUALS: String,
    ESCAPE: String,
    F1: String,
    F10: String,
    F11: String,
    F12: String,
    F2: String,
    F3: String,
    F4: String,
    F5: String,
    F6: String,
    F7: String,
    F8: String,
    F9: String,
    HELP: String,
    HOME: String,
    INSERT: String,
    LEFT: String,
    META: String,
    MULTIPLY: String,
    NULL: String,
    NUMPAD0: String,
    NUMPAD1: String,
    NUMPAD2: String,
    NUMPAD3: String,
    NUMPAD4: String,
    NUMPAD5: String,
    NUMPAD6: String,
    NUMPAD7: String,
    NUMPAD8: String,
    NUMPAD9: String,
    PAGE_DOWN: String,
    PAGE_UP: String,
    PAUSE: String,
    RETURN: String,
    RIGHT: String,
    SEMICOLON: String,
    SEPARATOR: String,
    SHIFT: String,
    SPACE: String,
    SUBTRACT: String,
    TAB: String,
    UP: String,
    chord: /* repeated */ String | IKey => String
  ): IKey = {
    val __obj = js.Dynamic.literal(ADD = ADD, ALT = ALT, ARROW_DOWN = ARROW_DOWN, ARROW_LEFT = ARROW_LEFT, ARROW_RIGHT = ARROW_RIGHT, ARROW_UP = ARROW_UP, BACK_SPACE = BACK_SPACE, CANCEL = CANCEL, CLEAR = CLEAR, COMMAND = COMMAND, CONTROL = CONTROL, DECIMAL = DECIMAL, DELETE = DELETE, DIVIDE = DIVIDE, DOWN = DOWN, END = END, ENTER = ENTER, EQUALS = EQUALS, ESCAPE = ESCAPE, F1 = F1, F10 = F10, F11 = F11, F12 = F12, F2 = F2, F3 = F3, F4 = F4, F5 = F5, F6 = F6, F7 = F7, F8 = F8, F9 = F9, HELP = HELP, HOME = HOME, INSERT = INSERT, LEFT = LEFT, META = META, MULTIPLY = MULTIPLY, NULL = NULL, NUMPAD0 = NUMPAD0, NUMPAD1 = NUMPAD1, NUMPAD2 = NUMPAD2, NUMPAD3 = NUMPAD3, NUMPAD4 = NUMPAD4, NUMPAD5 = NUMPAD5, NUMPAD6 = NUMPAD6, NUMPAD7 = NUMPAD7, NUMPAD8 = NUMPAD8, NUMPAD9 = NUMPAD9, PAGE_DOWN = PAGE_DOWN, PAGE_UP = PAGE_UP, PAUSE = PAUSE, RETURN = RETURN, RIGHT = RIGHT, SEMICOLON = SEMICOLON, SEPARATOR = SEPARATOR, SHIFT = SHIFT, SPACE = SPACE, SUBTRACT = SUBTRACT, TAB = TAB, UP = UP, chord = js.Any.fromFunction1(chord))
  
    __obj.asInstanceOf[IKey]
  }
}

