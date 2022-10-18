package typings.reactNativeElements.anon

import org.scalablytyped.runtime.Instantiable1
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactElement
import typings.reactNative.mod.ImageSourcePropType
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.distAvatarAvatarMod.AvatarIcon
import typings.reactNativeElements.distConfigThemeProviderMod.RecursivePartial
import typings.reactNativeElements.distImageImageMod.ImageProps
import typings.reactNativeElements.reactNativeElementsStrings.Component
import typings.reactNativeElements.reactNativeElementsStrings.large
import typings.reactNativeElements.reactNativeElementsStrings.medium
import typings.reactNativeElements.reactNativeElementsStrings.small
import typings.reactNativeElements.reactNativeElementsStrings.xlarge
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-elements.react-native-elements/dist/config/ThemeProvider.RecursivePartial<std.Partial<react-native-elements.react-native-elements/dist/avatar/Avatar.AvatarProps>> */
trait RecursivePartialPartialAv extends StObject {
  
  var Component: js.UndefOr[
    RecursivePartial[
      js.UndefOr[
        TypeofComponent & (Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
          typings.react.mod.Component[
            typings.reactNativeElements.reactNativeElementsStrings.Component, 
            js.Object, 
            js.Object
          ]
        ])
      ]
    ]
  ] = js.undefined
  
  var ImageComponent: js.UndefOr[RecursivePartial[js.UndefOr[ComponentClass[js.Object, ComponentState]]]] = js.undefined
  
  var activeOpacity: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  
  var avatarStyle: js.UndefOr[RecursivePartial[js.UndefOr[ImageStyle]]] = js.undefined
  
  var containerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  
  var icon: js.UndefOr[RecursivePartial[js.UndefOr[AvatarIcon]]] = js.undefined
  
  var iconStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.undefined
  
  var imageProps: js.UndefOr[RecursivePartial[js.UndefOr[Partial[ImageProps]]]] = js.undefined
  
  var onLongPress: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  
  var onPress: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  
  var overlayContainerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.undefined
  
  var placeholderStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  
  var renderPlaceholderContent: js.UndefOr[RecursivePartial[js.UndefOr[ReactElement]]] = js.undefined
  
  var rounded: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var size: js.UndefOr[RecursivePartial[js.UndefOr[small | medium | large | xlarge | Double]]] = js.undefined
  
  var source: js.UndefOr[RecursivePartial[js.UndefOr[ImageSourcePropType]]] = js.undefined
  
  var title: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  
  var titleStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.undefined
}
object RecursivePartialPartialAv {
  
  inline def apply(): RecursivePartialPartialAv = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialPartialAv]
  }
  
  extension [Self <: RecursivePartialPartialAv](x: Self) {
    
    inline def setActiveOpacity(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
    
    inline def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
    
    inline def setAvatarStyle(value: RecursivePartial[js.UndefOr[ImageStyle]]): Self = StObject.set(x, "avatarStyle", value.asInstanceOf[js.Any])
    
    inline def setAvatarStyleUndefined: Self = StObject.set(x, "avatarStyle", js.undefined)
    
    inline def setComponent(
      value: RecursivePartial[
          js.UndefOr[
            TypeofComponent & (Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
              typings.react.mod.Component[Component, js.Object, js.Object]
            ])
          ]
        ]
    ): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
    
    inline def setContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    inline def setIcon(value: RecursivePartial[js.UndefOr[AvatarIcon]]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
    
    inline def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setImageComponent(value: RecursivePartial[js.UndefOr[ComponentClass[js.Object, ComponentState]]]): Self = StObject.set(x, "ImageComponent", value.asInstanceOf[js.Any])
    
    inline def setImageComponentUndefined: Self = StObject.set(x, "ImageComponent", js.undefined)
    
    inline def setImageProps(value: RecursivePartial[js.UndefOr[Partial[ImageProps]]]): Self = StObject.set(x, "imageProps", value.asInstanceOf[js.Any])
    
    inline def setImagePropsUndefined: Self = StObject.set(x, "imageProps", js.undefined)
    
    inline def setOnLongPress(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "onLongPress", value.asInstanceOf[js.Any])
    
    inline def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
    
    inline def setOnPress(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "onPress", value.asInstanceOf[js.Any])
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setOverlayContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = StObject.set(x, "overlayContainerStyle", value.asInstanceOf[js.Any])
    
    inline def setOverlayContainerStyleUndefined: Self = StObject.set(x, "overlayContainerStyle", js.undefined)
    
    inline def setPlaceholderStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = StObject.set(x, "placeholderStyle", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderStyleUndefined: Self = StObject.set(x, "placeholderStyle", js.undefined)
    
    inline def setRenderPlaceholderContent(value: RecursivePartial[js.UndefOr[ReactElement]]): Self = StObject.set(x, "renderPlaceholderContent", value.asInstanceOf[js.Any])
    
    inline def setRenderPlaceholderContentUndefined: Self = StObject.set(x, "renderPlaceholderContent", js.undefined)
    
    inline def setRounded(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
    
    inline def setRoundedUndefined: Self = StObject.set(x, "rounded", js.undefined)
    
    inline def setSize(value: RecursivePartial[js.UndefOr[small | medium | large | xlarge | Double]]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSource(value: RecursivePartial[js.UndefOr[ImageSourcePropType]]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTitle(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
    
    inline def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
