package typings.reactDragtastic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsOverAccepted extends js.Object {
  /** A boolean representing whether the user is currently hovering a <Droppable/> that accepts the type of the currently active <Draggable/> */
  var isOverAccepted: Boolean
}

object AnonIsOverAccepted {
  @scala.inline
  def apply(isOverAccepted: Boolean): AnonIsOverAccepted = {
    val __obj = js.Dynamic.literal(isOverAccepted = isOverAccepted.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIsOverAccepted]
  }
}

