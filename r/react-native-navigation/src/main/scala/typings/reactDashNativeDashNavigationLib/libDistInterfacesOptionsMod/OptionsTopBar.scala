package typings
package reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OptionsTopBar extends js.Object {
  /**
       * Controls whether TopBar visibility changes should be animated
       */
  var animate: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Back button configuration
       */
  var backButton: js.UndefOr[OptionsTopBarBackButton] = js.undefined
  /**
       * Background configuration
       */
  var background: js.UndefOr[OptionsTopBarBackground] = js.undefined
  /**
       * Control the NavBar blur style
       * #### (iOS specific)
       * @requires translucent: true
       * @default 'default'
       */
  var barStyle: js.UndefOr[
    reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.default | reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.black
  ] = js.undefined
  /**
       * Change the navbar border color
       * #### (Android specific)
       */
  var borderColor: js.UndefOr[Color] = js.undefined
  /**
       * Set the border height of the navbar in dp
       * #### (Android specific)
       */
  var borderHeight: js.UndefOr[AndroidDensityNumber] = js.undefined
  /**
       * Change button colors in the top bar
       */
  var buttonColor: js.UndefOr[Color] = js.undefined
  /**
       * Draw behind the navbar
       */
  var drawBehind: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Set the elevation of the navbar in dp
       * #### (Android specific)
       */
  var elevation: js.UndefOr[AndroidDensityNumber] = js.undefined
  /**
       * Set the height of the navbar in dp
       * #### (Android specific)
       */
  var height: js.UndefOr[AndroidDensityNumber] = js.undefined
  /**
       * Top bar will hide and show based on users scroll direction
       */
  var hideOnScroll: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Control the Large Title configuration
       * #### (iOS 11+ specific)
       */
  var largeTitle: js.UndefOr[OptionsTopBarLargeTitle] = js.undefined
  /**
       * List of buttons to the left
       */
  var leftButtons: js.UndefOr[js.Array[OptionsTopBarButton]] = js.undefined
  /**
       * Disable the border on bottom of the navbar
       * #### (iOS specific)
       * @default false
       */
  var noBorder: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * List of buttons to the right
       */
  var rightButtons: js.UndefOr[js.Array[OptionsTopBarButton]] = js.undefined
  /**
       * Show a UISearchBar in the Top Bar
       * #### (iOS 11+ specific)
       */
  var searchBar: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Hides the UISearchBar when scrolling
       * #### (iOS 11+ specific)
       */
  var searchBarHiddenWhenScrolling: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The placeholder value in the UISearchBar
       * #### (iOS 11+ specific)
       */
  var searchBarPlaceholder: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Subtitle configuration
       */
  var subtitle: js.UndefOr[OptionsTopBarSubtitle] = js.undefined
  /**
       * Can be used to reference the top bar in E2E tests
       */
  var testID: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Title configuration
       */
  var title: js.UndefOr[OptionsTopBarTitle] = js.undefined
  /**
       * Show or hide the top bar
       */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

