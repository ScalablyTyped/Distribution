package typings.reactCalendarTimeline.mod

import typings.reactCalendarTimeline.anon.CollisionLeft
import typings.reactCalendarTimeline.anon.X
import typings.reactCalendarTimeline.reactCalendarTimelineStrings.left
import typings.reactCalendarTimeline.reactCalendarTimelineStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemContext extends js.Object {
  
  var canMove: Boolean = js.native
  
  var canResizeLeft: Boolean = js.native
  
  var canResizeRight: Boolean = js.native
  
  var dimensions: CollisionLeft = js.native
  
  var dragGroupDelta: Double = js.native
  
  var dragStart: X = js.native
  
  var dragTime: Double = js.native
  
  var dragging: Boolean = js.native
  
  var resizeEdge: left | right = js.native
  
  var resizeStart: Double = js.native
  
  var resizeTime: Double = js.native
  
  var resizing: Boolean = js.native
  
  var selected: Boolean = js.native
  
  var title: String = js.native
  
  var useResizeHandle: Boolean = js.native
  
  var width: Boolean = js.native
}
object ItemContext {
  
  @scala.inline
  def apply(
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
  implicit class ItemContextOps[Self <: ItemContext] (val x: Self) extends AnyVal {
    
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
    def setCanMove(value: Boolean): Self = this.set("canMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanResizeLeft(value: Boolean): Self = this.set("canResizeLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanResizeRight(value: Boolean): Self = this.set("canResizeRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensions(value: CollisionLeft): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragGroupDelta(value: Double): Self = this.set("dragGroupDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragStart(value: X): Self = this.set("dragStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragTime(value: Double): Self = this.set("dragTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragging(value: Boolean): Self = this.set("dragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeEdge(value: left | right): Self = this.set("resizeEdge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeStart(value: Double): Self = this.set("resizeStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeTime(value: Double): Self = this.set("resizeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizing(value: Boolean): Self = this.set("resizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseResizeHandle(value: Boolean): Self = this.set("useResizeHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Boolean): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
