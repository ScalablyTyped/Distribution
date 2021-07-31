package typings.reactNativeNavigation.optionsMod

import typings.reactNative.mod.Insets
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsBottomTab extends StObject {
  
  /**
    * Show the badge with the animation.
    * #### (Android specific)
    */
  var animateBadge: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set the text in a badge that is overlayed over the component
    */
  var badge: js.UndefOr[String] = js.undefined
  
  /**
    * Set the background color of the badge that is overlayed over the component
    */
  var badgeColor: js.UndefOr[String] = js.undefined
  
  /**
    * Set true if you want to disable the icon tinting
    * #### (iOS specific)
    */
  var disableIconTint: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set true if you want to disable the text tinting
    * #### (iOS specific)
    */
  var disableSelectedIconTint: js.UndefOr[Boolean] = js.undefined
  
  var dotIndicator: js.UndefOr[DotIndicatorOptions] = js.undefined
  
  /**
    * Set the font family for the tab's text
    */
  var fontFamily: js.UndefOr[FontFamily] = js.undefined
  
  /**
    * Set the text font size
    */
  var fontSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Set the font style for the tab's text
    */
  var fontStyle: js.UndefOr[FontStyle] = js.undefined
  
  /**
    * Specifies font weight. The values 'normal' and 'bold' are supported
    * for most fonts. Not all fonts have a variant for each of the numeric
    * values, in that case the closest one is chosen.
    */
  var fontWeight: js.UndefOr[FontWeight] = js.undefined
  
  /**
    * Set the tab icon
    */
  var icon: js.UndefOr[ImageResource] = js.undefined
  
  /**
    * Set the icon tint
    */
  var iconColor: js.UndefOr[Color] = js.undefined
  
  /**
    * Set the insets of the icon
    * #### (iOS specific)
    */
  var iconInsets: js.UndefOr[Insets] = js.undefined
  
  /**
    * If it's set to false, pressing a tab won't select the tab
    * instead it will emit a bottomTabPressedEvent
    */
  var selectTabOnPress: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set the font size for selected tabs
    * #### (Android specific)
    */
  var selectedFontSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Set selected icon image
    * #### (iOS specific)
    */
  var selectedIcon: js.UndefOr[ImageResource] = js.undefined
  
  /**
    * Set the selected icon tint
    */
  var selectedIconColor: js.UndefOr[Color] = js.undefined
  
  /**
    * Set the selected text color
    */
  var selectedTextColor: js.UndefOr[Color] = js.undefined
  
  /**
    * Set a testID to reference the tab in E2E tests
    */
  var testID: js.UndefOr[String] = js.undefined
  
  /**
    * Set the text to display below the icon
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Set the text color
    */
  var textColor: js.UndefOr[Color] = js.undefined
}
object OptionsBottomTab {
  
  @scala.inline
  def apply(): OptionsBottomTab = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsBottomTab]
  }
  
  @scala.inline
  implicit class OptionsBottomTabMutableBuilder[Self <: OptionsBottomTab] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimateBadge(value: Boolean): Self = StObject.set(x, "animateBadge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateBadgeUndefined: Self = StObject.set(x, "animateBadge", js.undefined)
    
    @scala.inline
    def setBadge(value: String): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeColor(value: String): Self = StObject.set(x, "badgeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeColorUndefined: Self = StObject.set(x, "badgeColor", js.undefined)
    
    @scala.inline
    def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    @scala.inline
    def setDisableIconTint(value: Boolean): Self = StObject.set(x, "disableIconTint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableIconTintUndefined: Self = StObject.set(x, "disableIconTint", js.undefined)
    
    @scala.inline
    def setDisableSelectedIconTint(value: Boolean): Self = StObject.set(x, "disableSelectedIconTint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableSelectedIconTintUndefined: Self = StObject.set(x, "disableSelectedIconTint", js.undefined)
    
    @scala.inline
    def setDotIndicator(value: DotIndicatorOptions): Self = StObject.set(x, "dotIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDotIndicatorUndefined: Self = StObject.set(x, "dotIndicator", js.undefined)
    
    @scala.inline
    def setFontFamily(value: FontFamily): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setFontStyle(value: FontStyle): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    @scala.inline
    def setFontWeight(value: FontWeight): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    @scala.inline
    def setIcon(value: ImageResource): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconColor(value: Color): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
    
    @scala.inline
    def setIconInsets(value: Insets): Self = StObject.set(x, "iconInsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconInsetsUndefined: Self = StObject.set(x, "iconInsets", js.undefined)
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setSelectTabOnPress(value: Boolean): Self = StObject.set(x, "selectTabOnPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectTabOnPressUndefined: Self = StObject.set(x, "selectTabOnPress", js.undefined)
    
    @scala.inline
    def setSelectedFontSize(value: Double): Self = StObject.set(x, "selectedFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedFontSizeUndefined: Self = StObject.set(x, "selectedFontSize", js.undefined)
    
    @scala.inline
    def setSelectedIcon(value: ImageResource): Self = StObject.set(x, "selectedIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedIconColor(value: Color): Self = StObject.set(x, "selectedIconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedIconColorUndefined: Self = StObject.set(x, "selectedIconColor", js.undefined)
    
    @scala.inline
    def setSelectedIconUndefined: Self = StObject.set(x, "selectedIcon", js.undefined)
    
    @scala.inline
    def setSelectedTextColor(value: Color): Self = StObject.set(x, "selectedTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedTextColorUndefined: Self = StObject.set(x, "selectedTextColor", js.undefined)
    
    @scala.inline
    def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColor(value: Color): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
