package typings.reactBeautifulDnd.mod

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
    val __obj = js.Dynamic.literal(droppableId = droppableId.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DraggableLocation]
  }
}

