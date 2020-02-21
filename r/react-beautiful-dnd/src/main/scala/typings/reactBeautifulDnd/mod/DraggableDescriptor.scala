package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableDescriptor extends js.Object {
  // Inherited from Droppable
  var droppableId: DroppableId
  var id: DraggableId
  var index: Double
  // This is technically redundant but it avoids
  // needing to look up a parent droppable just to get its type
  var `type`: TypeId
}

object DraggableDescriptor {
  @scala.inline
  def apply(droppableId: DroppableId, id: DraggableId, index: Double, `type`: TypeId): DraggableDescriptor = {
    val __obj = js.Dynamic.literal(droppableId = droppableId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableDescriptor]
  }
}

