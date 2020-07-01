package typings.reactVis.mod

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.TouchEvent
import typings.react.mod.WheelEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexibleWidthXYPlotProps extends js.Object {
  var animation: js.UndefOr[String | AnimationParam | Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var dontCheckIfEmpty: js.UndefOr[Boolean] = js.undefined
  var margin: js.UndefOr[Margin | Double] = js.undefined
  var onClick: js.UndefOr[RVMouseEventHandler] = js.undefined
  var onDoubleClick: js.UndefOr[RVMouseEventHandler] = js.undefined
  var onMouseDown: js.UndefOr[RVMouseEventHandler] = js.undefined
  var onMouseEnter: js.UndefOr[RVMouseEventHandler] = js.undefined
  var onMouseLeave: js.UndefOr[RVMouseEventHandler] = js.undefined
  var onMouseMove: js.UndefOr[RVMouseEventHandler] = js.undefined
  var onMouseUp: js.UndefOr[RVMouseEventHandler] = js.undefined
  var onTouchCancel: js.UndefOr[RVTouchEventHandler] = js.undefined
  var onTouchEnd: js.UndefOr[RVTouchEventHandler] = js.undefined
  var onTouchMove: js.UndefOr[RVTouchEventHandler] = js.undefined
  var onTouchStart: js.UndefOr[RVTouchEventHandler] = js.undefined
  var onWheel: js.UndefOr[RVWheelEventHandler] = js.undefined
  var stackBy: js.UndefOr[StackDirections] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object FlexibleWidthXYPlotProps {
  @scala.inline
  def apply(
    animation: String | AnimationParam | Boolean = null,
    className: String = null,
    dontCheckIfEmpty: js.UndefOr[Boolean] = js.undefined,
    margin: Margin | Double = null,
    onClick: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onDoubleClick: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onMouseDown: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onMouseEnter: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onMouseLeave: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onMouseMove: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onMouseUp: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onTouchCancel: TouchEvent[HTMLElement] => Unit = null,
    onTouchEnd: TouchEvent[HTMLElement] => Unit = null,
    onTouchMove: TouchEvent[HTMLElement] => Unit = null,
    onTouchStart: TouchEvent[HTMLElement] => Unit = null,
    onWheel: WheelEvent[HTMLElement] => Unit = null,
    stackBy: StackDirections = null,
    style: CSSProperties = null
  ): FlexibleWidthXYPlotProps = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(dontCheckIfEmpty)) __obj.updateDynamic("dontCheckIfEmpty")(dontCheckIfEmpty.get.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1(onDoubleClick))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    if (stackBy != null) __obj.updateDynamic("stackBy")(stackBy.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexibleWidthXYPlotProps]
  }
}

