package typings.reactNativeElements

import typings.reactNative.mod.ImageStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-native-ratings.react-native-ratings.AirbnbRatingProps> */
trait PartialAirbnbRatingProps extends js.Object {
  var count: js.UndefOr[Double] = js.undefined
  var defaultRating: js.UndefOr[Double] = js.undefined
  var isDisabled: js.UndefOr[Boolean] = js.undefined
  var onFinishRating: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  var reviews: js.UndefOr[js.Array[String]] = js.undefined
  var showRating: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var starStyle: js.UndefOr[ImageStyle] = js.undefined
}

object PartialAirbnbRatingProps {
  @scala.inline
  def apply(
    count: Int | Double = null,
    defaultRating: Int | Double = null,
    isDisabled: js.UndefOr[Boolean] = js.undefined,
    onFinishRating: /* value */ Double => Unit = null,
    reviews: js.Array[String] = null,
    showRating: js.UndefOr[Boolean] = js.undefined,
    size: Int | Double = null,
    starStyle: ImageStyle = null
  ): PartialAirbnbRatingProps = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (defaultRating != null) __obj.updateDynamic("defaultRating")(defaultRating.asInstanceOf[js.Any])
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled.asInstanceOf[js.Any])
    if (onFinishRating != null) __obj.updateDynamic("onFinishRating")(js.Any.fromFunction1(onFinishRating))
    if (reviews != null) __obj.updateDynamic("reviews")(reviews.asInstanceOf[js.Any])
    if (!js.isUndefined(showRating)) __obj.updateDynamic("showRating")(showRating.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (starStyle != null) __obj.updateDynamic("starStyle")(starStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialAirbnbRatingProps]
  }
}

