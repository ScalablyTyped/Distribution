package typings.reactDashNavigationDashMaterialDashBottomDashTabs.libTypescriptSrcTypesMod

import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationMaterialBottomTabConfig extends js.Object {
  /**
    * Custom color for icon and label in the active tab.
    */
  var activeColor: js.UndefOr[String] = js.undefined
  var activeColorDark: js.UndefOr[String] = js.undefined
  var activeColorLight: js.UndefOr[String] = js.undefined
  /**
    * Style for the bottom navigation bar.
    * You can set a bottom padding here if you have a translucent navigation bar on Android:
    *
    * ```js
    * barStyle={{ paddingBottom: 48 }}
    * ```
    */
  var barStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var barStyleDark: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var barStyleLight: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Custom color for icon and label in the inactive tab.
    */
  var inactiveColor: js.UndefOr[String] = js.undefined
  var inactiveColorDark: js.UndefOr[String] = js.undefined
  var inactiveColorLight: js.UndefOr[String] = js.undefined
  /**
    * Whether the bottom navigation bar is hidden when keyboard is shown.
    * On Android, this works best when [`windowSoftInputMode`](https://developer.android.com/guide/topics/manifest/activity-element#wsoft) is set to `adjustResize`.
    */
  var keyboardHidesNavigationBar: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to show labels in tabs. When `false`, only icons will be displayed.
    */
  var labeled: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the shifting style is used, the active tab appears wider and the inactive tabs won't have a label.
    * By default, this is `true` when you have more than 3 tabs.
    */
  var shifting: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object NavigationMaterialBottomTabConfig {
  @scala.inline
  def apply(
    activeColor: String = null,
    activeColorDark: String = null,
    activeColorLight: String = null,
    barStyle: StyleProp[ViewStyle] = null,
    barStyleDark: StyleProp[ViewStyle] = null,
    barStyleLight: StyleProp[ViewStyle] = null,
    inactiveColor: String = null,
    inactiveColorDark: String = null,
    inactiveColorLight: String = null,
    keyboardHidesNavigationBar: js.UndefOr[Boolean] = js.undefined,
    labeled: js.UndefOr[Boolean] = js.undefined,
    shifting: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null
  ): NavigationMaterialBottomTabConfig = {
    val __obj = js.Dynamic.literal()
    if (activeColor != null) __obj.updateDynamic("activeColor")(activeColor)
    if (activeColorDark != null) __obj.updateDynamic("activeColorDark")(activeColorDark)
    if (activeColorLight != null) __obj.updateDynamic("activeColorLight")(activeColorLight)
    if (barStyle != null) __obj.updateDynamic("barStyle")(barStyle.asInstanceOf[js.Any])
    if (barStyleDark != null) __obj.updateDynamic("barStyleDark")(barStyleDark.asInstanceOf[js.Any])
    if (barStyleLight != null) __obj.updateDynamic("barStyleLight")(barStyleLight.asInstanceOf[js.Any])
    if (inactiveColor != null) __obj.updateDynamic("inactiveColor")(inactiveColor)
    if (inactiveColorDark != null) __obj.updateDynamic("inactiveColorDark")(inactiveColorDark)
    if (inactiveColorLight != null) __obj.updateDynamic("inactiveColorLight")(inactiveColorLight)
    if (!js.isUndefined(keyboardHidesNavigationBar)) __obj.updateDynamic("keyboardHidesNavigationBar")(keyboardHidesNavigationBar)
    if (!js.isUndefined(labeled)) __obj.updateDynamic("labeled")(labeled)
    if (!js.isUndefined(shifting)) __obj.updateDynamic("shifting")(shifting)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationMaterialBottomTabConfig]
  }
}

