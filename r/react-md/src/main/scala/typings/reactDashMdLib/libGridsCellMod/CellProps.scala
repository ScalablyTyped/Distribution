package typings
package reactDashMdLib.libGridsCellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellProps
  extends reactDashMdLib.libMod.Props {
  var align: js.UndefOr[
    reactDashMdLib.reactDashMdLibStrings.top | reactDashMdLib.reactDashMdLibStrings.middle | reactDashMdLib.reactDashMdLibStrings.bottom | reactDashMdLib.reactDashMdLibStrings.stretch
  ] = js.undefined
  var children: js.UndefOr[
    reactLib.reactMod.ReactNode | (js.Function1[/* props */ reactDashMdLib.libGridsMod.HOCProps, reactLib.reactMod.ReactNode])
  ] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
  var desktopHidden: js.UndefOr[scala.Boolean] = js.undefined
  var desktopOffset: js.UndefOr[scala.Double] = js.undefined
  var desktopOrder: js.UndefOr[scala.Double] = js.undefined
  var desktopSize: js.UndefOr[scala.Double] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var order: js.UndefOr[scala.Double] = js.undefined
  var phoneHidden: js.UndefOr[scala.Boolean] = js.undefined
  var phoneOffset: js.UndefOr[scala.Double] = js.undefined
  var phoneOrder: js.UndefOr[scala.Double] = js.undefined
  var phoneSize: js.UndefOr[scala.Double] = js.undefined
  var position: js.UndefOr[
    reactDashMdLib.reactDashMdLibStrings.center | reactDashMdLib.reactDashMdLibStrings.right
  ] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var tabletHidden: js.UndefOr[scala.Boolean] = js.undefined
  var tabletOffset: js.UndefOr[scala.Double] = js.undefined
  var tabletOrder: js.UndefOr[scala.Double] = js.undefined
  var tabletSize: js.UndefOr[scala.Double] = js.undefined
}

object CellProps {
  @scala.inline
  def apply(
    align: reactDashMdLib.reactDashMdLibStrings.top | reactDashMdLib.reactDashMdLibStrings.middle | reactDashMdLib.reactDashMdLibStrings.bottom | reactDashMdLib.reactDashMdLibStrings.stretch = null,
    children: reactLib.reactMod.ReactNode | (js.Function1[/* props */ reactDashMdLib.libGridsMod.HOCProps, reactLib.reactMod.ReactNode]) = null,
    className: java.lang.String = null,
    component: reactLib.reactMod.ReactType[_] = null,
    desktopHidden: js.UndefOr[scala.Boolean] = js.undefined,
    desktopOffset: scala.Int | scala.Double = null,
    desktopOrder: scala.Int | scala.Double = null,
    desktopSize: scala.Int | scala.Double = null,
    offset: scala.Int | scala.Double = null,
    onBlur: /* event */ reactLib.reactMod.FocusEvent[stdLib.HTMLElement] => scala.Unit = null,
    onClick: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onDrag: /* event */ reactLib.reactMod.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragEnd: /* event */ reactLib.reactMod.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragEnter: /* event */ reactLib.reactMod.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragExit: /* event */ reactLib.reactMod.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragLeave: /* event */ reactLib.reactMod.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragOver: /* event */ reactLib.reactMod.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragStart: /* event */ reactLib.reactMod.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDrop: /* event */ reactLib.reactMod.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onFocus: /* event */ reactLib.reactMod.FocusEvent[stdLib.HTMLElement] => scala.Unit = null,
    onKeyDown: /* event */ reactLib.reactMod.KeyboardEvent[stdLib.HTMLElement] => scala.Unit = null,
    onKeyUp: /* event */ reactLib.reactMod.KeyboardEvent[stdLib.HTMLElement] => scala.Unit = null,
    onMouseDown: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseEnter: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseLeave: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseMove: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseOut: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseOver: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseUp: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onTouchCancel: /* event */ reactLib.reactMod.TouchEvent[stdLib.HTMLElement] => scala.Unit = null,
    onTouchEnd: /* event */ reactLib.reactMod.TouchEvent[stdLib.HTMLElement] => scala.Unit = null,
    onTouchMove: /* event */ reactLib.reactMod.TouchEvent[stdLib.HTMLElement] => scala.Unit = null,
    onTouchStart: /* event */ reactLib.reactMod.TouchEvent[stdLib.HTMLElement] => scala.Unit = null,
    order: scala.Int | scala.Double = null,
    phoneHidden: js.UndefOr[scala.Boolean] = js.undefined,
    phoneOffset: scala.Int | scala.Double = null,
    phoneOrder: scala.Int | scala.Double = null,
    phoneSize: scala.Int | scala.Double = null,
    position: reactDashMdLib.reactDashMdLibStrings.center | reactDashMdLib.reactDashMdLibStrings.right = null,
    size: scala.Int | scala.Double = null,
    style: reactLib.reactMod.CSSProperties = null,
    tabletHidden: js.UndefOr[scala.Boolean] = js.undefined,
    tabletOffset: scala.Int | scala.Double = null,
    tabletOrder: scala.Int | scala.Double = null,
    tabletSize: scala.Int | scala.Double = null
  ): CellProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(desktopHidden)) __obj.updateDynamic("desktopHidden")(desktopHidden)
    if (desktopOffset != null) __obj.updateDynamic("desktopOffset")(desktopOffset.asInstanceOf[js.Any])
    if (desktopOrder != null) __obj.updateDynamic("desktopOrder")(desktopOrder.asInstanceOf[js.Any])
    if (desktopSize != null) __obj.updateDynamic("desktopSize")(desktopSize.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1(onDragExit))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (!js.isUndefined(phoneHidden)) __obj.updateDynamic("phoneHidden")(phoneHidden)
    if (phoneOffset != null) __obj.updateDynamic("phoneOffset")(phoneOffset.asInstanceOf[js.Any])
    if (phoneOrder != null) __obj.updateDynamic("phoneOrder")(phoneOrder.asInstanceOf[js.Any])
    if (phoneSize != null) __obj.updateDynamic("phoneSize")(phoneSize.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(tabletHidden)) __obj.updateDynamic("tabletHidden")(tabletHidden)
    if (tabletOffset != null) __obj.updateDynamic("tabletOffset")(tabletOffset.asInstanceOf[js.Any])
    if (tabletOrder != null) __obj.updateDynamic("tabletOrder")(tabletOrder.asInstanceOf[js.Any])
    if (tabletSize != null) __obj.updateDynamic("tabletSize")(tabletSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellProps]
  }
}

