package typings.reactNavigationMaterialBottomTabs.typesMod

import typings.react.mod.ReactNode
import typings.reactNavigationMaterialBottomTabs.anon.DefaultHandler
import typings.reactNavigationMaterialBottomTabs.anon.Focused
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationMaterialBottomTabOptions extends js.Object {
  var tabBarAccessibilityLabel: js.UndefOr[String] = js.undefined
  var tabBarBadge: js.UndefOr[Boolean | Double | String] = js.undefined
  var tabBarColor: js.UndefOr[String] = js.undefined
  var tabBarIcon: js.UndefOr[ReactNode | (js.Function1[/* props */ Focused, ReactNode])] = js.undefined
  var tabBarLabel: js.UndefOr[ReactNode] = js.undefined
  var tabBarOnPress: js.UndefOr[js.Function1[/* props */ DefaultHandler, Unit]] = js.undefined
  var tabBarTestID: js.UndefOr[String] = js.undefined
  var tabBarVisible: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object NavigationMaterialBottomTabOptions {
  @scala.inline
  def apply(
    tabBarAccessibilityLabel: String = null,
    tabBarBadge: Boolean | Double | String = null,
    tabBarColor: String = null,
    tabBarIcon: ReactNode | (js.Function1[/* props */ Focused, ReactNode]) = null,
    tabBarLabel: ReactNode = null,
    tabBarOnPress: /* props */ DefaultHandler => Unit = null,
    tabBarTestID: String = null,
    tabBarVisible: js.UndefOr[Boolean] = js.undefined,
    title: String = null
  ): NavigationMaterialBottomTabOptions = {
    val __obj = js.Dynamic.literal()
    if (tabBarAccessibilityLabel != null) __obj.updateDynamic("tabBarAccessibilityLabel")(tabBarAccessibilityLabel.asInstanceOf[js.Any])
    if (tabBarBadge != null) __obj.updateDynamic("tabBarBadge")(tabBarBadge.asInstanceOf[js.Any])
    if (tabBarColor != null) __obj.updateDynamic("tabBarColor")(tabBarColor.asInstanceOf[js.Any])
    if (tabBarIcon != null) __obj.updateDynamic("tabBarIcon")(tabBarIcon.asInstanceOf[js.Any])
    if (tabBarLabel != null) __obj.updateDynamic("tabBarLabel")(tabBarLabel.asInstanceOf[js.Any])
    if (tabBarOnPress != null) __obj.updateDynamic("tabBarOnPress")(js.Any.fromFunction1(tabBarOnPress))
    if (tabBarTestID != null) __obj.updateDynamic("tabBarTestID")(tabBarTestID.asInstanceOf[js.Any])
    if (!js.isUndefined(tabBarVisible)) __obj.updateDynamic("tabBarVisible")(tabBarVisible.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationMaterialBottomTabOptions]
  }
}

