package typings.reactRnd.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reResizable.mod.ResizeDirection
import typings.react.mod.CSSProperties
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.reactDraggable.mod.DraggableEvent
import typings.reactDraggable.reactDraggableBooleans.`false`
import typings.reactRnd.anon.TypeofComponent
import typings.reactRnd.anon.X
import typings.reactRnd.anon.xnumberynumberSize
import typings.reactRnd.reactRndStrings.both
import typings.reactRnd.reactRndStrings.none
import typings.reactRnd.reactRndStrings.x
import typings.reactRnd.reactRndStrings.y
import typings.std.HTMLDivElement
import typings.std.MouseEvent
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props
  extends /* key */ StringDictionary[js.Any] {
  var allowAnyClick: js.UndefOr[Boolean] = js.native
  var bounds: js.UndefOr[String] = js.native
  var cancel: js.UndefOr[String] = js.native
  var children: js.UndefOr[ReactNode] = js.native
  var className: js.UndefOr[String] = js.native
  var default: js.UndefOr[xnumberynumberSize] = js.native
  var disableDragging: js.UndefOr[Boolean] = js.native
  var dragAxis: js.UndefOr[x | y | both | none] = js.native
  var dragGrid: js.UndefOr[Grid] = js.native
  var dragHandleClassName: js.UndefOr[String] = js.native
  var enableResizing: js.UndefOr[ResizeEnable] = js.native
  var enableUserSelectHack: js.UndefOr[Boolean] = js.native
  var lockAspectRatio: js.UndefOr[Boolean | Double] = js.native
  var lockAspectRatioExtraHeight: js.UndefOr[Double] = js.native
  var lockAspectRatioExtraWidth: js.UndefOr[Double] = js.native
  var maxHeight: js.UndefOr[Double | String] = js.native
  var maxWidth: js.UndefOr[Double | String] = js.native
  var minHeight: js.UndefOr[Double | String] = js.native
  var minWidth: js.UndefOr[Double | String] = js.native
  var nodeRef: js.UndefOr[Ref[TypeofComponent]] = js.native
  var onDrag: js.UndefOr[RndDragCallback] = js.native
  var onDragStart: js.UndefOr[RndDragCallback] = js.native
  var onDragStop: js.UndefOr[RndDragCallback] = js.native
  var onMouseDown: js.UndefOr[js.Function1[/* e */ MouseEvent, Unit]] = js.native
  var onMouseUp: js.UndefOr[js.Function1[/* e */ MouseEvent, Unit]] = js.native
  var onResize: js.UndefOr[RndResizeCallback] = js.native
  var onResizeStart: js.UndefOr[RndResizeStartCallback] = js.native
  var onResizeStop: js.UndefOr[RndResizeCallback] = js.native
  var position: js.UndefOr[X] = js.native
  var resizeGrid: js.UndefOr[Grid] = js.native
  var resizeHandleClasses: js.UndefOr[HandleClasses] = js.native
  var resizeHandleComponent: js.UndefOr[HandleComponent] = js.native
  var resizeHandleStyles: js.UndefOr[HandleStyles] = js.native
  var resizeHandleWrapperClass: js.UndefOr[String] = js.native
  var resizeHandleWrapperStyle: js.UndefOr[CSSProperties] = js.native
  var scale: js.UndefOr[Double] = js.native
  var size: js.UndefOr[Size] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object Props {
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
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
    def setAllowAnyClick(value: Boolean): Self = this.set("allowAnyClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowAnyClick: Self = this.set("allowAnyClick", js.undefined)
    @scala.inline
    def setBounds(value: String): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    @scala.inline
    def setCancel(value: String): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDefault(value: xnumberynumberSize): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setDisableDragging(value: Boolean): Self = this.set("disableDragging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableDragging: Self = this.set("disableDragging", js.undefined)
    @scala.inline
    def setDragAxis(value: typings.reactRnd.reactRndStrings.x | y | both | none): Self = this.set("dragAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragAxis: Self = this.set("dragAxis", js.undefined)
    @scala.inline
    def setDragGrid(value: Grid): Self = this.set("dragGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragGrid: Self = this.set("dragGrid", js.undefined)
    @scala.inline
    def setDragHandleClassName(value: String): Self = this.set("dragHandleClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragHandleClassName: Self = this.set("dragHandleClassName", js.undefined)
    @scala.inline
    def setEnableResizing(value: ResizeEnable): Self = this.set("enableResizing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableResizing: Self = this.set("enableResizing", js.undefined)
    @scala.inline
    def setEnableUserSelectHack(value: Boolean): Self = this.set("enableUserSelectHack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableUserSelectHack: Self = this.set("enableUserSelectHack", js.undefined)
    @scala.inline
    def setLockAspectRatio(value: Boolean | Double): Self = this.set("lockAspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLockAspectRatio: Self = this.set("lockAspectRatio", js.undefined)
    @scala.inline
    def setLockAspectRatioExtraHeight(value: Double): Self = this.set("lockAspectRatioExtraHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLockAspectRatioExtraHeight: Self = this.set("lockAspectRatioExtraHeight", js.undefined)
    @scala.inline
    def setLockAspectRatioExtraWidth(value: Double): Self = this.set("lockAspectRatioExtraWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLockAspectRatioExtraWidth: Self = this.set("lockAspectRatioExtraWidth", js.undefined)
    @scala.inline
    def setMaxHeight(value: Double | String): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double | String): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMinHeight(value: Double | String): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setMinWidth(value: Double | String): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setNodeRefFunction1(value: /* instance */ TypeofComponent | Null => Unit): Self = this.set("nodeRef", js.Any.fromFunction1(value))
    @scala.inline
    def setNodeRef(value: Ref[TypeofComponent]): Self = this.set("nodeRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeRef: Self = this.set("nodeRef", js.undefined)
    @scala.inline
    def setNodeRefNull: Self = this.set("nodeRef", null)
    @scala.inline
    def setOnDrag(
      value: (/* e */ DraggableEvent, /* data */ typings.reactDraggable.mod.DraggableData) => Unit | `false`
    ): Self = this.set("onDrag", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnDrag: Self = this.set("onDrag", js.undefined)
    @scala.inline
    def setOnDragStart(
      value: (/* e */ DraggableEvent, /* data */ typings.reactDraggable.mod.DraggableData) => Unit | `false`
    ): Self = this.set("onDragStart", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    @scala.inline
    def setOnDragStop(
      value: (/* e */ DraggableEvent, /* data */ typings.reactDraggable.mod.DraggableData) => Unit | `false`
    ): Self = this.set("onDragStop", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnDragStop: Self = this.set("onDragStop", js.undefined)
    @scala.inline
    def setOnMouseDown(value: /* e */ MouseEvent => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    @scala.inline
    def setOnMouseUp(value: /* e */ MouseEvent => Unit): Self = this.set("onMouseUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseUp: Self = this.set("onMouseUp", js.undefined)
    @scala.inline
    def setOnResize(
      value: (/* e */ MouseEvent | TouchEvent, /* dir */ ResizeDirection, /* elementRef */ HTMLDivElement, /* delta */ ResizableDelta, /* position */ Position) => Unit
    ): Self = this.set("onResize", js.Any.fromFunction5(value))
    @scala.inline
    def deleteOnResize: Self = this.set("onResize", js.undefined)
    @scala.inline
    def setOnResizeStart(
      value: (/* e */ (typings.react.mod.MouseEvent[HTMLDivElement, NativeMouseEvent]) | typings.react.mod.TouchEvent[HTMLDivElement], /* dir */ ResizeDirection, /* elementRef */ HTMLDivElement) => Unit
    ): Self = this.set("onResizeStart", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnResizeStart: Self = this.set("onResizeStart", js.undefined)
    @scala.inline
    def setOnResizeStop(
      value: (/* e */ MouseEvent | TouchEvent, /* dir */ ResizeDirection, /* elementRef */ HTMLDivElement, /* delta */ ResizableDelta, /* position */ Position) => Unit
    ): Self = this.set("onResizeStop", js.Any.fromFunction5(value))
    @scala.inline
    def deleteOnResizeStop: Self = this.set("onResizeStop", js.undefined)
    @scala.inline
    def setPosition(value: X): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setResizeGrid(value: Grid): Self = this.set("resizeGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizeGrid: Self = this.set("resizeGrid", js.undefined)
    @scala.inline
    def setResizeHandleClasses(value: HandleClasses): Self = this.set("resizeHandleClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizeHandleClasses: Self = this.set("resizeHandleClasses", js.undefined)
    @scala.inline
    def setResizeHandleComponent(value: HandleComponent): Self = this.set("resizeHandleComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizeHandleComponent: Self = this.set("resizeHandleComponent", js.undefined)
    @scala.inline
    def setResizeHandleStyles(value: HandleStyles): Self = this.set("resizeHandleStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizeHandleStyles: Self = this.set("resizeHandleStyles", js.undefined)
    @scala.inline
    def setResizeHandleWrapperClass(value: String): Self = this.set("resizeHandleWrapperClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizeHandleWrapperClass: Self = this.set("resizeHandleWrapperClass", js.undefined)
    @scala.inline
    def setResizeHandleWrapperStyle(value: CSSProperties): Self = this.set("resizeHandleWrapperStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizeHandleWrapperStyle: Self = this.set("resizeHandleWrapperStyle", js.undefined)
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setSize(value: Size): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

