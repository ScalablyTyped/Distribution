package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DraggableStateSnapshot extends StObject {
  
  // a combine target is being dragged over by
  var combineTargetFor: js.UndefOr[DraggableId | Null] = js.undefined
  
  // the id of a draggable that you are combining with
  var combineWith: js.UndefOr[DraggableId | Null] = js.undefined
  
  var draggingOver: js.UndefOr[DroppableId | Null] = js.undefined
  
  var dropAnimation: js.UndefOr[DropAnimation | Null] = js.undefined
  
  var isClone: Boolean
  
  var isDragging: Boolean
  
  var isDropAnimating: Boolean
  
  // What type of movement is being done: 'FLUID' or 'SNAP'
  var mode: js.UndefOr[MovementMode | Null] = js.undefined
}
object DraggableStateSnapshot {
  
  inline def apply(isClone: Boolean, isDragging: Boolean, isDropAnimating: Boolean): DraggableStateSnapshot = {
    val __obj = js.Dynamic.literal(isClone = isClone.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], isDropAnimating = isDropAnimating.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableStateSnapshot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DraggableStateSnapshot] (val x: Self) extends AnyVal {
    
    inline def setCombineTargetFor(value: DraggableId): Self = StObject.set(x, "combineTargetFor", value.asInstanceOf[js.Any])
    
    inline def setCombineTargetForNull: Self = StObject.set(x, "combineTargetFor", null)
    
    inline def setCombineTargetForUndefined: Self = StObject.set(x, "combineTargetFor", js.undefined)
    
    inline def setCombineWith(value: DraggableId): Self = StObject.set(x, "combineWith", value.asInstanceOf[js.Any])
    
    inline def setCombineWithNull: Self = StObject.set(x, "combineWith", null)
    
    inline def setCombineWithUndefined: Self = StObject.set(x, "combineWith", js.undefined)
    
    inline def setDraggingOver(value: DroppableId): Self = StObject.set(x, "draggingOver", value.asInstanceOf[js.Any])
    
    inline def setDraggingOverNull: Self = StObject.set(x, "draggingOver", null)
    
    inline def setDraggingOverUndefined: Self = StObject.set(x, "draggingOver", js.undefined)
    
    inline def setDropAnimation(value: DropAnimation): Self = StObject.set(x, "dropAnimation", value.asInstanceOf[js.Any])
    
    inline def setDropAnimationNull: Self = StObject.set(x, "dropAnimation", null)
    
    inline def setDropAnimationUndefined: Self = StObject.set(x, "dropAnimation", js.undefined)
    
    inline def setIsClone(value: Boolean): Self = StObject.set(x, "isClone", value.asInstanceOf[js.Any])
    
    inline def setIsDragging(value: Boolean): Self = StObject.set(x, "isDragging", value.asInstanceOf[js.Any])
    
    inline def setIsDropAnimating(value: Boolean): Self = StObject.set(x, "isDropAnimating", value.asInstanceOf[js.Any])
    
    inline def setMode(value: MovementMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeNull: Self = StObject.set(x, "mode", null)
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
