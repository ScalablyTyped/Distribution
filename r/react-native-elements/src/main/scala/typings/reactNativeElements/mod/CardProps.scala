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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardProps extends StObject {
  
  /**
    * Outer container style
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * Additional divider styling
    * (if title provided)
    */
  var dividerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * Subtitle rendered over the image
    * (only works if image prop is present)
    */
  var featuredSubtitle: js.UndefOr[String] = js.undefined
  
  /**
    * Styling for featured subtitle
    */
  var featuredSubtitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * Title rendered over the image
    * (only works if image prop is present)
    */
  var featuredTitle: js.UndefOr[String] = js.undefined
  
  /**
    * Styling for featured title
    */
  var featuredTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * Add an image as the heading with the image prop
    */
  var image: js.UndefOr[ImageSourcePropType] = js.undefined
  
  /**
    * Optional properties to pass to the image if provided e.g "resizeMode"
    */
  var imageProps: js.UndefOr[PartialImageProps] = js.undefined
  
  /**
    * Specify image styling if image is provided
    */
  var imageStyle: js.UndefOr[ImageStyle] = js.undefined
  
  /**
    * Specify styling for view surrounding image
    */
  var imageWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * Card title
    */
  var title: js.UndefOr[String | ReactElement] = js.undefined
  
  /**
    * Additional title styling (if title provided)
    */
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * Inner container style
    */
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}
object CardProps {
  
  inline def apply(): CardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardProps]
  }
  
  extension [Self <: CardProps](x: Self) {
    
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
