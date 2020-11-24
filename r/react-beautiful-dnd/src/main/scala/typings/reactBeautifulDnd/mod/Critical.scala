package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Critical extends js.Object {
  
  var draggable: DraggableDescriptor = js.native
  
  var droppable: DroppableDescriptor = js.native
}
object Critical {
  
  @scala.inline
  def apply(draggable: DraggableDescriptor, droppable: DroppableDescriptor): Critical = {
    val __obj = js.Dynamic.literal(draggable = draggable.asInstanceOf[js.Any], droppable = droppable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Critical]
  }
  
  @scala.inline
  implicit class CriticalOps[Self <: Critical] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDraggable(value: DraggableDescriptor): Self = this.set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDroppable(value: DroppableDescriptor): Self = this.set("droppable", value.asInstanceOf[js.Any])
  }
}
