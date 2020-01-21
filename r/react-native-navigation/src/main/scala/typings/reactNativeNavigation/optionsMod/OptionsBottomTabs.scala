package typings.reactNativeNavigation.optionsMod

import typings.reactNativeNavigation.reactNativeNavigationStrings.afterInitialTab
import typings.reactNativeNavigation.reactNativeNavigationStrings.alwaysHide
import typings.reactNativeNavigation.reactNativeNavigationStrings.alwaysShow
import typings.reactNativeNavigation.reactNativeNavigationStrings.black
import typings.reactNativeNavigation.reactNativeNavigationStrings.default
import typings.reactNativeNavigation.reactNativeNavigationStrings.onSwitchToTab
import typings.reactNativeNavigation.reactNativeNavigationStrings.showWhenActive
import typings.reactNativeNavigation.reactNativeNavigationStrings.together
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsBottomTabs extends js.Object {
  /**
    * Enable animations when toggling visibility
    */
  var animate: js.UndefOr[Boolean] = js.undefined
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
  var barStyle: js.UndefOr[default | black] = js.undefined
  /**
    * Switch to another screen within the bottom tabs via screen name
    */
  var currentTabId: js.UndefOr[String] = js.undefined
  /**
    * Switch to another screen within the bottom tabs via index (starting from 0)
    */
  var currentTabIndex: js.UndefOr[Double] = js.undefined
  /**
    * Draw screen component under the tab bar
    */
  var drawBehind: js.UndefOr[Boolean] = js.undefined
  /**
    * Set the elevation of the Bottom Tabs in dp
    * #### (Android specific)
    */
  var elevation: js.UndefOr[AndroidDensityNumber] = js.undefined
  /**
    * Hide the top line of the Tab Bar
    * #### (iOS specific)
    */
  var hideShadow: js.UndefOr[Boolean] = js.undefined
  /**
    * Set when tabs are attached to hierarchy consequently when the
    * RootView's constructor is called.
    */
  var tabsAttachMode: js.UndefOr[together | afterInitialTab | onSwitchToTab] = js.undefined
  /**
    * Set a testID to reference the bottom tabs
    */
  var testID: js.UndefOr[String] = js.undefined
  /**
    * Control the text display mode below the tab icon
    * #### (Android specific)
    */
  var titleDisplayMode: js.UndefOr[alwaysShow | showWhenActive | alwaysHide] = js.undefined
  /**
    * Allows the Bottom Tabs to be translucent (blurred)
    * #### (iOS specific)
    */
  var translucent: js.UndefOr[Boolean] = js.undefined
  /**
    * Show or hide the bottom tabs
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object OptionsBottomTabs {
  @scala.inline
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    backgroundColor: Color = null,
    barStyle: default | black = null,
    currentTabId: String = null,
    currentTabIndex: Int | Double = null,
    drawBehind: js.UndefOr[Boolean] = js.undefined,
    elevation: Int | Double = null,
    hideShadow: js.UndefOr[Boolean] = js.undefined,
    tabsAttachMode: together | afterInitialTab | onSwitchToTab = null,
    testID: String = null,
    titleDisplayMode: alwaysShow | showWhenActive | alwaysHide = null,
    translucent: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): OptionsBottomTabs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (barStyle != null) __obj.updateDynamic("barStyle")(barStyle.asInstanceOf[js.Any])
    if (currentTabId != null) __obj.updateDynamic("currentTabId")(currentTabId.asInstanceOf[js.Any])
    if (currentTabIndex != null) __obj.updateDynamic("currentTabIndex")(currentTabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(drawBehind)) __obj.updateDynamic("drawBehind")(drawBehind.asInstanceOf[js.Any])
    if (elevation != null) __obj.updateDynamic("elevation")(elevation.asInstanceOf[js.Any])
    if (!js.isUndefined(hideShadow)) __obj.updateDynamic("hideShadow")(hideShadow.asInstanceOf[js.Any])
    if (tabsAttachMode != null) __obj.updateDynamic("tabsAttachMode")(tabsAttachMode.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (titleDisplayMode != null) __obj.updateDynamic("titleDisplayMode")(titleDisplayMode.asInstanceOf[js.Any])
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsBottomTabs]
  }
}

