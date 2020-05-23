package typings.reactNativeElements.anon

import typings.react.mod.ReactElement
import typings.reactNative.mod.ImageSourcePropType
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.mod.RecursivePartial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-elements.react-native-elements.CardProps>> */
trait RecursivePartialPartialCa extends js.Object {
  var containerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  var dividerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  var featuredSubtitle: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var featuredSubtitleStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.undefined
  var featuredTitle: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var featuredTitleStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.undefined
  var image: js.UndefOr[RecursivePartial[js.UndefOr[ImageSourcePropType]]] = js.undefined
  var imageProps: js.UndefOr[RecursivePartial[js.UndefOr[PartialImageProps]]] = js.undefined
  var imageStyle: js.UndefOr[RecursivePartial[js.UndefOr[ImageStyle]]] = js.undefined
  var imageWrapperStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  var title: js.UndefOr[RecursivePartial[js.UndefOr[String | ReactElement]]] = js.undefined
  var titleStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.undefined
  var wrapperStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
}

object RecursivePartialPartialCa {
  @scala.inline
  def apply(
    containerStyle: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null,
    dividerStyle: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null,
    featuredSubtitle: RecursivePartial[js.UndefOr[String]] = null,
    featuredSubtitleStyle: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]] = null,
    featuredTitle: RecursivePartial[js.UndefOr[String]] = null,
    featuredTitleStyle: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]] = null,
    image: RecursivePartial[js.UndefOr[ImageSourcePropType]] = null,
    imageProps: RecursivePartial[js.UndefOr[PartialImageProps]] = null,
    imageStyle: RecursivePartial[js.UndefOr[ImageStyle]] = null,
    imageWrapperStyle: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null,
    title: RecursivePartial[js.UndefOr[String | ReactElement]] = null,
    titleStyle: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]] = null,
    wrapperStyle: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null
  ): RecursivePartialPartialCa = {
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
    __obj.asInstanceOf[RecursivePartialPartialCa]
  }
}

