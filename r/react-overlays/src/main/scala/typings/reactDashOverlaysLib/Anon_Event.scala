package typings
package reactDashOverlaysLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Event extends js.Object {
  def onKeyDown(event: reactLib.reactMod.ReactNs.SyntheticEvent[_, reactLib.Event]): scala.Unit
}

object Anon_Event {
  @scala.inline
  def apply(onKeyDown: js.Function1[reactLib.reactMod.ReactNs.SyntheticEvent[_, reactLib.Event], scala.Unit]): Anon_Event = {
    val __obj = js.Dynamic.literal(onKeyDown = onKeyDown)
  
    __obj.asInstanceOf[Anon_Event]
  }
}

