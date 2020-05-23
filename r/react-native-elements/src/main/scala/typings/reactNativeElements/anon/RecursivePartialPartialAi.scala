package typings.reactNativeElements.anon

import typings.reactNative.mod.ImageStyle
import typings.reactNativeElements.mod.RecursivePartial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-ratings.react-native-ratings.AirbnbRatingProps>> */
trait RecursivePartialPartialAi extends js.Object {
  var count: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  var defaultRating: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  var isDisabled: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var onFinishRating: js.UndefOr[RecursivePartial[js.UndefOr[js.Function1[/* value */ Double, Unit]]]] = js.undefined
  var reviews: js.UndefOr[RecursivePartial[js.UndefOr[js.Array[String]]]] = js.undefined
  var showRating: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var size: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  var starStyle: js.UndefOr[RecursivePartial[js.UndefOr[ImageStyle]]] = js.undefined
}

object RecursivePartialPartialAi {
  @scala.inline
  def apply(
    count: RecursivePartial[js.UndefOr[Double]] = null,
    defaultRating: RecursivePartial[js.UndefOr[Double]] = null,
    isDisabled: RecursivePartial[js.UndefOr[Boolean]] = null,
    onFinishRating: RecursivePartial[js.UndefOr[js.Function1[/* value */ Double, Unit]]] = null,
    reviews: RecursivePartial[js.UndefOr[js.Array[String]]] = null,
    showRating: RecursivePartial[js.UndefOr[Boolean]] = null,
    size: RecursivePartial[js.UndefOr[Double]] = null,
    starStyle: RecursivePartial[js.UndefOr[ImageStyle]] = null
  ): RecursivePartialPartialAi = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (defaultRating != null) __obj.updateDynamic("defaultRating")(defaultRating.asInstanceOf[js.Any])
    if (isDisabled != null) __obj.updateDynamic("isDisabled")(isDisabled.asInstanceOf[js.Any])
    if (onFinishRating != null) __obj.updateDynamic("onFinishRating")(onFinishRating.asInstanceOf[js.Any])
    if (reviews != null) __obj.updateDynamic("reviews")(reviews.asInstanceOf[js.Any])
    if (showRating != null) __obj.updateDynamic("showRating")(showRating.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (starStyle != null) __obj.updateDynamic("starStyle")(starStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecursivePartialPartialAi]
  }
}

