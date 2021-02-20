package typings.reactNativeNavigation.optionsMod

import typings.reactNativeNavigation.reactNativeNavigationStrings.black
import typings.reactNativeNavigation.reactNativeNavigationStrings.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsTopBar extends StObject {
  
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
    *
    */
  var scrollEdgeAppearance: js.UndefOr[OptionsTopBarScrollEdgeAppearance] = js.native
  
  /**
    * Show a UISearchBar in the Top Bar
    * #### (iOS 11+ specific)
    */
  var searchBar: js.UndefOr[OptionsSearchBar] = js.native
  
  /**
    * The background color of the UISearchBar's TextField
    * #### (iOS 13+ specific)
    */
  var searchBarBackgroundColor: js.UndefOr[String] = js.native
  
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
    * The tint color of the UISearchBar
    * #### (iOS 11+ specific)
    */
  var searchBarTintColor: js.UndefOr[String] = js.native
  
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
  implicit class OptionsTopBarMutableBuilder[Self <: OptionsTopBar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    @scala.inline
    def setBackButton(value: OptionsTopBarBackButton): Self = StObject.set(x, "backButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackButtonUndefined: Self = StObject.set(x, "backButton", js.undefined)
    
    @scala.inline
    def setBackground(value: OptionsTopBarBackground): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBarStyle(value: default | black): Self = StObject.set(x, "barStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarStyleUndefined: Self = StObject.set(x, "barStyle", js.undefined)
    
    @scala.inline
    def setBorderColor(value: Color): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setBorderHeight(value: AndroidDensityNumber): Self = StObject.set(x, "borderHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderHeightUndefined: Self = StObject.set(x, "borderHeight", js.undefined)
    
    @scala.inline
    def setDrawBehind(value: Boolean): Self = StObject.set(x, "drawBehind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawBehindUndefined: Self = StObject.set(x, "drawBehind", js.undefined)
    
    @scala.inline
    def setElevation(value: AndroidDensityNumber): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
    
    @scala.inline
    def setHeight(value: AndroidDensityNumber): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHideNavBarOnFocusSearchBar(value: Boolean): Self = StObject.set(x, "hideNavBarOnFocusSearchBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideNavBarOnFocusSearchBarUndefined: Self = StObject.set(x, "hideNavBarOnFocusSearchBar", js.undefined)
    
    @scala.inline
    def setHideOnScroll(value: Boolean): Self = StObject.set(x, "hideOnScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideOnScrollUndefined: Self = StObject.set(x, "hideOnScroll", js.undefined)
    
    @scala.inline
    def setLargeTitle(value: OptionsTopBarLargeTitle): Self = StObject.set(x, "largeTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLargeTitleUndefined: Self = StObject.set(x, "largeTitle", js.undefined)
    
    @scala.inline
    def setLeftButtonColor(value: Color): Self = StObject.set(x, "leftButtonColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftButtonColorUndefined: Self = StObject.set(x, "leftButtonColor", js.undefined)
    
    @scala.inline
    def setLeftButtonDisabledColor(value: Color): Self = StObject.set(x, "leftButtonDisabledColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftButtonDisabledColorUndefined: Self = StObject.set(x, "leftButtonDisabledColor", js.undefined)
    
    @scala.inline
    def setLeftButtons(value: js.Array[OptionsTopBarButton]): Self = StObject.set(x, "leftButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftButtonsUndefined: Self = StObject.set(x, "leftButtons", js.undefined)
    
    @scala.inline
    def setLeftButtonsVarargs(value: OptionsTopBarButton*): Self = StObject.set(x, "leftButtons", js.Array(value :_*))
    
    @scala.inline
    def setNoBorder(value: Boolean): Self = StObject.set(x, "noBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoBorderUndefined: Self = StObject.set(x, "noBorder", js.undefined)
    
    @scala.inline
    def setRightButtonColor(value: Color): Self = StObject.set(x, "rightButtonColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightButtonColorUndefined: Self = StObject.set(x, "rightButtonColor", js.undefined)
    
    @scala.inline
    def setRightButtonDisabledColor(value: Color): Self = StObject.set(x, "rightButtonDisabledColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightButtonDisabledColorUndefined: Self = StObject.set(x, "rightButtonDisabledColor", js.undefined)
    
    @scala.inline
    def setRightButtons(value: js.Array[OptionsTopBarButton]): Self = StObject.set(x, "rightButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightButtonsUndefined: Self = StObject.set(x, "rightButtons", js.undefined)
    
    @scala.inline
    def setRightButtonsVarargs(value: OptionsTopBarButton*): Self = StObject.set(x, "rightButtons", js.Array(value :_*))
    
    @scala.inline
    def setScrollEdgeAppearance(value: OptionsTopBarScrollEdgeAppearance): Self = StObject.set(x, "scrollEdgeAppearance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollEdgeAppearanceUndefined: Self = StObject.set(x, "scrollEdgeAppearance", js.undefined)
    
    @scala.inline
    def setSearchBar(value: OptionsSearchBar): Self = StObject.set(x, "searchBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchBarBackgroundColor(value: String): Self = StObject.set(x, "searchBarBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchBarBackgroundColorUndefined: Self = StObject.set(x, "searchBarBackgroundColor", js.undefined)
    
    @scala.inline
    def setSearchBarHiddenWhenScrolling(value: Boolean): Self = StObject.set(x, "searchBarHiddenWhenScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchBarHiddenWhenScrollingUndefined: Self = StObject.set(x, "searchBarHiddenWhenScrolling", js.undefined)
    
    @scala.inline
    def setSearchBarPlaceholder(value: String): Self = StObject.set(x, "searchBarPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchBarPlaceholderUndefined: Self = StObject.set(x, "searchBarPlaceholder", js.undefined)
    
    @scala.inline
    def setSearchBarTintColor(value: String): Self = StObject.set(x, "searchBarTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchBarTintColorUndefined: Self = StObject.set(x, "searchBarTintColor", js.undefined)
    
    @scala.inline
    def setSearchBarUndefined: Self = StObject.set(x, "searchBar", js.undefined)
    
    @scala.inline
    def setSubtitle(value: OptionsTopBarSubtitle): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    @scala.inline
    def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    @scala.inline
    def setTitle(value: OptionsTopBarTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTopMargin(value: Double): Self = StObject.set(x, "topMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopMarginUndefined: Self = StObject.set(x, "topMargin", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
