package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Combine extends js.Object {
  
  var draggableId: DraggableId = js.native
  
  var droppableId: DroppableId = js.native
}
object Combine {
  
  @scala.inline
  def apply(draggableId: DraggableId, droppableId: DroppableId): Combine = {
    val __obj = js.Dynamic.literal(draggableId = draggableId.asInstanceOf[js.Any], droppableId = droppableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Combine]
  }
  
  @scala.inline
  implicit class CombineOps[Self <: Combine] (val x: Self) extends AnyVal {
    
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
    def setDraggableId(value: DraggableId): Self = this.set("draggableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDroppableId(value: DroppableId): Self = this.set("droppableId", value.asInstanceOf[js.Any])
  }
}
