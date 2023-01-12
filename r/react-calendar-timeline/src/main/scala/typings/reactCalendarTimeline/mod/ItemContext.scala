package typings.reactCalendarTimeline.mod

import typings.reactCalendarTimeline.anon.CollisionLeft
import typings.reactCalendarTimeline.anon.X
import typings.reactCalendarTimeline.reactCalendarTimelineStrings.left
import typings.reactCalendarTimeline.reactCalendarTimelineStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemContext extends StObject {
  
  var canMove: Boolean
  
  var canResizeLeft: Boolean
  
  var canResizeRight: Boolean
  
  var dimensions: CollisionLeft
  
  var dragGroupDelta: Double
  
  var dragStart: X
  
  var dragTime: Double
  
  var dragging: Boolean
  
  var resizeEdge: left | right
  
  var resizeStart: Double
  
  var resizeTime: Double
  
  var resizing: Boolean
  
  var selected: Boolean
  
  var title: String
  
  var useResizeHandle: Boolean
  
  var width: Boolean
}
object ItemContext {
  
  inline def apply(
    canMove: Boolean,
    canResizeLeft: Boolean,
    canResizeRight: Boolean,
    dimensions: CollisionLeft,
    dragGroupDelta: Double,
    dragStart: X,
    dragTime: Double,
    dragging: Boolean,
    resizeEdge: left | right,
    resizeStart: Double,
    resizeTime: Double,
    resizing: Boolean,
    selected: Boolean,
    title: String,
    useResizeHandle: Boolean,
    width: Boolean
  ): ItemContext = {
    val __obj = js.Dynamic.literal(canMove = canMove.asInstanceOf[js.Any], canResizeLeft = canResizeLeft.asInstanceOf[js.Any], canResizeRight = canResizeRight.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], dragGroupDelta = dragGroupDelta.asInstanceOf[js.Any], dragStart = dragStart.asInstanceOf[js.Any], dragTime = dragTime.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], resizeEdge = resizeEdge.asInstanceOf[js.Any], resizeStart = resizeStart.asInstanceOf[js.Any], resizeTime = resizeTime.asInstanceOf[js.Any], resizing = resizing.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], useResizeHandle = useResizeHandle.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemContext] (val x: Self) extends AnyVal {
    
    inline def setCanMove(value: Boolean): Self = StObject.set(x, "canMove", value.asInstanceOf[js.Any])
    
    inline def setCanResizeLeft(value: Boolean): Self = StObject.set(x, "canResizeLeft", value.asInstanceOf[js.Any])
    
    inline def setCanResizeRight(value: Boolean): Self = StObject.set(x, "canResizeRight", value.asInstanceOf[js.Any])
    
    inline def setDimensions(value: CollisionLeft): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDragGroupDelta(value: Double): Self = StObject.set(x, "dragGroupDelta", value.asInstanceOf[js.Any])
    
    inline def setDragStart(value: X): Self = StObject.set(x, "dragStart", value.asInstanceOf[js.Any])
    
    inline def setDragTime(value: Double): Self = StObject.set(x, "dragTime", value.asInstanceOf[js.Any])
    
    inline def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
    
    inline def setResizeEdge(value: left | right): Self = StObject.set(x, "resizeEdge", value.asInstanceOf[js.Any])
    
    inline def setResizeStart(value: Double): Self = StObject.set(x, "resizeStart", value.asInstanceOf[js.Any])
    
    inline def setResizeTime(value: Double): Self = StObject.set(x, "resizeTime", value.asInstanceOf[js.Any])
    
    inline def setResizing(value: Boolean): Self = StObject.set(x, "resizing", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUseResizeHandle(value: Boolean): Self = StObject.set(x, "useResizeHandle", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Boolean): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
