package typings
package reactDashMdLib.libButtonsButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactDashMdLib.libButtonsButtonMod.SharedButtonProps because var conflicts: disabled. Inlined tabIndex, iconBefore, `type`, primary, secondary, href, mini, flat, raised, icon, floating, iconClassName, iconChildren, iconEl, svg, forceIconSize, forceIconFontSize, swapTheming, label */ trait ButtonProps
  extends reactDashMdLib.libInksInjectInkMod.InjectedInkProps
     with reactDashMdLib.libTooltipsInjectTooltipMod.InjectedTooltipProps
     with // for the `component` prop until refactored out
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var fixed: js.UndefOr[scala.Boolean] = js.undefined
  var fixedPosition: js.UndefOr[FixedPositions] = js.undefined
  var flat: js.UndefOr[scala.Boolean] = js.undefined
  var floating: js.UndefOr[scala.Boolean] = js.undefined
  var forceIconFontSize: js.UndefOr[scala.Boolean] = js.undefined
  var forceIconSize: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  var href: js.UndefOr[java.lang.String] = js.undefined
  var icon: js.UndefOr[scala.Boolean] = js.undefined
  var iconBefore: js.UndefOr[scala.Boolean] = js.undefined
  var iconChildren: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var iconClassName: js.UndefOr[java.lang.String] = js.undefined
  var iconEl: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /**
    * @deprecated
    */
  var label: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var mini: js.UndefOr[scala.Boolean] = js.undefined
  var primary: js.UndefOr[scala.Boolean] = js.undefined
  var raised: js.UndefOr[scala.Boolean] = js.undefined
  var secondary: js.UndefOr[scala.Boolean] = js.undefined
  var svg: js.UndefOr[scala.Boolean] = js.undefined
  var swapTheming: js.UndefOr[scala.Boolean] = js.undefined
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[ButtonTypes] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply(
    StringDictionary: // for the `component` prop until refactored out
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    component: reactLib.reactMod.ReactNs.ReactType[_] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    disabledInteractions: js.Array[reactDashMdLib.libInksInjectInkMod.InteractionTypes] = null,
    fixed: js.UndefOr[scala.Boolean] = js.undefined,
    fixedPosition: FixedPositions = null,
    flat: js.UndefOr[scala.Boolean] = js.undefined,
    floating: js.UndefOr[scala.Boolean] = js.undefined,
    forceIconFontSize: js.UndefOr[scala.Boolean] = js.undefined,
    forceIconSize: scala.Boolean | scala.Double = null,
    href: java.lang.String = null,
    icon: js.UndefOr[scala.Boolean] = js.undefined,
    iconBefore: js.UndefOr[scala.Boolean] = js.undefined,
    iconChildren: reactLib.reactMod.ReactNs.ReactNode = null,
    iconClassName: java.lang.String = null,
    iconEl: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    inkClassName: java.lang.String = null,
    inkContainerClassName: java.lang.String = null,
    inkContainerStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    inkDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    inkStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    inkTransitionEnterTimeout: scala.Int | scala.Double = null,
    inkTransitionLeaveTimeout: scala.Int | scala.Double = null,
    inkTransitionOverlay: scala.Int | scala.Double = null,
    label: reactLib.reactMod.ReactNs.ReactNode = null,
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
    primary: js.UndefOr[scala.Boolean] = js.undefined,
    raised: js.UndefOr[scala.Boolean] = js.undefined,
    secondary: js.UndefOr[scala.Boolean] = js.undefined,
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
    `type`: ButtonTypes = null,
    waitForInkTransition: js.UndefOr[scala.Boolean] = js.undefined
  ): ButtonProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (disabledInteractions != null) __obj.updateDynamic("disabledInteractions")(disabledInteractions)
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed)
    if (fixedPosition != null) __obj.updateDynamic("fixedPosition")(fixedPosition)
    if (!js.isUndefined(flat)) __obj.updateDynamic("flat")(flat)
    if (!js.isUndefined(floating)) __obj.updateDynamic("floating")(floating)
    if (!js.isUndefined(forceIconFontSize)) __obj.updateDynamic("forceIconFontSize")(forceIconFontSize)
    if (forceIconSize != null) __obj.updateDynamic("forceIconSize")(forceIconSize.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href)
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon)
    if (!js.isUndefined(iconBefore)) __obj.updateDynamic("iconBefore")(iconBefore)
    if (iconChildren != null) __obj.updateDynamic("iconChildren")(iconChildren.asInstanceOf[js.Any])
    if (iconClassName != null) __obj.updateDynamic("iconClassName")(iconClassName)
    if (iconEl != null) __obj.updateDynamic("iconEl")(iconEl)
    if (inkClassName != null) __obj.updateDynamic("inkClassName")(inkClassName)
    if (inkContainerClassName != null) __obj.updateDynamic("inkContainerClassName")(inkContainerClassName)
    if (inkContainerStyle != null) __obj.updateDynamic("inkContainerStyle")(inkContainerStyle)
    if (!js.isUndefined(inkDisabled)) __obj.updateDynamic("inkDisabled")(inkDisabled)
    if (inkStyle != null) __obj.updateDynamic("inkStyle")(inkStyle)
    if (inkTransitionEnterTimeout != null) __obj.updateDynamic("inkTransitionEnterTimeout")(inkTransitionEnterTimeout.asInstanceOf[js.Any])
    if (inkTransitionLeaveTimeout != null) __obj.updateDynamic("inkTransitionLeaveTimeout")(inkTransitionLeaveTimeout.asInstanceOf[js.Any])
    if (inkTransitionOverlay != null) __obj.updateDynamic("inkTransitionOverlay")(inkTransitionOverlay.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
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
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    if (!js.isUndefined(raised)) __obj.updateDynamic("raised")(raised)
    if (!js.isUndefined(secondary)) __obj.updateDynamic("secondary")(secondary)
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
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(waitForInkTransition)) __obj.updateDynamic("waitForInkTransition")(waitForInkTransition)
    __obj.asInstanceOf[ButtonProps]
  }
}

