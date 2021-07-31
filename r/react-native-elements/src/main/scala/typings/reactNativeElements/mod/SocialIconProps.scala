package typings.reactNativeElements.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SocialIconProps extends StObject {
  
  /**
    * Component Type of button
    *
    * @default TouchableHighlight
    */
  var Component: js.UndefOr[ComponentClass[js.Object, ComponentState]] = js.undefined
  
  /**
    * Creates button
    *
    * @default false
    */
  var button: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Disable button
    *
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify different font family
    *
    * @default System font bold (iOS), Sans Serif Black (android)
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  
  /**
    * Specify text styling
    */
  var fontStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * Specify font weight of title if set as a button with a title
    *
    * @default bold (ios), black(android)
    */
  var fontWeight: js.UndefOr[String] = js.undefined
  
  /**
    * Icon color
    */
  var iconColor: js.UndefOr[String] = js.undefined
  
  /**
    * Icon size
    *
    * @default 24
    */
  var iconSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Extra styling for icon component
    */
  var iconStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * Reverses icon color scheme, setting background to white and icon to primary color
    *
    * @default false
    */
  var light: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Shows loading indicator
    *
    * @default false
    */
  var loading: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @default none	function	onLongPress method
    */
  var onLongPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * onPress method
    */
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Adds a drop shadow, set to false to remove
    *
    * @default true
    */
  var raised: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Button styling
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * Title if made into a button
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Social media type
    */
  var `type`: SocialMediaType
  
  /**
    * Specify underlayColor for TouchableHighlight
    *
    * @default 'white' if `light` prop is true, otherwise defaults to icon color.
    */
  var underlayColor: js.UndefOr[String] = js.undefined
}
object SocialIconProps {
  
  @scala.inline
  def apply(`type`: SocialMediaType): SocialIconProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocialIconProps]
  }
  
  @scala.inline
  implicit class SocialIconPropsMutableBuilder[Self <: SocialIconProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButton(value: Boolean): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    @scala.inline
    def setComponent(value: ComponentClass[js.Object, ComponentState]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    @scala.inline
    def setFontStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyleNull: Self = StObject.set(x, "fontStyle", null)
    
    @scala.inline
    def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    @scala.inline
    def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    @scala.inline
    def setIconColor(value: String): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
    
    @scala.inline
    def setIconSize(value: Double): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconSizeUndefined: Self = StObject.set(x, "iconSize", js.undefined)
    
    @scala.inline
    def setIconStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconStyleNull: Self = StObject.set(x, "iconStyle", null)
    
    @scala.inline
    def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
    
    @scala.inline
    def setLight(value: Boolean): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
    
    @scala.inline
    def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    @scala.inline
    def setOnLongPress(value: () => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
    
    @scala.inline
    def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    @scala.inline
    def setRaised(value: Boolean): Self = StObject.set(x, "raised", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaisedUndefined: Self = StObject.set(x, "raised", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: SocialMediaType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlayColor(value: String): Self = StObject.set(x, "underlayColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlayColorUndefined: Self = StObject.set(x, "underlayColor", js.undefined)
  }
}
