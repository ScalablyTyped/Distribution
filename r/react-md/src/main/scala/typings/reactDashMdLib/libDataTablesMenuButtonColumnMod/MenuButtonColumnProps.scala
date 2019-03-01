package typings
package reactDashMdLib.libDataTablesMenuButtonColumnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuButtonColumnProps
  extends reactDashMdLib.libMenusMenuButtonMod.MenuButtonProps {
  var menuClassName: js.UndefOr[java.lang.String] = js.undefined
  var menuStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object MenuButtonColumnProps {
  @scala.inline
  def apply(
    anchor: reactDashMdLib.libHelpersLayoverMod.LayoverAnchor = null,
    belowAnchor: reactDashMdLib.libHelpersLayoverMod.LayoverAnchor = null,
    block: js.UndefOr[scala.Boolean] = js.undefined,
    buttonChildren: reactLib.reactMod.ReactNs.ReactNode = null,
    cascading: js.UndefOr[scala.Boolean] = js.undefined,
    cascadingAnchor: reactDashMdLib.Anon_XY = null,
    cascadingZDepth: scala.Int | scala.Double = null,
    centered: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    closeOnOutsideClick: js.UndefOr[scala.Boolean] = js.undefined,
    defaultOpen: js.UndefOr[scala.Boolean] = js.undefined,
    defaultVisible: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    disabledInteractions: js.Array[reactDashMdLib.libInksInjectInkMod.InteractionTypes] = null,
    fillViewportHeight: js.UndefOr[scala.Boolean] = js.undefined,
    fillViewportWidth: js.UndefOr[scala.Boolean] = js.undefined,
    fixedTo: js.Object | reactDashMdLib.Anon_X = null,
    flat: js.UndefOr[scala.Boolean] = js.undefined,
    floating: js.UndefOr[scala.Boolean] = js.undefined,
    forceIconFontSize: js.UndefOr[scala.Boolean] = js.undefined,
    forceIconSize: scala.Boolean | scala.Double = null,
    fullWidth: js.UndefOr[scala.Boolean] = js.undefined,
    href: java.lang.String = null,
    icon: js.UndefOr[scala.Boolean] = js.undefined,
    iconBefore: js.UndefOr[scala.Boolean] = js.undefined,
    iconChildren: reactLib.reactMod.ReactNs.ReactNode = null,
    iconClassName: java.lang.String = null,
    iconEl: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    id: reactDashMdLib.libMod.IdPropType = null,
    inkClassName: java.lang.String = null,
    inkContainerClassName: java.lang.String = null,
    inkContainerStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    inkDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    inkStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    inkTransitionEnterTimeout: scala.Int | scala.Double = null,
    inkTransitionLeaveTimeout: scala.Int | scala.Double = null,
    inkTransitionOverlay: scala.Int | scala.Double = null,
    isOpen: js.UndefOr[scala.Boolean] = js.undefined,
    label: reactLib.reactMod.ReactNs.ReactNode = null,
    listClassName: java.lang.String = null,
    listHeightRestricted: js.UndefOr[scala.Boolean] = js.undefined,
    listId: reactDashMdLib.libMod.IdPropType = null,
    listInline: js.UndefOr[scala.Boolean] = js.undefined,
    listProps: js.Object = null,
    listStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    listZDepth: scala.Int | scala.Double = null,
    menuClassName: java.lang.String = null,
    menuItems: scala.Double | java.lang.String | js.Object | reactLib.reactMod.ReactNs.ReactNode | (js.Array[
      scala.Double | java.lang.String | js.Object | reactLib.reactMod.ReactNs.ReactNode
    ]) = null,
    menuStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    minBottom: scala.Double | java.lang.String = null,
    minLeft: scala.Double | java.lang.String = null,
    minRight: scala.Double | java.lang.String = null,
    mini: js.UndefOr[scala.Boolean] = js.undefined,
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
    onMenuBlur: js.Function1[/* event */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLElement], scala.Unit] = null,
    onMenuClick: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMenuFocus: js.Function1[/* event */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLElement], scala.Unit] = null,
    onMenuKeyDown: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLElement], 
      scala.Unit
    ] = null,
    onMenuKeyUp: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLElement], 
      scala.Unit
    ] = null,
    onMenuMouseDown: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMenuMouseEnter: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMenuMouseLeave: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMenuMouseMove: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMenuMouseUp: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMenuToggle: js.Function = null,
    onMenuTouchCancel: js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], scala.Unit] = null,
    onMenuTouchEnd: js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], scala.Unit] = null,
    onMenuTouchMove: js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], scala.Unit] = null,
    onMenuTouchStart: js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], scala.Unit] = null,
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
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    position: reactDashMdLib.libHelpersLayoverMod.LayoverPositions = null,
    primary: js.UndefOr[scala.Boolean] = js.undefined,
    raised: js.UndefOr[scala.Boolean] = js.undefined,
    repositionOnResize: js.UndefOr[scala.Boolean] = js.undefined,
    repositionOnScroll: js.UndefOr[scala.Boolean] = js.undefined,
    sameWidth: js.UndefOr[scala.Boolean] = js.undefined,
    secondary: js.UndefOr[scala.Boolean] = js.undefined,
    simplifiedMenu: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    svg: js.UndefOr[scala.Boolean] = js.undefined,
    swapTheming: js.UndefOr[scala.Boolean] = js.undefined,
    tabIndex: scala.Int | scala.Double = null,
    tooltipClassName: java.lang.String = null,
    tooltipContainerClassName: java.lang.String = null,
    tooltipContainerStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    tooltipDelay: scala.Int | scala.Double = null,
    tooltipLabel: reactLib.reactMod.ReactNs.ReactNode = null,
    tooltipPosition: reactDashMdLib.libTooltipsInjectTooltipMod.Positions = null,
    tooltipStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    tooltipTransitionEnterTimeout: scala.Int | scala.Double = null,
    tooltipTransitionLeaveTimeout: scala.Int | scala.Double = null,
    transitionEnterTimeout: scala.Int | scala.Double = null,
    transitionLeaveTimeout: scala.Int | scala.Double = null,
    transitionName: java.lang.String = null,
    `type`: reactDashMdLib.libButtonsButtonMod.ButtonTypes = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    waitForInkTransition: js.UndefOr[scala.Boolean] = js.undefined,
    xThreshold: scala.Int | scala.Double = null,
    yThreshold: scala.Int | scala.Double = null
  ): MenuButtonColumnProps = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (belowAnchor != null) __obj.updateDynamic("belowAnchor")(belowAnchor)
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block)
    if (buttonChildren != null) __obj.updateDynamic("buttonChildren")(buttonChildren.asInstanceOf[js.Any])
    if (!js.isUndefined(cascading)) __obj.updateDynamic("cascading")(cascading)
    if (cascadingAnchor != null) __obj.updateDynamic("cascadingAnchor")(cascadingAnchor)
    if (cascadingZDepth != null) __obj.updateDynamic("cascadingZDepth")(cascadingZDepth.asInstanceOf[js.Any])
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(closeOnOutsideClick)) __obj.updateDynamic("closeOnOutsideClick")(closeOnOutsideClick)
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen)
    if (!js.isUndefined(defaultVisible)) __obj.updateDynamic("defaultVisible")(defaultVisible)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (disabledInteractions != null) __obj.updateDynamic("disabledInteractions")(disabledInteractions)
    if (!js.isUndefined(fillViewportHeight)) __obj.updateDynamic("fillViewportHeight")(fillViewportHeight)
    if (!js.isUndefined(fillViewportWidth)) __obj.updateDynamic("fillViewportWidth")(fillViewportWidth)
    if (fixedTo != null) __obj.updateDynamic("fixedTo")(fixedTo.asInstanceOf[js.Any])
    if (!js.isUndefined(flat)) __obj.updateDynamic("flat")(flat)
    if (!js.isUndefined(floating)) __obj.updateDynamic("floating")(floating)
    if (!js.isUndefined(forceIconFontSize)) __obj.updateDynamic("forceIconFontSize")(forceIconFontSize)
    if (forceIconSize != null) __obj.updateDynamic("forceIconSize")(forceIconSize.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth)
    if (href != null) __obj.updateDynamic("href")(href)
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon)
    if (!js.isUndefined(iconBefore)) __obj.updateDynamic("iconBefore")(iconBefore)
    if (iconChildren != null) __obj.updateDynamic("iconChildren")(iconChildren.asInstanceOf[js.Any])
    if (iconClassName != null) __obj.updateDynamic("iconClassName")(iconClassName)
    if (iconEl != null) __obj.updateDynamic("iconEl")(iconEl)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inkClassName != null) __obj.updateDynamic("inkClassName")(inkClassName)
    if (inkContainerClassName != null) __obj.updateDynamic("inkContainerClassName")(inkContainerClassName)
    if (inkContainerStyle != null) __obj.updateDynamic("inkContainerStyle")(inkContainerStyle)
    if (!js.isUndefined(inkDisabled)) __obj.updateDynamic("inkDisabled")(inkDisabled)
    if (inkStyle != null) __obj.updateDynamic("inkStyle")(inkStyle)
    if (inkTransitionEnterTimeout != null) __obj.updateDynamic("inkTransitionEnterTimeout")(inkTransitionEnterTimeout.asInstanceOf[js.Any])
    if (inkTransitionLeaveTimeout != null) __obj.updateDynamic("inkTransitionLeaveTimeout")(inkTransitionLeaveTimeout.asInstanceOf[js.Any])
    if (inkTransitionOverlay != null) __obj.updateDynamic("inkTransitionOverlay")(inkTransitionOverlay.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (listClassName != null) __obj.updateDynamic("listClassName")(listClassName)
    if (!js.isUndefined(listHeightRestricted)) __obj.updateDynamic("listHeightRestricted")(listHeightRestricted)
    if (listId != null) __obj.updateDynamic("listId")(listId.asInstanceOf[js.Any])
    if (!js.isUndefined(listInline)) __obj.updateDynamic("listInline")(listInline)
    if (listProps != null) __obj.updateDynamic("listProps")(listProps)
    if (listStyle != null) __obj.updateDynamic("listStyle")(listStyle)
    if (listZDepth != null) __obj.updateDynamic("listZDepth")(listZDepth.asInstanceOf[js.Any])
    if (menuClassName != null) __obj.updateDynamic("menuClassName")(menuClassName)
    if (menuItems != null) __obj.updateDynamic("menuItems")(menuItems.asInstanceOf[js.Any])
    if (menuStyle != null) __obj.updateDynamic("menuStyle")(menuStyle)
    if (minBottom != null) __obj.updateDynamic("minBottom")(minBottom.asInstanceOf[js.Any])
    if (minLeft != null) __obj.updateDynamic("minLeft")(minLeft.asInstanceOf[js.Any])
    if (minRight != null) __obj.updateDynamic("minRight")(minRight.asInstanceOf[js.Any])
    if (!js.isUndefined(mini)) __obj.updateDynamic("mini")(mini)
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
    if (onMenuBlur != null) __obj.updateDynamic("onMenuBlur")(onMenuBlur)
    if (onMenuClick != null) __obj.updateDynamic("onMenuClick")(onMenuClick)
    if (onMenuFocus != null) __obj.updateDynamic("onMenuFocus")(onMenuFocus)
    if (onMenuKeyDown != null) __obj.updateDynamic("onMenuKeyDown")(onMenuKeyDown)
    if (onMenuKeyUp != null) __obj.updateDynamic("onMenuKeyUp")(onMenuKeyUp)
    if (onMenuMouseDown != null) __obj.updateDynamic("onMenuMouseDown")(onMenuMouseDown)
    if (onMenuMouseEnter != null) __obj.updateDynamic("onMenuMouseEnter")(onMenuMouseEnter)
    if (onMenuMouseLeave != null) __obj.updateDynamic("onMenuMouseLeave")(onMenuMouseLeave)
    if (onMenuMouseMove != null) __obj.updateDynamic("onMenuMouseMove")(onMenuMouseMove)
    if (onMenuMouseUp != null) __obj.updateDynamic("onMenuMouseUp")(onMenuMouseUp)
    if (onMenuToggle != null) __obj.updateDynamic("onMenuToggle")(onMenuToggle)
    if (onMenuTouchCancel != null) __obj.updateDynamic("onMenuTouchCancel")(onMenuTouchCancel)
    if (onMenuTouchEnd != null) __obj.updateDynamic("onMenuTouchEnd")(onMenuTouchEnd)
    if (onMenuTouchMove != null) __obj.updateDynamic("onMenuTouchMove")(onMenuTouchMove)
    if (onMenuTouchStart != null) __obj.updateDynamic("onMenuTouchStart")(onMenuTouchStart)
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
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    if (!js.isUndefined(raised)) __obj.updateDynamic("raised")(raised)
    if (!js.isUndefined(repositionOnResize)) __obj.updateDynamic("repositionOnResize")(repositionOnResize)
    if (!js.isUndefined(repositionOnScroll)) __obj.updateDynamic("repositionOnScroll")(repositionOnScroll)
    if (!js.isUndefined(sameWidth)) __obj.updateDynamic("sameWidth")(sameWidth)
    if (!js.isUndefined(secondary)) __obj.updateDynamic("secondary")(secondary)
    if (!js.isUndefined(simplifiedMenu)) __obj.updateDynamic("simplifiedMenu")(simplifiedMenu)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(svg)) __obj.updateDynamic("svg")(svg)
    if (!js.isUndefined(swapTheming)) __obj.updateDynamic("swapTheming")(swapTheming)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (tooltipClassName != null) __obj.updateDynamic("tooltipClassName")(tooltipClassName)
    if (tooltipContainerClassName != null) __obj.updateDynamic("tooltipContainerClassName")(tooltipContainerClassName)
    if (tooltipContainerStyle != null) __obj.updateDynamic("tooltipContainerStyle")(tooltipContainerStyle)
    if (tooltipDelay != null) __obj.updateDynamic("tooltipDelay")(tooltipDelay.asInstanceOf[js.Any])
    if (tooltipLabel != null) __obj.updateDynamic("tooltipLabel")(tooltipLabel.asInstanceOf[js.Any])
    if (tooltipPosition != null) __obj.updateDynamic("tooltipPosition")(tooltipPosition)
    if (tooltipStyle != null) __obj.updateDynamic("tooltipStyle")(tooltipStyle)
    if (tooltipTransitionEnterTimeout != null) __obj.updateDynamic("tooltipTransitionEnterTimeout")(tooltipTransitionEnterTimeout.asInstanceOf[js.Any])
    if (tooltipTransitionLeaveTimeout != null) __obj.updateDynamic("tooltipTransitionLeaveTimeout")(tooltipTransitionLeaveTimeout.asInstanceOf[js.Any])
    if (transitionEnterTimeout != null) __obj.updateDynamic("transitionEnterTimeout")(transitionEnterTimeout.asInstanceOf[js.Any])
    if (transitionLeaveTimeout != null) __obj.updateDynamic("transitionLeaveTimeout")(transitionLeaveTimeout.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (!js.isUndefined(waitForInkTransition)) __obj.updateDynamic("waitForInkTransition")(waitForInkTransition)
    if (xThreshold != null) __obj.updateDynamic("xThreshold")(xThreshold.asInstanceOf[js.Any])
    if (yThreshold != null) __obj.updateDynamic("yThreshold")(yThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuButtonColumnProps]
  }
}

