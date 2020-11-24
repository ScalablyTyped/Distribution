package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DroppableStateSnapshot extends js.Object {
  
  var draggingFromThisWith: js.UndefOr[DraggableId] = js.native
  
  var draggingOverWith: js.UndefOr[DraggableId] = js.native
  
  var isDraggingOver: Boolean = js.native
  
  var isUsingPlaceholder: Boolean = js.native
}
object DroppableStateSnapshot {
  
  @scala.inline
  def apply(isDraggingOver: Boolean, isUsingPlaceholder: Boolean): DroppableStateSnapshot = {
    val __obj = js.Dynamic.literal(isDraggingOver = isDraggingOver.asInstanceOf[js.Any], isUsingPlaceholder = isUsingPlaceholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[DroppableStateSnapshot]
  }
  
  @scala.inline
  implicit class DroppableStateSnapshotOps[Self <: DroppableStateSnapshot] (val x: Self) extends AnyVal {
    
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
    def setIsDraggingOver(value: Boolean): Self = this.set("isDraggingOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUsingPlaceholder(value: Boolean): Self = this.set("isUsingPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggingFromThisWith(value: DraggableId): Self = this.set("draggingFromThisWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggingFromThisWith: Self = this.set("draggingFromThisWith", js.undefined)
    
    @scala.inline
    def setDraggingOverWith(value: DraggableId): Self = this.set("draggingOverWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggingOverWith: Self = this.set("draggingOverWith", js.undefined)
  }
}
