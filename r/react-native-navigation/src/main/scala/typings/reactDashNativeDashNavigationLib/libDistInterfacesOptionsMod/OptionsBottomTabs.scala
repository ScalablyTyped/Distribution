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

