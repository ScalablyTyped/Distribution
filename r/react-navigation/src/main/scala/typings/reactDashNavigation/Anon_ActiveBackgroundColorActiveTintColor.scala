package typings.reactDashNavigation

import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveBackgroundColorActiveTintColor extends js.Object {
  var activeBackgroundColor: js.UndefOr[String] = js.undefined
  var activeTintColor: js.UndefOr[String] = js.undefined
  var allowFontScaling: js.UndefOr[Boolean] = js.undefined
  var iconStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var inactiveBackgroundColor: js.UndefOr[String] = js.undefined
  var inactiveTintColor: js.UndefOr[String] = js.undefined
  var indicatorStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var keyboardHidesTabBar: js.UndefOr[Boolean] = js.undefined
  var labelStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var pressColor: js.UndefOr[String] = js.undefined
  var pressOpacity: js.UndefOr[Double] = js.undefined
  var scrollEnabled: js.UndefOr[Boolean] = js.undefined
  // Top
  var showIcon: js.UndefOr[Boolean] = js.undefined
  var showLabel: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var tabStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var upperCaseLabel: js.UndefOr[Boolean] = js.undefined
}

object Anon_ActiveBackgroundColorActiveTintColor {
  @scala.inline
  def apply(
    activeBackgroundColor: String = null,
    activeTintColor: String = null,
    allowFontScaling: js.UndefOr[Boolean] = js.undefined,
    iconStyle: StyleProp[ViewStyle] = null,
    inactiveBackgroundColor: String = null,
    inactiveTintColor: String = null,
    indicatorStyle: StyleProp[ViewStyle] = null,
    keyboardHidesTabBar: js.UndefOr[Boolean] = js.undefined,
    labelStyle: StyleProp[TextStyle] = null,
    pressColor: String = null,
    pressOpacity: Int | Double = null,
    scrollEnabled: js.UndefOr[Boolean] = js.undefined,
    showIcon: js.UndefOr[Boolean] = js.undefined,
    showLabel: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    tabStyle: StyleProp[ViewStyle] = null,
    upperCaseLabel: js.UndefOr[Boolean] = js.undefined
  ): Anon_ActiveBackgroundColorActiveTintColor = {
    val __obj = js.Dynamic.literal()
    if (activeBackgroundColor != null) __obj.updateDynamic("activeBackgroundColor")(activeBackgroundColor)
    if (activeTintColor != null) __obj.updateDynamic("activeTintColor")(activeTintColor)
    if (!js.isUndefined(allowFontScaling)) __obj.updateDynamic("allowFontScaling")(allowFontScaling)
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle.asInstanceOf[js.Any])
    if (inactiveBackgroundColor != null) __obj.updateDynamic("inactiveBackgroundColor")(inactiveBackgroundColor)
    if (inactiveTintColor != null) __obj.updateDynamic("inactiveTintColor")(inactiveTintColor)
    if (indicatorStyle != null) __obj.updateDynamic("indicatorStyle")(indicatorStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardHidesTabBar)) __obj.updateDynamic("keyboardHidesTabBar")(keyboardHidesTabBar)
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

