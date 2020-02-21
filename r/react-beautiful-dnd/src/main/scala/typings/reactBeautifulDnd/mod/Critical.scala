package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Critical extends js.Object {
  var draggable: DraggableDescriptor
  var droppable: DroppableDescriptor
}

object Critical {
  @scala.inline
  def apply(draggable: DraggableDescriptor, droppable: DroppableDescriptor): Critical = {
    val __obj = js.Dynamic.literal(draggable = draggable.asInstanceOf[js.Any], droppable = droppable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Critical]
  }
}

