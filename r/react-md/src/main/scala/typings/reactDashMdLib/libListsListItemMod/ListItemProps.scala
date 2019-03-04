package typings
package reactDashMdLib.libListsListItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactDashMdLib.libListsListItemMod.BaseListItemProps because var conflicts: disabled. Inlined tileStyle, tileClassName, primaryText, secondaryText, leftIcon, leftAvatar, rightIcon, rightAvatar, threeLines, `aria-setsize`, `aria-posinset` */ trait ListItemProps
  extends reactDashMdLib.libInksInjectInkMod.InjectedInkProps
     with // for the `component` prop until refactored out
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var actionButtonIcon: js.UndefOr[java.lang.String] = js.undefined
  var actionButtonOnClick: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var actionButtonPrimary: js.UndefOr[scala.Boolean] = js.undefined
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var activeBoxClassName: js.UndefOr[java.lang.String] = js.undefined
  var activeBoxStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var activeClassName: js.UndefOr[java.lang.String] = js.undefined
  var animateNestedItems: js.UndefOr[scala.Boolean] = js.undefined
  var `aria-posinset`: js.UndefOr[scala.Double] = js.undefined
  var `aria-setsize`: js.UndefOr[scala.Double] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var contentClassName: js.UndefOr[java.lang.String] = js.undefined
  var contentStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /**
    * @deprecated
    */
  var defaultOpen: js.UndefOr[scala.Boolean] = js.undefined
  var defaultVisible: js.UndefOr[scala.Boolean] = js.undefined
  var expanderIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /**
    * @deprecated
    */
  var expanderIconChildren: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * @deprecated
    */
  var expanderIconClassName: js.UndefOr[java.lang.String] = js.undefined
  var expanderLeft: js.UndefOr[scala.Boolean] = js.undefined
  var inset: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @deprecated
    */
  var isOpen: js.UndefOr[scala.Boolean] = js.undefined
  var itemComponent: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var itemProps: js.UndefOr[js.Object] = js.undefined
  var itemRef: js.UndefOr[
    js.Function1[/* ref */ reactLib.reactMod.ReactNs.ReactHTMLElement[_] | scala.Null, scala.Null]
  ] = js.undefined
  var leftAvatar: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var leftIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var leftNodeClassName: js.UndefOr[java.lang.String] = js.undefined
  var leftNodeStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var nestedItems: js.UndefOr[js.Array[reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  var nestedListClassName: js.UndefOr[java.lang.String] = js.undefined
  var nestedListHeightRestricted: js.UndefOr[scala.Boolean] = js.undefined
  var nestedListStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var primaryText: reactLib.reactMod.ReactNs.ReactNode | js.UndefOr[reactLib.reactMod.ReactNs.ReactNode]
  var primaryTextClassName: js.UndefOr[java.lang.String] = js.undefined
  var primaryTextStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var renderChildrenOutside: js.UndefOr[scala.Boolean] = js.undefined
  var rightAvatar: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var rightIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var rightNodeClassName: js.UndefOr[java.lang.String] = js.undefined
  var rightNodeStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var secondaryText: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var secondaryTextClassName: js.UndefOr[java.lang.String] = js.undefined
  var secondaryTextStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  var threeLines: js.UndefOr[scala.Boolean] = js.undefined
  var tileClassName: js.UndefOr[java.lang.String] = js.undefined
  var tileStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object ListItemProps {
  @scala.inline
  def apply(
    primaryText: reactLib.reactMod.ReactNs.ReactNode,
    StringDictionary: // for the `component` prop until refactored out
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    actionButtonIcon: java.lang.String = null,
    actionButtonOnClick: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    actionButtonPrimary: js.UndefOr[scala.Boolean] = js.undefined,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    activeBoxClassName: java.lang.String = null,
    activeBoxStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    activeClassName: java.lang.String = null,
    animateNestedItems: js.UndefOr[scala.Boolean] = js.undefined,
    `aria-posinset`: scala.Int | scala.Double = null,
    `aria-setsize`: scala.Int | scala.Double = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    component: reactLib.reactMod.ReactNs.ReactType[_] = null,
    contentClassName: java.lang.String = null,
    contentStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    defaultOpen: js.UndefOr[scala.Boolean] = js.undefined,
    defaultVisible: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    disabledInteractions: js.Array[reactDashMdLib.libInksInjectInkMod.InteractionTypes] = null,
    expanderIcon: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    expanderIconChildren: reactLib.reactMod.ReactNs.ReactNode = null,
    expanderIconClassName: java.lang.String = null,
    expanderLeft: js.UndefOr[scala.Boolean] = js.undefined,
    inkClassName: java.lang.String = null,
    inkContainerClassName: java.lang.String = null,
    inkContainerStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    inkDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    inkStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    inkTransitionEnterTimeout: scala.Int | scala.Double = null,
    inkTransitionLeaveTimeout: scala.Int | scala.Double = null,
    inkTransitionOverlay: scala.Int | scala.Double = null,
    inset: js.UndefOr[scala.Boolean] = js.undefined,
    isOpen: js.UndefOr[scala.Boolean] = js.undefined,
    itemComponent: reactLib.reactMod.ReactNs.ReactType[_] = null,
    itemProps: js.Object = null,
    itemRef: js.Function1[/* ref */ reactLib.reactMod.ReactNs.ReactHTMLElement[_] | scala.Null, scala.Null] = null,
    leftAvatar: reactLib.reactMod.ReactNs.ReactNode = null,
    leftIcon: reactLib.reactMod.ReactNs.ReactNode = null,
    leftNodeClassName: java.lang.String = null,
    leftNodeStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    nestedItems: js.Array[reactLib.reactMod.ReactNs.ReactNode] = null,
    nestedListClassName: java.lang.String = null,
    nestedListHeightRestricted: js.UndefOr[scala.Boolean] = js.undefined,
    nestedListStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
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
    primaryTextClassName: java.lang.String = null,
    primaryTextStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    renderChildrenOutside: js.UndefOr[scala.Boolean] = js.undefined,
    rightAvatar: reactLib.reactMod.ReactNs.ReactNode = null,
    rightIcon: reactLib.reactMod.ReactNs.ReactNode = null,
    rightNodeClassName: java.lang.String = null,
    rightNodeStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    secondaryText: reactLib.reactMod.ReactNs.ReactNode = null,
    secondaryTextClassName: java.lang.String = null,
    secondaryTextStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    tabIndex: scala.Int | scala.Double = null,
    threeLines: js.UndefOr[scala.Boolean] = js.undefined,
    tileClassName: java.lang.String = null,
    tileStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    waitForInkTransition: js.UndefOr[scala.Boolean] = js.undefined
  ): ListItemProps = {
    val __obj = js.Dynamic.literal(primaryText = primaryText.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (actionButtonIcon != null) __obj.updateDynamic("actionButtonIcon")(actionButtonIcon)
    if (actionButtonOnClick != null) __obj.updateDynamic("actionButtonOnClick")(actionButtonOnClick)
    if (!js.isUndefined(actionButtonPrimary)) __obj.updateDynamic("actionButtonPrimary")(actionButtonPrimary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (activeBoxClassName != null) __obj.updateDynamic("activeBoxClassName")(activeBoxClassName)
    if (activeBoxStyle != null) __obj.updateDynamic("activeBoxStyle")(activeBoxStyle)
    if (activeClassName != null) __obj.updateDynamic("activeClassName")(activeClassName)
    if (!js.isUndefined(animateNestedItems)) __obj.updateDynamic("animateNestedItems")(animateNestedItems)
    if (`aria-posinset` != null) __obj.updateDynamic("aria-posinset")(`aria-posinset`.asInstanceOf[js.Any])
    if (`aria-setsize` != null) __obj.updateDynamic("aria-setsize")(`aria-setsize`.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName)
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle)
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen)
    if (!js.isUndefined(defaultVisible)) __obj.updateDynamic("defaultVisible")(defaultVisible)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (disabledInteractions != null) __obj.updateDynamic("disabledInteractions")(disabledInteractions)
    if (expanderIcon != null) __obj.updateDynamic("expanderIcon")(expanderIcon)
    if (expanderIconChildren != null) __obj.updateDynamic("expanderIconChildren")(expanderIconChildren.asInstanceOf[js.Any])
    if (expanderIconClassName != null) __obj.updateDynamic("expanderIconClassName")(expanderIconClassName)
    if (!js.isUndefined(expanderLeft)) __obj.updateDynamic("expanderLeft")(expanderLeft)
    if (inkClassName != null) __obj.updateDynamic("inkClassName")(inkClassName)
    if (inkContainerClassName != null) __obj.updateDynamic("inkContainerClassName")(inkContainerClassName)
    if (inkContainerStyle != null) __obj.updateDynamic("inkContainerStyle")(inkContainerStyle)
    if (!js.isUndefined(inkDisabled)) __obj.updateDynamic("inkDisabled")(inkDisabled)
    if (inkStyle != null) __obj.updateDynamic("inkStyle")(inkStyle)
    if (inkTransitionEnterTimeout != null) __obj.updateDynamic("inkTransitionEnterTimeout")(inkTransitionEnterTimeout.asInstanceOf[js.Any])
    if (inkTransitionLeaveTimeout != null) __obj.updateDynamic("inkTransitionLeaveTimeout")(inkTransitionLeaveTimeout.asInstanceOf[js.Any])
    if (inkTransitionOverlay != null) __obj.updateDynamic("inkTransitionOverlay")(inkTransitionOverlay.asInstanceOf[js.Any])
    if (!js.isUndefined(inset)) __obj.updateDynamic("inset")(inset)
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (itemComponent != null) __obj.updateDynamic("itemComponent")(itemComponent.asInstanceOf[js.Any])
    if (itemProps != null) __obj.updateDynamic("itemProps")(itemProps)
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef)
    if (leftAvatar != null) __obj.updateDynamic("leftAvatar")(leftAvatar.asInstanceOf[js.Any])
    if (leftIcon != null) __obj.updateDynamic("leftIcon")(leftIcon.asInstanceOf[js.Any])
    if (leftNodeClassName != null) __obj.updateDynamic("leftNodeClassName")(leftNodeClassName)
    if (leftNodeStyle != null) __obj.updateDynamic("leftNodeStyle")(leftNodeStyle)
    if (nestedItems != null) __obj.updateDynamic("nestedItems")(nestedItems)
    if (nestedListClassName != null) __obj.updateDynamic("nestedListClassName")(nestedListClassName)
    if (!js.isUndefined(nestedListHeightRestricted)) __obj.updateDynamic("nestedListHeightRestricted")(nestedListHeightRestricted)
    if (nestedListStyle != null) __obj.updateDynamic("nestedListStyle")(nestedListStyle)
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
    if (primaryTextClassName != null) __obj.updateDynamic("primaryTextClassName")(primaryTextClassName)
    if (primaryTextStyle != null) __obj.updateDynamic("primaryTextStyle")(primaryTextStyle)
    if (!js.isUndefined(renderChildrenOutside)) __obj.updateDynamic("renderChildrenOutside")(renderChildrenOutside)
    if (rightAvatar != null) __obj.updateDynamic("rightAvatar")(rightAvatar.asInstanceOf[js.Any])
    if (rightIcon != null) __obj.updateDynamic("rightIcon")(rightIcon.asInstanceOf[js.Any])
    if (rightNodeClassName != null) __obj.updateDynamic("rightNodeClassName")(rightNodeClassName)
    if (rightNodeStyle != null) __obj.updateDynamic("rightNodeStyle")(rightNodeStyle)
    if (secondaryText != null) __obj.updateDynamic("secondaryText")(secondaryText.asInstanceOf[js.Any])
    if (secondaryTextClassName != null) __obj.updateDynamic("secondaryTextClassName")(secondaryTextClassName)
    if (secondaryTextStyle != null) __obj.updateDynamic("secondaryTextStyle")(secondaryTextStyle)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(threeLines)) __obj.updateDynamic("threeLines")(threeLines)
    if (tileClassName != null) __obj.updateDynamic("tileClassName")(tileClassName)
    if (tileStyle != null) __obj.updateDynamic("tileStyle")(tileStyle)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (!js.isUndefined(waitForInkTransition)) __obj.updateDynamic("waitForInkTransition")(waitForInkTransition)
    __obj.asInstanceOf[ListItemProps]
  }
}

