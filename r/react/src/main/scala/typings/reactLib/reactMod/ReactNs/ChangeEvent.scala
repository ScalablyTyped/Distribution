package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ChangeEvent[T]
  extends BaseSyntheticEvent[reactLib.Event, reactLib.EventTarget with T, reactLib.EventTarget] {
  @JSName("target")
  var target_ChangeEvent: reactLib.EventTarget with T
}

