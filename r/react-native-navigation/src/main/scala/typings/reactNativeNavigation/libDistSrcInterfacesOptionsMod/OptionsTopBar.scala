package typings.reactNativeNavigation.libDistSrcInterfacesOptionsMod

import typings.reactNativeNavigation.reactNativeNavigationStrings.black
import typings.reactNativeNavigation.reactNativeNavigationStrings.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsTopBar extends StObject {
  
  /**
    * Controls whether TopBar visibility changes should be animated
    */
  var animate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Toggles animation on left buttons bar upon changes
    */
  var animateLeftButtons: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Toggles animation on right buttons bar upon changes
    */
  var animateRightButtons: js.UndefOr[Boolean] = js.undefined
  
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
  
  var leftButtonBackgroundColor: js.UndefOr[Color] = js.undefined
  
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
  
  var rightButtonBackgroundColor: js.UndefOr[Color] = js.undefined
  
  var rightButtonColor: js.UndefOr[Color] = js.undefined
  
  var rightButtonDisabledColor: js.UndefOr[Color] = js.undefined
  
  /**
    * List of buttons to the right
    */
  var rightButtons: js.UndefOr[js.Array[OptionsTopBarButton]] = js.undefined
  
  /**
    *
    */
  var scrollEdgeAppearance: js.UndefOr[OptionsTopBarScrollEdgeAppearance] = js.undefined
  
  /**
    * Show a UISearchBar in the Top Bar
    * #### (iOS 11+ specific)
    */
  var searchBar: js.UndefOr[OptionsSearchBar] = js.undefined
  
  /**
    * The background color of the UISearchBar's TextField
    * #### (iOS 13+ specific)
    */
  var searchBarBackgroundColor: js.UndefOr[String] = js.undefined
  
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
    * The tint color of the UISearchBar
    * #### (iOS 11+ specific)
    */
  var searchBarTintColor: js.UndefOr[String] = js.undefined
  
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
  
  inline def apply(): OptionsTopBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsTopBar]
  }
  
  extension [Self <: OptionsTopBar](x: Self) {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateLeftButtons(value: Boolean): Self = StObject.set(x, "animateLeftButtons", value.asInstanceOf[js.Any])
    
    inline def setAnimateLeftButtonsUndefined: Self = StObject.set(x, "animateLeftButtons", js.undefined)
    
    inline def setAnimateRightButtons(value: Boolean): Self = StObject.set(x, "animateRightButtons", value.asInstanceOf[js.Any])
    
    inline def setAnimateRightButtonsUndefined: Self = StObject.set(x, "animateRightButtons", js.undefined)
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setBackButton(value: OptionsTopBarBackButton): Self = StObject.set(x, "backButton", value.asInstanceOf[js.Any])
    
    inline def setBackButtonUndefined: Self = StObject.set(x, "backButton", js.undefined)
    
    inline def setBackground(value: OptionsTopBarBackground): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBarStyle(value: default | black): Self = StObject.set(x, "barStyle", value.asInstanceOf[js.Any])
    
    inline def setBarStyleUndefined: Self = StObject.set(x, "barStyle", js.undefined)
    
    inline def setBorderColor(value: Color): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorNull: Self = StObject.set(x, "borderColor", null)
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderHeight(value: AndroidDensityNumber): Self = StObject.set(x, "borderHeight", value.asInstanceOf[js.Any])
    
    inline def setBorderHeightUndefined: Self = StObject.set(x, "borderHeight", js.undefined)
    
    inline def setDrawBehind(value: Boolean): Self = StObject.set(x, "drawBehind", value.asInstanceOf[js.Any])
    
    inline def setDrawBehindUndefined: Self = StObject.set(x, "drawBehind", js.undefined)
    
    inline def setElevation(value: AndroidDensityNumber): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
    
    inline def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
    
    inline def setHeight(value: AndroidDensityNumber): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHideNavBarOnFocusSearchBar(value: Boolean): Self = StObject.set(x, "hideNavBarOnFocusSearchBar", value.asInstanceOf[js.Any])
    
    inline def setHideNavBarOnFocusSearchBarUndefined: Self = StObject.set(x, "hideNavBarOnFocusSearchBar", js.undefined)
    
    inline def setHideOnScroll(value: Boolean): Self = StObject.set(x, "hideOnScroll", value.asInstanceOf[js.Any])
    
    inline def setHideOnScrollUndefined: Self = StObject.set(x, "hideOnScroll", js.undefined)
    
    inline def setLargeTitle(value: OptionsTopBarLargeTitle): Self = StObject.set(x, "largeTitle", value.asInstanceOf[js.Any])
    
    inline def setLargeTitleUndefined: Self = StObject.set(x, "largeTitle", js.undefined)
    
    inline def setLeftButtonBackgroundColor(value: Color): Self = StObject.set(x, "leftButtonBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setLeftButtonBackgroundColorNull: Self = StObject.set(x, "leftButtonBackgroundColor", null)
    
    inline def setLeftButtonBackgroundColorUndefined: Self = StObject.set(x, "leftButtonBackgroundColor", js.undefined)
    
    inline def setLeftButtonColor(value: Color): Self = StObject.set(x, "leftButtonColor", value.asInstanceOf[js.Any])
    
    inline def setLeftButtonColorNull: Self = StObject.set(x, "leftButtonColor", null)
    
    inline def setLeftButtonColorUndefined: Self = StObject.set(x, "leftButtonColor", js.undefined)
    
    inline def setLeftButtonDisabledColor(value: Color): Self = StObject.set(x, "leftButtonDisabledColor", value.asInstanceOf[js.Any])
    
    inline def setLeftButtonDisabledColorNull: Self = StObject.set(x, "leftButtonDisabledColor", null)
    
    inline def setLeftButtonDisabledColorUndefined: Self = StObject.set(x, "leftButtonDisabledColor", js.undefined)
    
    inline def setLeftButtons(value: js.Array[OptionsTopBarButton]): Self = StObject.set(x, "leftButtons", value.asInstanceOf[js.Any])
    
    inline def setLeftButtonsUndefined: Self = StObject.set(x, "leftButtons", js.undefined)
    
    inline def setLeftButtonsVarargs(value: OptionsTopBarButton*): Self = StObject.set(x, "leftButtons", js.Array(value*))
    
    inline def setNoBorder(value: Boolean): Self = StObject.set(x, "noBorder", value.asInstanceOf[js.Any])
    
    inline def setNoBorderUndefined: Self = StObject.set(x, "noBorder", js.undefined)
    
    inline def setRightButtonBackgroundColor(value: Color): Self = StObject.set(x, "rightButtonBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setRightButtonBackgroundColorNull: Self = StObject.set(x, "rightButtonBackgroundColor", null)
    
    inline def setRightButtonBackgroundColorUndefined: Self = StObject.set(x, "rightButtonBackgroundColor", js.undefined)
    
    inline def setRightButtonColor(value: Color): Self = StObject.set(x, "rightButtonColor", value.asInstanceOf[js.Any])
    
    inline def setRightButtonColorNull: Self = StObject.set(x, "rightButtonColor", null)
    
    inline def setRightButtonColorUndefined: Self = StObject.set(x, "rightButtonColor", js.undefined)
    
    inline def setRightButtonDisabledColor(value: Color): Self = StObject.set(x, "rightButtonDisabledColor", value.asInstanceOf[js.Any])
    
    inline def setRightButtonDisabledColorNull: Self = StObject.set(x, "rightButtonDisabledColor", null)
    
    inline def setRightButtonDisabledColorUndefined: Self = StObject.set(x, "rightButtonDisabledColor", js.undefined)
    
    inline def setRightButtons(value: js.Array[OptionsTopBarButton]): Self = StObject.set(x, "rightButtons", value.asInstanceOf[js.Any])
    
    inline def setRightButtonsUndefined: Self = StObject.set(x, "rightButtons", js.undefined)
    
    inline def setRightButtonsVarargs(value: OptionsTopBarButton*): Self = StObject.set(x, "rightButtons", js.Array(value*))
    
    inline def setScrollEdgeAppearance(value: OptionsTopBarScrollEdgeAppearance): Self = StObject.set(x, "scrollEdgeAppearance", value.asInstanceOf[js.Any])
    
    inline def setScrollEdgeAppearanceUndefined: Self = StObject.set(x, "scrollEdgeAppearance", js.undefined)
    
    inline def setSearchBar(value: OptionsSearchBar): Self = StObject.set(x, "searchBar", value.asInstanceOf[js.Any])
    
    inline def setSearchBarBackgroundColor(value: String): Self = StObject.set(x, "searchBarBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setSearchBarBackgroundColorUndefined: Self = StObject.set(x, "searchBarBackgroundColor", js.undefined)
    
    inline def setSearchBarHiddenWhenScrolling(value: Boolean): Self = StObject.set(x, "searchBarHiddenWhenScrolling", value.asInstanceOf[js.Any])
    
    inline def setSearchBarHiddenWhenScrollingUndefined: Self = StObject.set(x, "searchBarHiddenWhenScrolling", js.undefined)
    
    inline def setSearchBarPlaceholder(value: String): Self = StObject.set(x, "searchBarPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setSearchBarPlaceholderUndefined: Self = StObject.set(x, "searchBarPlaceholder", js.undefined)
    
    inline def setSearchBarTintColor(value: String): Self = StObject.set(x, "searchBarTintColor", value.asInstanceOf[js.Any])
    
    inline def setSearchBarTintColorUndefined: Self = StObject.set(x, "searchBarTintColor", js.undefined)
    
    inline def setSearchBarUndefined: Self = StObject.set(x, "searchBar", js.undefined)
    
    inline def setSubtitle(value: OptionsTopBarSubtitle): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    inline def setTitle(value: OptionsTopBarTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTopMargin(value: Double): Self = StObject.set(x, "topMargin", value.asInstanceOf[js.Any])
    
    inline def setTopMarginUndefined: Self = StObject.set(x, "topMargin", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
