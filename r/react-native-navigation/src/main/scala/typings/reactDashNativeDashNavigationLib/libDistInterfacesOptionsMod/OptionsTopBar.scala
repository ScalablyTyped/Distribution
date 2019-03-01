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
    * Controls Hiding NavBar on focus UISearchBar
    * #### (iOS 11+ specific)
    */
  var hideNavBarOnFocusSearchBar: js.UndefOr[scala.Boolean] = js.undefined
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

object OptionsTopBar {
  @scala.inline
  def apply(
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    backButton: OptionsTopBarBackButton = null,
    background: OptionsTopBarBackground = null,
    barStyle: reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.default | reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.black = null,
    borderColor: Color = null,
    borderHeight: js.UndefOr[AndroidDensityNumber] = js.undefined,
    buttonColor: Color = null,
    drawBehind: js.UndefOr[scala.Boolean] = js.undefined,
    elevation: js.UndefOr[AndroidDensityNumber] = js.undefined,
    height: js.UndefOr[AndroidDensityNumber] = js.undefined,
    hideNavBarOnFocusSearchBar: js.UndefOr[scala.Boolean] = js.undefined,
    hideOnScroll: js.UndefOr[scala.Boolean] = js.undefined,
    largeTitle: OptionsTopBarLargeTitle = null,
    leftButtons: js.Array[OptionsTopBarButton] = null,
    noBorder: js.UndefOr[scala.Boolean] = js.undefined,
    rightButtons: js.Array[OptionsTopBarButton] = null,
    searchBar: js.UndefOr[scala.Boolean] = js.undefined,
    searchBarHiddenWhenScrolling: js.UndefOr[scala.Boolean] = js.undefined,
    searchBarPlaceholder: java.lang.String = null,
    subtitle: OptionsTopBarSubtitle = null,
    testID: java.lang.String = null,
    title: OptionsTopBarTitle = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): OptionsTopBar = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (backButton != null) __obj.updateDynamic("backButton")(backButton)
    if (background != null) __obj.updateDynamic("background")(background)
    if (barStyle != null) __obj.updateDynamic("barStyle")(barStyle.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (!js.isUndefined(borderHeight)) __obj.updateDynamic("borderHeight")(borderHeight)
    if (buttonColor != null) __obj.updateDynamic("buttonColor")(buttonColor)
    if (!js.isUndefined(drawBehind)) __obj.updateDynamic("drawBehind")(drawBehind)
    if (!js.isUndefined(elevation)) __obj.updateDynamic("elevation")(elevation)
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height)
    if (!js.isUndefined(hideNavBarOnFocusSearchBar)) __obj.updateDynamic("hideNavBarOnFocusSearchBar")(hideNavBarOnFocusSearchBar)
    if (!js.isUndefined(hideOnScroll)) __obj.updateDynamic("hideOnScroll")(hideOnScroll)
    if (largeTitle != null) __obj.updateDynamic("largeTitle")(largeTitle)
    if (leftButtons != null) __obj.updateDynamic("leftButtons")(leftButtons)
    if (!js.isUndefined(noBorder)) __obj.updateDynamic("noBorder")(noBorder)
    if (rightButtons != null) __obj.updateDynamic("rightButtons")(rightButtons)
    if (!js.isUndefined(searchBar)) __obj.updateDynamic("searchBar")(searchBar)
    if (!js.isUndefined(searchBarHiddenWhenScrolling)) __obj.updateDynamic("searchBarHiddenWhenScrolling")(searchBarHiddenWhenScrolling)
    if (searchBarPlaceholder != null) __obj.updateDynamic("searchBarPlaceholder")(searchBarPlaceholder)
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle)
    if (testID != null) __obj.updateDynamic("testID")(testID)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[OptionsTopBar]
  }
}

