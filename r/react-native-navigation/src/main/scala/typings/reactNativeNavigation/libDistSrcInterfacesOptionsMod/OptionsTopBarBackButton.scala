package typings.reactNativeNavigation.libDistSrcInterfacesOptionsMod

import typings.reactNative.mod.ImageURISource
import typings.reactNativeNavigation.reactNativeNavigationStrings.default
import typings.reactNativeNavigation.reactNativeNavigationStrings.generic
import typings.reactNativeNavigation.reactNativeNavigationStrings.minimal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsTopBarBackButton extends StObject {
  
  /**
    * Overrides the text that's read by the screen reader when the user interacts with the back button
    * #### (Android specific)
    */
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  /**
    * Back button icon and text color
    */
  var color: js.UndefOr[Color] = js.undefined
  
  /**
    * Allows the NavBar to be translucent (blurred)
    * #### (iOS specific)
    */
  var displayMode: js.UndefOr[default | generic | minimal] = js.undefined
  
  /**
    * Enables iOS 14 back button menu display
    * #### (iOS specific)
    * @default true
    */
  var enableMenu: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set the font family for the back button
    * #### (iOS specific)
    */
  var fontFamily: js.UndefOr[FontFamily] = js.undefined
  
  /**
    * Set subtitle font size
    */
  var fontSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Set the font style for a text
    */
  var fontStyle: js.UndefOr[FontStyle] = js.undefined
  
  /**
    * Specifies font weight. The values 'normal' and 'bold' are supported
    * for most fonts. Not all fonts have a variant for each of the numeric
    * values, in that case the closest one is chosen.
    */
  var fontWeight: js.UndefOr[FontWeight] = js.undefined
  
  /**
    * Image to show as the back button
    */
  var icon: js.UndefOr[ImageResource] = js.undefined
  
  /**
    * Button id for reference press event
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Controls whether the default back button should pop the Stack or not
    * @default true
    */
  var popStackOnPress: js.UndefOr[Boolean] = js.undefined
  
  /**
    * SF Symbol to show as the back button
    * #### (iOS 13+ specific)
    */
  var sfSymbol: js.UndefOr[String] = js.undefined
  
  /**
    * Show title or just the icon
    * #### (iOS specific)
    */
  var showTitle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set testID for reference in E2E tests
    */
  var testID: js.UndefOr[String] = js.undefined
  
  /**
    * Set the back button title
    * #### (iOS specific)
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Weither the back button is visible or not
    * @default true
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object OptionsTopBarBackButton {
  
  inline def apply(): OptionsTopBarBackButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsTopBarBackButton]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionsTopBarBackButton] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorNull: Self = StObject.set(x, "color", null)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDisplayMode(value: default | generic | minimal): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
    
    inline def setDisplayModeUndefined: Self = StObject.set(x, "displayMode", js.undefined)
    
    inline def setEnableMenu(value: Boolean): Self = StObject.set(x, "enableMenu", value.asInstanceOf[js.Any])
    
    inline def setEnableMenuUndefined: Self = StObject.set(x, "enableMenu", js.undefined)
    
    inline def setFontFamily(value: FontFamily): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontStyle(value: FontStyle): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    inline def setFontWeight(value: FontWeight): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    inline def setIcon(value: ImageResource): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setIconVarargs(value: ImageURISource*): Self = StObject.set(x, "icon", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPopStackOnPress(value: Boolean): Self = StObject.set(x, "popStackOnPress", value.asInstanceOf[js.Any])
    
    inline def setPopStackOnPressUndefined: Self = StObject.set(x, "popStackOnPress", js.undefined)
    
    inline def setSfSymbol(value: String): Self = StObject.set(x, "sfSymbol", value.asInstanceOf[js.Any])
    
    inline def setSfSymbolUndefined: Self = StObject.set(x, "sfSymbol", js.undefined)
    
    inline def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
    
    inline def setShowTitleUndefined: Self = StObject.set(x, "showTitle", js.undefined)
    
    inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
