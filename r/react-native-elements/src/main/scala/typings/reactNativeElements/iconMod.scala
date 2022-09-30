package typings.reactNativeElements

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.TouchableHighlightProps
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.anon.IconButtonPropstypestring
import typings.reactNativeElements.anon.PartialIconProps
import typings.reactNativeElements.anon.PickIconButtonPropstypest
import typings.reactNativeElements.anon.TypeofComponent
import typings.reactNativeElements.helpersMod.RneFunctionComponent
import typings.reactNativeVectorIcons.iconMod.IconButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/icons/Icon", JSImport.Default)
  @js.native
  val default: FunctionComponent[PickIconButtonPropstypest] | ForwardRefExoticComponent[IconButtonPropstypestring] = js.native
  
  @JSImport("react-native-elements/dist/icons/Icon", "Icon")
  @js.native
  val Icon: RneFunctionComponent[IconProps] = js.native
  
  type IconNode = Boolean | ReactElement | PartialIconProps
  
  trait IconObject
    extends StObject
       with TouchableHighlightProps {
    
    var color: js.UndefOr[String] = js.undefined
    
    var iconStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[IconType] = js.undefined
  }
  object IconObject {
    
    inline def apply(): IconObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconObject]
    }
    
    extension [Self <: IconObject](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setIconStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
      
      inline def setIconStyleNull: Self = StObject.set(x, "iconStyle", null)
      
      inline def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setType(value: IconType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait IconProps
    extends StObject
       with IconButtonProps {
    
    var Component: js.UndefOr[
        TypeofComponent & (Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
          typings.react.mod.Component[js.Object, js.Object, js.Object]
        ])
      ] = js.undefined
    
    var brand: js.UndefOr[Boolean] = js.undefined
    
    var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var disabledStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var iconProps: js.UndefOr[typings.reactNativeVectorIcons.iconMod.IconProps] = js.undefined
    
    var raised: js.UndefOr[Boolean] = js.undefined
    
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    var reverseColor: js.UndefOr[String] = js.undefined
    
    var solid: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[IconType] = js.undefined
  }
  object IconProps {
    
    inline def apply(name: String): IconProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconProps]
    }
    
    extension [Self <: IconProps](x: Self) {
      
      inline def setBrand(value: Boolean): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
      
      inline def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
      
      inline def setComponent(
        value: TypeofComponent & (Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
              Component[js.Object, js.Object, js.Object]
            ])
      ): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
      
      inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
      
      inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      inline def setDisabledStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "disabledStyle", value.asInstanceOf[js.Any])
      
      inline def setDisabledStyleNull: Self = StObject.set(x, "disabledStyle", null)
      
      inline def setDisabledStyleUndefined: Self = StObject.set(x, "disabledStyle", js.undefined)
      
      inline def setIconProps(value: typings.reactNativeVectorIcons.iconMod.IconProps): Self = StObject.set(x, "iconProps", value.asInstanceOf[js.Any])
      
      inline def setIconPropsUndefined: Self = StObject.set(x, "iconProps", js.undefined)
      
      inline def setRaised(value: Boolean): Self = StObject.set(x, "raised", value.asInstanceOf[js.Any])
      
      inline def setRaisedUndefined: Self = StObject.set(x, "raised", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseColor(value: String): Self = StObject.set(x, "reverseColor", value.asInstanceOf[js.Any])
      
      inline def setReverseColorUndefined: Self = StObject.set(x, "reverseColor", js.undefined)
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setSolid(value: Boolean): Self = StObject.set(x, "solid", value.asInstanceOf[js.Any])
      
      inline def setSolidUndefined: Self = StObject.set(x, "solid", js.undefined)
      
      inline def setType(value: IconType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeElements.reactNativeElementsStrings.material
    - typings.reactNativeElements.reactNativeElementsStrings.`material-community`
    - typings.reactNativeElements.reactNativeElementsStrings.`simple-line-icon`
    - typings.reactNativeElements.reactNativeElementsStrings.zocial
    - typings.reactNativeElements.reactNativeElementsStrings.`font-awesome`
    - typings.reactNativeElements.reactNativeElementsStrings.octicon
    - typings.reactNativeElements.reactNativeElementsStrings.ionicon
    - typings.reactNativeElements.reactNativeElementsStrings.foundation
    - typings.reactNativeElements.reactNativeElementsStrings.evilicon
    - typings.reactNativeElements.reactNativeElementsStrings.entypo
    - typings.reactNativeElements.reactNativeElementsStrings.antdesign
    - typings.reactNativeElements.reactNativeElementsStrings.`font-awesome-5`
    - java.lang.String
  */
  type IconType = _IconType | String
  
  trait _IconType extends StObject
  
  type _To = FunctionComponent[PickIconButtonPropstypest] | ForwardRefExoticComponent[IconButtonPropstypestring]
  
  /* This means you don't have to write `default`, but can instead just say `iconMod.foo` */
  override def _to: FunctionComponent[PickIconButtonPropstypest] | ForwardRefExoticComponent[IconButtonPropstypestring] = default
}
