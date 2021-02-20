package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DroppableStateSnapshot extends StObject {
  
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
  implicit class DroppableStateSnapshotMutableBuilder[Self <: DroppableStateSnapshot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDraggingFromThisWith(value: DraggableId): Self = StObject.set(x, "draggingFromThisWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggingFromThisWithUndefined: Self = StObject.set(x, "draggingFromThisWith", js.undefined)
    
    @scala.inline
    def setDraggingOverWith(value: DraggableId): Self = StObject.set(x, "draggingOverWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggingOverWithUndefined: Self = StObject.set(x, "draggingOverWith", js.undefined)
    
    @scala.inline
    def setIsDraggingOver(value: Boolean): Self = StObject.set(x, "isDraggingOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUsingPlaceholder(value: Boolean): Self = StObject.set(x, "isUsingPlaceholder", value.asInstanceOf[js.Any])
  }
}
