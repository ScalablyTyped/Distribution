package typings.reactDashDragtastic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventsIsOver extends js.Object {
  var events: Anon_OnMouseEnter
  /** A boolean representing if the user is currently hovering the <Droppable/>. */
  var isOver: Boolean
  /** A boolean representing if this droppable will accept the currently dragging <DragComponent/>. */
  var willAccept: Boolean
}

object Anon_EventsIsOver {
  @scala.inline
  def apply(events: Anon_OnMouseEnter, isOver: Boolean, willAccept: Boolean): Anon_EventsIsOver = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], isOver = isOver.asInstanceOf[js.Any], willAccept = willAccept.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EventsIsOver]
  }
}

