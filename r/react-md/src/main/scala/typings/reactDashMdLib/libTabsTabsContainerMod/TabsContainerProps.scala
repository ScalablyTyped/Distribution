package typings
package reactDashMdLib.libTabsTabsContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsContainerProps
  extends reactDashMdLib.libMod.Props
     with // for the `component` prop until refactored out
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var activeTabIndex: js.UndefOr[scala.Double] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[reactDashMdLib.libTabsTabsMod.TabsProps]] = js.undefined
  var colored: js.UndefOr[scala.Boolean] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var defaultTabIndex: js.UndefOr[scala.Double] = js.undefined
  var fixed: js.UndefOr[scala.Boolean] = js.undefined
  var headerClassName: js.UndefOr[java.lang.String] = js.undefined
  var headerComponent: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var headerStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var headerZDepth: js.UndefOr[scala.Double] = js.undefined
  var labelAndIcon: js.UndefOr[scala.Boolean] = js.undefined
  var onTabChange: js.UndefOr[
    js.Function5[
      /* activeTabIndex */ scala.Double, 
      /* tabId */ reactDashMdLib.libMod.IdPropType, 
      /* tabControlsId */ scala.Double | java.lang.String, 
      /* tabChildren */ reactLib.reactMod.ReactNs.ReactNode, 
      /* event */ stdLib.Event, 
      scala.Unit
    ]
  ] = js.undefined
  var panelClassName: js.UndefOr[java.lang.String] = js.undefined
  var panelComponent: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var panelStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var slideClassName: js.UndefOr[java.lang.String] = js.undefined
  var slideStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var swipeableViewsClassName: js.UndefOr[java.lang.String] = js.undefined
  var swipeableViewsProps: js.UndefOr[js.Object] = js.undefined
  var swipeableViewsStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var toolbar: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
}

object TabsContainerProps {
  @scala.inline
  def apply(
    StringDictionary: // for the `component` prop until refactored out
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    activeTabIndex: scala.Int | scala.Double = null,
    children: reactLib.reactMod.ReactNs.ReactElement[reactDashMdLib.libTabsTabsMod.TabsProps] = null,
    className: java.lang.String = null,
    colored: js.UndefOr[scala.Boolean] = js.undefined,
    component: reactLib.reactMod.ReactNs.ReactType[_] = null,
    defaultTabIndex: scala.Int | scala.Double = null,
    fixed: js.UndefOr[scala.Boolean] = js.undefined,
    headerClassName: java.lang.String = null,
    headerComponent: reactLib.reactMod.ReactNs.ReactType[_] = null,
    headerStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    headerZDepth: scala.Int | scala.Double = null,
    labelAndIcon: js.UndefOr[scala.Boolean] = js.undefined,
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
    onMouseDown: /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseEnter: /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseLeave: /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseMove: /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseOut: /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseOver: /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseUp: /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onTabChange: (/* activeTabIndex */ scala.Double, /* tabId */ reactDashMdLib.libMod.IdPropType, /* tabControlsId */ scala.Double | java.lang.String, /* tabChildren */ reactLib.reactMod.ReactNs.ReactNode, /* event */ stdLib.Event) => scala.Unit = null,
    onTouchCancel: /* event */ reactLib.reactMod.ReactNs.TouchEvent[stdLib.HTMLElement] => scala.Unit = null,
    onTouchEnd: /* event */ reactLib.reactMod.ReactNs.TouchEvent[stdLib.HTMLElement] => scala.Unit = null,
    onTouchMove: /* event */ reactLib.reactMod.ReactNs.TouchEvent[stdLib.HTMLElement] => scala.Unit = null,
    onTouchStart: /* event */ reactLib.reactMod.ReactNs.TouchEvent[stdLib.HTMLElement] => scala.Unit = null,
    panelClassName: java.lang.String = null,
    panelComponent: reactLib.reactMod.ReactNs.ReactType[_] = null,
    panelStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    slideClassName: java.lang.String = null,
    slideStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    swipeableViewsClassName: java.lang.String = null,
    swipeableViewsProps: js.Object = null,
    swipeableViewsStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    toolbar: reactLib.reactMod.ReactNs.ReactElement[_] = null
  ): TabsContainerProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (activeTabIndex != null) __obj.updateDynamic("activeTabIndex")(activeTabIndex.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(colored)) __obj.updateDynamic("colored")(colored)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (defaultTabIndex != null) __obj.updateDynamic("defaultTabIndex")(defaultTabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed)
    if (headerClassName != null) __obj.updateDynamic("headerClassName")(headerClassName)
    if (headerComponent != null) __obj.updateDynamic("headerComponent")(headerComponent.asInstanceOf[js.Any])
    if (headerStyle != null) __obj.updateDynamic("headerStyle")(headerStyle)
    if (headerZDepth != null) __obj.updateDynamic("headerZDepth")(headerZDepth.asInstanceOf[js.Any])
    if (!js.isUndefined(labelAndIcon)) __obj.updateDynamic("labelAndIcon")(labelAndIcon)
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
    if (onTabChange != null) __obj.updateDynamic("onTabChange")(js.Any.fromFunction5(onTabChange))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (panelClassName != null) __obj.updateDynamic("panelClassName")(panelClassName)
    if (panelComponent != null) __obj.updateDynamic("panelComponent")(panelComponent.asInstanceOf[js.Any])
    if (panelStyle != null) __obj.updateDynamic("panelStyle")(panelStyle)
    if (slideClassName != null) __obj.updateDynamic("slideClassName")(slideClassName)
    if (slideStyle != null) __obj.updateDynamic("slideStyle")(slideStyle)
    if (style != null) __obj.updateDynamic("style")(style)
    if (swipeableViewsClassName != null) __obj.updateDynamic("swipeableViewsClassName")(swipeableViewsClassName)
    if (swipeableViewsProps != null) __obj.updateDynamic("swipeableViewsProps")(swipeableViewsProps)
    if (swipeableViewsStyle != null) __obj.updateDynamic("swipeableViewsStyle")(swipeableViewsStyle)
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar)
    __obj.asInstanceOf[TabsContainerProps]
  }
}

