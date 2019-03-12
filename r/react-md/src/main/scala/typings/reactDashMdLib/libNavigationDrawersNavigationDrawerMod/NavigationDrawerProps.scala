package typings
package reactDashMdLib.libNavigationDrawersNavigationDrawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationDrawerProps
  extends reactDashMdLib.libDrawersDrawerMod.SharedDrawerProps {
  var constantDrawerType: js.UndefOr[scala.Boolean] = js.undefined
  var contentClassName: js.UndefOr[java.lang.String] = js.undefined
  var contentComponent: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var contentId: js.UndefOr[reactDashMdLib.libMod.IdPropType] = js.undefined
  var contentProps: js.UndefOr[js.Object] = js.undefined
  var contentStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var desktopDrawerType: js.UndefOr[reactDashMdLib.libDrawersDrawerMod.DrawerType] = js.undefined
  var desktopMinWidth: js.UndefOr[scala.Double] = js.undefined
  var drawerChildren: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var drawerClassName: js.UndefOr[java.lang.String] = js.undefined
  var drawerHeader: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var drawerHeaderChildren: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var drawerId: js.UndefOr[reactDashMdLib.libMod.IdPropType] = js.undefined
  var drawerStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var drawerTitle: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var drawerTransitionDuration: js.UndefOr[scala.Double] = js.undefined
  var drawerType: js.UndefOr[reactDashMdLib.libDrawersDrawerMod.DrawerType] = js.undefined
  var drawerZDepth: js.UndefOr[scala.Double] = js.undefined
  var extractMini: js.UndefOr[scala.Boolean] = js.undefined
  var footer: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var includeDrawerHeader: js.UndefOr[scala.Boolean] = js.undefined
  var jumpLabel: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var miniDrawerChildren: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var miniDrawerClassName: js.UndefOr[java.lang.String] = js.undefined
  var miniDrawerHeader: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var miniDrawerId: js.UndefOr[reactDashMdLib.libMod.IdPropType] = js.undefined
  var miniDrawerStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var miniNavClassName: js.UndefOr[java.lang.String] = js.undefined
  var miniNavItemsId: js.UndefOr[reactDashMdLib.libMod.IdPropType] = js.undefined
  var miniNavStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var mobileDrawerType: js.UndefOr[reactDashMdLib.libDrawersDrawerMod.MobileDrawerType] = js.undefined
  var mobileMinWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * @deprecated
    */
  var onVisibilityToggle: js.UndefOr[js.Function2[/* visible */ scala.Boolean, /* event */ stdLib.Event, scala.Unit]] = js.undefined
  var persistentIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /**
    * @deprecated
    */
  var persistentIconChildren: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * @deprecated
    */
  var persistentIconClassName: js.UndefOr[java.lang.String] = js.undefined
  var tabletDrawerType: js.UndefOr[reactDashMdLib.libDrawersDrawerMod.DrawerType] = js.undefined
  var tabletMinWidth: js.UndefOr[scala.Double] = js.undefined
  var temporaryIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /**
    * @deprecated
    */
  var temporaryIconChildren: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * @deprecated
    */
  var temporaryIconClassName: js.UndefOr[java.lang.String] = js.undefined
  var toolbarActions: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactElement[_] | js.Array[reactLib.reactMod.ReactNs.ReactElement[_]]
  ] = js.undefined
  var toolbarChildren: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var toolbarClassName: js.UndefOr[java.lang.String] = js.undefined
  var toolbarId: js.UndefOr[reactDashMdLib.libMod.IdPropType] = js.undefined
  var toolbarProminent: js.UndefOr[scala.Boolean] = js.undefined
  var toolbarProminentTitle: js.UndefOr[scala.Boolean] = js.undefined
  var toolbarSingleColor: js.UndefOr[scala.Boolean] = js.undefined
  var toolbarStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var toolbarThemeType: js.UndefOr[
    reactDashMdLib.reactDashMdLibStrings.default | reactDashMdLib.reactDashMdLibStrings.colored | reactDashMdLib.reactDashMdLibStrings.themed
  ] = js.undefined
  var toolbarTitle: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var toolbarTitleClassName: js.UndefOr[java.lang.String] = js.undefined
  var toolbarTitleMenu: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  var toolbarTitleStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var toolbarZDepth: js.UndefOr[scala.Double] = js.undefined
  var transitionEnterTimeout: js.UndefOr[scala.Double] = js.undefined
  var transitionLeaveTimeout: js.UndefOr[scala.Double] = js.undefined
  var transitionName: js.UndefOr[java.lang.String] = js.undefined
}

object NavigationDrawerProps {
  @scala.inline
  def apply(
    autoclose: js.UndefOr[scala.Boolean] = js.undefined,
    autocloseAfterInk: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    clickableDesktopOverlay: js.UndefOr[scala.Boolean] = js.undefined,
    constantDrawerType: js.UndefOr[scala.Boolean] = js.undefined,
    contentClassName: java.lang.String = null,
    contentComponent: reactLib.reactMod.ReactNs.ReactType[_] = null,
    contentId: reactDashMdLib.libMod.IdPropType = null,
    contentProps: js.Object = null,
    contentStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    defaultMedia: reactDashMdLib.libDrawersDrawerMod.MediaType = null,
    defaultVisible: js.UndefOr[scala.Boolean] = js.undefined,
    desktopDrawerType: reactDashMdLib.libDrawersDrawerMod.DrawerType = null,
    desktopMinWidth: scala.Int | scala.Double = null,
    drawerChildren: reactLib.reactMod.ReactNs.ReactNode = null,
    drawerClassName: java.lang.String = null,
    drawerHeader: reactLib.reactMod.ReactNs.ReactNode = null,
    drawerHeaderChildren: reactLib.reactMod.ReactNs.ReactNode = null,
    drawerId: reactDashMdLib.libMod.IdPropType = null,
    drawerStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    drawerTitle: reactLib.reactMod.ReactNs.ReactNode = null,
    drawerTransitionDuration: scala.Int | scala.Double = null,
    drawerType: reactDashMdLib.libDrawersDrawerMod.DrawerType = null,
    drawerZDepth: scala.Int | scala.Double = null,
    extractMini: js.UndefOr[scala.Boolean] = js.undefined,
    footer: reactLib.reactMod.ReactNs.ReactNode = null,
    includeDrawerHeader: js.UndefOr[scala.Boolean] = js.undefined,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    jumpLabel: reactLib.reactMod.ReactNs.ReactNode = null,
    lastChild: js.UndefOr[scala.Boolean] = js.undefined,
    miniDrawerChildren: reactLib.reactMod.ReactNs.ReactNode = null,
    miniDrawerClassName: java.lang.String = null,
    miniDrawerHeader: reactLib.reactMod.ReactNs.ReactNode = null,
    miniDrawerId: reactDashMdLib.libMod.IdPropType = null,
    miniDrawerStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    miniNavClassName: java.lang.String = null,
    miniNavItemsId: reactDashMdLib.libMod.IdPropType = null,
    miniNavStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    mobileDrawerType: reactDashMdLib.libDrawersDrawerMod.MobileDrawerType = null,
    mobileMinWidth: scala.Int | scala.Double = null,
    navClassName: java.lang.String = null,
    navItems: js.Array[
      reactLib.reactMod.ReactNs.ReactElement[_] | reactDashMdLib.libDrawersDrawerMod.NavItem
    ] = null,
    navItemsId: reactDashMdLib.libMod.IdPropType = null,
    navStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    onBlur: /* event */ reactLib.reactMod.ReactNs.FocusEvent[stdLib.HTMLElement] => scala.Unit = null,
    onClick: /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onDrag: /* event */ reactLib.reactMod.ReactNs.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragEnd: /* event */ reactLib.reactMod.ReactNs.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragEnter: /* event */ reactLib.reactMod.ReactNs.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragExit: /* event */ reactLib.reactMod.ReactNs.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragLeave: /* event */ reactLib.reactMod.ReactNs.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragOver: /* event */ reactLib.reactMod.ReactNs.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragStart: /* event */ reactLib.reactMod.ReactNs.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDrop: /* event */ reactLib.reactMod.ReactNs.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onFocus: /* event */ reactLib.reactMod.ReactNs.FocusEvent[stdLib.HTMLElement] => scala.Unit = null,
    onKeyDown: /* event */ reactLib.reactMod.ReactNs.KeyboardEvent[stdLib.HTMLElement] => scala.Unit = null,
    onKeyUp: /* event */ reactLib.reactMod.ReactNs.KeyboardEvent[stdLib.HTMLElement] => scala.Unit = null,
    onMediaTypeChange: (/* type */ reactDashMdLib.libDrawersDrawerMod.DrawerType, /* media */ reactDashMdLib.Anon_Desktop) => scala.Unit = null,
    onMouseDown: /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseEnter: /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseLeave: /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseMove: /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseOut: /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseOver: /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseUp: /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onTouchCancel: /* event */ reactLib.reactMod.ReactNs.TouchEvent[stdLib.HTMLElement] => scala.Unit = null,
    onTouchEnd: /* event */ reactLib.reactMod.ReactNs.TouchEvent[stdLib.HTMLElement] => scala.Unit = null,
    onTouchMove: /* event */ reactLib.reactMod.ReactNs.TouchEvent[stdLib.HTMLElement] => scala.Unit = null,
    onTouchStart: /* event */ reactLib.reactMod.ReactNs.TouchEvent[stdLib.HTMLElement] => scala.Unit = null,
    onVisibilityChange: (/* visible */ scala.Boolean, /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent]) => scala.Unit = null,
    onVisibilityToggle: (/* visible */ scala.Boolean, /* event */ stdLib.Event) => scala.Unit = null,
    overlay: js.UndefOr[scala.Boolean] = js.undefined,
    overlayClassName: java.lang.String = null,
    overlayStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    persistentIcon: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    persistentIconChildren: reactLib.reactMod.ReactNs.ReactNode = null,
    persistentIconClassName: java.lang.String = null,
    portal: js.UndefOr[scala.Boolean] = js.undefined,
    position: reactDashMdLib.libDrawersDrawerMod.DrawerPosition = null,
    renderNode: js.Object = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    tabletDrawerType: reactDashMdLib.libDrawersDrawerMod.DrawerType = null,
    tabletMinWidth: scala.Int | scala.Double = null,
    temporaryIcon: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    temporaryIconChildren: reactLib.reactMod.ReactNs.ReactNode = null,
    temporaryIconClassName: java.lang.String = null,
    toolbarActions: reactLib.reactMod.ReactNs.ReactElement[_] | js.Array[reactLib.reactMod.ReactNs.ReactElement[_]] = null,
    toolbarChildren: reactLib.reactMod.ReactNs.ReactNode = null,
    toolbarClassName: java.lang.String = null,
    toolbarId: reactDashMdLib.libMod.IdPropType = null,
    toolbarProminent: js.UndefOr[scala.Boolean] = js.undefined,
    toolbarProminentTitle: js.UndefOr[scala.Boolean] = js.undefined,
    toolbarSingleColor: js.UndefOr[scala.Boolean] = js.undefined,
    toolbarStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    toolbarThemeType: reactDashMdLib.reactDashMdLibStrings.default | reactDashMdLib.reactDashMdLibStrings.colored | reactDashMdLib.reactDashMdLibStrings.themed = null,
    toolbarTitle: reactLib.reactMod.ReactNs.ReactNode = null,
    toolbarTitleClassName: java.lang.String = null,
    toolbarTitleMenu: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    toolbarTitleStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    toolbarZDepth: scala.Int | scala.Double = null,
    transitionEnterTimeout: scala.Int | scala.Double = null,
    transitionLeaveTimeout: scala.Int | scala.Double = null,
    transitionName: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): NavigationDrawerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoclose)) __obj.updateDynamic("autoclose")(autoclose)
    if (!js.isUndefined(autocloseAfterInk)) __obj.updateDynamic("autocloseAfterInk")(autocloseAfterInk)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(clickableDesktopOverlay)) __obj.updateDynamic("clickableDesktopOverlay")(clickableDesktopOverlay)
    if (!js.isUndefined(constantDrawerType)) __obj.updateDynamic("constantDrawerType")(constantDrawerType)
    if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName)
    if (contentComponent != null) __obj.updateDynamic("contentComponent")(contentComponent.asInstanceOf[js.Any])
    if (contentId != null) __obj.updateDynamic("contentId")(contentId.asInstanceOf[js.Any])
    if (contentProps != null) __obj.updateDynamic("contentProps")(contentProps)
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle)
    if (defaultMedia != null) __obj.updateDynamic("defaultMedia")(defaultMedia)
    if (!js.isUndefined(defaultVisible)) __obj.updateDynamic("defaultVisible")(defaultVisible)
    if (desktopDrawerType != null) __obj.updateDynamic("desktopDrawerType")(desktopDrawerType)
    if (desktopMinWidth != null) __obj.updateDynamic("desktopMinWidth")(desktopMinWidth.asInstanceOf[js.Any])
    if (drawerChildren != null) __obj.updateDynamic("drawerChildren")(drawerChildren.asInstanceOf[js.Any])
    if (drawerClassName != null) __obj.updateDynamic("drawerClassName")(drawerClassName)
    if (drawerHeader != null) __obj.updateDynamic("drawerHeader")(drawerHeader.asInstanceOf[js.Any])
    if (drawerHeaderChildren != null) __obj.updateDynamic("drawerHeaderChildren")(drawerHeaderChildren.asInstanceOf[js.Any])
    if (drawerId != null) __obj.updateDynamic("drawerId")(drawerId.asInstanceOf[js.Any])
    if (drawerStyle != null) __obj.updateDynamic("drawerStyle")(drawerStyle)
    if (drawerTitle != null) __obj.updateDynamic("drawerTitle")(drawerTitle.asInstanceOf[js.Any])
    if (drawerTransitionDuration != null) __obj.updateDynamic("drawerTransitionDuration")(drawerTransitionDuration.asInstanceOf[js.Any])
    if (drawerType != null) __obj.updateDynamic("drawerType")(drawerType)
    if (drawerZDepth != null) __obj.updateDynamic("drawerZDepth")(drawerZDepth.asInstanceOf[js.Any])
    if (!js.isUndefined(extractMini)) __obj.updateDynamic("extractMini")(extractMini)
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (!js.isUndefined(includeDrawerHeader)) __obj.updateDynamic("includeDrawerHeader")(includeDrawerHeader)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (jumpLabel != null) __obj.updateDynamic("jumpLabel")(jumpLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(lastChild)) __obj.updateDynamic("lastChild")(lastChild)
    if (miniDrawerChildren != null) __obj.updateDynamic("miniDrawerChildren")(miniDrawerChildren.asInstanceOf[js.Any])
    if (miniDrawerClassName != null) __obj.updateDynamic("miniDrawerClassName")(miniDrawerClassName)
    if (miniDrawerHeader != null) __obj.updateDynamic("miniDrawerHeader")(miniDrawerHeader.asInstanceOf[js.Any])
    if (miniDrawerId != null) __obj.updateDynamic("miniDrawerId")(miniDrawerId.asInstanceOf[js.Any])
    if (miniDrawerStyle != null) __obj.updateDynamic("miniDrawerStyle")(miniDrawerStyle)
    if (miniNavClassName != null) __obj.updateDynamic("miniNavClassName")(miniNavClassName)
    if (miniNavItemsId != null) __obj.updateDynamic("miniNavItemsId")(miniNavItemsId.asInstanceOf[js.Any])
    if (miniNavStyle != null) __obj.updateDynamic("miniNavStyle")(miniNavStyle)
    if (mobileDrawerType != null) __obj.updateDynamic("mobileDrawerType")(mobileDrawerType)
    if (mobileMinWidth != null) __obj.updateDynamic("mobileMinWidth")(mobileMinWidth.asInstanceOf[js.Any])
    if (navClassName != null) __obj.updateDynamic("navClassName")(navClassName)
    if (navItems != null) __obj.updateDynamic("navItems")(navItems)
    if (navItemsId != null) __obj.updateDynamic("navItemsId")(navItemsId.asInstanceOf[js.Any])
    if (navStyle != null) __obj.updateDynamic("navStyle")(navStyle)
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
    if (onMediaTypeChange != null) __obj.updateDynamic("onMediaTypeChange")(js.Any.fromFunction2(onMediaTypeChange))
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
    if (onVisibilityChange != null) __obj.updateDynamic("onVisibilityChange")(js.Any.fromFunction2(onVisibilityChange))
    if (onVisibilityToggle != null) __obj.updateDynamic("onVisibilityToggle")(js.Any.fromFunction2(onVisibilityToggle))
    if (!js.isUndefined(overlay)) __obj.updateDynamic("overlay")(overlay)
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName)
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle)
    if (persistentIcon != null) __obj.updateDynamic("persistentIcon")(persistentIcon)
    if (persistentIconChildren != null) __obj.updateDynamic("persistentIconChildren")(persistentIconChildren.asInstanceOf[js.Any])
    if (persistentIconClassName != null) __obj.updateDynamic("persistentIconClassName")(persistentIconClassName)
    if (!js.isUndefined(portal)) __obj.updateDynamic("portal")(portal)
    if (position != null) __obj.updateDynamic("position")(position)
    if (renderNode != null) __obj.updateDynamic("renderNode")(renderNode)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabletDrawerType != null) __obj.updateDynamic("tabletDrawerType")(tabletDrawerType)
    if (tabletMinWidth != null) __obj.updateDynamic("tabletMinWidth")(tabletMinWidth.asInstanceOf[js.Any])
    if (temporaryIcon != null) __obj.updateDynamic("temporaryIcon")(temporaryIcon)
    if (temporaryIconChildren != null) __obj.updateDynamic("temporaryIconChildren")(temporaryIconChildren.asInstanceOf[js.Any])
    if (temporaryIconClassName != null) __obj.updateDynamic("temporaryIconClassName")(temporaryIconClassName)
    if (toolbarActions != null) __obj.updateDynamic("toolbarActions")(toolbarActions.asInstanceOf[js.Any])
    if (toolbarChildren != null) __obj.updateDynamic("toolbarChildren")(toolbarChildren.asInstanceOf[js.Any])
    if (toolbarClassName != null) __obj.updateDynamic("toolbarClassName")(toolbarClassName)
    if (toolbarId != null) __obj.updateDynamic("toolbarId")(toolbarId.asInstanceOf[js.Any])
    if (!js.isUndefined(toolbarProminent)) __obj.updateDynamic("toolbarProminent")(toolbarProminent)
    if (!js.isUndefined(toolbarProminentTitle)) __obj.updateDynamic("toolbarProminentTitle")(toolbarProminentTitle)
    if (!js.isUndefined(toolbarSingleColor)) __obj.updateDynamic("toolbarSingleColor")(toolbarSingleColor)
    if (toolbarStyle != null) __obj.updateDynamic("toolbarStyle")(toolbarStyle)
    if (toolbarThemeType != null) __obj.updateDynamic("toolbarThemeType")(toolbarThemeType.asInstanceOf[js.Any])
    if (toolbarTitle != null) __obj.updateDynamic("toolbarTitle")(toolbarTitle.asInstanceOf[js.Any])
    if (toolbarTitleClassName != null) __obj.updateDynamic("toolbarTitleClassName")(toolbarTitleClassName)
    if (toolbarTitleMenu != null) __obj.updateDynamic("toolbarTitleMenu")(toolbarTitleMenu)
    if (toolbarTitleStyle != null) __obj.updateDynamic("toolbarTitleStyle")(toolbarTitleStyle)
    if (toolbarZDepth != null) __obj.updateDynamic("toolbarZDepth")(toolbarZDepth.asInstanceOf[js.Any])
    if (transitionEnterTimeout != null) __obj.updateDynamic("transitionEnterTimeout")(transitionEnterTimeout.asInstanceOf[js.Any])
    if (transitionLeaveTimeout != null) __obj.updateDynamic("transitionLeaveTimeout")(transitionLeaveTimeout.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[NavigationDrawerProps]
  }
}

