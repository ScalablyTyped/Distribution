package typings.soundjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventObjHandleEvent extends js.Object {
  def handleEvent(eventObj: js.Object): Unit
}

object AnonEventObjHandleEvent {
  @scala.inline
  def apply(handleEvent: js.Object => Unit): AnonEventObjHandleEvent = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
  
    __obj.asInstanceOf[AnonEventObjHandleEvent]
  }
}

