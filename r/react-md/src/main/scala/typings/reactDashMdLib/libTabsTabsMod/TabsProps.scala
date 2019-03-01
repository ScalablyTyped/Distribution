package typings
package reactDashMdLib.libTabsTabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsProps
  extends reactDashMdLib.libMod.Props
     with // for the `component` prop until refactored out
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var activeTabClassName: js.UndefOr[java.lang.String] = js.undefined
  var activeTabIndex: js.UndefOr[scala.Double] = js.undefined
  var alignToKeyline: js.UndefOr[scala.Boolean] = js.undefined
  var centered: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactElement[reactDashMdLib.libTabsTabMod.TabProps] | js.Array[reactLib.reactMod.ReactNs.ReactElement[reactDashMdLib.libTabsTabMod.TabProps]]
  ] = js.undefined
  var colored: js.UndefOr[scala.Boolean] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var defaultMedia: js.UndefOr[reactDashMdLib.libDrawersDrawerMod.MediaType] = js.undefined
  var defaultTabIndex: js.UndefOr[scala.Double] = js.undefined
  var desktopMinWidth: js.UndefOr[scala.Double] = js.undefined
  var inactiveTabClassName: js.UndefOr[java.lang.String] = js.undefined
  var indicatorHeight: js.UndefOr[scala.Double] = js.undefined
  var nextIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /**
    * @deprecated
    */
  var nextIconChildren: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * @deprecated
    */
  var nextIconClassName: js.UndefOr[java.lang.String] = js.undefined
  var onTabChange: js.UndefOr[
    js.Function5[
      /* activeTabIndex */ scala.Double, 
      /* tabId */ reactDashMdLib.libMod.IdPropType, 
      /* tabControlsId */ reactDashMdLib.libMod.IdPropType, 
      /* tabChildren */ reactLib.reactMod.ReactNs.ReactNode, 
      /* event */ reactLib.Event, 
      scala.Unit
    ]
  ] = js.undefined
  var overflowMenu: js.UndefOr[scala.Boolean] = js.undefined
  var overflowMenuIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /**
    * @deprecated
    */
  var overflowMenuIconChildren: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * @deprecated
    */
  var overflowMenuIconClassName: js.UndefOr[java.lang.String] = js.undefined
  var overflowMenuLabel: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var previousIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /**
    * @deprecated
    */
  var previousIconChildren: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * @deprecated
    */
  var previousIconClassName: js.UndefOr[java.lang.String] = js.undefined
  var tabId: reactDashMdLib.libMod.IdPropType
}

object TabsProps {
  @scala.inline
  def apply(
    tabId: reactDashMdLib.libMod.IdPropType,
    StringDictionary: // for the `component` prop until refactored out
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    activeTabClassName: java.lang.String = null,
    activeTabIndex: scala.Int | scala.Double = null,
    alignToKeyline: js.UndefOr[scala.Boolean] = js.undefined,
    centered: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactElement[reactDashMdLib.libTabsTabMod.TabProps] | js.Array[reactLib.reactMod.ReactNs.ReactElement[reactDashMdLib.libTabsTabMod.TabProps]] = null,
    className: java.lang.String = null,
    colored: js.UndefOr[scala.Boolean] = js.undefined,
    component: reactLib.reactMod.ReactNs.ReactType[_] = null,
    defaultMedia: reactDashMdLib.libDrawersDrawerMod.MediaType = null,
    defaultTabIndex: scala.Int | scala.Double = null,
    desktopMinWidth: scala.Int | scala.Double = null,
    inactiveTabClassName: java.lang.String = null,
    indicatorHeight: scala.Int | scala.Double = null,
    nextIcon: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    nextIconChildren: reactLib.reactMod.ReactNs.ReactNode = null,
    nextIconClassName: java.lang.String = null,
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
    onTabChange: js.Function5[
      /* activeTabIndex */ scala.Double, 
      /* tabId */ reactDashMdLib.libMod.IdPropType, 
      /* tabControlsId */ reactDashMdLib.libMod.IdPropType, 
      /* tabChildren */ reactLib.reactMod.ReactNs.ReactNode, 
      /* event */ reactLib.Event, 
      scala.Unit
    ] = null,
    onTouchCancel: js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], scala.Unit] = null,
    onTouchEnd: js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], scala.Unit] = null,
    onTouchMove: js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], scala.Unit] = null,
    onTouchStart: js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], scala.Unit] = null,
    overflowMenu: js.UndefOr[scala.Boolean] = js.undefined,
    overflowMenuIcon: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    overflowMenuIconChildren: reactLib.reactMod.ReactNs.ReactNode = null,
    overflowMenuIconClassName: java.lang.String = null,
    overflowMenuLabel: reactLib.reactMod.ReactNs.ReactNode = null,
    previousIcon: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    previousIconChildren: reactLib.reactMod.ReactNs.ReactNode = null,
    previousIconClassName: java.lang.String = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): TabsProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("tabId")(tabId.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (activeTabClassName != null) __obj.updateDynamic("activeTabClassName")(activeTabClassName)
    if (activeTabIndex != null) __obj.updateDynamic("activeTabIndex")(activeTabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(alignToKeyline)) __obj.updateDynamic("alignToKeyline")(alignToKeyline)
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(colored)) __obj.updateDynamic("colored")(colored)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (defaultMedia != null) __obj.updateDynamic("defaultMedia")(defaultMedia)
    if (defaultTabIndex != null) __obj.updateDynamic("defaultTabIndex")(defaultTabIndex.asInstanceOf[js.Any])
    if (desktopMinWidth != null) __obj.updateDynamic("desktopMinWidth")(desktopMinWidth.asInstanceOf[js.Any])
    if (inactiveTabClassName != null) __obj.updateDynamic("inactiveTabClassName")(inactiveTabClassName)
    if (indicatorHeight != null) __obj.updateDynamic("indicatorHeight")(indicatorHeight.asInstanceOf[js.Any])
    if (nextIcon != null) __obj.updateDynamic("nextIcon")(nextIcon)
    if (nextIconChildren != null) __obj.updateDynamic("nextIconChildren")(nextIconChildren.asInstanceOf[js.Any])
    if (nextIconClassName != null) __obj.updateDynamic("nextIconClassName")(nextIconClassName)
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
    if (onTabChange != null) __obj.updateDynamic("onTabChange")(onTabChange)
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (!js.isUndefined(overflowMenu)) __obj.updateDynamic("overflowMenu")(overflowMenu)
    if (overflowMenuIcon != null) __obj.updateDynamic("overflowMenuIcon")(overflowMenuIcon)
    if (overflowMenuIconChildren != null) __obj.updateDynamic("overflowMenuIconChildren")(overflowMenuIconChildren.asInstanceOf[js.Any])
    if (overflowMenuIconClassName != null) __obj.updateDynamic("overflowMenuIconClassName")(overflowMenuIconClassName)
    if (overflowMenuLabel != null) __obj.updateDynamic("overflowMenuLabel")(overflowMenuLabel.asInstanceOf[js.Any])
    if (previousIcon != null) __obj.updateDynamic("previousIcon")(previousIcon)
    if (previousIconChildren != null) __obj.updateDynamic("previousIconChildren")(previousIconChildren.asInstanceOf[js.Any])
    if (previousIconClassName != null) __obj.updateDynamic("previousIconClassName")(previousIconClassName)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[TabsProps]
  }
}

