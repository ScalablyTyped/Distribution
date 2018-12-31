package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidEvent[T]
  extends BaseSyntheticEvent[reactLib.Event, reactLib.EventTarget with T, reactLib.EventTarget] {
  @JSName("target")
  var target_InvalidEvent: reactLib.EventTarget with T
}

