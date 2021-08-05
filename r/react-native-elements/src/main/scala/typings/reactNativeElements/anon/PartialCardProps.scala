package typings.reactNativeElements.anon

import typings.react.mod.ReactElement
import typings.reactNative.mod.ImageSourcePropType
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-native-elements.react-native-elements.CardProps> */
trait PartialCardProps extends StObject {
  
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var dividerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var featuredSubtitle: js.UndefOr[String] = js.undefined
  
  var featuredSubtitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var featuredTitle: js.UndefOr[String] = js.undefined
  
  var featuredTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var image: js.UndefOr[ImageSourcePropType] = js.undefined
  
  var imageProps: js.UndefOr[PartialImageProps] = js.undefined
  
  var imageStyle: js.UndefOr[ImageStyle] = js.undefined
  
  var imageWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var title: js.UndefOr[String | ReactElement] = js.undefined
  
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}
object PartialCardProps {
  
  inline def apply(): PartialCardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCardProps]
  }
  
  extension [Self <: PartialCardProps](x: Self) {
    
    inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
    
    inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    inline def setDividerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "dividerStyle", value.asInstanceOf[js.Any])
    
    inline def setDividerStyleNull: Self = StObject.set(x, "dividerStyle", null)
    
    inline def setDividerStyleUndefined: Self = StObject.set(x, "dividerStyle", js.undefined)
    
    inline def setFeaturedSubtitle(value: String): Self = StObject.set(x, "featuredSubtitle", value.asInstanceOf[js.Any])
    
    inline def setFeaturedSubtitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "featuredSubtitleStyle", value.asInstanceOf[js.Any])
    
    inline def setFeaturedSubtitleStyleNull: Self = StObject.set(x, "featuredSubtitleStyle", null)
    
    inline def setFeaturedSubtitleStyleUndefined: Self = StObject.set(x, "featuredSubtitleStyle", js.undefined)
    
    inline def setFeaturedSubtitleUndefined: Self = StObject.set(x, "featuredSubtitle", js.undefined)
    
    inline def setFeaturedTitle(value: String): Self = StObject.set(x, "featuredTitle", value.asInstanceOf[js.Any])
    
    inline def setFeaturedTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "featuredTitleStyle", value.asInstanceOf[js.Any])
    
    inline def setFeaturedTitleStyleNull: Self = StObject.set(x, "featuredTitleStyle", null)
    
    inline def setFeaturedTitleStyleUndefined: Self = StObject.set(x, "featuredTitleStyle", js.undefined)
    
    inline def setFeaturedTitleUndefined: Self = StObject.set(x, "featuredTitle", js.undefined)
    
    inline def setImage(value: ImageSourcePropType): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageProps(value: PartialImageProps): Self = StObject.set(x, "imageProps", value.asInstanceOf[js.Any])
    
    inline def setImagePropsUndefined: Self = StObject.set(x, "imageProps", js.undefined)
    
    inline def setImageStyle(value: ImageStyle): Self = StObject.set(x, "imageStyle", value.asInstanceOf[js.Any])
    
    inline def setImageStyleUndefined: Self = StObject.set(x, "imageStyle", js.undefined)
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setImageVarargs(value: ImageURISource*): Self = StObject.set(x, "image", js.Array(value :_*))
    
    inline def setImageWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "imageWrapperStyle", value.asInstanceOf[js.Any])
    
    inline def setImageWrapperStyleNull: Self = StObject.set(x, "imageWrapperStyle", null)
    
    inline def setImageWrapperStyleUndefined: Self = StObject.set(x, "imageWrapperStyle", js.undefined)
    
    inline def setTitle(value: String | ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
    
    inline def setTitleStyleNull: Self = StObject.set(x, "titleStyle", null)
    
    inline def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
    
    inline def setWrapperStyleNull: Self = StObject.set(x, "wrapperStyle", null)
    
    inline def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
  }
}
