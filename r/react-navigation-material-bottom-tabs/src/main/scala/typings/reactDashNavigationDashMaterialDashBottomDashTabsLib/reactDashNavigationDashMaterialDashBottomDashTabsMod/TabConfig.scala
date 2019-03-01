package typings
package reactDashNavigationDashMaterialDashBottomDashTabsLib.reactDashNavigationDashMaterialDashBottomDashTabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabConfig extends js.Object {
  var activeTintColor: js.UndefOr[java.lang.String] = js.undefined
  var backBehavior: js.UndefOr[
    reactDashNavigationDashMaterialDashBottomDashTabsLib.reactDashNavigationDashMaterialDashBottomDashTabsLibStrings.initialRoute | reactDashNavigationDashMaterialDashBottomDashTabsLib.reactDashNavigationDashMaterialDashBottomDashTabsLibStrings.none
  ] = js.undefined
  var barStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var inactiveTintColor: js.UndefOr[java.lang.String] = js.undefined
  var initialRouteName: js.UndefOr[java.lang.String] = js.undefined
  var labeled: js.UndefOr[scala.Boolean] = js.undefined
  var order: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var paths: js.UndefOr[reactDashNavigationLib.reactDashNavigationMod.NavigationPathsConfig] = js.undefined
  var shifting: js.UndefOr[scala.Boolean] = js.undefined
}

object TabConfig {
  @scala.inline
  def apply(
    activeTintColor: java.lang.String = null,
    backBehavior: reactDashNavigationDashMaterialDashBottomDashTabsLib.reactDashNavigationDashMaterialDashBottomDashTabsLibStrings.initialRoute | reactDashNavigationDashMaterialDashBottomDashTabsLib.reactDashNavigationDashMaterialDashBottomDashTabsLibStrings.none = null,
    barStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    inactiveTintColor: java.lang.String = null,
    initialRouteName: java.lang.String = null,
    labeled: js.UndefOr[scala.Boolean] = js.undefined,
    order: js.Array[java.lang.String] = null,
    paths: reactDashNavigationLib.reactDashNavigationMod.NavigationPathsConfig = null,
    shifting: js.UndefOr[scala.Boolean] = js.undefined
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

