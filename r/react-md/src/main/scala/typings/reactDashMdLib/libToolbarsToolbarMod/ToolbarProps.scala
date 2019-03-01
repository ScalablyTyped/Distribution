package typings
package reactDashMdLib.libToolbarsToolbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarProps
  extends reactDashMdLib.libMod.Props
     with // for the `component` prop until refactored out
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var actions: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactElement[_] | js.Array[reactLib.reactMod.ReactNs.ReactElement[_]]
  ] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var colored: js.UndefOr[scala.Boolean] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var fixed: js.UndefOr[scala.Boolean] = js.undefined
  var inset: js.UndefOr[scala.Boolean] = js.undefined
  var nav: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  var prominent: js.UndefOr[scala.Boolean] = js.undefined
  var prominentTitle: js.UndefOr[scala.Boolean] = js.undefined
  var singleColor: js.UndefOr[scala.Boolean] = js.undefined
  var themed: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var titleClassName: js.UndefOr[java.lang.String] = js.undefined
  var titleMenu: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  var titleStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var zDepth: js.UndefOr[scala.Double] = js.undefined
}

object ToolbarProps {
  @scala.inline
  def apply(
    StringDictionary: // for the `component` prop until refactored out
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    actions: reactLib.reactMod.ReactNs.ReactElement[_] | js.Array[reactLib.reactMod.ReactNs.ReactElement[_]] = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    colored: js.UndefOr[scala.Boolean] = js.undefined,
    component: reactLib.reactMod.ReactNs.ReactType[_] = null,
    fixed: js.UndefOr[scala.Boolean] = js.undefined,
    inset: js.UndefOr[scala.Boolean] = js.undefined,
    nav: reactLib.reactMod.ReactNs.ReactElement[_] = null,
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
    prominent: js.UndefOr[scala.Boolean] = js.undefined,
    prominentTitle: js.UndefOr[scala.Boolean] = js.undefined,
    singleColor: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    themed: js.UndefOr[scala.Boolean] = js.undefined,
    title: reactLib.reactMod.ReactNs.ReactNode = null,
    titleClassName: java.lang.String = null,
    titleMenu: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    titleStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    zDepth: scala.Int | scala.Double = null
  ): ToolbarProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(colored)) __obj.updateDynamic("colored")(colored)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed)
    if (!js.isUndefined(inset)) __obj.updateDynamic("inset")(inset)
    if (nav != null) __obj.updateDynamic("nav")(nav)
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
    if (!js.isUndefined(prominent)) __obj.updateDynamic("prominent")(prominent)
    if (!js.isUndefined(prominentTitle)) __obj.updateDynamic("prominentTitle")(prominentTitle)
    if (!js.isUndefined(singleColor)) __obj.updateDynamic("singleColor")(singleColor)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(themed)) __obj.updateDynamic("themed")(themed)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleClassName != null) __obj.updateDynamic("titleClassName")(titleClassName)
    if (titleMenu != null) __obj.updateDynamic("titleMenu")(titleMenu)
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle)
    if (zDepth != null) __obj.updateDynamic("zDepth")(zDepth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarProps]
  }
}

