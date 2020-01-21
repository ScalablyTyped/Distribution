package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Combine extends js.Object {
  var draggableId: DraggableId
  var droppableId: DroppableId
}

object Combine {
  @scala.inline
  def apply(draggableId: DraggableId, droppableId: DroppableId): Combine = {
    val __obj = js.Dynamic.literal(draggableId = draggableId.asInstanceOf[js.Any], droppableId = droppableId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Combine]
  }
}

