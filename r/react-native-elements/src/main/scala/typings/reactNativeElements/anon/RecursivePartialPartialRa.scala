package typings.reactNativeElements.anon

import typings.propTypes.mod.Validator
import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.mod.RecursivePartial
import typings.reactNativeElements.reactNativeElementsStrings.bell
import typings.reactNativeElements.reactNativeElementsStrings.custom
import typings.reactNativeElements.reactNativeElementsStrings.heart
import typings.reactNativeElements.reactNativeElementsStrings.rocket
import typings.reactNativeElements.reactNativeElementsStrings.star
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-ratings.react-native-ratings.RatingProps>> */
trait RecursivePartialPartialRa extends js.Object {
  var fractions: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  var imageSize: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  var minValue: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  var onFinishRating: js.UndefOr[RecursivePartial[js.UndefOr[js.Function1[/* rating */ Double, Unit]]]] = js.undefined
  var onStartRating: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  var ratingBackgroundColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var ratingColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var ratingCount: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  var ratingImage: js.UndefOr[RecursivePartial[js.UndefOr[ImageURISource]]] = js.undefined
  var ratingTextColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var readonly: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var showRating: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var startingValue: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  var style: js.UndefOr[RecursivePartial[js.UndefOr[Validator[js.UndefOr[StyleProp[ViewStyle]]]]]] = js.undefined
  var tintColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var `type`: js.UndefOr[RecursivePartial[js.UndefOr[star | rocket | bell | heart | custom]]] = js.undefined
}

object RecursivePartialPartialRa {
  @scala.inline
  def apply(
    fractions: RecursivePartial[js.UndefOr[Double]] = null,
    imageSize: RecursivePartial[js.UndefOr[Double]] = null,
    minValue: RecursivePartial[js.UndefOr[Double]] = null,
    onFinishRating: RecursivePartial[js.UndefOr[js.Function1[/* rating */ Double, Unit]]] = null,
    onStartRating: RecursivePartial[js.UndefOr[js.Function0[Unit]]] = null,
    ratingBackgroundColor: RecursivePartial[js.UndefOr[String]] = null,
    ratingColor: RecursivePartial[js.UndefOr[String]] = null,
    ratingCount: RecursivePartial[js.UndefOr[Double]] = null,
    ratingImage: RecursivePartial[js.UndefOr[ImageURISource]] = null,
    ratingTextColor: RecursivePartial[js.UndefOr[String]] = null,
    readonly: RecursivePartial[js.UndefOr[Boolean]] = null,
    showRating: RecursivePartial[js.UndefOr[Boolean]] = null,
    startingValue: RecursivePartial[js.UndefOr[Double]] = null,
    style: RecursivePartial[js.UndefOr[Validator[js.UndefOr[StyleProp[ViewStyle]]]]] = null,
    tintColor: RecursivePartial[js.UndefOr[String]] = null,
    `type`: RecursivePartial[js.UndefOr[star | rocket | bell | heart | custom]] = null
  ): RecursivePartialPartialRa = {
    val __obj = js.Dynamic.literal()
    if (fractions != null) __obj.updateDynamic("fractions")(fractions.asInstanceOf[js.Any])
    if (imageSize != null) __obj.updateDynamic("imageSize")(imageSize.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (onFinishRating != null) __obj.updateDynamic("onFinishRating")(onFinishRating.asInstanceOf[js.Any])
    if (onStartRating != null) __obj.updateDynamic("onStartRating")(onStartRating.asInstanceOf[js.Any])
    if (ratingBackgroundColor != null) __obj.updateDynamic("ratingBackgroundColor")(ratingBackgroundColor.asInstanceOf[js.Any])
    if (ratingColor != null) __obj.updateDynamic("ratingColor")(ratingColor.asInstanceOf[js.Any])
    if (ratingCount != null) __obj.updateDynamic("ratingCount")(ratingCount.asInstanceOf[js.Any])
    if (ratingImage != null) __obj.updateDynamic("ratingImage")(ratingImage.asInstanceOf[js.Any])
    if (ratingTextColor != null) __obj.updateDynamic("ratingTextColor")(ratingTextColor.asInstanceOf[js.Any])
    if (readonly != null) __obj.updateDynamic("readonly")(readonly.asInstanceOf[js.Any])
    if (showRating != null) __obj.updateDynamic("showRating")(showRating.asInstanceOf[js.Any])
    if (startingValue != null) __obj.updateDynamic("startingValue")(startingValue.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecursivePartialPartialRa]
  }
}

