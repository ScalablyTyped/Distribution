package typings.reactDragtastic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventsIsOver extends js.Object {
  var events: AnonOnMouseEnter
  /** A boolean representing if the user is currently hovering the <Droppable/>. */
  var isOver: Boolean
  /** A boolean representing if this droppable will accept the currently dragging <DragComponent/>. */
  var willAccept: Boolean
}

object AnonEventsIsOver {
  @scala.inline
  def apply(events: AnonOnMouseEnter, isOver: Boolean, willAccept: Boolean): AnonEventsIsOver = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], isOver = isOver.asInstanceOf[js.Any], willAccept = willAccept.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEventsIsOver]
  }
}

