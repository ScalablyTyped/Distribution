package typings
package reactDashNativeDashStarDashRatingLib.reactDashNativeDashStarDashRatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StarRatingProps extends js.Object {
  /**
    * Style of the button containing the star.
    */
  var buttonStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * Style of the element containing the star rating component.
    */
  var containerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * Sets the interactivity of the star buttons.
    *
    * Default is false
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The name of the icon to represent an empty star.
    * Refer to react-native-vector-icons.
    * Also can be a image object, both {uri:xxx.xxx} and require('xx/xx/xx.xxx').
    *
    * Default is "star-o"
    */
  var emptyStar: js.UndefOr[java.lang.String | reactDashNativeLib.reactDashNativeMod.ImageURISource] = js.undefined
  /**
    * Color of an empty star.
    *
    * Default is gray
    */
  var emptyStarColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the icon to represent a full star.
    * Refer to react-native-vector-icons.
    * Also can be a image object, both {uri:xxx.xxx} and require('xx/xx/xx.xxx')
    *
    * Default is "star"
    */
  var fullStar: js.UndefOr[java.lang.String | reactDashNativeLib.reactDashNativeMod.ImageURISource] = js.undefined
  /**
    * Color of a filled star.
    *
    * Default is black
    */
  var fullStarColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the icon to represent an half star.
    * Refer to react-native-vector-icons.
    * Also can be a image object, both {uri:xxx.xxx} and require('xx/xx/xx.xxx').
    *
    * Default is "star-half-o"
    */
  var halfStar: js.UndefOr[java.lang.String | reactDashNativeLib.reactDashNativeMod.ImageURISource] = js.undefined
  /**
    * Color of a half-filled star.
    *
    * Defaults to fullStarColor.
    */
  var halfStarColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets ability to select half stars
    *
    * Default is false
    */
  var halfStarEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The name of the icon set the star image belongs to.
    * Refer to react-native-vector-icons.
    *
    * Default is "FontAwesome"
    */
  var iconSet: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The maximum number of stars possible.
    *
    * Default is 5
    */
  var maxStars: js.UndefOr[scala.Double] = js.undefined
  /**
    * The current rating to show.
    *
    * Default is 0
    */
  var rating: js.UndefOr[scala.Double] = js.undefined
  /**
    * Renders stars from right to left
    *
    * Default is false
    */
  var reversed: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A function to handle star button presses.
    */
  var selectedStar: js.UndefOr[js.Function1[/* rating */ scala.Double, scala.Unit]] = js.undefined
  /**
    * Size of the star.
    *
    * Default is 40
    */
  var starSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Style to apply to the star.
    */
  var starStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
}

object StarRatingProps {
  @scala.inline
  def apply(
    buttonStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    containerStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    emptyStar: java.lang.String | reactDashNativeLib.reactDashNativeMod.ImageURISource = null,
    emptyStarColor: java.lang.String = null,
    fullStar: java.lang.String | reactDashNativeLib.reactDashNativeMod.ImageURISource = null,
    fullStarColor: java.lang.String = null,
    halfStar: java.lang.String | reactDashNativeLib.reactDashNativeMod.ImageURISource = null,
    halfStarColor: java.lang.String = null,
    halfStarEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    iconSet: java.lang.String = null,
    maxStars: scala.Int | scala.Double = null,
    rating: scala.Int | scala.Double = null,
    reversed: js.UndefOr[scala.Boolean] = js.undefined,
    selectedStar: /* rating */ scala.Double => scala.Unit = null,
    starSize: scala.Int | scala.Double = null,
    starStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null
  ): StarRatingProps = {
    val __obj = js.Dynamic.literal()
    if (buttonStyle != null) __obj.updateDynamic("buttonStyle")(buttonStyle.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (emptyStar != null) __obj.updateDynamic("emptyStar")(emptyStar.asInstanceOf[js.Any])
    if (emptyStarColor != null) __obj.updateDynamic("emptyStarColor")(emptyStarColor)
    if (fullStar != null) __obj.updateDynamic("fullStar")(fullStar.asInstanceOf[js.Any])
    if (fullStarColor != null) __obj.updateDynamic("fullStarColor")(fullStarColor)
    if (halfStar != null) __obj.updateDynamic("halfStar")(halfStar.asInstanceOf[js.Any])
    if (halfStarColor != null) __obj.updateDynamic("halfStarColor")(halfStarColor)
    if (!js.isUndefined(halfStarEnabled)) __obj.updateDynamic("halfStarEnabled")(halfStarEnabled)
    if (iconSet != null) __obj.updateDynamic("iconSet")(iconSet)
    if (maxStars != null) __obj.updateDynamic("maxStars")(maxStars.asInstanceOf[js.Any])
    if (rating != null) __obj.updateDynamic("rating")(rating.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed)
    if (selectedStar != null) __obj.updateDynamic("selectedStar")(js.Any.fromFunction1(selectedStar))
    if (starSize != null) __obj.updateDynamic("starSize")(starSize.asInstanceOf[js.Any])
    if (starStyle != null) __obj.updateDynamic("starStyle")(starStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[StarRatingProps]
  }
}

