package typings.reactCalendarTimeline.mod

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactEventHandler
import typings.react.mod.SyntheticEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Omit<react-calendar-timeline.react-calendar-timeline.ItemRendererGetItemPropsReturnType, 'key' | 'ref'>> */
trait GetItemsProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var onContextMenu: js.UndefOr[ReactEventHandler[Element]] = js.undefined
  var onDoubleClick: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  var onMouseDown: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  var onMouseUp: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  var onTouchEnd: js.UndefOr[TouchEventHandler[Element]] = js.undefined
  var onTouchStart: js.UndefOr[TouchEventHandler[Element]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object GetItemsProps {
  @scala.inline
  def apply(
    className: String = null,
    onContextMenu: SyntheticEvent[Element, Event] => scala.Unit = null,
    onDoubleClick: MouseEvent[Element, NativeMouseEvent] => scala.Unit = null,
    onMouseDown: MouseEvent[Element, NativeMouseEvent] => scala.Unit = null,
    onMouseUp: MouseEvent[Element, NativeMouseEvent] => scala.Unit = null,
    onTouchEnd: TouchEvent[Element] => scala.Unit = null,
    onTouchStart: TouchEvent[Element] => scala.Unit = null,
    style: CSSProperties = null
  ): GetItemsProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1(onDoubleClick))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetItemsProps]
  }
}

