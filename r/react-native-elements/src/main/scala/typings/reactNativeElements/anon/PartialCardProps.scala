package typings.reactNativeElements.anon

import typings.react.mod.ReactElement
import typings.reactNative.mod.ImageSourcePropType
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-native-elements.react-native-elements.CardProps> */
trait PartialCardProps extends js.Object {
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
  @scala.inline
  def apply(
    containerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    dividerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    featuredSubtitle: String = null,
    featuredSubtitleStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    featuredTitle: String = null,
    featuredTitleStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    image: ImageSourcePropType = null,
    imageProps: PartialImageProps = null,
    imageStyle: ImageStyle = null,
    imageWrapperStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    title: String | ReactElement = null,
    titleStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    wrapperStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined
  ): PartialCardProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(containerStyle)) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(dividerStyle)) __obj.updateDynamic("dividerStyle")(dividerStyle.asInstanceOf[js.Any])
    if (featuredSubtitle != null) __obj.updateDynamic("featuredSubtitle")(featuredSubtitle.asInstanceOf[js.Any])
    if (!js.isUndefined(featuredSubtitleStyle)) __obj.updateDynamic("featuredSubtitleStyle")(featuredSubtitleStyle.asInstanceOf[js.Any])
    if (featuredTitle != null) __obj.updateDynamic("featuredTitle")(featuredTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(featuredTitleStyle)) __obj.updateDynamic("featuredTitleStyle")(featuredTitleStyle.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (imageProps != null) __obj.updateDynamic("imageProps")(imageProps.asInstanceOf[js.Any])
    if (imageStyle != null) __obj.updateDynamic("imageStyle")(imageStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(imageWrapperStyle)) __obj.updateDynamic("imageWrapperStyle")(imageWrapperStyle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(titleStyle)) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapperStyle)) __obj.updateDynamic("wrapperStyle")(wrapperStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialCardProps]
  }
}

