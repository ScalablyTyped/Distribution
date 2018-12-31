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

