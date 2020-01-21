package typings.reactNativeElements.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileProps extends js.Object {
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
  var imageProps: js.UndefOr[Partial[ImageProps]] = js.undefined
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
  def apply(
    imageSrc: ImageURISource | String | Double,
    ImageComponent: ComponentClass[js.Object, ComponentState] = null,
    activeOpacity: Int | Double = null,
    caption: String = null,
    captionStyle: StyleProp[TextStyle] = null,
    containerStyle: StyleProp[ViewStyle] = null,
    contentContainerStyle: StyleProp[ViewStyle] = null,
    featured: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    icon: IconObject = null,
    iconContainerStyle: StyleProp[ViewStyle] = null,
    imageContainerStyle: StyleProp[ViewStyle] = null,
    imageProps: Partial[ImageProps] = null,
    onPress: () => Unit = null,
    overlayContainerStyle: StyleProp[ViewStyle] = null,
    title: String = null,
    titleStyle: StyleProp[TextStyle] = null,
    width: Int | Double = null
  ): TileProps = {
    val __obj = js.Dynamic.literal(imageSrc = imageSrc.asInstanceOf[js.Any])
    if (ImageComponent != null) __obj.updateDynamic("ImageComponent")(ImageComponent.asInstanceOf[js.Any])
    if (activeOpacity != null) __obj.updateDynamic("activeOpacity")(activeOpacity.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (captionStyle != null) __obj.updateDynamic("captionStyle")(captionStyle.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (contentContainerStyle != null) __obj.updateDynamic("contentContainerStyle")(contentContainerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(featured)) __obj.updateDynamic("featured")(featured.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconContainerStyle != null) __obj.updateDynamic("iconContainerStyle")(iconContainerStyle.asInstanceOf[js.Any])
    if (imageContainerStyle != null) __obj.updateDynamic("imageContainerStyle")(imageContainerStyle.asInstanceOf[js.Any])
    if (imageProps != null) __obj.updateDynamic("imageProps")(imageProps.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (overlayContainerStyle != null) __obj.updateDynamic("overlayContainerStyle")(overlayContainerStyle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileProps]
  }
}

