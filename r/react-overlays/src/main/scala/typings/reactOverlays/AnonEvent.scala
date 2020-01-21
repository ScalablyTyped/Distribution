package typings.reactOverlays

import typings.react.mod.SyntheticEvent
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEvent extends js.Object {
  def onKeyDown(event: SyntheticEvent[_, Event_]): Unit
}

object AnonEvent {
  @scala.inline
  def apply(onKeyDown: SyntheticEvent[_, Event_] => Unit): AnonEvent = {
    val __obj = js.Dynamic.literal(onKeyDown = js.Any.fromFunction1(onKeyDown))
  
    __obj.asInstanceOf[AnonEvent]
  }
}

