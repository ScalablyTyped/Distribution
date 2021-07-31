package typings.reactNativeElements.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.anon.PartialImageProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileProps extends StObject {
  
  /**
    * Specify a different component as the Image component
    * @default React Native BackgroundImage component
    */
  var ImageComponent: js.UndefOr[ComponentClass[js.Object, ComponentState]] = js.undefined
  
  /**
    * Number passed to control opacity on press
    *
    * @default 0.2
    */
  var activeOpacity: js.UndefOr[Double] = js.undefined
  
  /**
    * Text inside the tile when tile is featured
    */
  var caption: js.UndefOr[String] = js.undefined
  
  /**
    * Styling for the caption
    */
  var captionStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * @default none	object (style)	Styling for the outer tile container
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * Styling for bottom container when not featured tile
    */
  var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * Changes the look of the tile
    */
  var featured: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Height for the tile
    *
    * @default Device Width * 0.8
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Icon Component Props
    */
  var icon: js.UndefOr[IconObject] = js.undefined
  
  /**
    * Styling for the outer icon container
    */
  var iconContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * Styling for the image
    */
  var imageContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * Optional properties to pass to the image if provided e.g "resizeMode"
    */
  var imageProps: js.UndefOr[PartialImageProps] = js.undefined
  
  /**
    * Source for the image
    */
  var imageSrc: ImageURISource | String | Double
  
  /**
    * @default none	function (event)	Function to call when tile is pressed
    */
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Styling for overlay
    */
  var overlayContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * Text inside the tile
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Styling for the title
    */
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * Width for the tile
    *
    * @default Device Width
    */
  var width: js.UndefOr[Double] = js.undefined
}
object TileProps {
  
  @scala.inline
  def apply(imageSrc: ImageURISource | String | Double): TileProps = {
    val __obj = js.Dynamic.literal(imageSrc = imageSrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileProps]
  }
  
  @scala.inline
  implicit class TilePropsMutableBuilder[Self <: TileProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "captionStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionStyleNull: Self = StObject.set(x, "captionStyle", null)
    
    @scala.inline
    def setCaptionStyleUndefined: Self = StObject.set(x, "captionStyle", js.undefined)
    
    @scala.inline
    def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
    
    @scala.inline
    def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    @scala.inline
    def setContentContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentContainerStyleNull: Self = StObject.set(x, "contentContainerStyle", null)
    
    @scala.inline
    def setContentContainerStyleUndefined: Self = StObject.set(x, "contentContainerStyle", js.undefined)
    
    @scala.inline
    def setFeatured(value: Boolean): Self = StObject.set(x, "featured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturedUndefined: Self = StObject.set(x, "featured", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setIcon(value: IconObject): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "iconContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconContainerStyleNull: Self = StObject.set(x, "iconContainerStyle", null)
    
    @scala.inline
    def setIconContainerStyleUndefined: Self = StObject.set(x, "iconContainerStyle", js.undefined)
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setImageComponent(value: ComponentClass[js.Object, ComponentState]): Self = StObject.set(x, "ImageComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageComponentUndefined: Self = StObject.set(x, "ImageComponent", js.undefined)
    
    @scala.inline
    def setImageContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "imageContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageContainerStyleNull: Self = StObject.set(x, "imageContainerStyle", null)
    
    @scala.inline
    def setImageContainerStyleUndefined: Self = StObject.set(x, "imageContainerStyle", js.undefined)
    
    @scala.inline
    def setImageProps(value: PartialImageProps): Self = StObject.set(x, "imageProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagePropsUndefined: Self = StObject.set(x, "imageProps", js.undefined)
    
    @scala.inline
    def setImageSrc(value: ImageURISource | String | Double): Self = StObject.set(x, "imageSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    @scala.inline
    def setOverlayContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "overlayContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayContainerStyleNull: Self = StObject.set(x, "overlayContainerStyle", null)
    
    @scala.inline
    def setOverlayContainerStyleUndefined: Self = StObject.set(x, "overlayContainerStyle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleStyleNull: Self = StObject.set(x, "titleStyle", null)
    
    @scala.inline
    def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
