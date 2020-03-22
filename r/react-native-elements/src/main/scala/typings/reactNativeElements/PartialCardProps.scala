package typings.reactNativeElements

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
    containerStyle: StyleProp[ViewStyle] = null,
    dividerStyle: StyleProp[ViewStyle] = null,
    featuredSubtitle: String = null,
    featuredSubtitleStyle: StyleProp[TextStyle] = null,
    featuredTitle: String = null,
    featuredTitleStyle: StyleProp[TextStyle] = null,
    image: ImageSourcePropType = null,
    imageProps: PartialImageProps = null,
    imageStyle: ImageStyle = null,
    imageWrapperStyle: StyleProp[ViewStyle] = null,
    title: String | ReactElement = null,
    titleStyle: StyleProp[TextStyle] = null,
    wrapperStyle: StyleProp[ViewStyle] = null
  ): PartialCardProps = {
    val __obj = js.Dynamic.literal()
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (dividerStyle != null) __obj.updateDynamic("dividerStyle")(dividerStyle.asInstanceOf[js.Any])
    if (featuredSubtitle != null) __obj.updateDynamic("featuredSubtitle")(featuredSubtitle.asInstanceOf[js.Any])
    if (featuredSubtitleStyle != null) __obj.updateDynamic("featuredSubtitleStyle")(featuredSubtitleStyle.asInstanceOf[js.Any])
    if (featuredTitle != null) __obj.updateDynamic("featuredTitle")(featuredTitle.asInstanceOf[js.Any])
    if (featuredTitleStyle != null) __obj.updateDynamic("featuredTitleStyle")(featuredTitleStyle.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (imageProps != null) __obj.updateDynamic("imageProps")(imageProps.asInstanceOf[js.Any])
    if (imageStyle != null) __obj.updateDynamic("imageStyle")(imageStyle.asInstanceOf[js.Any])
    if (imageWrapperStyle != null) __obj.updateDynamic("imageWrapperStyle")(imageWrapperStyle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (wrapperStyle != null) __obj.updateDynamic("wrapperStyle")(wrapperStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialCardProps]
  }
}

