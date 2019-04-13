package typings
package rmcDashTabsLib.libPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabBarPropsType extends js.Object {
  /** current active tab */
  var activeTab: scala.Double
  /** use animate | default: true */
  var animated: scala.Boolean
  var instanceId: scala.Double
  /** on tab click */
  var onTabClick: js.UndefOr[
    js.Function2[
      /* tab */ rmcDashTabsLib.libModelsMod.ModelsNs.TabData, 
      /* index */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  /** page size of tabbar's tab | default: 5 */
  var page: js.UndefOr[scala.Double] = js.undefined
  /** render the tab of tabbar */
  var renderTab: js.UndefOr[
    js.Function1[
      /* tab */ rmcDashTabsLib.libModelsMod.ModelsNs.TabData, 
      reactLib.reactMod.ReactNode
    ]
  ] = js.undefined
  /** render the underline of tabbar */
  var renderUnderline: js.UndefOr[
    js.Function1[/* style */ reactLib.reactMod.CSSProperties | js.Any, reactLib.reactMod.ReactNode]
  ] = js.undefined
  /** tabBar active text color */
  var tabBarActiveTextColor: js.UndefOr[java.lang.String] = js.undefined
  /** tabBar background color */
  var tabBarBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /** tabBar inactive text color */
  var tabBarInactiveTextColor: js.UndefOr[java.lang.String] = js.undefined
  /** tabBar's position | defualt: top */
  var tabBarPosition: js.UndefOr[
    rmcDashTabsLib.rmcDashTabsLibStrings.top | rmcDashTabsLib.rmcDashTabsLibStrings.bottom | rmcDashTabsLib.rmcDashTabsLibStrings.left | rmcDashTabsLib.rmcDashTabsLibStrings.right
  ] = js.undefined
  /** tabBar text style */
  var tabBarTextStyle: js.UndefOr[reactLib.reactMod.CSSProperties | js.Any] = js.undefined
  /** tabBar underline style */
  var tabBarUnderlineStyle: js.UndefOr[reactLib.reactMod.CSSProperties | js.Any] = js.undefined
  /** tabs data */
  var tabs: js.Array[rmcDashTabsLib.libModelsMod.ModelsNs.TabData]
  /** call this function to switch tab */
  def goToTab(index: scala.Double): scala.Unit
}

object TabBarPropsType {
  @scala.inline
  def apply(
    activeTab: scala.Double,
    animated: scala.Boolean,
    goToTab: scala.Double => scala.Unit,
    instanceId: scala.Double,
    tabs: js.Array[rmcDashTabsLib.libModelsMod.ModelsNs.TabData],
    onTabClick: (/* tab */ rmcDashTabsLib.libModelsMod.ModelsNs.TabData, /* index */ scala.Double) => scala.Unit = null,
    page: scala.Int | scala.Double = null,
    renderTab: /* tab */ rmcDashTabsLib.libModelsMod.ModelsNs.TabData => reactLib.reactMod.ReactNode = null,
    renderUnderline: /* style */ reactLib.reactMod.CSSProperties | js.Any => reactLib.reactMod.ReactNode = null,
    tabBarActiveTextColor: java.lang.String = null,
    tabBarBackgroundColor: java.lang.String = null,
    tabBarInactiveTextColor: java.lang.String = null,
    tabBarPosition: rmcDashTabsLib.rmcDashTabsLibStrings.top | rmcDashTabsLib.rmcDashTabsLibStrings.bottom | rmcDashTabsLib.rmcDashTabsLibStrings.left | rmcDashTabsLib.rmcDashTabsLibStrings.right = null,
    tabBarTextStyle: reactLib.reactMod.CSSProperties | js.Any = null,
    tabBarUnderlineStyle: reactLib.reactMod.CSSProperties | js.Any = null
  ): TabBarPropsType = {
    val __obj = js.Dynamic.literal(activeTab = activeTab, animated = animated, goToTab = js.Any.fromFunction1(goToTab), instanceId = instanceId, tabs = tabs)
    if (onTabClick != null) __obj.updateDynamic("onTabClick")(js.Any.fromFunction2(onTabClick))
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (renderTab != null) __obj.updateDynamic("renderTab")(js.Any.fromFunction1(renderTab))
    if (renderUnderline != null) __obj.updateDynamic("renderUnderline")(js.Any.fromFunction1(renderUnderline))
    if (tabBarActiveTextColor != null) __obj.updateDynamic("tabBarActiveTextColor")(tabBarActiveTextColor)
    if (tabBarBackgroundColor != null) __obj.updateDynamic("tabBarBackgroundColor")(tabBarBackgroundColor)
    if (tabBarInactiveTextColor != null) __obj.updateDynamic("tabBarInactiveTextColor")(tabBarInactiveTextColor)
    if (tabBarPosition != null) __obj.updateDynamic("tabBarPosition")(tabBarPosition.asInstanceOf[js.Any])
    if (tabBarTextStyle != null) __obj.updateDynamic("tabBarTextStyle")(tabBarTextStyle.asInstanceOf[js.Any])
    if (tabBarUnderlineStyle != null) __obj.updateDynamic("tabBarUnderlineStyle")(tabBarUnderlineStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabBarPropsType]
  }
}

