package typings.reactGridLayout.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.reactGridLayout.anon.H
import typings.reactGridLayout.reactGridLayoutStrings.horizontal
import typings.reactGridLayout.reactGridLayoutStrings.vertical
import typings.std.Event
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoreProps extends js.Object {
  
  /**
    * If true, the container height swells and contracts to fit contents.
    */
  var autoSize: js.UndefOr[Boolean] = js.native
  
  /**
    * The classname to add to the root element.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * Compaction type.
    */
  var compactType: js.UndefOr[vertical | horizontal | Null] = js.native
  
  /**
    * A CSS selector for tags that will not be draggable.
    *
    * For example: `draggableCancel: '.MyNonDraggableAreaClassName'`
    *
    * If you forget the leading. it will not work.
    */
  var draggableCancel: js.UndefOr[String] = js.native
  
  /**
    * A CSS selector for tags that will act as the draggable handle.
    *
    * For example: `draggableHandle: '.MyDragHandleClassName'`
    *
    * If you forget the leading . it will not work.
    */
  var draggableHandle: js.UndefOr[String] = js.native
  
  /**
    * Configuration of a dropping element. Dropping element is a "virtual" element
    * which appears when you drag over some element from outside.
    */
  var droppingItem: js.UndefOr[H] = js.native
  
  /**
    * If true and draggable, all items will be moved only within grid.
    */
  var isBounded: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to false it will disable dragging on all children.
    */
  var isDraggable: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to false it will not call `onDrop()` callback.
    */
  var isDroppable: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to false it will disable resizing on all children.
    */
  var isResizable: js.UndefOr[Boolean] = js.native
  
  /**
    * Default Infinity, but you can specify a max here if you like.
    * Note that this isn't fully fleshed out and won't error if you specify a layout that
    * extends beyond the row capacity. It will, however, not allow users to drag/resize
    * an item past the barrier. They can push items beyond the barrier, though.
    * Intentionally not documented for this reason.
    */
  var maxRows: js.UndefOr[Double] = js.native
  
  /**
    * Calls on each drag movement.
    */
  var onDrag: js.UndefOr[ItemCallback] = js.native
  
  /**
    * Calls when drag starts.
    */
  var onDragStart: js.UndefOr[ItemCallback] = js.native
  
  /**
    * Calls when drag is complete.
    */
  var onDragStop: js.UndefOr[ItemCallback] = js.native
  
  /**
    * Calls when some element has been dropped
    */
  var onDrop: js.UndefOr[
    js.Function3[/* layout */ js.Array[Layout], /* item */ Layout, /* e */ Event, Unit]
  ] = js.native
  
  /**
    * Calls when resize movement happens.
    */
  var onResize: js.UndefOr[ItemCallback] = js.native
  
  /**
    * Calls when resize starts.
    */
  var onResizeStart: js.UndefOr[ItemCallback] = js.native
  
  /**
    * Calls when resize is complete.
    */
  var onResizeStop: js.UndefOr[ItemCallback] = js.native
  
  /**
    * If true, grid items won't change position when being dragged over.
    */
  var preventCollision: js.UndefOr[Boolean] = js.native
  
  /**
    * Defines custom component for resize handle
    */
  var resizeHandle: js.UndefOr[ReactNode | (js.Function1[/* resizeHandle */ ResizeHandle, ReactNode])] = js.native
  
  /**
    * Defines which resize handles should be rendered
    * Allows for any combination of:
    * 's' - South handle (bottom-center)
    * 'w' - West handle (left-center)
    * 'e' - East handle (right-center)
    * 'n' - North handle (top-center)
    * 'sw' - Southwest handle (bottom-left)
    * 'nw' - Northwest handle (top-left)
    * 'se' - Southeast handle (bottom-right)
    * 'ne' - Northeast handle (top-right)
    */
  var resizeHandles: js.UndefOr[js.Array[ResizeHandle]] = js.native
  
  /**
    * Rows have a static height, but you can change this based on breakpoints if you like.
    */
  var rowHeight: js.UndefOr[Double] = js.native
  
  /**
    * Inline-style object to pass to the root element.
    */
  var style: js.UndefOr[CSSProperties] = js.native
  
  /**
    * Scale coefficient for CSS3 `transform: scale()`
    */
  var transformScale: js.UndefOr[Double] = js.native
  
  /**
    * Uses CSS3 `translate()` instead of position top/left.
    * This makes about 6x faster paint performance.
    */
  var useCSSTransforms: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, the layout will compact vertically.
    */
  var verticalCompact: js.UndefOr[Boolean] = js.native
  
  /**
    * This allows setting the initial width on the server side.
    * This is required unless using the HOC <WidthProvider> or similar.
    */
  var width: js.UndefOr[Double] = js.native
}
object CoreProps {
  
  @scala.inline
  def apply(): CoreProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoreProps]
  }
  
  @scala.inline
  implicit class CorePropsOps[Self <: CoreProps] (val x: Self) extends AnyVal {
    
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
    def setAutoSize(value: Boolean): Self = this.set("autoSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoSize: Self = this.set("autoSize", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCompactType(value: vertical | horizontal): Self = this.set("compactType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompactType: Self = this.set("compactType", js.undefined)
    
    @scala.inline
    def setCompactTypeNull: Self = this.set("compactType", null)
    
    @scala.inline
    def setDraggableCancel(value: String): Self = this.set("draggableCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggableCancel: Self = this.set("draggableCancel", js.undefined)
    
    @scala.inline
    def setDraggableHandle(value: String): Self = this.set("draggableHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggableHandle: Self = this.set("draggableHandle", js.undefined)
    
    @scala.inline
    def setDroppingItem(value: H): Self = this.set("droppingItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDroppingItem: Self = this.set("droppingItem", js.undefined)
    
    @scala.inline
    def setIsBounded(value: Boolean): Self = this.set("isBounded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsBounded: Self = this.set("isBounded", js.undefined)
    
    @scala.inline
    def setIsDraggable(value: Boolean): Self = this.set("isDraggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDraggable: Self = this.set("isDraggable", js.undefined)
    
    @scala.inline
    def setIsDroppable(value: Boolean): Self = this.set("isDroppable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDroppable: Self = this.set("isDroppable", js.undefined)
    
    @scala.inline
    def setIsResizable(value: Boolean): Self = this.set("isResizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsResizable: Self = this.set("isResizable", js.undefined)
    
    @scala.inline
    def setMaxRows(value: Double): Self = this.set("maxRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRows: Self = this.set("maxRows", js.undefined)
    
    @scala.inline
    def setOnDrag(
      value: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit
    ): Self = this.set("onDrag", js.Any.fromFunction6(value))
    
    @scala.inline
    def deleteOnDrag: Self = this.set("onDrag", js.undefined)
    
    @scala.inline
    def setOnDragStart(
      value: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit
    ): Self = this.set("onDragStart", js.Any.fromFunction6(value))
    
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    
    @scala.inline
    def setOnDragStop(
      value: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit
    ): Self = this.set("onDragStop", js.Any.fromFunction6(value))
    
    @scala.inline
    def deleteOnDragStop: Self = this.set("onDragStop", js.undefined)
    
    @scala.inline
    def setOnDrop(value: (/* layout */ js.Array[Layout], /* item */ Layout, /* e */ Event) => Unit): Self = this.set("onDrop", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnDrop: Self = this.set("onDrop", js.undefined)
    
    @scala.inline
    def setOnResize(
      value: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit
    ): Self = this.set("onResize", js.Any.fromFunction6(value))
    
    @scala.inline
    def deleteOnResize: Self = this.set("onResize", js.undefined)
    
    @scala.inline
    def setOnResizeStart(
      value: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit
    ): Self = this.set("onResizeStart", js.Any.fromFunction6(value))
    
    @scala.inline
    def deleteOnResizeStart: Self = this.set("onResizeStart", js.undefined)
    
    @scala.inline
    def setOnResizeStop(
      value: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit
    ): Self = this.set("onResizeStop", js.Any.fromFunction6(value))
    
    @scala.inline
    def deleteOnResizeStop: Self = this.set("onResizeStop", js.undefined)
    
    @scala.inline
    def setPreventCollision(value: Boolean): Self = this.set("preventCollision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventCollision: Self = this.set("preventCollision", js.undefined)
    
    @scala.inline
    def setResizeHandleFunction1(value: /* resizeHandle */ ResizeHandle => ReactNode): Self = this.set("resizeHandle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResizeHandle(value: ReactNode | (js.Function1[/* resizeHandle */ ResizeHandle, ReactNode])): Self = this.set("resizeHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeHandle: Self = this.set("resizeHandle", js.undefined)
    
    @scala.inline
    def setResizeHandlesVarargs(value: ResizeHandle*): Self = this.set("resizeHandles", js.Array(value :_*))
    
    @scala.inline
    def setResizeHandles(value: js.Array[ResizeHandle]): Self = this.set("resizeHandles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeHandles: Self = this.set("resizeHandles", js.undefined)
    
    @scala.inline
    def setRowHeight(value: Double): Self = this.set("rowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowHeight: Self = this.set("rowHeight", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTransformScale(value: Double): Self = this.set("transformScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformScale: Self = this.set("transformScale", js.undefined)
    
    @scala.inline
    def setUseCSSTransforms(value: Boolean): Self = this.set("useCSSTransforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseCSSTransforms: Self = this.set("useCSSTransforms", js.undefined)
    
    @scala.inline
    def setVerticalCompact(value: Boolean): Self = this.set("verticalCompact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalCompact: Self = this.set("verticalCompact", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
