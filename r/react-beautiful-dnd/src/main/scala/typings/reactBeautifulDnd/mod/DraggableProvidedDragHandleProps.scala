package typings.reactBeautifulDnd.mod

import typings.react.mod.DragEvent
import typings.react.mod.DragEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DraggableProvidedDragHandleProps extends StObject {
  
  var `aria-describedby`: ElementId
  
  var `data-rbd-drag-handle-context-id`: ContextId
  
  var `data-rbd-drag-handle-draggable-id`: DraggableId
  
  var draggable: Boolean
  
  var onDragStart: DragEventHandler[Any]
  
  var role: String
  
  var tabIndex: Double
}
object DraggableProvidedDragHandleProps {
  
  inline def apply(
    `aria-describedby`: ElementId,
    `data-rbd-drag-handle-context-id`: ContextId,
    `data-rbd-drag-handle-draggable-id`: DraggableId,
    draggable: Boolean,
    onDragStart: DragEvent[Any] => Unit,
    role: String,
    tabIndex: Double
  ): DraggableProvidedDragHandleProps = {
    val __obj = js.Dynamic.literal(draggable = draggable.asInstanceOf[js.Any], onDragStart = js.Any.fromFunction1(onDragStart), role = role.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    __obj.updateDynamic("data-rbd-drag-handle-context-id")(`data-rbd-drag-handle-context-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("data-rbd-drag-handle-draggable-id")(`data-rbd-drag-handle-draggable-id`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableProvidedDragHandleProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DraggableProvidedDragHandleProps] (val x: Self) extends AnyVal {
    
    inline def `setAria-describedby`(value: ElementId): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `setData-rbd-drag-handle-context-id`(value: ContextId): Self = StObject.set(x, "data-rbd-drag-handle-context-id", value.asInstanceOf[js.Any])
    
    inline def `setData-rbd-drag-handle-draggable-id`(value: DraggableId): Self = StObject.set(x, "data-rbd-drag-handle-draggable-id", value.asInstanceOf[js.Any])
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setOnDragStart(value: DragEvent[Any] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
  }
}
