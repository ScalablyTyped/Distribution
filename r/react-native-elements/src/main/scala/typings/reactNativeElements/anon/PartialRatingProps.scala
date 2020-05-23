package typings.reactNativeElements.anon

import typings.propTypes.mod.Validator
import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.reactNativeElementsStrings.bell
import typings.reactNativeElements.reactNativeElementsStrings.custom
import typings.reactNativeElements.reactNativeElementsStrings.heart
import typings.reactNativeElements.reactNativeElementsStrings.rocket
import typings.reactNativeElements.reactNativeElementsStrings.star
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-native-ratings.react-native-ratings.RatingProps> */
trait PartialRatingProps extends js.Object {
  var fractions: js.UndefOr[Double] = js.undefined
  var imageSize: js.UndefOr[Double] = js.undefined
  var minValue: js.UndefOr[Double] = js.undefined
  var onFinishRating: js.UndefOr[js.Function1[/* rating */ Double, Unit]] = js.undefined
  var onStartRating: js.UndefOr[js.Function0[Unit]] = js.undefined
  var ratingBackgroundColor: js.UndefOr[String] = js.undefined
  var ratingColor: js.UndefOr[String] = js.undefined
  var ratingCount: js.UndefOr[Double] = js.undefined
  var ratingImage: js.UndefOr[ImageURISource] = js.undefined
  var ratingTextColor: js.UndefOr[String] = js.undefined
  var readonly: js.UndefOr[Boolean] = js.undefined
  var showRating: js.UndefOr[Boolean] = js.undefined
  var startingValue: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[Validator[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  var tintColor: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[star | rocket | bell | heart | custom] = js.undefined
}

object PartialRatingProps {
  @scala.inline
  def apply(
    fractions: js.UndefOr[Double] = js.undefined,
    imageSize: js.UndefOr[Double] = js.undefined,
    minValue: js.UndefOr[Double] = js.undefined,
    onFinishRating: /* rating */ Double => Unit = null,
    onStartRating: () => Unit = null,
    ratingBackgroundColor: String = null,
    ratingColor: String = null,
    ratingCount: js.UndefOr[Double] = js.undefined,
    ratingImage: ImageURISource = null,
    ratingTextColor: String = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    showRating: js.UndefOr[Boolean] = js.undefined,
    startingValue: js.UndefOr[Double] = js.undefined,
    style: Validator[js.UndefOr[StyleProp[ViewStyle]]] = null,
    tintColor: String = null,
    `type`: star | rocket | bell | heart | custom = null
  ): PartialRatingProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fractions)) __obj.updateDynamic("fractions")(fractions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(imageSize)) __obj.updateDynamic("imageSize")(imageSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minValue)) __obj.updateDynamic("minValue")(minValue.get.asInstanceOf[js.Any])
    if (onFinishRating != null) __obj.updateDynamic("onFinishRating")(js.Any.fromFunction1(onFinishRating))
    if (onStartRating != null) __obj.updateDynamic("onStartRating")(js.Any.fromFunction0(onStartRating))
    if (ratingBackgroundColor != null) __obj.updateDynamic("ratingBackgroundColor")(ratingBackgroundColor.asInstanceOf[js.Any])
    if (ratingColor != null) __obj.updateDynamic("ratingColor")(ratingColor.asInstanceOf[js.Any])
    if (!js.isUndefined(ratingCount)) __obj.updateDynamic("ratingCount")(ratingCount.get.asInstanceOf[js.Any])
    if (ratingImage != null) __obj.updateDynamic("ratingImage")(ratingImage.asInstanceOf[js.Any])
    if (ratingTextColor != null) __obj.updateDynamic("ratingTextColor")(ratingTextColor.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showRating)) __obj.updateDynamic("showRating")(showRating.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startingValue)) __obj.updateDynamic("startingValue")(startingValue.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialRatingProps]
  }
}

