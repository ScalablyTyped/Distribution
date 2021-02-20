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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-native-elements.react-native-elements.CardProps> */
@js.native
trait PartialCardProps extends StObject {
  
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var dividerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var featuredSubtitle: js.UndefOr[String] = js.native
  
  var featuredSubtitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var featuredTitle: js.UndefOr[String] = js.native
  
  var featuredTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var image: js.UndefOr[ImageSourcePropType] = js.native
  
  var imageProps: js.UndefOr[PartialImageProps] = js.native
  
  var imageStyle: js.UndefOr[ImageStyle] = js.native
  
  var imageWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var title: js.UndefOr[String | ReactElement] = js.native
  
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
}
object PartialCardProps {
  
  @scala.inline
  def apply(): PartialCardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCardProps]
  }
  
  @scala.inline
  implicit class PartialCardPropsMutableBuilder[Self <: PartialCardProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
    
    @scala.inline
    def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    @scala.inline
    def setDividerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "dividerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDividerStyleNull: Self = StObject.set(x, "dividerStyle", null)
    
    @scala.inline
    def setDividerStyleUndefined: Self = StObject.set(x, "dividerStyle", js.undefined)
    
    @scala.inline
    def setFeaturedSubtitle(value: String): Self = StObject.set(x, "featuredSubtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturedSubtitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "featuredSubtitleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturedSubtitleStyleNull: Self = StObject.set(x, "featuredSubtitleStyle", null)
    
    @scala.inline
    def setFeaturedSubtitleStyleUndefined: Self = StObject.set(x, "featuredSubtitleStyle", js.undefined)
    
    @scala.inline
    def setFeaturedSubtitleUndefined: Self = StObject.set(x, "featuredSubtitle", js.undefined)
    
    @scala.inline
    def setFeaturedTitle(value: String): Self = StObject.set(x, "featuredTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturedTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "featuredTitleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturedTitleStyleNull: Self = StObject.set(x, "featuredTitleStyle", null)
    
    @scala.inline
    def setFeaturedTitleStyleUndefined: Self = StObject.set(x, "featuredTitleStyle", js.undefined)
    
    @scala.inline
    def setFeaturedTitleUndefined: Self = StObject.set(x, "featuredTitle", js.undefined)
    
    @scala.inline
    def setImage(value: ImageSourcePropType): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageProps(value: PartialImageProps): Self = StObject.set(x, "imageProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagePropsUndefined: Self = StObject.set(x, "imageProps", js.undefined)
    
    @scala.inline
    def setImageStyle(value: ImageStyle): Self = StObject.set(x, "imageStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageStyleUndefined: Self = StObject.set(x, "imageStyle", js.undefined)
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setImageVarargs(value: ImageURISource*): Self = StObject.set(x, "image", js.Array(value :_*))
    
    @scala.inline
    def setImageWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "imageWrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageWrapperStyleNull: Self = StObject.set(x, "imageWrapperStyle", null)
    
    @scala.inline
    def setImageWrapperStyleUndefined: Self = StObject.set(x, "imageWrapperStyle", js.undefined)
    
    @scala.inline
    def setTitle(value: String | ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleStyleNull: Self = StObject.set(x, "titleStyle", null)
    
    @scala.inline
    def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapperStyleNull: Self = StObject.set(x, "wrapperStyle", null)
    
    @scala.inline
    def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
  }
}
