package typings.reactNativeNavigation.optionsMod

import typings.reactNativeNavigation.reactNativeNavigationStrings.black
import typings.reactNativeNavigation.reactNativeNavigationStrings.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsTopBar extends js.Object {
  /**
    * Controls whether TopBar visibility changes should be animated
    */
  var animate: js.UndefOr[Boolean] = js.undefined
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
  var barStyle: js.UndefOr[default | black] = js.undefined
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
    * Draw behind the navbar
    */
  var drawBehind: js.UndefOr[Boolean] = js.undefined
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
  var hideNavBarOnFocusSearchBar: js.UndefOr[Boolean] = js.undefined
  /**
    * Top bar will hide and show based on users scroll direction
    */
  var hideOnScroll: js.UndefOr[Boolean] = js.undefined
  /**
    * Control the Large Title configuration
    * #### (iOS 11+ specific)
    */
  var largeTitle: js.UndefOr[OptionsTopBarLargeTitle] = js.undefined
  /**
    * Change button colors in the top bar
    */
  var leftButtonColor: js.UndefOr[Color] = js.undefined
  var leftButtonDisabledColor: js.UndefOr[Color] = js.undefined
  /**
    * List of buttons to the left
    */
  var leftButtons: js.UndefOr[js.Array[OptionsTopBarButton]] = js.undefined
  /**
    * Disable the border on bottom of the navbar
    * #### (iOS specific)
    * @default false
    */
  var noBorder: js.UndefOr[Boolean] = js.undefined
  var rightButtonColor: js.UndefOr[Color] = js.undefined
  var rightButtonDisabledColor: js.UndefOr[Color] = js.undefined
  /**
    * List of buttons to the right
    */
  var rightButtons: js.UndefOr[js.Array[OptionsTopBarButton]] = js.undefined
  /**
    * Show a UISearchBar in the Top Bar
    * #### (iOS 11+ specific)
    */
  var searchBar: js.UndefOr[Boolean] = js.undefined
  /**
    * Hides the UISearchBar when scrolling
    * #### (iOS 11+ specific)
    */
  var searchBarHiddenWhenScrolling: js.UndefOr[Boolean] = js.undefined
  /**
    * The placeholder value in the UISearchBar
    * #### (iOS 11+ specific)
    */
  var searchBarPlaceholder: js.UndefOr[String] = js.undefined
  /**
    * Subtitle configuration
    */
  var subtitle: js.UndefOr[OptionsTopBarSubtitle] = js.undefined
  /**
    * Can be used to reference the top bar in E2E tests
    */
  var testID: js.UndefOr[String] = js.undefined
  /**
    * Title configuration
    */
  var title: js.UndefOr[OptionsTopBarTitle] = js.undefined
  /**
    * Layout top margin
    * #### (Android specific)
    */
  var topMargin: js.UndefOr[Double] = js.undefined
  /**
    * Show or hide the top bar
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object OptionsTopBar {
  @scala.inline
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    backButton: OptionsTopBarBackButton = null,
    background: OptionsTopBarBackground = null,
    barStyle: default | black = null,
    borderColor: Color = null,
    borderHeight: Int | Double = null,
    drawBehind: js.UndefOr[Boolean] = js.undefined,
    elevation: Int | Double = null,
    height: Int | Double = null,
    hideNavBarOnFocusSearchBar: js.UndefOr[Boolean] = js.undefined,
    hideOnScroll: js.UndefOr[Boolean] = js.undefined,
    largeTitle: OptionsTopBarLargeTitle = null,
    leftButtonColor: Color = null,
    leftButtonDisabledColor: Color = null,
    leftButtons: js.Array[OptionsTopBarButton] = null,
    noBorder: js.UndefOr[Boolean] = js.undefined,
    rightButtonColor: Color = null,
    rightButtonDisabledColor: Color = null,
    rightButtons: js.Array[OptionsTopBarButton] = null,
    searchBar: js.UndefOr[Boolean] = js.undefined,
    searchBarHiddenWhenScrolling: js.UndefOr[Boolean] = js.undefined,
    searchBarPlaceholder: String = null,
    subtitle: OptionsTopBarSubtitle = null,
    testID: String = null,
    title: OptionsTopBarTitle = null,
    topMargin: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): OptionsTopBar = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (backButton != null) __obj.updateDynamic("backButton")(backButton.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (barStyle != null) __obj.updateDynamic("barStyle")(barStyle.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderHeight != null) __obj.updateDynamic("borderHeight")(borderHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(drawBehind)) __obj.updateDynamic("drawBehind")(drawBehind.asInstanceOf[js.Any])
    if (elevation != null) __obj.updateDynamic("elevation")(elevation.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hideNavBarOnFocusSearchBar)) __obj.updateDynamic("hideNavBarOnFocusSearchBar")(hideNavBarOnFocusSearchBar.asInstanceOf[js.Any])
    if (!js.isUndefined(hideOnScroll)) __obj.updateDynamic("hideOnScroll")(hideOnScroll.asInstanceOf[js.Any])
    if (largeTitle != null) __obj.updateDynamic("largeTitle")(largeTitle.asInstanceOf[js.Any])
    if (leftButtonColor != null) __obj.updateDynamic("leftButtonColor")(leftButtonColor.asInstanceOf[js.Any])
    if (leftButtonDisabledColor != null) __obj.updateDynamic("leftButtonDisabledColor")(leftButtonDisabledColor.asInstanceOf[js.Any])
    if (leftButtons != null) __obj.updateDynamic("leftButtons")(leftButtons.asInstanceOf[js.Any])
    if (!js.isUndefined(noBorder)) __obj.updateDynamic("noBorder")(noBorder.asInstanceOf[js.Any])
    if (rightButtonColor != null) __obj.updateDynamic("rightButtonColor")(rightButtonColor.asInstanceOf[js.Any])
    if (rightButtonDisabledColor != null) __obj.updateDynamic("rightButtonDisabledColor")(rightButtonDisabledColor.asInstanceOf[js.Any])
    if (rightButtons != null) __obj.updateDynamic("rightButtons")(rightButtons.asInstanceOf[js.Any])
    if (!js.isUndefined(searchBar)) __obj.updateDynamic("searchBar")(searchBar.asInstanceOf[js.Any])
    if (!js.isUndefined(searchBarHiddenWhenScrolling)) __obj.updateDynamic("searchBarHiddenWhenScrolling")(searchBarHiddenWhenScrolling.asInstanceOf[js.Any])
    if (searchBarPlaceholder != null) __obj.updateDynamic("searchBarPlaceholder")(searchBarPlaceholder.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (topMargin != null) __obj.updateDynamic("topMargin")(topMargin.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsTopBar]
  }
}

