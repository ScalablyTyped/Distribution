package typings
package reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsBottomTabs extends js.Object {
  /**
    * Enable animations when toggling visibility
    */
  var animate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set a background color for the bottom tabs
    */
  var backgroundColor: js.UndefOr[Color] = js.undefined
  /**
    * Control the Bottom Tabs blur style
    * #### (iOS specific)
    * @requires translucent: true
    * @default 'default'
    */
  var barStyle: js.UndefOr[
    reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.default | reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.black
  ] = js.undefined
  /**
    * Switch to another screen within the bottom tabs via screen name
    */
  var currentTabId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Switch to another screen within the bottom tabs via index (starting from 0)
    */
  var currentTabIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * Draw screen component under the tab bar
    */
  var drawBehind: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set the elevation of the Bottom Tabs in dp
    * #### (Android specific)
    */
  var elevation: js.UndefOr[AndroidDensityNumber] = js.undefined
  /**
    * Hide the top line of the Tab Bar
    * #### (iOS specific)
    */
  var hideShadow: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set when tabs are attached to hierarchy consequently when the
    * RootView's constructor is called.
    */
  var tabsAttachMode: js.UndefOr[
    reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.together | reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.afterInitialTab | reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.onSwitchToTab
  ] = js.undefined
  /**
    * Set a testID to reference the bottom tabs
    */
  var testID: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Control the text display mode below the tab icon
    * #### (Android specific)
    */
  var titleDisplayMode: js.UndefOr[
    reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.alwaysShow | reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.showWhenActive | reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.alwaysHide
  ] = js.undefined
  /**
    * Allows the Bottom Tabs to be translucent (blurred)
    * #### (iOS specific)
    */
  var translucent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Show or hide the bottom tabs
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object OptionsBottomTabs {
  @scala.inline
  def apply(
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    backgroundColor: Color = null,
    barStyle: reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.default | reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.black = null,
    currentTabId: java.lang.String = null,
    currentTabIndex: scala.Int | scala.Double = null,
    drawBehind: js.UndefOr[scala.Boolean] = js.undefined,
    elevation: js.UndefOr[AndroidDensityNumber] = js.undefined,
    hideShadow: js.UndefOr[scala.Boolean] = js.undefined,
    tabsAttachMode: reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.together | reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.afterInitialTab | reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.onSwitchToTab = null,
    testID: java.lang.String = null,
    titleDisplayMode: reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.alwaysShow | reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.showWhenActive | reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.alwaysHide = null,
    translucent: js.UndefOr[scala.Boolean] = js.undefined,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): OptionsBottomTabs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (barStyle != null) __obj.updateDynamic("barStyle")(barStyle.asInstanceOf[js.Any])
    if (currentTabId != null) __obj.updateDynamic("currentTabId")(currentTabId)
    if (currentTabIndex != null) __obj.updateDynamic("currentTabIndex")(currentTabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(drawBehind)) __obj.updateDynamic("drawBehind")(drawBehind)
    if (!js.isUndefined(elevation)) __obj.updateDynamic("elevation")(elevation)
    if (!js.isUndefined(hideShadow)) __obj.updateDynamic("hideShadow")(hideShadow)
    if (tabsAttachMode != null) __obj.updateDynamic("tabsAttachMode")(tabsAttachMode.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID)
    if (titleDisplayMode != null) __obj.updateDynamic("titleDisplayMode")(titleDisplayMode.asInstanceOf[js.Any])
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[OptionsBottomTabs]
  }
}

