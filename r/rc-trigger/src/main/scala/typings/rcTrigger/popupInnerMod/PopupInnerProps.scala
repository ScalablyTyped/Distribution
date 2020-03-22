package typings.rcTrigger.popupInnerMod

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupInnerProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var className: String
  var hiddenClassName: js.UndefOr[String] = js.undefined
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.undefined
  var prefixCls: String
  var style: js.UndefOr[CSSProperties] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object PopupInnerProps {
  @scala.inline
  def apply(
    className: String,
    prefixCls: String,
    children: ReactNode = null,
    hiddenClassName: String = null,
    onMouseDown: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    onMouseEnter: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    onMouseLeave: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    onTouchStart: TouchEvent[HTMLDivElement] => Unit = null,
    style: CSSProperties = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): PopupInnerProps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (hiddenClassName != null) __obj.updateDynamic("hiddenClassName")(hiddenClassName.asInstanceOf[js.Any])
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupInnerProps]
  }
}

