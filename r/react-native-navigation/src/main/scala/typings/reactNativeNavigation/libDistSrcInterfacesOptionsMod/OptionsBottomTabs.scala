package typings.reactNativeNavigation.libDistSrcInterfacesOptionsMod

import typings.reactNativeNavigation.reactNativeNavigationStrings.afterInitialTab
import typings.reactNativeNavigation.reactNativeNavigationStrings.alwaysHide
import typings.reactNativeNavigation.reactNativeNavigationStrings.alwaysShow
import typings.reactNativeNavigation.reactNativeNavigationStrings.black
import typings.reactNativeNavigation.reactNativeNavigationStrings.default
import typings.reactNativeNavigation.reactNativeNavigationStrings.onSwitchToTab
import typings.reactNativeNavigation.reactNativeNavigationStrings.showWhenActive
import typings.reactNativeNavigation.reactNativeNavigationStrings.showWhenActiveForce
import typings.reactNativeNavigation.reactNativeNavigationStrings.together
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsBottomTabs extends StObject {
  
  /**
    * Overrides the text that's read by the screen reader when the user interacts with the element
    * #### (iOS specific)
    */
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  /**
    * Enable animations when toggling visibility
    */
  var animate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls whether tab selection is animated or not
    * #### (android specific)
    * @default true
    */
  var animateTabSelection: js.UndefOr[Boolean] = js.undefined
  
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
    * Control the top border color of the Bottom tabs bar
    */
  var borderColor: js.UndefOr[Color] = js.undefined
  
  /**
    * Control the top border width of the Bottom tabs bar
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  
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
    * Hides the BottomTabs on scroll to increase the amount of content visible to the user.
    * The options requires that the scrollable view will be the root view of the screen and that it specifies `nestedScrollEnabled: true`.
    * #### (Android specific)
    */
  var hideOnScroll: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Hide the top line of the Tab Bar
    * #### (iOS specific)
    */
  var hideShadow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Use large icons when possible, even when three tabs without titles are displayed
    * #### (android specific)
    * @default false
    */
  var preferLargeIcons: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Control the shadow of the Bottom tabs bar
    */
  var shadow: js.UndefOr[ShadowOptions] = js.undefined
  
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
  var titleDisplayMode: js.UndefOr[alwaysShow | showWhenActive | alwaysHide | showWhenActiveForce] = js.undefined
  
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
  
  inline def apply(): OptionsBottomTabs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsBottomTabs]
  }
  
  extension [Self <: OptionsBottomTabs](x: Self) {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateTabSelection(value: Boolean): Self = StObject.set(x, "animateTabSelection", value.asInstanceOf[js.Any])
    
    inline def setAnimateTabSelectionUndefined: Self = StObject.set(x, "animateTabSelection", js.undefined)
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorNull: Self = StObject.set(x, "backgroundColor", null)
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBarStyle(value: default | black): Self = StObject.set(x, "barStyle", value.asInstanceOf[js.Any])
    
    inline def setBarStyleUndefined: Self = StObject.set(x, "barStyle", js.undefined)
    
    inline def setBorderColor(value: Color): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorNull: Self = StObject.set(x, "borderColor", null)
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setCurrentTabId(value: String): Self = StObject.set(x, "currentTabId", value.asInstanceOf[js.Any])
    
    inline def setCurrentTabIdUndefined: Self = StObject.set(x, "currentTabId", js.undefined)
    
    inline def setCurrentTabIndex(value: Double): Self = StObject.set(x, "currentTabIndex", value.asInstanceOf[js.Any])
    
    inline def setCurrentTabIndexUndefined: Self = StObject.set(x, "currentTabIndex", js.undefined)
    
    inline def setDrawBehind(value: Boolean): Self = StObject.set(x, "drawBehind", value.asInstanceOf[js.Any])
    
    inline def setDrawBehindUndefined: Self = StObject.set(x, "drawBehind", js.undefined)
    
    inline def setElevation(value: AndroidDensityNumber): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
    
    inline def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
    
    inline def setHideOnScroll(value: Boolean): Self = StObject.set(x, "hideOnScroll", value.asInstanceOf[js.Any])
    
    inline def setHideOnScrollUndefined: Self = StObject.set(x, "hideOnScroll", js.undefined)
    
    inline def setHideShadow(value: Boolean): Self = StObject.set(x, "hideShadow", value.asInstanceOf[js.Any])
    
    inline def setHideShadowUndefined: Self = StObject.set(x, "hideShadow", js.undefined)
    
    inline def setPreferLargeIcons(value: Boolean): Self = StObject.set(x, "preferLargeIcons", value.asInstanceOf[js.Any])
    
    inline def setPreferLargeIconsUndefined: Self = StObject.set(x, "preferLargeIcons", js.undefined)
    
    inline def setShadow(value: ShadowOptions): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    inline def setTabsAttachMode(value: together | afterInitialTab | onSwitchToTab): Self = StObject.set(x, "tabsAttachMode", value.asInstanceOf[js.Any])
    
    inline def setTabsAttachModeUndefined: Self = StObject.set(x, "tabsAttachMode", js.undefined)
    
    inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    inline def setTitleDisplayMode(value: alwaysShow | showWhenActive | alwaysHide | showWhenActiveForce): Self = StObject.set(x, "titleDisplayMode", value.asInstanceOf[js.Any])
    
    inline def setTitleDisplayModeUndefined: Self = StObject.set(x, "titleDisplayMode", js.undefined)
    
    inline def setTranslucent(value: Boolean): Self = StObject.set(x, "translucent", value.asInstanceOf[js.Any])
    
    inline def setTranslucentUndefined: Self = StObject.set(x, "translucent", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
