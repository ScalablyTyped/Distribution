package typings.reactDashNavigationDashMaterialDashBottomDashTabs.reactDashNavigationDashMaterialDashBottomDashTabsMod

import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNavigation.reactDashNavigationMod.NavigationPathsConfig
import typings.reactDashNavigationDashMaterialDashBottomDashTabs.reactDashNavigationDashMaterialDashBottomDashTabsStrings.initialRoute
import typings.reactDashNavigationDashMaterialDashBottomDashTabs.reactDashNavigationDashMaterialDashBottomDashTabsStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabConfig extends js.Object {
  var activeTintColor: js.UndefOr[String] = js.undefined
  var backBehavior: js.UndefOr[initialRoute | none] = js.undefined
  var barStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var inactiveTintColor: js.UndefOr[String] = js.undefined
  var initialRouteName: js.UndefOr[String] = js.undefined
  var labeled: js.UndefOr[Boolean] = js.undefined
  var order: js.UndefOr[js.Array[String]] = js.undefined
  var paths: js.UndefOr[NavigationPathsConfig] = js.undefined
  var shifting: js.UndefOr[Boolean] = js.undefined
}

object TabConfig {
  @scala.inline
  def apply(
    activeTintColor: String = null,
    backBehavior: initialRoute | none = null,
    barStyle: StyleProp[ViewStyle] = null,
    inactiveTintColor: String = null,
    initialRouteName: String = null,
    labeled: js.UndefOr[Boolean] = js.undefined,
    order: js.Array[String] = null,
    paths: NavigationPathsConfig = null,
    shifting: js.UndefOr[Boolean] = js.undefined
  ): TabConfig = {
    val __obj = js.Dynamic.literal()
    if (activeTintColor != null) __obj.updateDynamic("activeTintColor")(activeTintColor)
    if (backBehavior != null) __obj.updateDynamic("backBehavior")(backBehavior.asInstanceOf[js.Any])
    if (barStyle != null) __obj.updateDynamic("barStyle")(barStyle.asInstanceOf[js.Any])
    if (inactiveTintColor != null) __obj.updateDynamic("inactiveTintColor")(inactiveTintColor)
    if (initialRouteName != null) __obj.updateDynamic("initialRouteName")(initialRouteName)
    if (!js.isUndefined(labeled)) __obj.updateDynamic("labeled")(labeled)
    if (order != null) __obj.updateDynamic("order")(order)
    if (paths != null) __obj.updateDynamic("paths")(paths)
    if (!js.isUndefined(shifting)) __obj.updateDynamic("shifting")(shifting)
    __obj.asInstanceOf[TabConfig]
  }
}

