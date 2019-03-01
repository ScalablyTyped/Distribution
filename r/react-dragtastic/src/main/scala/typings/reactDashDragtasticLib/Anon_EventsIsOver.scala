package typings
package reactDashDragtasticLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventsIsOver extends js.Object {
  var events: Anon_OnMouseEnter
  /** A boolean representing if the user is currently hovering the <Droppable/>. */
  var isOver: scala.Boolean
  /** A boolean representing if this droppable will accept the currently dragging <DragComponent/>. */
  var willAccept: scala.Boolean
}

object Anon_EventsIsOver {
  @scala.inline
  def apply(events: Anon_OnMouseEnter, isOver: scala.Boolean, willAccept: scala.Boolean): Anon_EventsIsOver = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("events")(events)
    __obj.updateDynamic("isOver")(isOver)
    __obj.updateDynamic("willAccept")(willAccept)
    __obj.asInstanceOf[Anon_EventsIsOver]
  }
}

