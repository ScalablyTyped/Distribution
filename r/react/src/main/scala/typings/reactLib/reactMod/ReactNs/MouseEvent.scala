package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MouseEvent[T] extends SyntheticEvent[T] {
  var altKey: scala.Boolean
  var button: scala.Double
  var buttons: scala.Double
  var clientX: scala.Double
  var clientY: scala.Double
  var ctrlKey: scala.Boolean
  var metaKey: scala.Boolean
  var movementX: scala.Double
  var movementY: scala.Double
  @JSName("nativeEvent")
  var nativeEvent_MouseEvent: reactLib.NativeMouseEvent
  var pageX: scala.Double
  var pageY: scala.Double
  var relatedTarget: reactLib.EventTarget
  var screenX: scala.Double
  var screenY: scala.Double
  var shiftKey: scala.Boolean
  /**
           * See [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#keys-modifier). for a list of valid (case-sensitive) arguments to this method.
           */
  def getModifierState(key: java.lang.String): scala.Boolean
}

