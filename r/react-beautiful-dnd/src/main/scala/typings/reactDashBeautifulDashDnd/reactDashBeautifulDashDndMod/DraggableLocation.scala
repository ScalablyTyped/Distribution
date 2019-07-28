package typings.reactDashBeautifulDashDnd.reactDashBeautifulDashDndMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableLocation extends js.Object {
  var droppableId: DroppableId
  var index: Double
}

object DraggableLocation {
  @scala.inline
  def apply(droppableId: DroppableId, index: Double): DraggableLocation = {
    val __obj = js.Dynamic.literal(droppableId = droppableId, index = index)
  
    __obj.asInstanceOf[DraggableLocation]
  }
}

