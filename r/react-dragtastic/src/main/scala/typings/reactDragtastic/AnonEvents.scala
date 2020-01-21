package typings.reactDragtastic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEvents extends js.Object {
  var events: AnonOnMouseDown
  /** A boolean representing if the draggable is currently active. */
  var isActive: Boolean
}

object AnonEvents {
  @scala.inline
  def apply(events: AnonOnMouseDown, isActive: Boolean): AnonEvents = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEvents]
  }
}

