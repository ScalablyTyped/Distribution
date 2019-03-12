package typings
package seleniumDashWebdriverLib.seleniumDashWebdriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKey extends js.Object {
  var ADD: java.lang.String
  var ALT: java.lang.String
  var ARROW_DOWN: java.lang.String
  var ARROW_LEFT: java.lang.String
  var ARROW_RIGHT: java.lang.String
  var ARROW_UP: java.lang.String
  var BACK_SPACE: java.lang.String
  var CANCEL: java.lang.String
  var CLEAR: java.lang.String
  var COMMAND: java.lang.String
  var CONTROL: java.lang.String
  var DECIMAL: java.lang.String
  var DELETE: java.lang.String
  var DIVIDE: java.lang.String
  var DOWN: java.lang.String
  var END: java.lang.String
  var ENTER: java.lang.String
  var EQUALS: java.lang.String
  var ESCAPE: java.lang.String
  var F1: java.lang.String
  var F10: java.lang.String
  var F11: java.lang.String
  var F12: java.lang.String
    // function keys
  var F2: java.lang.String
  var F3: java.lang.String
  var F4: java.lang.String
  var F5: java.lang.String
  var F6: java.lang.String
  var F7: java.lang.String
  var F8: java.lang.String
  var F9: java.lang.String
    // ^break
  var HELP: java.lang.String
  var HOME: java.lang.String
  var INSERT: java.lang.String
  var LEFT: java.lang.String
    // Apple command key
  var META: java.lang.String
  var MULTIPLY: java.lang.String
  var NULL: java.lang.String
  var NUMPAD0: java.lang.String
    // number pad keys
  var NUMPAD1: java.lang.String
  var NUMPAD2: java.lang.String
  var NUMPAD3: java.lang.String
  var NUMPAD4: java.lang.String
  var NUMPAD5: java.lang.String
  var NUMPAD6: java.lang.String
  var NUMPAD7: java.lang.String
  var NUMPAD8: java.lang.String
  var NUMPAD9: java.lang.String
  var PAGE_DOWN: java.lang.String
  var PAGE_UP: java.lang.String
  var PAUSE: java.lang.String
  var RETURN: java.lang.String
  var RIGHT: java.lang.String
  var SEMICOLON: java.lang.String
  var SEPARATOR: java.lang.String
  var SHIFT: java.lang.String
  var SPACE: java.lang.String
  var SUBTRACT: java.lang.String
  var TAB: java.lang.String
  var UP: java.lang.String
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
  def chord(var_args: (java.lang.String | IKey)*): java.lang.String
}

object IKey {
  @scala.inline
  def apply(
    ADD: java.lang.String,
    ALT: java.lang.String,
    ARROW_DOWN: java.lang.String,
    ARROW_LEFT: java.lang.String,
    ARROW_RIGHT: java.lang.String,
    ARROW_UP: java.lang.String,
    BACK_SPACE: java.lang.String,
    CANCEL: java.lang.String,
    CLEAR: java.lang.String,
    COMMAND: java.lang.String,
    CONTROL: java.lang.String,
    DECIMAL: java.lang.String,
    DELETE: java.lang.String,
    DIVIDE: java.lang.String,
    DOWN: java.lang.String,
    END: java.lang.String,
    ENTER: java.lang.String,
    EQUALS: java.lang.String,
    ESCAPE: java.lang.String,
    F1: java.lang.String,
    F10: java.lang.String,
    F11: java.lang.String,
    F12: java.lang.String,
    F2: java.lang.String,
    F3: java.lang.String,
    F4: java.lang.String,
    F5: java.lang.String,
    F6: java.lang.String,
    F7: java.lang.String,
    F8: java.lang.String,
    F9: java.lang.String,
    HELP: java.lang.String,
    HOME: java.lang.String,
    INSERT: java.lang.String,
    LEFT: java.lang.String,
    META: java.lang.String,
    MULTIPLY: java.lang.String,
    NULL: java.lang.String,
    NUMPAD0: java.lang.String,
    NUMPAD1: java.lang.String,
    NUMPAD2: java.lang.String,
    NUMPAD3: java.lang.String,
    NUMPAD4: java.lang.String,
    NUMPAD5: java.lang.String,
    NUMPAD6: java.lang.String,
    NUMPAD7: java.lang.String,
    NUMPAD8: java.lang.String,
    NUMPAD9: java.lang.String,
    PAGE_DOWN: java.lang.String,
    PAGE_UP: java.lang.String,
    PAUSE: java.lang.String,
    RETURN: java.lang.String,
    RIGHT: java.lang.String,
    SEMICOLON: java.lang.String,
    SEPARATOR: java.lang.String,
    SHIFT: java.lang.String,
    SPACE: java.lang.String,
    SUBTRACT: java.lang.String,
    TAB: java.lang.String,
    UP: java.lang.String,
    chord: /* repeated */ java.lang.String | IKey => java.lang.String
  ): IKey = {
    val __obj = js.Dynamic.literal(ADD = ADD, ALT = ALT, ARROW_DOWN = ARROW_DOWN, ARROW_LEFT = ARROW_LEFT, ARROW_RIGHT = ARROW_RIGHT, ARROW_UP = ARROW_UP, BACK_SPACE = BACK_SPACE, CANCEL = CANCEL, CLEAR = CLEAR, COMMAND = COMMAND, CONTROL = CONTROL, DECIMAL = DECIMAL, DELETE = DELETE, DIVIDE = DIVIDE, DOWN = DOWN, END = END, ENTER = ENTER, EQUALS = EQUALS, ESCAPE = ESCAPE, F1 = F1, F10 = F10, F11 = F11, F12 = F12, F2 = F2, F3 = F3, F4 = F4, F5 = F5, F6 = F6, F7 = F7, F8 = F8, F9 = F9, HELP = HELP, HOME = HOME, INSERT = INSERT, LEFT = LEFT, META = META, MULTIPLY = MULTIPLY, NULL = NULL, NUMPAD0 = NUMPAD0, NUMPAD1 = NUMPAD1, NUMPAD2 = NUMPAD2, NUMPAD3 = NUMPAD3, NUMPAD4 = NUMPAD4, NUMPAD5 = NUMPAD5, NUMPAD6 = NUMPAD6, NUMPAD7 = NUMPAD7, NUMPAD8 = NUMPAD8, NUMPAD9 = NUMPAD9, PAGE_DOWN = PAGE_DOWN, PAGE_UP = PAGE_UP, PAUSE = PAUSE, RETURN = RETURN, RIGHT = RIGHT, SEMICOLON = SEMICOLON, SEPARATOR = SEPARATOR, SHIFT = SHIFT, SPACE = SPACE, SUBTRACT = SUBTRACT, TAB = TAB, UP = UP, chord = js.Any.fromFunction1(chord))
  
    __obj.asInstanceOf[IKey]
  }
}

