package typings.reactNativeElements.anon

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
    activeOpacity: js.UndefOr[Double] = js.undefined,
    caption: String = null,
    captionStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    containerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    contentContainerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    featured: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    icon: IconObject = null,
    iconContainerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    imageContainerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    imageProps: PartialImageProps = null,
    imageSrc: ImageURISource | String | Double = null,
    onPress: () => Unit = null,
    overlayContainerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    title: String = null,
    titleStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): PartialTileProps = {
    val __obj = js.Dynamic.literal()
    if (ImageComponent != null) __obj.updateDynamic("ImageComponent")(ImageComponent.asInstanceOf[js.Any])
    if (!js.isUndefined(activeOpacity)) __obj.updateDynamic("activeOpacity")(activeOpacity.get.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (!js.isUndefined(captionStyle)) __obj.updateDynamic("captionStyle")(captionStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(containerStyle)) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(contentContainerStyle)) __obj.updateDynamic("contentContainerStyle")(contentContainerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(featured)) __obj.updateDynamic("featured")(featured.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(iconContainerStyle)) __obj.updateDynamic("iconContainerStyle")(iconContainerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(imageContainerStyle)) __obj.updateDynamic("imageContainerStyle")(imageContainerStyle.asInstanceOf[js.Any])
    if (imageProps != null) __obj.updateDynamic("imageProps")(imageProps.asInstanceOf[js.Any])
    if (imageSrc != null) __obj.updateDynamic("imageSrc")(imageSrc.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (!js.isUndefined(overlayContainerStyle)) __obj.updateDynamic("overlayContainerStyle")(overlayContainerStyle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(titleStyle)) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTileProps]
  }
}

