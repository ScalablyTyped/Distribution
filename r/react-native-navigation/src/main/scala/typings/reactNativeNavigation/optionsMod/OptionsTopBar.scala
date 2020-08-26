package typings.reactNativeNavigation.optionsMod

import typings.reactNativeNavigation.reactNativeNavigationStrings.black
import typings.reactNativeNavigation.reactNativeNavigationStrings.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsTopBar extends js.Object {
  /**
    * Controls whether TopBar visibility changes should be animated
    */
  var animate: js.UndefOr[Boolean] = js.native
  /**
    * Back button configuration
    */
  var backButton: js.UndefOr[OptionsTopBarBackButton] = js.native
  /**
    * Background configuration
    */
  var background: js.UndefOr[OptionsTopBarBackground] = js.native
  /**
    * Control the NavBar blur style
    * #### (iOS specific)
    * @requires translucent: true
    * @default 'default'
    */
  var barStyle: js.UndefOr[default | black] = js.native
  /**
    * Change the navbar border color
    * #### (Android specific)
    */
  var borderColor: js.UndefOr[Color] = js.native
  /**
    * Set the border height of the navbar in dp
    * #### (Android specific)
    */
  var borderHeight: js.UndefOr[AndroidDensityNumber] = js.native
  /**
    * Draw behind the navbar
    */
  var drawBehind: js.UndefOr[Boolean] = js.native
  /**
    * Set the elevation of the navbar in dp
    * #### (Android specific)
    */
  var elevation: js.UndefOr[AndroidDensityNumber] = js.native
  /**
    * Set the height of the navbar in dp
    * #### (Android specific)
    */
  var height: js.UndefOr[AndroidDensityNumber] = js.native
  /**
    * Controls Hiding NavBar on focus UISearchBar
    * #### (iOS 11+ specific)
    */
  var hideNavBarOnFocusSearchBar: js.UndefOr[Boolean] = js.native
  /**
    * Top bar will hide and show based on users scroll direction
    */
  var hideOnScroll: js.UndefOr[Boolean] = js.native
  /**
    * Control the Large Title configuration
    * #### (iOS 11+ specific)
    */
  var largeTitle: js.UndefOr[OptionsTopBarLargeTitle] = js.native
  /**
    * Change button colors in the top bar
    */
  var leftButtonColor: js.UndefOr[Color] = js.native
  var leftButtonDisabledColor: js.UndefOr[Color] = js.native
  /**
    * List of buttons to the left
    */
  var leftButtons: js.UndefOr[js.Array[OptionsTopBarButton]] = js.native
  /**
    * Disable the border on bottom of the navbar
    * #### (iOS specific)
    * @default false
    */
  var noBorder: js.UndefOr[Boolean] = js.native
  var rightButtonColor: js.UndefOr[Color] = js.native
  var rightButtonDisabledColor: js.UndefOr[Color] = js.native
  /**
    * List of buttons to the right
    */
  var rightButtons: js.UndefOr[js.Array[OptionsTopBarButton]] = js.native
  /**
    * Show a UISearchBar in the Top Bar
    * #### (iOS 11+ specific)
    */
  var searchBar: js.UndefOr[Boolean] = js.native
  /**
    * Hides the UISearchBar when scrolling
    * #### (iOS 11+ specific)
    */
  var searchBarHiddenWhenScrolling: js.UndefOr[Boolean] = js.native
  /**
    * The placeholder value in the UISearchBar
    * #### (iOS 11+ specific)
    */
  var searchBarPlaceholder: js.UndefOr[String] = js.native
  /**
    * Subtitle configuration
    */
  var subtitle: js.UndefOr[OptionsTopBarSubtitle] = js.native
  /**
    * Can be used to reference the top bar in E2E tests
    */
  var testID: js.UndefOr[String] = js.native
  /**
    * Title configuration
    */
  var title: js.UndefOr[OptionsTopBarTitle] = js.native
  /**
    * Layout top margin
    * #### (Android specific)
    */
  var topMargin: js.UndefOr[Double] = js.native
  /**
    * Show or hide the top bar
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object OptionsTopBar {
  @scala.inline
  def apply(): OptionsTopBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsTopBar]
  }
  @scala.inline
  implicit class OptionsTopBarOps[Self <: OptionsTopBar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setBackButton(value: OptionsTopBarBackButton): Self = this.set("backButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackButton: Self = this.set("backButton", js.undefined)
    @scala.inline
    def setBackground(value: OptionsTopBarBackground): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setBarStyle(value: default | black): Self = this.set("barStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarStyle: Self = this.set("barStyle", js.undefined)
    @scala.inline
    def setBorderColor(value: Color): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setBorderHeight(value: AndroidDensityNumber): Self = this.set("borderHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderHeight: Self = this.set("borderHeight", js.undefined)
    @scala.inline
    def setDrawBehind(value: Boolean): Self = this.set("drawBehind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawBehind: Self = this.set("drawBehind", js.undefined)
    @scala.inline
    def setElevation(value: AndroidDensityNumber): Self = this.set("elevation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElevation: Self = this.set("elevation", js.undefined)
    @scala.inline
    def setHeight(value: AndroidDensityNumber): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHideNavBarOnFocusSearchBar(value: Boolean): Self = this.set("hideNavBarOnFocusSearchBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideNavBarOnFocusSearchBar: Self = this.set("hideNavBarOnFocusSearchBar", js.undefined)
    @scala.inline
    def setHideOnScroll(value: Boolean): Self = this.set("hideOnScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideOnScroll: Self = this.set("hideOnScroll", js.undefined)
    @scala.inline
    def setLargeTitle(value: OptionsTopBarLargeTitle): Self = this.set("largeTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLargeTitle: Self = this.set("largeTitle", js.undefined)
    @scala.inline
    def setLeftButtonColor(value: Color): Self = this.set("leftButtonColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftButtonColor: Self = this.set("leftButtonColor", js.undefined)
    @scala.inline
    def setLeftButtonDisabledColor(value: Color): Self = this.set("leftButtonDisabledColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftButtonDisabledColor: Self = this.set("leftButtonDisabledColor", js.undefined)
    @scala.inline
    def setLeftButtonsVarargs(value: OptionsTopBarButton*): Self = this.set("leftButtons", js.Array(value :_*))
    @scala.inline
    def setLeftButtons(value: js.Array[OptionsTopBarButton]): Self = this.set("leftButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftButtons: Self = this.set("leftButtons", js.undefined)
    @scala.inline
    def setNoBorder(value: Boolean): Self = this.set("noBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoBorder: Self = this.set("noBorder", js.undefined)
    @scala.inline
    def setRightButtonColor(value: Color): Self = this.set("rightButtonColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightButtonColor: Self = this.set("rightButtonColor", js.undefined)
    @scala.inline
    def setRightButtonDisabledColor(value: Color): Self = this.set("rightButtonDisabledColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightButtonDisabledColor: Self = this.set("rightButtonDisabledColor", js.undefined)
    @scala.inline
    def setRightButtonsVarargs(value: OptionsTopBarButton*): Self = this.set("rightButtons", js.Array(value :_*))
    @scala.inline
    def setRightButtons(value: js.Array[OptionsTopBarButton]): Self = this.set("rightButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightButtons: Self = this.set("rightButtons", js.undefined)
    @scala.inline
    def setSearchBar(value: Boolean): Self = this.set("searchBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchBar: Self = this.set("searchBar", js.undefined)
    @scala.inline
    def setSearchBarHiddenWhenScrolling(value: Boolean): Self = this.set("searchBarHiddenWhenScrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchBarHiddenWhenScrolling: Self = this.set("searchBarHiddenWhenScrolling", js.undefined)
    @scala.inline
    def setSearchBarPlaceholder(value: String): Self = this.set("searchBarPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchBarPlaceholder: Self = this.set("searchBarPlaceholder", js.undefined)
    @scala.inline
    def setSubtitle(value: OptionsTopBarSubtitle): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
    @scala.inline
    def setTestID(value: String): Self = this.set("testID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestID: Self = this.set("testID", js.undefined)
    @scala.inline
    def setTitle(value: OptionsTopBarTitle): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTopMargin(value: Double): Self = this.set("topMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopMargin: Self = this.set("topMargin", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

