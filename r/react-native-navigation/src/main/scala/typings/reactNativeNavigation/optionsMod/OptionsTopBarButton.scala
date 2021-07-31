package typings.reactNativeNavigation.optionsMod

import typings.reactNativeNavigation.anon.Height
import typings.reactNativeNavigation.reactNativeNavigationStrings.always
import typings.reactNativeNavigation.reactNativeNavigationStrings.ifRoom
import typings.reactNativeNavigation.reactNativeNavigationStrings.never
import typings.reactNativeNavigation.reactNativeNavigationStrings.withText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsTopBarButton extends StObject {
  
  /**
    * Overrides the text that's read by the screen reader when the user interacts with the element
    */
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  /**
    * (Android only) Sets a textual button to be ALL CAPS. default value is true
    */
  var allCaps: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set text color
    */
  var color: js.UndefOr[Color] = js.undefined
  
  /**
    * Set the button as a custom component
    */
  var component: js.UndefOr[Height] = js.undefined
  
  /**
    * Disable icon tinting
    */
  var disableIconTint: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set text color in disabled state
    */
  var disabledColor: js.UndefOr[Color] = js.undefined
  
  /**
    * Set the button enabled or disabled
    * @default true
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set the font family for the button's text
    */
  var fontFamily: js.UndefOr[FontFamily] = js.undefined
  
  /**
    * Set the font size in dp
    */
  var fontSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Set the font style for the button's text
    */
  var fontStyle: js.UndefOr[FontStyle] = js.undefined
  
  /**
    * Specifies font weight. The values 'normal' and 'bold' are supported
    * for most fonts. Not all fonts have a variant for each of the numeric
    * values, in that case the closest one is chosen.
    */
  var fontWeight: js.UndefOr[FontWeight] = js.undefined
  
  /**
    * Set the button icon
    */
  var icon: js.UndefOr[ImageResource] = js.undefined
  
  /**
    * Set the button icon insets
    */
  var iconInsets: js.UndefOr[IconInsets] = js.undefined
  
  /**
    * Button id for reference press event
    */
  var id: String
  
  /**
    * (Android only) Set showAsAction value
    * @see {@link https://developer.android.com/guide/topics/resources/menu-resource|Android developer guide: Menu resource}
    */
  var showAsAction: js.UndefOr[ifRoom | withText | always | never] = js.undefined
  
  /**
    * (iOS only) Set the button as an iOS system icon
    */
  var systemItem: js.UndefOr[SystemItemIcon] = js.undefined
  
  /**
    * Set testID for reference in E2E tests
    */
  var testID: js.UndefOr[String] = js.undefined
  
  /**
    * Set the button text
    */
  var text: js.UndefOr[String] = js.undefined
}
object OptionsTopBarButton {
  
  @scala.inline
  def apply(id: String): OptionsTopBarButton = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsTopBarButton]
  }
  
  @scala.inline
  implicit class OptionsTopBarButtonMutableBuilder[Self <: OptionsTopBarButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    @scala.inline
    def setAllCaps(value: Boolean): Self = StObject.set(x, "allCaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllCapsUndefined: Self = StObject.set(x, "allCaps", js.undefined)
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setComponent(value: Height): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setDisableIconTint(value: Boolean): Self = StObject.set(x, "disableIconTint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableIconTintUndefined: Self = StObject.set(x, "disableIconTint", js.undefined)
    
    @scala.inline
    def setDisabledColor(value: Color): Self = StObject.set(x, "disabledColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledColorUndefined: Self = StObject.set(x, "disabledColor", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
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
    def setIconInsets(value: IconInsets): Self = StObject.set(x, "iconInsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconInsetsUndefined: Self = StObject.set(x, "iconInsets", js.undefined)
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAsAction(value: ifRoom | withText | always | never): Self = StObject.set(x, "showAsAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAsActionUndefined: Self = StObject.set(x, "showAsAction", js.undefined)
    
    @scala.inline
    def setSystemItem(value: SystemItemIcon): Self = StObject.set(x, "systemItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemItemUndefined: Self = StObject.set(x, "systemItem", js.undefined)
    
    @scala.inline
    def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
