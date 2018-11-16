package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FocusEvent[T] extends SyntheticEvent[T] {
  @JSName("nativeEvent")
  var nativeEvent_FocusEvent: reactLib.NativeFocusEvent
  var relatedTarget: reactLib.EventTarget
  @JSName("target")
  var target_FocusEvent: reactLib.EventTarget with T
}

