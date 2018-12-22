package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait KeyboardEvent[T]
  extends BaseSyntheticEvent[reactLib.NativeKeyboardEvent, reactLib.EventTarget with T, reactLib.EventTarget] {
  var altKey: scala.Boolean
  var charCode: scala.Double
  var ctrlKey: scala.Boolean
  /**
           * See the [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#named-key-attribute-values). for possible values
           */
  var key: java.lang.String
  var keyCode: scala.Double
  var locale: java.lang.String
  var location: scala.Double
  var metaKey: scala.Boolean
  var repeat: scala.Boolean
  var shiftKey: scala.Boolean
  var which: scala.Double
  /**
           * See [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#keys-modifier). for a list of valid (case-sensitive) arguments to this method.
           */
  def getModifierState(key: java.lang.String): scala.Boolean
}

