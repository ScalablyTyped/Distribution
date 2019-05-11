package typings
package rmcDashTabsLib.esDefaultTabBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsType
  extends rmcDashTabsLib.esPropsTypeMod.TabBarPropsType {
  /** default: rmc-tabs-tab-bar */
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
}

object PropsType {
  @scala.inline
  def apply(
    activeTab: scala.Double,
    animated: scala.Boolean,
    goToTab: scala.Double => scala.Unit,
    instanceId: scala.Double,
    tabs: js.Array[rmcDashTabsLib.esModelsMod.ModelsNs.TabData],
    onTabClick: (/* tab */ rmcDashTabsLib.esModelsMod.ModelsNs.TabData, /* index */ scala.Double) => scala.Unit = null,
    page: scala.Int | scala.Double = null,
    prefixCls: java.lang.String = null,
    renderTab: /* tab */ rmcDashTabsLib.esModelsMod.ModelsNs.TabData => reactLib.reactMod.ReactNode = null,
    renderUnderline: /* style */ reactLib.reactMod.CSSProperties | js.Any => reactLib.reactMod.ReactNode = null,
    tabBarActiveTextColor: java.lang.String = null,
    tabBarBackgroundColor: java.lang.String = null,
    tabBarInactiveTextColor: java.lang.String = null,
    tabBarPosition: rmcDashTabsLib.rmcDashTabsLibStrings.top | rmcDashTabsLib.rmcDashTabsLibStrings.bottom | rmcDashTabsLib.rmcDashTabsLibStrings.left | rmcDashTabsLib.rmcDashTabsLibStrings.right = null,
    tabBarTextStyle: reactLib.reactMod.CSSProperties | js.Any = null,
    tabBarUnderlineStyle: reactLib.reactMod.CSSProperties | js.Any = null
  ): PropsType = {
    val __obj = js.Dynamic.literal(activeTab = activeTab, animated = animated, goToTab = js.Any.fromFunction1(goToTab), instanceId = instanceId, tabs = tabs)
    if (onTabClick != null) __obj.updateDynamic("onTabClick")(js.Any.fromFunction2(onTabClick))
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (renderTab != null) __obj.updateDynamic("renderTab")(js.Any.fromFunction1(renderTab))
    if (renderUnderline != null) __obj.updateDynamic("renderUnderline")(js.Any.fromFunction1(renderUnderline))
    if (tabBarActiveTextColor != null) __obj.updateDynamic("tabBarActiveTextColor")(tabBarActiveTextColor)
    if (tabBarBackgroundColor != null) __obj.updateDynamic("tabBarBackgroundColor")(tabBarBackgroundColor)
    if (tabBarInactiveTextColor != null) __obj.updateDynamic("tabBarInactiveTextColor")(tabBarInactiveTextColor)
    if (tabBarPosition != null) __obj.updateDynamic("tabBarPosition")(tabBarPosition.asInstanceOf[js.Any])
    if (tabBarTextStyle != null) __obj.updateDynamic("tabBarTextStyle")(tabBarTextStyle.asInstanceOf[js.Any])
    if (tabBarUnderlineStyle != null) __obj.updateDynamic("tabBarUnderlineStyle")(tabBarUnderlineStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsType]
  }
}

