package typings.reactNativeElements.anon

import org.scalablytyped.runtime.Instantiable1
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactElement
import typings.reactNative.mod.ImageSourcePropType
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.distAvatarAvatarMod.AvatarIcon
import typings.reactNativeElements.reactNativeElementsStrings.large
import typings.reactNativeElements.reactNativeElementsStrings.medium
import typings.reactNativeElements.reactNativeElementsStrings.small
import typings.reactNativeElements.reactNativeElementsStrings.xlarge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-elements.react-native-elements/dist/avatar/Avatar.AvatarProps & std.Partial<react-native-elements.react-native-elements/dist/config.ThemeProps<react-native-elements.react-native-elements/dist/avatar/Avatar.AvatarProps>> */
trait AvatarPropsPartialThemePrActiveOpacity extends StObject {
  
  var Component: js.UndefOr[
    TypeofComponent & (Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
      typings.react.mod.Component[js.Object, js.Object, js.Object]
    ])
  ] = js.undefined
  
  var ImageComponent: js.UndefOr[ComponentClass[js.Object, ComponentState]] = js.undefined
  
  var activeOpacity: js.UndefOr[Double] = js.undefined
  
  var avatarStyle: js.UndefOr[ImageStyle] = js.undefined
  
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var icon: js.UndefOr[AvatarIcon] = js.undefined
  
  var iconStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var imageProps: js.UndefOr[PartialImageProps] = js.undefined
  
  var onLongPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var overlayContainerStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var placeholderStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var renderPlaceholderContent: js.UndefOr[ReactElement] = js.undefined
  
  var replaceTheme: js.UndefOr[js.Function1[/* updates */ RecursivePartialFullThemeAirbnbRating, Unit]] = js.undefined
  
  var rounded: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[small | medium | large | xlarge | Double] = js.undefined
  
  var source: js.UndefOr[ImageSourcePropType] = js.undefined
  
  var theme: js.UndefOr[ThemeAvatarPropsActiveOpacity] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var updateTheme: js.UndefOr[js.Function1[/* updates */ RecursivePartialFullThemeAirbnbRating, Unit]] = js.undefined
}
object AvatarPropsPartialThemePrActiveOpacity {
  
  inline def apply(): AvatarPropsPartialThemePrActiveOpacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvatarPropsPartialThemePrActiveOpacity]
  }
  
  extension [Self <: AvatarPropsPartialThemePrActiveOpacity](x: Self) {
    
    inline def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
    
    inline def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
    
    inline def setAvatarStyle(value: ImageStyle): Self = StObject.set(x, "avatarStyle", value.asInstanceOf[js.Any])
    
    inline def setAvatarStyleUndefined: Self = StObject.set(x, "avatarStyle", js.undefined)
    
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
    
    inline def setIcon(value: AvatarIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
    
    inline def setIconStyleNull: Self = StObject.set(x, "iconStyle", null)
    
    inline def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setImageComponent(value: ComponentClass[js.Object, ComponentState]): Self = StObject.set(x, "ImageComponent", value.asInstanceOf[js.Any])
    
    inline def setImageComponentUndefined: Self = StObject.set(x, "ImageComponent", js.undefined)
    
    inline def setImageProps(value: PartialImageProps): Self = StObject.set(x, "imageProps", value.asInstanceOf[js.Any])
    
    inline def setImagePropsUndefined: Self = StObject.set(x, "imageProps", js.undefined)
    
    inline def setOnLongPress(value: () => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction0(value))
    
    inline def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
    
    inline def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setOverlayContainerStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "overlayContainerStyle", value.asInstanceOf[js.Any])
    
    inline def setOverlayContainerStyleNull: Self = StObject.set(x, "overlayContainerStyle", null)
    
    inline def setOverlayContainerStyleUndefined: Self = StObject.set(x, "overlayContainerStyle", js.undefined)
    
    inline def setPlaceholderStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "placeholderStyle", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderStyleNull: Self = StObject.set(x, "placeholderStyle", null)
    
    inline def setPlaceholderStyleUndefined: Self = StObject.set(x, "placeholderStyle", js.undefined)
    
    inline def setRenderPlaceholderContent(value: ReactElement): Self = StObject.set(x, "renderPlaceholderContent", value.asInstanceOf[js.Any])
    
    inline def setRenderPlaceholderContentUndefined: Self = StObject.set(x, "renderPlaceholderContent", js.undefined)
    
    inline def setReplaceTheme(value: /* updates */ RecursivePartialFullThemeAirbnbRating => Unit): Self = StObject.set(x, "replaceTheme", js.Any.fromFunction1(value))
    
    inline def setReplaceThemeUndefined: Self = StObject.set(x, "replaceTheme", js.undefined)
    
    inline def setRounded(value: Boolean): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
    
    inline def setRoundedUndefined: Self = StObject.set(x, "rounded", js.undefined)
    
    inline def setSize(value: small | medium | large | xlarge | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSource(value: ImageSourcePropType): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSourceVarargs(value: ImageURISource*): Self = StObject.set(x, "source", js.Array(value*))
    
    inline def setTheme(value: ThemeAvatarPropsActiveOpacity): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
    
    inline def setTitleStyleNull: Self = StObject.set(x, "titleStyle", null)
    
    inline def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUpdateTheme(value: /* updates */ RecursivePartialFullThemeAirbnbRating => Unit): Self = StObject.set(x, "updateTheme", js.Any.fromFunction1(value))
    
    inline def setUpdateThemeUndefined: Self = StObject.set(x, "updateTheme", js.undefined)
  }
}
