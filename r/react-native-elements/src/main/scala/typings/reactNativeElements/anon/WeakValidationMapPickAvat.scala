package typings.reactNativeElements.anon

import org.scalablytyped.runtime.Instantiable1
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactElement
import typings.react.mod.Validator
import typings.reactNative.mod.ImageSourcePropType
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.avatarMod.AvatarIcon
import typings.reactNativeElements.reactNativeElementsStrings.Component
import typings.reactNativeElements.reactNativeElementsStrings.large
import typings.reactNativeElements.reactNativeElementsStrings.medium
import typings.reactNativeElements.reactNativeElementsStrings.small
import typings.reactNativeElements.reactNativeElementsStrings.xlarge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<std.Pick<react-native-elements.react-native-elements/dist/avatar/Avatar.AvatarProps & std.Partial<react-native-elements.react-native-elements/dist/config.ThemeProps<react-native-elements.react-native-elements/dist/avatar/Avatar.AvatarProps>>, 'source' | 'iconStyle' | 'size' | 'onPress' | 'onLongPress' | 'activeOpacity' | 'Component' | 'containerStyle' | 'title' | 'ImageComponent' | 'placeholderStyle' | 'icon' | 'avatarStyle' | 'rounded' | 'titleStyle' | 'overlayContainerStyle' | 'imageProps' | 'renderPlaceholderContent'>> */
trait WeakValidationMapPickAvat extends StObject {
  
  var Component: js.UndefOr[
    Validator[
      js.UndefOr[
        (TypeofComponent & (Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
          typings.react.mod.Component[
            typings.reactNativeElements.reactNativeElementsStrings.Component, 
            js.Object, 
            js.Object
          ]
        ])) | Null
      ]
    ]
  ] = js.undefined
  
  var ImageComponent: js.UndefOr[Validator[js.UndefOr[(ComponentClass[js.Object, ComponentState]) | Null]]] = js.undefined
  
  var activeOpacity: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var avatarStyle: js.UndefOr[Validator[js.UndefOr[ImageStyle | Null]]] = js.undefined
  
  var containerStyle: js.UndefOr[Validator[js.UndefOr[Null | StyleProp[ViewStyle]]]] = js.undefined
  
  var icon: js.UndefOr[Validator[js.UndefOr[AvatarIcon | Null]]] = js.undefined
  
  var iconStyle: js.UndefOr[Validator[js.UndefOr[Null | StyleProp[TextStyle]]]] = js.undefined
  
  var imageProps: js.UndefOr[Validator[js.UndefOr[Null | PartialImageProps]]] = js.undefined
  
  var onLongPress: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit] | Null]]] = js.undefined
  
  var onPress: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit] | Null]]] = js.undefined
  
  var overlayContainerStyle: js.UndefOr[Validator[js.UndefOr[Null | StyleProp[TextStyle]]]] = js.undefined
  
  var placeholderStyle: js.UndefOr[Validator[js.UndefOr[Null | StyleProp[ViewStyle]]]] = js.undefined
  
  var renderPlaceholderContent: js.UndefOr[Validator[js.UndefOr[Null | ReactElement]]] = js.undefined
  
  var rounded: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var size: js.UndefOr[Validator[js.UndefOr[small | medium | large | xlarge | Double | Null]]] = js.undefined
  
  var source: js.UndefOr[Validator[js.UndefOr[ImageSourcePropType | Null]]] = js.undefined
  
  var title: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var titleStyle: js.UndefOr[Validator[js.UndefOr[Null | StyleProp[TextStyle]]]] = js.undefined
}
object WeakValidationMapPickAvat {
  
  inline def apply(): WeakValidationMapPickAvat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapPickAvat]
  }
  
  extension [Self <: WeakValidationMapPickAvat](x: Self) {
    
    inline def setActiveOpacity(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
    
    inline def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
    
    inline def setAvatarStyle(value: Validator[js.UndefOr[ImageStyle | Null]]): Self = StObject.set(x, "avatarStyle", value.asInstanceOf[js.Any])
    
    inline def setAvatarStyleUndefined: Self = StObject.set(x, "avatarStyle", js.undefined)
    
    inline def setComponent(
      value: Validator[
          js.UndefOr[
            (TypeofComponent & (Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
              typings.react.mod.Component[Component, js.Object, js.Object]
            ])) | Null
          ]
        ]
    ): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
    
    inline def setContainerStyle(value: Validator[js.UndefOr[Null | StyleProp[ViewStyle]]]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    inline def setIcon(value: Validator[js.UndefOr[AvatarIcon | Null]]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconStyle(value: Validator[js.UndefOr[Null | StyleProp[TextStyle]]]): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
    
    inline def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setImageComponent(value: Validator[js.UndefOr[(ComponentClass[js.Object, ComponentState]) | Null]]): Self = StObject.set(x, "ImageComponent", value.asInstanceOf[js.Any])
    
    inline def setImageComponentUndefined: Self = StObject.set(x, "ImageComponent", js.undefined)
    
    inline def setImageProps(value: Validator[js.UndefOr[Null | PartialImageProps]]): Self = StObject.set(x, "imageProps", value.asInstanceOf[js.Any])
    
    inline def setImagePropsUndefined: Self = StObject.set(x, "imageProps", js.undefined)
    
    inline def setOnLongPress(value: Validator[js.UndefOr[js.Function0[Unit] | Null]]): Self = StObject.set(x, "onLongPress", value.asInstanceOf[js.Any])
    
    inline def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
    
    inline def setOnPress(value: Validator[js.UndefOr[js.Function0[Unit] | Null]]): Self = StObject.set(x, "onPress", value.asInstanceOf[js.Any])
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setOverlayContainerStyle(value: Validator[js.UndefOr[Null | StyleProp[TextStyle]]]): Self = StObject.set(x, "overlayContainerStyle", value.asInstanceOf[js.Any])
    
    inline def setOverlayContainerStyleUndefined: Self = StObject.set(x, "overlayContainerStyle", js.undefined)
    
    inline def setPlaceholderStyle(value: Validator[js.UndefOr[Null | StyleProp[ViewStyle]]]): Self = StObject.set(x, "placeholderStyle", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderStyleUndefined: Self = StObject.set(x, "placeholderStyle", js.undefined)
    
    inline def setRenderPlaceholderContent(value: Validator[js.UndefOr[Null | ReactElement]]): Self = StObject.set(x, "renderPlaceholderContent", value.asInstanceOf[js.Any])
    
    inline def setRenderPlaceholderContentUndefined: Self = StObject.set(x, "renderPlaceholderContent", js.undefined)
    
    inline def setRounded(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
    
    inline def setRoundedUndefined: Self = StObject.set(x, "rounded", js.undefined)
    
    inline def setSize(value: Validator[js.UndefOr[small | medium | large | xlarge | Double | Null]]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSource(value: Validator[js.UndefOr[ImageSourcePropType | Null]]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTitle(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleStyle(value: Validator[js.UndefOr[Null | StyleProp[TextStyle]]]): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
    
    inline def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
