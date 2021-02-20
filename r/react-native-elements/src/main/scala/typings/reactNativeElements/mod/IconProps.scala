package typings.reactNativeElements.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeVectorIcons.iconMod.IconButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IconProps extends IconButtonProps {
  
  /**
    * View if no onPress method is defined, TouchableHighlight if onPress method is defined	React Native component	update React Native Component
    */
  var Component: js.UndefOr[ComponentClass[js.Object, ComponentState]] = js.native
  
  /**
    * FontAwesome5 brands icon set
    *
    * @default false
    */
  var brand: js.UndefOr[Boolean] = js.native
  
  /**
    * Add styling to container holding icon
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * Styles for the Icon when disabled
    */
  var disabledStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /*
    * Extra props supplied to Icon Component from react-native-vector-icons.
    */
  var iconProps: js.UndefOr[typings.reactNativeVectorIcons.iconMod.IconProps] = js.native
  
  /**
    * Adds box shadow to button
    *
    * @default false
    */
  var raised: js.UndefOr[Boolean] = js.native
  
  /**
    * Reverses color scheme
    *
    * @default false
    */
  var reverse: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify reverse icon color
    *
    * @default 'white'
    */
  var reverseColor: js.UndefOr[String] = js.native
  
  /**
    * FontAwesome5 solid style
    *
    * @default false
    */
  var solid: js.UndefOr[Boolean] = js.native
  
  /**
    * Type (defaults to material, options are material-community, zocial, font-awesome, octicon, ionicon, foundation, evilicon, simple-line-icon, or entypo)
    * @default 'material'
    */
  var `type`: js.UndefOr[IconType] = js.native
}
object IconProps {
  
  @scala.inline
  def apply(name: String): IconProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconProps]
  }
  
  @scala.inline
  implicit class IconPropsMutableBuilder[Self <: IconProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrand(value: Boolean): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
    
    @scala.inline
    def setComponent(value: ComponentClass[js.Object, ComponentState]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
    
    @scala.inline
    def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    @scala.inline
    def setDisabledStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "disabledStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledStyleNull: Self = StObject.set(x, "disabledStyle", null)
    
    @scala.inline
    def setDisabledStyleUndefined: Self = StObject.set(x, "disabledStyle", js.undefined)
    
    @scala.inline
    def setIconProps(value: typings.reactNativeVectorIcons.iconMod.IconProps): Self = StObject.set(x, "iconProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconPropsUndefined: Self = StObject.set(x, "iconProps", js.undefined)
    
    @scala.inline
    def setRaised(value: Boolean): Self = StObject.set(x, "raised", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaisedUndefined: Self = StObject.set(x, "raised", js.undefined)
    
    @scala.inline
    def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseColor(value: String): Self = StObject.set(x, "reverseColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseColorUndefined: Self = StObject.set(x, "reverseColor", js.undefined)
    
    @scala.inline
    def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    @scala.inline
    def setSolid(value: Boolean): Self = StObject.set(x, "solid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolidUndefined: Self = StObject.set(x, "solid", js.undefined)
    
    @scala.inline
    def setType(value: IconType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
