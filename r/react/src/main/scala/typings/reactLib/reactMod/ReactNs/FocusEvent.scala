package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusEvent[T]
  extends BaseSyntheticEvent[reactLib.NativeFocusEvent, reactLib.EventTarget with T, reactLib.EventTarget] {
  var relatedTarget: reactLib.EventTarget
  @JSName("target")
  var target_FocusEvent: reactLib.EventTarget with T
}

