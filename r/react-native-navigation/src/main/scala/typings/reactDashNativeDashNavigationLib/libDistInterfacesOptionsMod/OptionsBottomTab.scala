package typings
package reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsBottomTab extends js.Object {
  /**
    * Set the text in a badge that is overlayed over the component
    */
  var badge: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set the background color of the badge that is overlayed over the component
    */
  var badgeColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set true if you want to disable the icon tinting
    * #### (iOS specific)
    */
  var disableIconTint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set true if you want to disable the text tinting
    * #### (iOS specific)
    */
  var disableSelectedIconTint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set the text font family
    */
  var fontFamily: js.UndefOr[FontFamily] = js.undefined
  /**
    * Set the text font size
    */
  var fontSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Set the tab icon
    */
  var icon: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ImageRequireSource] = js.undefined
  /**
    * Set the icon tint
    */
  var iconColor: js.UndefOr[Color] = js.undefined
  /**
    * Set the insets of the icon
    * #### (iOS specific)
    */
  var iconInsets: js.UndefOr[reactDashNativeLib.reactDashNativeMod.Insets] = js.undefined
  /**
    * Set the font size for selected tabs
    * #### (Android specific)
    */
  var selectedFontSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Set selected icon image
    * #### (iOS specific)
    */
  var selectedIcon: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ImageRequireSource] = js.undefined
  /**
    * Set the selected icon tint
    */
  var selectedIconColor: js.UndefOr[Color] = js.undefined
  /**
    * Set the selected text color
    */
  var selectedTextColor: js.UndefOr[Color] = js.undefined
  /**
    * Set a testID to reference the tab in E2E tests
    */
  var testID: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set the text to display below the icon
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set the text color
    */
  var textColor: js.UndefOr[Color] = js.undefined
}

object OptionsBottomTab {
  @scala.inline
  def apply(
    badge: java.lang.String = null,
    badgeColor: java.lang.String = null,
    disableIconTint: js.UndefOr[scala.Boolean] = js.undefined,
    disableSelectedIconTint: js.UndefOr[scala.Boolean] = js.undefined,
    fontFamily: FontFamily = null,
    fontSize: scala.Int | scala.Double = null,
    icon: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ImageRequireSource] = js.undefined,
    iconColor: Color = null,
    iconInsets: reactDashNativeLib.reactDashNativeMod.Insets = null,
    selectedFontSize: scala.Int | scala.Double = null,
    selectedIcon: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ImageRequireSource] = js.undefined,
    selectedIconColor: Color = null,
    selectedTextColor: Color = null,
    testID: java.lang.String = null,
    text: java.lang.String = null,
    textColor: Color = null
  ): OptionsBottomTab = {
    val __obj = js.Dynamic.literal()
    if (badge != null) __obj.updateDynamic("badge")(badge)
    if (badgeColor != null) __obj.updateDynamic("badgeColor")(badgeColor)
    if (!js.isUndefined(disableIconTint)) __obj.updateDynamic("disableIconTint")(disableIconTint)
    if (!js.isUndefined(disableSelectedIconTint)) __obj.updateDynamic("disableSelectedIconTint")(disableSelectedIconTint)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon)
    if (iconColor != null) __obj.updateDynamic("iconColor")(iconColor)
    if (iconInsets != null) __obj.updateDynamic("iconInsets")(iconInsets)
    if (selectedFontSize != null) __obj.updateDynamic("selectedFontSize")(selectedFontSize.asInstanceOf[js.Any])
    if (!js.isUndefined(selectedIcon)) __obj.updateDynamic("selectedIcon")(selectedIcon)
    if (selectedIconColor != null) __obj.updateDynamic("selectedIconColor")(selectedIconColor)
    if (selectedTextColor != null) __obj.updateDynamic("selectedTextColor")(selectedTextColor)
    if (testID != null) __obj.updateDynamic("testID")(testID)
    if (text != null) __obj.updateDynamic("text")(text)
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    __obj.asInstanceOf[OptionsBottomTab]
  }
}

