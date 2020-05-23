package typings.reactNativeRatings.mod

import typings.reactNative.mod.ImageStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AirbnbRatingProps extends js.Object {
  /**
    * Total number of ratings to display
    *
    * Default is 5
    */
  var count: js.UndefOr[Double] = js.undefined
  /**
    * Initial value for the rating
    *
    * Default is 3
    */
  var defaultRating: js.UndefOr[Double] = js.undefined
  /**
    * Whether the rating can be modiefied by the user
    *
    * Default is false
    */
  var isDisabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Callback method when the user finishes rating. Gives you the final rating value as a whole number
    */
  var onFinishRating: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  /**
    * Labels to show when each value is tapped
    *
    * e.g. If the first star is tapped, then value in index 0 will be used as the label
    *
    * Default is ['Terrible', 'Bad', 'Okay', 'Good', 'Great']
    */
  var reviews: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Determines if to show the reviews above the rating
    *
    * Default is true
    */
  var showRating: js.UndefOr[Boolean] = js.undefined
  /**
    * Size of rating image
    *
    * Default is 40
    */
  var size: js.UndefOr[Double] = js.undefined
  /**
    * Style for star image component
    *
    * Default is true
    */
  var starStyle: js.UndefOr[ImageStyle] = js.undefined
}

object AirbnbRatingProps {
  @scala.inline
  def apply(
    count: js.UndefOr[Double] = js.undefined,
    defaultRating: js.UndefOr[Double] = js.undefined,
    isDisabled: js.UndefOr[Boolean] = js.undefined,
    onFinishRating: /* value */ Double => Unit = null,
    reviews: js.Array[String] = null,
    showRating: js.UndefOr[Boolean] = js.undefined,
    size: js.UndefOr[Double] = js.undefined,
    starStyle: ImageStyle = null
  ): AirbnbRatingProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultRating)) __obj.updateDynamic("defaultRating")(defaultRating.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled.get.asInstanceOf[js.Any])
    if (onFinishRating != null) __obj.updateDynamic("onFinishRating")(js.Any.fromFunction1(onFinishRating))
    if (reviews != null) __obj.updateDynamic("reviews")(reviews.asInstanceOf[js.Any])
    if (!js.isUndefined(showRating)) __obj.updateDynamic("showRating")(showRating.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (starStyle != null) __obj.updateDynamic("starStyle")(starStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AirbnbRatingProps]
  }
}

