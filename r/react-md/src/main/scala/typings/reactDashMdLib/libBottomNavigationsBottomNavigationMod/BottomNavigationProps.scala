package typings
package reactDashMdLib.libBottomNavigationsBottomNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BottomNavigationProps
  extends reactDashMdLib.libMod.Props
     with // for the `component` prop until refactored out
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var activeIndex: js.UndefOr[scala.Double] = js.undefined
  var animate: js.UndefOr[scala.Boolean] = js.undefined
  var colored: js.UndefOr[scala.Boolean] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var defaultActiveIndex: js.UndefOr[scala.Double] = js.undefined
  var defaultVisible: js.UndefOr[scala.Boolean] = js.undefined
  var dynamic: js.UndefOr[scala.Boolean] = js.undefined
  var dynamicThreshold: js.UndefOr[scala.Double] = js.undefined
  var lastChild: js.UndefOr[scala.Boolean] = js.undefined
  var links: js.Array[reactDashMdLib.Anon_Component]
  var onNavChange: js.UndefOr[
    js.Function2[
      /* activeIndex */ scala.Double, 
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onVisibilityChange: js.UndefOr[js.Function1[/* visible */ scala.Boolean, scala.Unit]] = js.undefined
  var portal: js.UndefOr[scala.Boolean] = js.undefined
  var renderNode: js.UndefOr[js.Object] = js.undefined
  var transitionDuration: js.UndefOr[scala.Double] = js.undefined
}

object BottomNavigationProps {
  @scala.inline
  def apply(
    links: js.Array[reactDashMdLib.Anon_Component],
    StringDictionary: // for the `component` prop until refactored out
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    activeIndex: scala.Int | scala.Double = null,
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    colored: js.UndefOr[scala.Boolean] = js.undefined,
    component: reactLib.reactMod.ReactNs.ReactType[_] = null,
    defaultActiveIndex: scala.Int | scala.Double = null,
    defaultVisible: js.UndefOr[scala.Boolean] = js.undefined,
    dynamic: js.UndefOr[scala.Boolean] = js.undefined,
    dynamicThreshold: scala.Int | scala.Double = null,
    lastChild: js.UndefOr[scala.Boolean] = js.undefined,
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
    onNavChange: js.Function2[
      /* activeIndex */ scala.Double, 
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onTouchCancel: js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], scala.Unit] = null,
    onTouchEnd: js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], scala.Unit] = null,
    onTouchMove: js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], scala.Unit] = null,
    onTouchStart: js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], scala.Unit] = null,
    onVisibilityChange: js.Function1[/* visible */ scala.Boolean, scala.Unit] = null,
    portal: js.UndefOr[scala.Boolean] = js.undefined,
    renderNode: js.Object = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    transitionDuration: scala.Int | scala.Double = null
  ): BottomNavigationProps = {
    val __obj = js.Dynamic.literal(links = links)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(colored)) __obj.updateDynamic("colored")(colored)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (defaultActiveIndex != null) __obj.updateDynamic("defaultActiveIndex")(defaultActiveIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultVisible)) __obj.updateDynamic("defaultVisible")(defaultVisible)
    if (!js.isUndefined(dynamic)) __obj.updateDynamic("dynamic")(dynamic)
    if (dynamicThreshold != null) __obj.updateDynamic("dynamicThreshold")(dynamicThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(lastChild)) __obj.updateDynamic("lastChild")(lastChild)
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
    if (onNavChange != null) __obj.updateDynamic("onNavChange")(onNavChange)
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (onVisibilityChange != null) __obj.updateDynamic("onVisibilityChange")(onVisibilityChange)
    if (!js.isUndefined(portal)) __obj.updateDynamic("portal")(portal)
    if (renderNode != null) __obj.updateDynamic("renderNode")(renderNode)
    if (style != null) __obj.updateDynamic("style")(style)
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomNavigationProps]
  }
}

