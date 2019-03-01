package typings
package reactDashNavigationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveBackgroundColorActiveTintColor extends js.Object {
  var activeBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var activeTintColor: js.UndefOr[java.lang.String] = js.undefined
  var allowFontScaling: js.UndefOr[scala.Boolean] = js.undefined
  var iconStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var inactiveBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var inactiveTintColor: js.UndefOr[java.lang.String] = js.undefined
  var indicatorStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var labelStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  var pressColor: js.UndefOr[java.lang.String] = js.undefined
  var pressOpacity: js.UndefOr[scala.Double] = js.undefined
  var scrollEnabled: js.UndefOr[scala.Boolean] = js.undefined
  // Top
  var showIcon: js.UndefOr[scala.Boolean] = js.undefined
  var showLabel: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var tabStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var upperCaseLabel: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ActiveBackgroundColorActiveTintColor {
  @scala.inline
  def apply(
    activeBackgroundColor: java.lang.String = null,
    activeTintColor: java.lang.String = null,
    allowFontScaling: js.UndefOr[scala.Boolean] = js.undefined,
    iconStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    inactiveBackgroundColor: java.lang.String = null,
    inactiveTintColor: java.lang.String = null,
    indicatorStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    labelStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    pressColor: java.lang.String = null,
    pressOpacity: scala.Int | scala.Double = null,
    scrollEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    showIcon: js.UndefOr[scala.Boolean] = js.undefined,
    showLabel: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    tabStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    upperCaseLabel: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_ActiveBackgroundColorActiveTintColor = {
    val __obj = js.Dynamic.literal()
    if (activeBackgroundColor != null) __obj.updateDynamic("activeBackgroundColor")(activeBackgroundColor)
    if (activeTintColor != null) __obj.updateDynamic("activeTintColor")(activeTintColor)
    if (!js.isUndefined(allowFontScaling)) __obj.updateDynamic("allowFontScaling")(allowFontScaling)
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle.asInstanceOf[js.Any])
    if (inactiveBackgroundColor != null) __obj.updateDynamic("inactiveBackgroundColor")(inactiveBackgroundColor)
    if (inactiveTintColor != null) __obj.updateDynamic("inactiveTintColor")(inactiveTintColor)
    if (indicatorStyle != null) __obj.updateDynamic("indicatorStyle")(indicatorStyle.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (pressColor != null) __obj.updateDynamic("pressColor")(pressColor)
    if (pressOpacity != null) __obj.updateDynamic("pressOpacity")(pressOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollEnabled)) __obj.updateDynamic("scrollEnabled")(scrollEnabled)
    if (!js.isUndefined(showIcon)) __obj.updateDynamic("showIcon")(showIcon)
    if (!js.isUndefined(showLabel)) __obj.updateDynamic("showLabel")(showLabel)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabStyle != null) __obj.updateDynamic("tabStyle")(tabStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(upperCaseLabel)) __obj.updateDynamic("upperCaseLabel")(upperCaseLabel)
    __obj.asInstanceOf[Anon_ActiveBackgroundColorActiveTintColor]
  }
}

