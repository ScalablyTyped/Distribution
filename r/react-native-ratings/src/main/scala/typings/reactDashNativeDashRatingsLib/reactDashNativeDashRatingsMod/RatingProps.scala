package typings
package reactDashNativeDashRatingsLib.reactDashNativeDashRatingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RatingProps extends js.Object {
  /**
    * The number of decimal places for the rating value; must be between 0 and 20
    */
  var fractions: js.UndefOr[scala.Double] = js.undefined
  /**
    * The size of each rating image
    *
    * Default is 50
    */
  var imageSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum value the user can select
    *
    * Default is 0
    */
  var minValue: js.UndefOr[scala.Double] = js.undefined
  /**
    * Callback method when the user finishes rating. Gives you the final rating value as a whole number
    */
  var onFinishRating: js.UndefOr[js.Function1[/* rating */ scala.Double, scala.Unit]] = js.undefined
  /**
    * Callback method when the user starts rating.
    */
  var onStartRating: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Pass in a custom background-fill-color for the rating icon; use this along with type='custom' prop above
    *
    * Default is 'white'
    */
  var ratingBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Pass in a custom fill-color for the rating icon; use this along with type='custom' prop above
    *
    * Default is '#f1c40f'
    */
  var ratingColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Number of rating images to display
    *
    * Default is 5
    */
  var ratingCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * Pass in a custom image source; use this along with type='custom' prop above
    */
  var ratingImage: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ImageURISource] = js.undefined
  /**
    * Color used for the text labels
    */
  var ratingTextColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the rating can be modiefied by the user
    *
    * Default is false
    */
  var readonly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Displays the Built-in Rating UI to show the rating value in real-time
    *
    * Default is false
    */
  var showRating: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The initial rating to render
    *
    * Default is ratingCount/2
    */
  var startingValue: js.UndefOr[scala.Double] = js.undefined
  /**
    * Exposes style prop to add additonal styling to the container view
    */
  var style: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ViewPropTypes.style */ js.UndefOr[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ViewPropTypes.style */ js.Any
  ] = js.undefined
  /**
    * Graphic used for represent a rating
    *
    * Default is 'star'
    */
  var `type`: js.UndefOr[
    reactDashNativeDashRatingsLib.reactDashNativeDashRatingsLibStrings.star | reactDashNativeDashRatingsLib.reactDashNativeDashRatingsLibStrings.rocket | reactDashNativeDashRatingsLib.reactDashNativeDashRatingsLibStrings.bell | reactDashNativeDashRatingsLib.reactDashNativeDashRatingsLibStrings.heart | reactDashNativeDashRatingsLib.reactDashNativeDashRatingsLibStrings.custom
  ] = js.undefined
}

object RatingProps {
  @scala.inline
  def apply(
    fractions: scala.Int | scala.Double = null,
    imageSize: scala.Int | scala.Double = null,
    minValue: scala.Int | scala.Double = null,
    onFinishRating: /* rating */ scala.Double => scala.Unit = null,
    onStartRating: () => scala.Unit = null,
    ratingBackgroundColor: java.lang.String = null,
    ratingColor: java.lang.String = null,
    ratingCount: scala.Int | scala.Double = null,
    ratingImage: reactDashNativeLib.reactDashNativeMod.ImageURISource = null,
    ratingTextColor: java.lang.String = null,
    readonly: js.UndefOr[scala.Boolean] = js.undefined,
    showRating: js.UndefOr[scala.Boolean] = js.undefined,
    startingValue: scala.Int | scala.Double = null,
    style: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ViewPropTypes.style */ js.Any = null,
    `type`: reactDashNativeDashRatingsLib.reactDashNativeDashRatingsLibStrings.star | reactDashNativeDashRatingsLib.reactDashNativeDashRatingsLibStrings.rocket | reactDashNativeDashRatingsLib.reactDashNativeDashRatingsLibStrings.bell | reactDashNativeDashRatingsLib.reactDashNativeDashRatingsLibStrings.heart | reactDashNativeDashRatingsLib.reactDashNativeDashRatingsLibStrings.custom = null
  ): RatingProps = {
    val __obj = js.Dynamic.literal()
    if (fractions != null) __obj.updateDynamic("fractions")(fractions.asInstanceOf[js.Any])
    if (imageSize != null) __obj.updateDynamic("imageSize")(imageSize.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (onFinishRating != null) __obj.updateDynamic("onFinishRating")(js.Any.fromFunction1(onFinishRating))
    if (onStartRating != null) __obj.updateDynamic("onStartRating")(js.Any.fromFunction0(onStartRating))
    if (ratingBackgroundColor != null) __obj.updateDynamic("ratingBackgroundColor")(ratingBackgroundColor)
    if (ratingColor != null) __obj.updateDynamic("ratingColor")(ratingColor)
    if (ratingCount != null) __obj.updateDynamic("ratingCount")(ratingCount.asInstanceOf[js.Any])
    if (ratingImage != null) __obj.updateDynamic("ratingImage")(ratingImage)
    if (ratingTextColor != null) __obj.updateDynamic("ratingTextColor")(ratingTextColor)
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly)
    if (!js.isUndefined(showRating)) __obj.updateDynamic("showRating")(showRating)
    if (startingValue != null) __obj.updateDynamic("startingValue")(startingValue.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RatingProps]
  }
}

