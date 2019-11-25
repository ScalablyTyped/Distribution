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
    val __obj = js.Dynamic.literal(ADD = ADD.asInstanceOf[js.Any], ALT = ALT.asInstanceOf[js.Any], ARROW_DOWN = ARROW_DOWN.asInstanceOf[js.Any], ARROW_LEFT = ARROW_LEFT.asInstanceOf[js.Any], ARROW_RIGHT = ARROW_RIGHT.asInstanceOf[js.Any], ARROW_UP = ARROW_UP.asInstanceOf[js.Any], BACK_SPACE = BACK_SPACE.asInstanceOf[js.Any], CANCEL = CANCEL.asInstanceOf[js.Any], CLEAR = CLEAR.asInstanceOf[js.Any], COMMAND = COMMAND.asInstanceOf[js.Any], CONTROL = CONTROL.asInstanceOf[js.Any], DECIMAL = DECIMAL.asInstanceOf[js.Any], DELETE = DELETE.asInstanceOf[js.Any], DIVIDE = DIVIDE.asInstanceOf[js.Any], DOWN = DOWN.asInstanceOf[js.Any], END = END.asInstanceOf[js.Any], ENTER = ENTER.asInstanceOf[js.Any], EQUALS = EQUALS.asInstanceOf[js.Any], ESCAPE = ESCAPE.asInstanceOf[js.Any], F1 = F1.asInstanceOf[js.Any], F10 = F10.asInstanceOf[js.Any], F11 = F11.asInstanceOf[js.Any], F12 = F12.asInstanceOf[js.Any], F2 = F2.asInstanceOf[js.Any], F3 = F3.asInstanceOf[js.Any], F4 = F4.asInstanceOf[js.Any], F5 = F5.asInstanceOf[js.Any], F6 = F6.asInstanceOf[js.Any], F7 = F7.asInstanceOf[js.Any], F8 = F8.asInstanceOf[js.Any], F9 = F9.asInstanceOf[js.Any], HELP = HELP.asInstanceOf[js.Any], HOME = HOME.asInstanceOf[js.Any], INSERT = INSERT.asInstanceOf[js.Any], LEFT = LEFT.asInstanceOf[js.Any], META = META.asInstanceOf[js.Any], MULTIPLY = MULTIPLY.asInstanceOf[js.Any], NULL = NULL.asInstanceOf[js.Any], NUMPAD0 = NUMPAD0.asInstanceOf[js.Any], NUMPAD1 = NUMPAD1.asInstanceOf[js.Any], NUMPAD2 = NUMPAD2.asInstanceOf[js.Any], NUMPAD3 = NUMPAD3.asInstanceOf[js.Any], NUMPAD4 = NUMPAD4.asInstanceOf[js.Any], NUMPAD5 = NUMPAD5.asInstanceOf[js.Any], NUMPAD6 = NUMPAD6.asInstanceOf[js.Any], NUMPAD7 = NUMPAD7.asInstanceOf[js.Any], NUMPAD8 = NUMPAD8.asInstanceOf[js.Any], NUMPAD9 = NUMPAD9.asInstanceOf[js.Any], PAGE_DOWN = PAGE_DOWN.asInstanceOf[js.Any], PAGE_UP = PAGE_UP.asInstanceOf[js.Any], PAUSE = PAUSE.asInstanceOf[js.Any], RETURN = RETURN.asInstanceOf[js.Any], RIGHT = RIGHT.asInstanceOf[js.Any], SEMICOLON = SEMICOLON.asInstanceOf[js.Any], SEPARATOR = SEPARATOR.asInstanceOf[js.Any], SHIFT = SHIFT.asInstanceOf[js.Any], SPACE = SPACE.asInstanceOf[js.Any], SUBTRACT = SUBTRACT.asInstanceOf[js.Any], TAB = TAB.asInstanceOf[js.Any], UP = UP.asInstanceOf[js.Any], chord = js.Any.fromFunction1(chord))
  
    __obj.asInstanceOf[IKey]
  }
}

