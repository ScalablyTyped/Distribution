package typings.reactNativeElements.mod

import typings.react.mod.ReactElement
import typings.reactNative.mod.ImageSourcePropType
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.anon.PartialImageProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardProps extends js.Object {
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
  ): CardProps = {
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
    __obj.asInstanceOf[CardProps]
  }
}

