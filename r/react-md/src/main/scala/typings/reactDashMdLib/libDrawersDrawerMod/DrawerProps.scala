package typings
package reactDashMdLib.libDrawersDrawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerProps
  extends SharedDrawerProps
     with // for the `component` prop until refactored out
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var constantType: js.UndefOr[scala.Boolean] = js.undefined
  var desktopMinWidth: js.UndefOr[scala.Double] = js.undefined
  var desktopType: js.UndefOr[DrawerType] = js.undefined
  var header: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var mobileMinWidth: js.UndefOr[scala.Double] = js.undefined
  var mobileType: js.UndefOr[MobileDrawerType] = js.undefined
  /**
    * @deprecated
    */
  var onVisibilityToggle: js.UndefOr[
    js.Function2[
      /* visible */ scala.Boolean, 
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var tabletMinWidth: js.UndefOr[scala.Double] = js.undefined
  var tabletType: js.UndefOr[DrawerType] = js.undefined
  var transitionDuration: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[DrawerType] = js.undefined
  var zDepth: js.UndefOr[scala.Double] = js.undefined
}

object DrawerProps {
  @scala.inline
  def apply(
    StringDictionary: // for the `component` prop until refactored out
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    autoclose: js.UndefOr[scala.Boolean] = js.undefined,
    autocloseAfterInk: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    clickableDesktopOverlay: js.UndefOr[scala.Boolean] = js.undefined,
    component: reactLib.reactMod.ReactNs.ReactType[_] = null,
    constantType: js.UndefOr[scala.Boolean] = js.undefined,
    defaultMedia: MediaType = null,
    defaultVisible: js.UndefOr[scala.Boolean] = js.undefined,
    desktopMinWidth: scala.Int | scala.Double = null,
    desktopType: DrawerType = null,
    header: reactLib.reactMod.ReactNs.ReactNode = null,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    lastChild: js.UndefOr[scala.Boolean] = js.undefined,
    mobileMinWidth: scala.Int | scala.Double = null,
    mobileType: MobileDrawerType = null,
    navClassName: java.lang.String = null,
    navItems: js.Array[reactLib.reactMod.ReactNs.ReactElement[_] | NavItem] = null,
    navItemsId: reactDashMdLib.libMod.IdPropType = null,
    navStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
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
    onMediaTypeChange: js.Function2[/* type */ DrawerType, /* media */ reactDashMdLib.Anon_Desktop, scala.Unit] = null,
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
    onVisibilityChange: js.Function2[
      /* visible */ scala.Boolean, 
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onVisibilityToggle: js.Function2[
      /* visible */ scala.Boolean, 
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    overlay: js.UndefOr[scala.Boolean] = js.undefined,
    overlayClassName: java.lang.String = null,
    overlayStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    portal: js.UndefOr[scala.Boolean] = js.undefined,
    position: DrawerPosition = null,
    renderNode: js.Object = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    tabletMinWidth: scala.Int | scala.Double = null,
    tabletType: DrawerType = null,
    transitionDuration: scala.Int | scala.Double = null,
    `type`: DrawerType = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    zDepth: scala.Int | scala.Double = null
  ): DrawerProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(autoclose)) __obj.updateDynamic("autoclose")(autoclose)
    if (!js.isUndefined(autocloseAfterInk)) __obj.updateDynamic("autocloseAfterInk")(autocloseAfterInk)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(clickableDesktopOverlay)) __obj.updateDynamic("clickableDesktopOverlay")(clickableDesktopOverlay)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(constantType)) __obj.updateDynamic("constantType")(constantType)
    if (defaultMedia != null) __obj.updateDynamic("defaultMedia")(defaultMedia)
    if (!js.isUndefined(defaultVisible)) __obj.updateDynamic("defaultVisible")(defaultVisible)
    if (desktopMinWidth != null) __obj.updateDynamic("desktopMinWidth")(desktopMinWidth.asInstanceOf[js.Any])
    if (desktopType != null) __obj.updateDynamic("desktopType")(desktopType)
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (!js.isUndefined(lastChild)) __obj.updateDynamic("lastChild")(lastChild)
    if (mobileMinWidth != null) __obj.updateDynamic("mobileMinWidth")(mobileMinWidth.asInstanceOf[js.Any])
    if (mobileType != null) __obj.updateDynamic("mobileType")(mobileType)
    if (navClassName != null) __obj.updateDynamic("navClassName")(navClassName)
    if (navItems != null) __obj.updateDynamic("navItems")(navItems)
    if (navItemsId != null) __obj.updateDynamic("navItemsId")(navItemsId.asInstanceOf[js.Any])
    if (navStyle != null) __obj.updateDynamic("navStyle")(navStyle)
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
    if (onMediaTypeChange != null) __obj.updateDynamic("onMediaTypeChange")(onMediaTypeChange)
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
    if (onVisibilityChange != null) __obj.updateDynamic("onVisibilityChange")(onVisibilityChange)
    if (onVisibilityToggle != null) __obj.updateDynamic("onVisibilityToggle")(onVisibilityToggle)
    if (!js.isUndefined(overlay)) __obj.updateDynamic("overlay")(overlay)
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName)
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle)
    if (!js.isUndefined(portal)) __obj.updateDynamic("portal")(portal)
    if (position != null) __obj.updateDynamic("position")(position)
    if (renderNode != null) __obj.updateDynamic("renderNode")(renderNode)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabletMinWidth != null) __obj.updateDynamic("tabletMinWidth")(tabletMinWidth.asInstanceOf[js.Any])
    if (tabletType != null) __obj.updateDynamic("tabletType")(tabletType)
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (zDepth != null) __obj.updateDynamic("zDepth")(zDepth.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerProps]
  }
}

