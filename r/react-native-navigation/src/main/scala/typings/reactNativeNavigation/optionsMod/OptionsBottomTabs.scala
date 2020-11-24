package typings.reactNativeNavigation.optionsMod

import typings.reactNativeNavigation.reactNativeNavigationStrings.afterInitialTab
import typings.reactNativeNavigation.reactNativeNavigationStrings.alwaysHide
import typings.reactNativeNavigation.reactNativeNavigationStrings.alwaysShow
import typings.reactNativeNavigation.reactNativeNavigationStrings.black
import typings.reactNativeNavigation.reactNativeNavigationStrings.default
import typings.reactNativeNavigation.reactNativeNavigationStrings.onSwitchToTab
import typings.reactNativeNavigation.reactNativeNavigationStrings.showWhenActive
import typings.reactNativeNavigation.reactNativeNavigationStrings.showWhenActiveForce
import typings.reactNativeNavigation.reactNativeNavigationStrings.together
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsBottomTabs extends js.Object {
  
  /**
    * Enable animations when toggling visibility
    */
  var animate: js.UndefOr[Boolean] = js.native
  
  /**
    * Set a background color for the bottom tabs
    */
  var backgroundColor: js.UndefOr[Color] = js.native
  
  /**
    * Control the Bottom Tabs blur style
    * #### (iOS specific)
    * @requires translucent: true
    * @default 'default'
    */
  var barStyle: js.UndefOr[default | black] = js.native
  
  /**
    * Switch to another screen within the bottom tabs via screen name
    */
  var currentTabId: js.UndefOr[String] = js.native
  
  /**
    * Switch to another screen within the bottom tabs via index (starting from 0)
    */
  var currentTabIndex: js.UndefOr[Double] = js.native
  
  /**
    * Draw screen component under the tab bar
    */
  var drawBehind: js.UndefOr[Boolean] = js.native
  
  /**
    * Set the elevation of the Bottom Tabs in dp
    * #### (Android specific)
    */
  var elevation: js.UndefOr[AndroidDensityNumber] = js.native
  
  /**
    * Hides the BottomTabs on scroll to increase the amount of content visible to the user.
    * The options requires that the scrollable view will be the root view of the screen and that it specifies `nestedScrollEnabled: true`.
    * #### (Android specific)
    */
  var hideOnScroll: js.UndefOr[Boolean] = js.native
  
  /**
    * Hide the top line of the Tab Bar
    * #### (iOS specific)
    */
  var hideShadow: js.UndefOr[Boolean] = js.native
  
  /**
    * Use large icons when possible, even when three tabs without titles are displayed
    * #### (android specific)
    * @default false
    */
  var preferLargeIcons: js.UndefOr[Boolean] = js.native
  
  /**
    * Set when tabs are attached to hierarchy consequently when the
    * RootView's constructor is called.
    */
  var tabsAttachMode: js.UndefOr[together | afterInitialTab | onSwitchToTab] = js.native
  
  /**
    * Set a testID to reference the bottom tabs
    */
  var testID: js.UndefOr[String] = js.native
  
  /**
    * Control the text display mode below the tab icon
    * #### (Android specific)
    */
  var titleDisplayMode: js.UndefOr[alwaysShow | showWhenActive | alwaysHide | showWhenActiveForce] = js.native
  
  /**
    * Allows the Bottom Tabs to be translucent (blurred)
    * #### (iOS specific)
    */
  var translucent: js.UndefOr[Boolean] = js.native
  
  /**
    * Show or hide the bottom tabs
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object OptionsBottomTabs {
  
  @scala.inline
  def apply(): OptionsBottomTabs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsBottomTabs]
  }
  
  @scala.inline
  implicit class OptionsBottomTabsOps[Self <: OptionsBottomTabs] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: Color): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBarStyle(value: default | black): Self = this.set("barStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarStyle: Self = this.set("barStyle", js.undefined)
    
    @scala.inline
    def setCurrentTabId(value: String): Self = this.set("currentTabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentTabId: Self = this.set("currentTabId", js.undefined)
    
    @scala.inline
    def setCurrentTabIndex(value: Double): Self = this.set("currentTabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentTabIndex: Self = this.set("currentTabIndex", js.undefined)
    
    @scala.inline
    def setDrawBehind(value: Boolean): Self = this.set("drawBehind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawBehind: Self = this.set("drawBehind", js.undefined)
    
    @scala.inline
    def setElevation(value: AndroidDensityNumber): Self = this.set("elevation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElevation: Self = this.set("elevation", js.undefined)
    
    @scala.inline
    def setHideOnScroll(value: Boolean): Self = this.set("hideOnScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideOnScroll: Self = this.set("hideOnScroll", js.undefined)
    
    @scala.inline
    def setHideShadow(value: Boolean): Self = this.set("hideShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideShadow: Self = this.set("hideShadow", js.undefined)
    
    @scala.inline
    def setPreferLargeIcons(value: Boolean): Self = this.set("preferLargeIcons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferLargeIcons: Self = this.set("preferLargeIcons", js.undefined)
    
    @scala.inline
    def setTabsAttachMode(value: together | afterInitialTab | onSwitchToTab): Self = this.set("tabsAttachMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabsAttachMode: Self = this.set("tabsAttachMode", js.undefined)
    
    @scala.inline
    def setTestID(value: String): Self = this.set("testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestID: Self = this.set("testID", js.undefined)
    
    @scala.inline
    def setTitleDisplayMode(value: alwaysShow | showWhenActive | alwaysHide | showWhenActiveForce): Self = this.set("titleDisplayMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleDisplayMode: Self = this.set("titleDisplayMode", js.undefined)
    
    @scala.inline
    def setTranslucent(value: Boolean): Self = this.set("translucent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslucent: Self = this.set("translucent", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
