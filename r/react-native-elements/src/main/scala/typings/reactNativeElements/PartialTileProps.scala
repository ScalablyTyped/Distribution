package typings.reactNativeElements

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.mod.IconObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-native-elements.react-native-elements.TileProps> */
trait PartialTileProps extends js.Object {
  var ImageComponent: js.UndefOr[ComponentClass[js.Object, ComponentState]] = js.undefined
  var activeOpacity: js.UndefOr[Double] = js.undefined
  var caption: js.UndefOr[String] = js.undefined
  var captionStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var featured: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var icon: js.UndefOr[IconObject] = js.undefined
  var iconContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var imageContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var imageProps: js.UndefOr[PartialImageProps] = js.undefined
  var imageSrc: js.UndefOr[ImageURISource | String | Double] = js.undefined
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var overlayContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object PartialTileProps {
  @scala.inline
  def apply(
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
    imageProps: PartialImageProps = null,
    imageSrc: ImageURISource | String | Double = null,
    onPress: () => Unit = null,
    overlayContainerStyle: StyleProp[ViewStyle] = null,
    title: String = null,
    titleStyle: StyleProp[TextStyle] = null,
    width: Int | Double = null
  ): PartialTileProps = {
    val __obj = js.Dynamic.literal()
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
    if (imageSrc != null) __obj.updateDynamic("imageSrc")(imageSrc.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (overlayContainerStyle != null) __obj.updateDynamic("overlayContainerStyle")(overlayContainerStyle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTileProps]
  }
}

