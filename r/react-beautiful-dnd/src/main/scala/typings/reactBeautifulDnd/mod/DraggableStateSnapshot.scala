package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DraggableStateSnapshot extends StObject {
  
  // a combine target is being dragged over by
  var combineTargetFor: js.UndefOr[DraggableId] = js.undefined
  
  // the id of a draggable that you are combining with
  var combineWith: js.UndefOr[DraggableId] = js.undefined
  
  var draggingOver: js.UndefOr[DroppableId] = js.undefined
  
  var dropAnimation: js.UndefOr[DropAnimation] = js.undefined
  
  var isDragging: Boolean
  
  var isDropAnimating: Boolean
  
  // What type of movement is being done: 'FLUID' or 'SNAP'
  var mode: js.UndefOr[MovementMode] = js.undefined
}
object DraggableStateSnapshot {
  
  inline def apply(isDragging: Boolean, isDropAnimating: Boolean): DraggableStateSnapshot = {
    val __obj = js.Dynamic.literal(isDragging = isDragging.asInstanceOf[js.Any], isDropAnimating = isDropAnimating.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableStateSnapshot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DraggableStateSnapshot] (val x: Self) extends AnyVal {
    
    inline def setCombineTargetFor(value: DraggableId): Self = StObject.set(x, "combineTargetFor", value.asInstanceOf[js.Any])
    
    inline def setCombineTargetForUndefined: Self = StObject.set(x, "combineTargetFor", js.undefined)
    
    inline def setCombineWith(value: DraggableId): Self = StObject.set(x, "combineWith", value.asInstanceOf[js.Any])
    
    inline def setCombineWithUndefined: Self = StObject.set(x, "combineWith", js.undefined)
    
    inline def setDraggingOver(value: DroppableId): Self = StObject.set(x, "draggingOver", value.asInstanceOf[js.Any])
    
    inline def setDraggingOverUndefined: Self = StObject.set(x, "draggingOver", js.undefined)
    
    inline def setDropAnimation(value: DropAnimation): Self = StObject.set(x, "dropAnimation", value.asInstanceOf[js.Any])
    
    inline def setDropAnimationUndefined: Self = StObject.set(x, "dropAnimation", js.undefined)
    
    inline def setIsDragging(value: Boolean): Self = StObject.set(x, "isDragging", value.asInstanceOf[js.Any])
    
    inline def setIsDropAnimating(value: Boolean): Self = StObject.set(x, "isDropAnimating", value.asInstanceOf[js.Any])
    
    inline def setMode(value: MovementMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
