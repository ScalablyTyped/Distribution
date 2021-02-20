package typings.reactNativeElements.anon

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.mod.IconObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-native-elements.react-native-elements.TileProps> */
@js.native
trait PartialTileProps extends StObject {
  
  var ImageComponent: js.UndefOr[ComponentClass[js.Object, ComponentState]] = js.native
  
  var activeOpacity: js.UndefOr[Double] = js.native
  
  var caption: js.UndefOr[String] = js.native
  
  var captionStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var featured: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var icon: js.UndefOr[IconObject] = js.native
  
  var iconContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var imageContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var imageProps: js.UndefOr[PartialImageProps] = js.native
  
  var imageSrc: js.UndefOr[ImageURISource | String | Double] = js.native
  
  var onPress: js.UndefOr[js.Function0[Unit]] = js.native
  
  var overlayContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object PartialTileProps {
  
  @scala.inline
  def apply(): PartialTileProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTileProps]
  }
  
  @scala.inline
  implicit class PartialTilePropsMutableBuilder[Self <: PartialTileProps] (val x: Self) extends AnyVal {
    
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
    def setImageSrcUndefined: Self = StObject.set(x, "imageSrc", js.undefined)
    
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
