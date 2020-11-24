package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DraggableDescriptor extends js.Object {
  
  // Inherited from Droppable
  var droppableId: DroppableId = js.native
  
  var id: DraggableId = js.native
  
  var index: Double = js.native
  
  // This is technically redundant but it avoids
  // needing to look up a parent droppable just to get its type
  var `type`: TypeId = js.native
}
object DraggableDescriptor {
  
  @scala.inline
  def apply(droppableId: DroppableId, id: DraggableId, index: Double, `type`: TypeId): DraggableDescriptor = {
    val __obj = js.Dynamic.literal(droppableId = droppableId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableDescriptor]
  }
  
  @scala.inline
  implicit class DraggableDescriptorOps[Self <: DraggableDescriptor] (val x: Self) extends AnyVal {
    
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
    def setDroppableId(value: DroppableId): Self = this.set("droppableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: DraggableId): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TypeId): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
