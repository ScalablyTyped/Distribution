package typings
package reactDashOverlaysLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Event extends js.Object {
  def onKeyDown(event: reactLib.reactMod.SyntheticEvent[_, reactLib.Event]): scala.Unit
}

object Anon_Event {
  @scala.inline
  def apply(onKeyDown: reactLib.reactMod.SyntheticEvent[_, reactLib.Event] => scala.Unit): Anon_Event = {
    val __obj = js.Dynamic.literal(onKeyDown = js.Any.fromFunction1(onKeyDown))
  
    __obj.asInstanceOf[Anon_Event]
  }
}

