package typings.reactDashNativeDashRatings.reactDashNativeDashRatingsMod

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
}

object AirbnbRatingProps {
  @scala.inline
  def apply(
    count: Int | Double = null,
    defaultRating: Int | Double = null,
    onFinishRating: /* value */ Double => Unit = null,
    reviews: js.Array[String] = null,
    showRating: js.UndefOr[Boolean] = js.undefined
  ): AirbnbRatingProps = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (defaultRating != null) __obj.updateDynamic("defaultRating")(defaultRating.asInstanceOf[js.Any])
    if (onFinishRating != null) __obj.updateDynamic("onFinishRating")(js.Any.fromFunction1(onFinishRating))
    if (reviews != null) __obj.updateDynamic("reviews")(reviews)
    if (!js.isUndefined(showRating)) __obj.updateDynamic("showRating")(showRating)
    __obj.asInstanceOf[AirbnbRatingProps]
  }
}

