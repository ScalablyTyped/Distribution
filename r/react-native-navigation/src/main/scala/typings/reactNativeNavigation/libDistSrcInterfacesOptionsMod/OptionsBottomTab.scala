package typings.reactNativeNavigation.libDistSrcInterfacesOptionsMod

import typings.reactNative.mod.ImageURISource
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
  var badgeColor: js.UndefOr[Color] = js.undefined
  
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
    * Set the icon height
    * #### (Android specific)
    */
  var iconHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Set the insets of the icon
    */
  var iconInsets: js.UndefOr[Insets] = js.undefined
  
  /**
    * Set the icon width
    * #### (Android specific)
    */
  var iconWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Pop to root of stack by tapping on already selected tab
    * #### (Android specific)
    */
  var popToRoot: js.UndefOr[Boolean] = js.undefined
  
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
    * Set the SF symbol as selected icon (will be used primarily)
    * #### (iOS 13+ specific)
    */
  var sfSelectedSymbol: js.UndefOr[String] = js.undefined
  
  /**
    * Set the SF symbol as icon (will be used primarily)
    * #### (iOS 13+ specific)
    */
  var sfSymbol: js.UndefOr[String] = js.undefined
  
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
  
  inline def apply(): OptionsBottomTab = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsBottomTab]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionsBottomTab] (val x: Self) extends AnyVal {
    
    inline def setAnimateBadge(value: Boolean): Self = StObject.set(x, "animateBadge", value.asInstanceOf[js.Any])
    
    inline def setAnimateBadgeUndefined: Self = StObject.set(x, "animateBadge", js.undefined)
    
    inline def setBadge(value: String): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    inline def setBadgeColor(value: Color): Self = StObject.set(x, "badgeColor", value.asInstanceOf[js.Any])
    
    inline def setBadgeColorNull: Self = StObject.set(x, "badgeColor", null)
    
    inline def setBadgeColorUndefined: Self = StObject.set(x, "badgeColor", js.undefined)
    
    inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    inline def setDisableIconTint(value: Boolean): Self = StObject.set(x, "disableIconTint", value.asInstanceOf[js.Any])
    
    inline def setDisableIconTintUndefined: Self = StObject.set(x, "disableIconTint", js.undefined)
    
    inline def setDisableSelectedIconTint(value: Boolean): Self = StObject.set(x, "disableSelectedIconTint", value.asInstanceOf[js.Any])
    
    inline def setDisableSelectedIconTintUndefined: Self = StObject.set(x, "disableSelectedIconTint", js.undefined)
    
    inline def setDotIndicator(value: DotIndicatorOptions): Self = StObject.set(x, "dotIndicator", value.asInstanceOf[js.Any])
    
    inline def setDotIndicatorUndefined: Self = StObject.set(x, "dotIndicator", js.undefined)
    
    inline def setFontFamily(value: FontFamily): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontStyle(value: FontStyle): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    inline def setFontWeight(value: FontWeight): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    inline def setIcon(value: ImageResource): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconColor(value: Color): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
    
    inline def setIconColorNull: Self = StObject.set(x, "iconColor", null)
    
    inline def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
    
    inline def setIconHeight(value: Double): Self = StObject.set(x, "iconHeight", value.asInstanceOf[js.Any])
    
    inline def setIconHeightUndefined: Self = StObject.set(x, "iconHeight", js.undefined)
    
    inline def setIconInsets(value: Insets): Self = StObject.set(x, "iconInsets", value.asInstanceOf[js.Any])
    
    inline def setIconInsetsUndefined: Self = StObject.set(x, "iconInsets", js.undefined)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setIconVarargs(value: ImageURISource*): Self = StObject.set(x, "icon", js.Array(value*))
    
    inline def setIconWidth(value: Double): Self = StObject.set(x, "iconWidth", value.asInstanceOf[js.Any])
    
    inline def setIconWidthUndefined: Self = StObject.set(x, "iconWidth", js.undefined)
    
    inline def setPopToRoot(value: Boolean): Self = StObject.set(x, "popToRoot", value.asInstanceOf[js.Any])
    
    inline def setPopToRootUndefined: Self = StObject.set(x, "popToRoot", js.undefined)
    
    inline def setSelectTabOnPress(value: Boolean): Self = StObject.set(x, "selectTabOnPress", value.asInstanceOf[js.Any])
    
    inline def setSelectTabOnPressUndefined: Self = StObject.set(x, "selectTabOnPress", js.undefined)
    
    inline def setSelectedFontSize(value: Double): Self = StObject.set(x, "selectedFontSize", value.asInstanceOf[js.Any])
    
    inline def setSelectedFontSizeUndefined: Self = StObject.set(x, "selectedFontSize", js.undefined)
    
    inline def setSelectedIcon(value: ImageResource): Self = StObject.set(x, "selectedIcon", value.asInstanceOf[js.Any])
    
    inline def setSelectedIconColor(value: Color): Self = StObject.set(x, "selectedIconColor", value.asInstanceOf[js.Any])
    
    inline def setSelectedIconColorNull: Self = StObject.set(x, "selectedIconColor", null)
    
    inline def setSelectedIconColorUndefined: Self = StObject.set(x, "selectedIconColor", js.undefined)
    
    inline def setSelectedIconUndefined: Self = StObject.set(x, "selectedIcon", js.undefined)
    
    inline def setSelectedIconVarargs(value: ImageURISource*): Self = StObject.set(x, "selectedIcon", js.Array(value*))
    
    inline def setSelectedTextColor(value: Color): Self = StObject.set(x, "selectedTextColor", value.asInstanceOf[js.Any])
    
    inline def setSelectedTextColorNull: Self = StObject.set(x, "selectedTextColor", null)
    
    inline def setSelectedTextColorUndefined: Self = StObject.set(x, "selectedTextColor", js.undefined)
    
    inline def setSfSelectedSymbol(value: String): Self = StObject.set(x, "sfSelectedSymbol", value.asInstanceOf[js.Any])
    
    inline def setSfSelectedSymbolUndefined: Self = StObject.set(x, "sfSelectedSymbol", js.undefined)
    
    inline def setSfSymbol(value: String): Self = StObject.set(x, "sfSymbol", value.asInstanceOf[js.Any])
    
    inline def setSfSymbolUndefined: Self = StObject.set(x, "sfSymbol", js.undefined)
    
    inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextColor(value: Color): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTextColorNull: Self = StObject.set(x, "textColor", null)
    
    inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
