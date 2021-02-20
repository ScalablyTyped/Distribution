package typings.reactNativeElements.mod

import typings.react.mod.ReactElement
import typings.reactNative.mod.ImageSourcePropType
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.anon.PartialImageProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardProps extends StObject {
  
  /**
    * Outer container style
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * Additional divider styling
    * (if title provided)
    */
  var dividerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * Subtitle rendered over the image
    * (only works if image prop is present)
    */
  var featuredSubtitle: js.UndefOr[String] = js.native
  
  /**
    * Styling for featured subtitle
    */
  var featuredSubtitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  /**
    * Title rendered over the image
    * (only works if image prop is present)
    */
  var featuredTitle: js.UndefOr[String] = js.native
  
  /**
    * Styling for featured title
    */
  var featuredTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  /**
    * Add an image as the heading with the image prop
    */
  var image: js.UndefOr[ImageSourcePropType] = js.native
  
  /**
    * Optional properties to pass to the image if provided e.g "resizeMode"
    */
  var imageProps: js.UndefOr[PartialImageProps] = js.native
  
  /**
    * Specify image styling if image is provided
    */
  var imageStyle: js.UndefOr[ImageStyle] = js.native
  
  /**
    * Specify styling for view surrounding image
    */
  var imageWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * Card title
    */
  var title: js.UndefOr[String | ReactElement] = js.native
  
  /**
    * Additional title styling (if title provided)
    */
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  /**
    * Inner container style
    */
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
}
object CardProps {
  
  @scala.inline
  def apply(): CardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardProps]
  }
  
  @scala.inline
  implicit class CardPropsMutableBuilder[Self <: CardProps] (val x: Self) extends AnyVal {
    
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
