package typings.reactNativeElements.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.anon.PartialImageProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileProps extends js.Object {
  
  /**
    * Specify a different component as the Image component
    * @default React Native BackgroundImage component
    */
  var ImageComponent: js.UndefOr[ComponentClass[js.Object, ComponentState]] = js.native
  
  /**
    * Number passed to control opacity on press
    *
    * @default 0.2
    */
  var activeOpacity: js.UndefOr[Double] = js.native
  
  /**
    * Text inside the tile when tile is featured
    */
  var caption: js.UndefOr[String] = js.native
  
  /**
    * Styling for the caption
    */
  var captionStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  /**
    * @default none	object (style)	Styling for the outer tile container
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * Styling for bottom container when not featured tile
    */
  var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * Changes the look of the tile
    */
  var featured: js.UndefOr[Boolean] = js.native
  
  /**
    * Height for the tile
    *
    * @default Device Width * 0.8
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * Icon Component Props
    */
  var icon: js.UndefOr[IconObject] = js.native
  
  /**
    * Styling for the outer icon container
    */
  var iconContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * Styling for the image
    */
  var imageContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * Optional properties to pass to the image if provided e.g "resizeMode"
    */
  var imageProps: js.UndefOr[PartialImageProps] = js.native
  
  /**
    * Source for the image
    */
  var imageSrc: ImageURISource | String | Double = js.native
  
  /**
    * @default none	function (event)	Function to call when tile is pressed
    */
  var onPress: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Styling for overlay
    */
  var overlayContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * Text inside the tile
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * Styling for the title
    */
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  /**
    * Width for the tile
    *
    * @default Device Width
    */
  var width: js.UndefOr[Double] = js.native
}
object TileProps {
  
  @scala.inline
  def apply(imageSrc: ImageURISource | String | Double): TileProps = {
    val __obj = js.Dynamic.literal(imageSrc = imageSrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileProps]
  }
  
  @scala.inline
  implicit class TilePropsOps[Self <: TileProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setImageSrc(value: ImageURISource | String | Double): Self = this.set("imageSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageComponent(value: ComponentClass[js.Object, ComponentState]): Self = this.set("ImageComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageComponent: Self = this.set("ImageComponent", js.undefined)
    
    @scala.inline
    def setActiveOpacity(value: Double): Self = this.set("activeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveOpacity: Self = this.set("activeOpacity", js.undefined)
    
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    
    @scala.inline
    def setCaptionStyle(value: StyleProp[TextStyle]): Self = this.set("captionStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptionStyle: Self = this.set("captionStyle", js.undefined)
    
    @scala.inline
    def setCaptionStyleNull: Self = this.set("captionStyle", null)
    
    @scala.inline
    def setContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    
    @scala.inline
    def setContainerStyleNull: Self = this.set("containerStyle", null)
    
    @scala.inline
    def setContentContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("contentContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentContainerStyle: Self = this.set("contentContainerStyle", js.undefined)
    
    @scala.inline
    def setContentContainerStyleNull: Self = this.set("contentContainerStyle", null)
    
    @scala.inline
    def setFeatured(value: Boolean): Self = this.set("featured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatured: Self = this.set("featured", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setIcon(value: IconObject): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIconContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("iconContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconContainerStyle: Self = this.set("iconContainerStyle", js.undefined)
    
    @scala.inline
    def setIconContainerStyleNull: Self = this.set("iconContainerStyle", null)
    
    @scala.inline
    def setImageContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("imageContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageContainerStyle: Self = this.set("imageContainerStyle", js.undefined)
    
    @scala.inline
    def setImageContainerStyleNull: Self = this.set("imageContainerStyle", null)
    
    @scala.inline
    def setImageProps(value: PartialImageProps): Self = this.set("imageProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageProps: Self = this.set("imageProps", js.undefined)
    
    @scala.inline
    def setOnPress(value: () => Unit): Self = this.set("onPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    
    @scala.inline
    def setOverlayContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("overlayContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayContainerStyle: Self = this.set("overlayContainerStyle", js.undefined)
    
    @scala.inline
    def setOverlayContainerStyleNull: Self = this.set("overlayContainerStyle", null)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleStyle(value: StyleProp[TextStyle]): Self = this.set("titleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleStyle: Self = this.set("titleStyle", js.undefined)
    
    @scala.inline
    def setTitleStyleNull: Self = this.set("titleStyle", null)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
