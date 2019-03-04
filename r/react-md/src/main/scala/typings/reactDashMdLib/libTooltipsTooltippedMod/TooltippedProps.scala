package typings
package reactDashMdLib.libTooltipsTooltippedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltippedProps
  extends reactDashMdLib.libMod.Props {
  var children: reactLib.reactMod.ReactNs.ReactElement[_]
  var container: js.UndefOr[js.Function1[/* HTMLElement */ reactLib.HTMLElement, reactLib.HTMLElement]] = js.undefined
  var delay: js.UndefOr[scala.Double] = js.undefined
  var enterTimeout: js.UndefOr[scala.Double] = js.undefined
  var label: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var leaveTimeout: js.UndefOr[scala.Double] = js.undefined
  var position: js.UndefOr[reactDashMdLib.libTooltipsInjectTooltipMod.Positions] = js.undefined
  var setPosition: js.UndefOr[scala.Boolean] = js.undefined
  var target: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactElement[_] | (js.Function1[/* HTMLElement */ reactLib.HTMLElement, reactLib.reactMod.ReactNs.ReactElement[_]])
  ] = js.undefined
  var tooltipClassName: js.UndefOr[java.lang.String] = js.undefined
  var tooltipStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object TooltippedProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ReactElement[_],
    className: java.lang.String = null,
    container: js.Function1[/* HTMLElement */ reactLib.HTMLElement, reactLib.HTMLElement] = null,
    delay: scala.Int | scala.Double = null,
    enterTimeout: scala.Int | scala.Double = null,
    label: reactLib.reactMod.ReactNs.ReactNode = null,
    leaveTimeout: scala.Int | scala.Double = null,
    onBlur: js.Function1[/* event */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLElement], scala.Unit] = null,
    onClick: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onDrag: js.Function1[/* event */ reactLib.reactMod.ReactNs.DragEvent[reactLib.HTMLElement], scala.Unit] = null,
    onDragEnd: js.Function1[/* event */ reactLib.reactMod.ReactNs.DragEvent[reactLib.HTMLElement], scala.Unit] = null,
    onDragEnter: js.Function1[/* event */ reactLib.reactMod.ReactNs.DragEvent[reactLib.HTMLElement], scala.Unit] = null,
    onDragExit: js.Function1[/* event */ reactLib.reactMod.ReactNs.DragEvent[reactLib.HTMLElement], scala.Unit] = null,
    onDragLeave: js.Function1[/* event */ reactLib.reactMod.ReactNs.DragEvent[reactLib.HTMLElement], scala.Unit] = null,
    onDragOver: js.Function1[/* event */ reactLib.reactMod.ReactNs.DragEvent[reactLib.HTMLElement], scala.Unit] = null,
    onDragStart: js.Function1[/* event */ reactLib.reactMod.ReactNs.DragEvent[reactLib.HTMLElement], scala.Unit] = null,
    onDrop: js.Function1[/* event */ reactLib.reactMod.ReactNs.DragEvent[reactLib.HTMLElement], scala.Unit] = null,
    onFocus: js.Function1[/* event */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLElement], scala.Unit] = null,
    onKeyDown: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLElement], 
      scala.Unit
    ] = null,
    onKeyUp: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLElement], 
      scala.Unit
    ] = null,
    onMouseDown: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMouseEnter: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMouseLeave: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMouseMove: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMouseOut: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMouseOver: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMouseUp: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onTouchCancel: js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], scala.Unit] = null,
    onTouchEnd: js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], scala.Unit] = null,
    onTouchMove: js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], scala.Unit] = null,
    onTouchStart: js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], scala.Unit] = null,
    position: reactDashMdLib.libTooltipsInjectTooltipMod.Positions = null,
    setPosition: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    target: reactLib.reactMod.ReactNs.ReactElement[_] | (js.Function1[/* HTMLElement */ reactLib.HTMLElement, reactLib.reactMod.ReactNs.ReactElement[_]]) = null,
    tooltipClassName: java.lang.String = null,
    tooltipStyle: reactLib.reactMod.ReactNs.CSSProperties = null
  ): TooltippedProps = {
    val __obj = js.Dynamic.literal(children = children)
    if (className != null) __obj.updateDynamic("className")(className)
    if (container != null) __obj.updateDynamic("container")(container)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (enterTimeout != null) __obj.updateDynamic("enterTimeout")(enterTimeout.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (leaveTimeout != null) __obj.updateDynamic("leaveTimeout")(leaveTimeout.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag)
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(onDragEnd)
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(onDragEnter)
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(onDragExit)
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(onDragLeave)
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(onDragOver)
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart)
    if (onDrop != null) __obj.updateDynamic("onDrop")(onDrop)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown)
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(onKeyUp)
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove)
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(onMouseOut)
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(onMouseOver)
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp)
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(setPosition)) __obj.updateDynamic("setPosition")(setPosition)
    if (style != null) __obj.updateDynamic("style")(style)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (tooltipClassName != null) __obj.updateDynamic("tooltipClassName")(tooltipClassName)
    if (tooltipStyle != null) __obj.updateDynamic("tooltipStyle")(tooltipStyle)
    __obj.asInstanceOf[TooltippedProps]
  }
}

