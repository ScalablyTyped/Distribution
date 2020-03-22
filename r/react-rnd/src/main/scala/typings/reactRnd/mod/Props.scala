package typings.reactRnd.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reResizable.mod.ResizeDirection
import typings.react.mod.CSSProperties
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.reactDraggable.mod.DraggableEvent
import typings.reactDraggable.reactDraggableBooleans.`false`
import typings.reactRnd.AnonX
import typings.reactRnd.reactRndStrings.both
import typings.reactRnd.reactRndStrings.none
import typings.reactRnd.reactRndStrings.x
import typings.reactRnd.reactRndStrings.y
import typings.reactRnd.xnumberynumberSize
import typings.std.HTMLDivElement
import typings.std.MouseEvent
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props
  extends /* key */ StringDictionary[js.Any] {
  var bounds: js.UndefOr[String] = js.undefined
  var cancel: js.UndefOr[String] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var default: js.UndefOr[xnumberynumberSize] = js.undefined
  var disableDragging: js.UndefOr[Boolean] = js.undefined
  var dragAxis: js.UndefOr[x | y | both | none] = js.undefined
  var dragGrid: js.UndefOr[Grid] = js.undefined
  var dragHandleClassName: js.UndefOr[String] = js.undefined
  var enableResizing: js.UndefOr[ResizeEnable] = js.undefined
  var enableUserSelectHack: js.UndefOr[Boolean] = js.undefined
  var lockAspectRatio: js.UndefOr[Boolean | Double] = js.undefined
  var lockAspectRatioExtraHeight: js.UndefOr[Double] = js.undefined
  var lockAspectRatioExtraWidth: js.UndefOr[Double] = js.undefined
  var maxHeight: js.UndefOr[Double | String] = js.undefined
  var maxWidth: js.UndefOr[Double | String] = js.undefined
  var minHeight: js.UndefOr[Double | String] = js.undefined
  var minWidth: js.UndefOr[Double | String] = js.undefined
  var onDrag: js.UndefOr[RndDragCallback] = js.undefined
  var onDragStart: js.UndefOr[RndDragCallback] = js.undefined
  var onDragStop: js.UndefOr[RndDragCallback] = js.undefined
  var onMouseDown: js.UndefOr[js.Function1[/* e */ MouseEvent, Unit]] = js.undefined
  var onMouseUp: js.UndefOr[js.Function1[/* e */ MouseEvent, Unit]] = js.undefined
  var onResize: js.UndefOr[RndResizeCallback] = js.undefined
  var onResizeStart: js.UndefOr[RndResizeStartCallback] = js.undefined
  var onResizeStop: js.UndefOr[RndResizeCallback] = js.undefined
  var position: js.UndefOr[AnonX] = js.undefined
  var resizeGrid: js.UndefOr[Grid] = js.undefined
  var resizeHandleClasses: js.UndefOr[HandleClasses] = js.undefined
  var resizeHandleComponent: js.UndefOr[HandleComponent] = js.undefined
  var resizeHandleStyles: js.UndefOr[HandleStyles] = js.undefined
  var resizeHandleWrapperClass: js.UndefOr[String] = js.undefined
  var resizeHandleWrapperStyle: js.UndefOr[CSSProperties] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Size] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    bounds: String = null,
    cancel: String = null,
    children: ReactNode = null,
    className: String = null,
    default: xnumberynumberSize = null,
    disableDragging: js.UndefOr[Boolean] = js.undefined,
    dragAxis: x | y | both | none = null,
    dragGrid: Grid = null,
    dragHandleClassName: String = null,
    enableResizing: ResizeEnable = null,
    enableUserSelectHack: js.UndefOr[Boolean] = js.undefined,
    lockAspectRatio: Boolean | Double = null,
    lockAspectRatioExtraHeight: Int | Double = null,
    lockAspectRatioExtraWidth: Int | Double = null,
    maxHeight: Double | String = null,
    maxWidth: Double | String = null,
    minHeight: Double | String = null,
    minWidth: Double | String = null,
    onDrag: (/* e */ DraggableEvent, /* data */ typings.reactDraggable.mod.DraggableData) => Unit | `false` = null,
    onDragStart: (/* e */ DraggableEvent, /* data */ typings.reactDraggable.mod.DraggableData) => Unit | `false` = null,
    onDragStop: (/* e */ DraggableEvent, /* data */ typings.reactDraggable.mod.DraggableData) => Unit | `false` = null,
    onMouseDown: /* e */ MouseEvent => Unit = null,
    onMouseUp: /* e */ MouseEvent => Unit = null,
    onResize: (/* e */ MouseEvent | TouchEvent, /* dir */ ResizeDirection, /* elementRef */ HTMLDivElement, /* delta */ ResizableDelta, /* position */ Position) => Unit = null,
    onResizeStart: (/* e */ (typings.react.mod.MouseEvent[HTMLDivElement, NativeMouseEvent]) | typings.react.mod.TouchEvent[HTMLDivElement], /* dir */ ResizeDirection, /* elementRef */ HTMLDivElement) => Unit = null,
    onResizeStop: (/* e */ MouseEvent | TouchEvent, /* dir */ ResizeDirection, /* elementRef */ HTMLDivElement, /* delta */ ResizableDelta, /* position */ Position) => Unit = null,
    position: AnonX = null,
    resizeGrid: Grid = null,
    resizeHandleClasses: HandleClasses = null,
    resizeHandleComponent: HandleComponent = null,
    resizeHandleStyles: HandleStyles = null,
    resizeHandleWrapperClass: String = null,
    resizeHandleWrapperStyle: CSSProperties = null,
    scale: Int | Double = null,
    size: Size = null,
    style: CSSProperties = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (!js.isUndefined(disableDragging)) __obj.updateDynamic("disableDragging")(disableDragging.asInstanceOf[js.Any])
    if (dragAxis != null) __obj.updateDynamic("dragAxis")(dragAxis.asInstanceOf[js.Any])
    if (dragGrid != null) __obj.updateDynamic("dragGrid")(dragGrid.asInstanceOf[js.Any])
    if (dragHandleClassName != null) __obj.updateDynamic("dragHandleClassName")(dragHandleClassName.asInstanceOf[js.Any])
    if (enableResizing != null) __obj.updateDynamic("enableResizing")(enableResizing.asInstanceOf[js.Any])
    if (!js.isUndefined(enableUserSelectHack)) __obj.updateDynamic("enableUserSelectHack")(enableUserSelectHack.asInstanceOf[js.Any])
    if (lockAspectRatio != null) __obj.updateDynamic("lockAspectRatio")(lockAspectRatio.asInstanceOf[js.Any])
    if (lockAspectRatioExtraHeight != null) __obj.updateDynamic("lockAspectRatioExtraHeight")(lockAspectRatioExtraHeight.asInstanceOf[js.Any])
    if (lockAspectRatioExtraWidth != null) __obj.updateDynamic("lockAspectRatioExtraWidth")(lockAspectRatioExtraWidth.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction2(onDrag))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction2(onDragStart))
    if (onDragStop != null) __obj.updateDynamic("onDragStop")(js.Any.fromFunction2(onDragStop))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction5(onResize))
    if (onResizeStart != null) __obj.updateDynamic("onResizeStart")(js.Any.fromFunction3(onResizeStart))
    if (onResizeStop != null) __obj.updateDynamic("onResizeStop")(js.Any.fromFunction5(onResizeStop))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (resizeGrid != null) __obj.updateDynamic("resizeGrid")(resizeGrid.asInstanceOf[js.Any])
    if (resizeHandleClasses != null) __obj.updateDynamic("resizeHandleClasses")(resizeHandleClasses.asInstanceOf[js.Any])
    if (resizeHandleComponent != null) __obj.updateDynamic("resizeHandleComponent")(resizeHandleComponent.asInstanceOf[js.Any])
    if (resizeHandleStyles != null) __obj.updateDynamic("resizeHandleStyles")(resizeHandleStyles.asInstanceOf[js.Any])
    if (resizeHandleWrapperClass != null) __obj.updateDynamic("resizeHandleWrapperClass")(resizeHandleWrapperClass.asInstanceOf[js.Any])
    if (resizeHandleWrapperStyle != null) __obj.updateDynamic("resizeHandleWrapperStyle")(resizeHandleWrapperStyle.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

