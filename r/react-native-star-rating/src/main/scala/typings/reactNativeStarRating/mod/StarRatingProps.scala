package typings.reactNativeStarRating.mod

import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeStarRating.reactNativeStarRatingStrings.bounce
import typings.reactNativeStarRating.reactNativeStarRatingStrings.flash
import typings.reactNativeStarRating.reactNativeStarRatingStrings.jello
import typings.reactNativeStarRating.reactNativeStarRatingStrings.pulse
import typings.reactNativeStarRating.reactNativeStarRatingStrings.rotate
import typings.reactNativeStarRating.reactNativeStarRatingStrings.rubberBand
import typings.reactNativeStarRating.reactNativeStarRatingStrings.shake
import typings.reactNativeStarRating.reactNativeStarRatingStrings.swing
import typings.reactNativeStarRating.reactNativeStarRatingStrings.tada
import typings.reactNativeStarRating.reactNativeStarRatingStrings.wobble
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StarRatingProps extends js.Object {
  /**
    * Number between 0 to 1 to determine the opacity of the button.
    * Default is 0.2
    */
  var activeOpacity: js.UndefOr[Double] = js.undefined
  /**
    * Add an animation to the stars upon selection.
    */
  var animation: js.UndefOr[
    bounce | flash | jello | pulse | rotate | rubberBand | shake | swing | tada | wobble
  ] = js.undefined
  /**
    * Style of the button containing the star.
    */
  var buttonStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Style of the element containing the star rating component.
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Sets the interactivity of the star buttons.
    *
    * Default is false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the icon to represent an empty star.
    * Refer to react-native-vector-icons.
    * Also can be a image object, both {uri:xxx.xxx} and require('xx/xx/xx.xxx').
    *
    * Default is "star-o"
    */
  var emptyStar: js.UndefOr[String | ImageURISource] = js.undefined
  /**
    * Color of an empty star.
    *
    * Default is gray
    */
  var emptyStarColor: js.UndefOr[String] = js.undefined
  /**
    * The name of the icon to represent a full star.
    * Refer to react-native-vector-icons.
    * Also can be a image object, both {uri:xxx.xxx} and require('xx/xx/xx.xxx')
    *
    * Default is "star"
    */
  var fullStar: js.UndefOr[String | ImageURISource] = js.undefined
  /**
    * Color of a filled star.
    *
    * Default is black
    */
  var fullStarColor: js.UndefOr[String] = js.undefined
  /**
    * The name of the icon to represent an half star.
    * Refer to react-native-vector-icons.
    * Also can be a image object, both {uri:xxx.xxx} and require('xx/xx/xx.xxx').
    *
    * Default is "star-half-o"
    */
  var halfStar: js.UndefOr[String | ImageURISource] = js.undefined
  /**
    * Color of a half-filled star.
    *
    * Defaults to fullStarColor.
    */
  var halfStarColor: js.UndefOr[String] = js.undefined
  /**
    * Sets ability to select half stars
    *
    * Default is false
    */
  var halfStarEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the icon set the star image belongs to.
    * Refer to react-native-vector-icons.
    *
    * Default is "FontAwesome"
    */
  var iconSet: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of stars possible.
    *
    * Default is 5
    */
  var maxStars: js.UndefOr[Double] = js.undefined
  /**
    * The current rating to show.
    *
    * Default is 0
    */
  var rating: js.UndefOr[Double] = js.undefined
  /**
    * Renders stars from right to left
    *
    * Default is false
    */
  var reversed: js.UndefOr[Boolean] = js.undefined
  /**
    * A function to handle star button presses.
    */
  var selectedStar: js.UndefOr[js.Function1[/* rating */ Double, Unit]] = js.undefined
  /**
    * Size of the star.
    *
    * Default is 40
    */
  var starSize: js.UndefOr[Double] = js.undefined
  /**
    * Style to apply to the star.
    */
  var starStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object StarRatingProps {
  @scala.inline
  def apply(
    activeOpacity: Int | Double = null,
    animation: bounce | flash | jello | pulse | rotate | rubberBand | shake | swing | tada | wobble = null,
    buttonStyle: StyleProp[ViewStyle] = null,
    containerStyle: StyleProp[ViewStyle] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    emptyStar: String | ImageURISource = null,
    emptyStarColor: String = null,
    fullStar: String | ImageURISource = null,
    fullStarColor: String = null,
    halfStar: String | ImageURISource = null,
    halfStarColor: String = null,
    halfStarEnabled: js.UndefOr[Boolean] = js.undefined,
    iconSet: String = null,
    maxStars: Int | Double = null,
    rating: Int | Double = null,
    reversed: js.UndefOr[Boolean] = js.undefined,
    selectedStar: /* rating */ Double => Unit = null,
    starSize: Int | Double = null,
    starStyle: StyleProp[ViewStyle] = null
  ): StarRatingProps = {
    val __obj = js.Dynamic.literal()
    if (activeOpacity != null) __obj.updateDynamic("activeOpacity")(activeOpacity.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (buttonStyle != null) __obj.updateDynamic("buttonStyle")(buttonStyle.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (emptyStar != null) __obj.updateDynamic("emptyStar")(emptyStar.asInstanceOf[js.Any])
    if (emptyStarColor != null) __obj.updateDynamic("emptyStarColor")(emptyStarColor.asInstanceOf[js.Any])
    if (fullStar != null) __obj.updateDynamic("fullStar")(fullStar.asInstanceOf[js.Any])
    if (fullStarColor != null) __obj.updateDynamic("fullStarColor")(fullStarColor.asInstanceOf[js.Any])
    if (halfStar != null) __obj.updateDynamic("halfStar")(halfStar.asInstanceOf[js.Any])
    if (halfStarColor != null) __obj.updateDynamic("halfStarColor")(halfStarColor.asInstanceOf[js.Any])
    if (!js.isUndefined(halfStarEnabled)) __obj.updateDynamic("halfStarEnabled")(halfStarEnabled.asInstanceOf[js.Any])
    if (iconSet != null) __obj.updateDynamic("iconSet")(iconSet.asInstanceOf[js.Any])
    if (maxStars != null) __obj.updateDynamic("maxStars")(maxStars.asInstanceOf[js.Any])
    if (rating != null) __obj.updateDynamic("rating")(rating.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.asInstanceOf[js.Any])
    if (selectedStar != null) __obj.updateDynamic("selectedStar")(js.Any.fromFunction1(selectedStar))
    if (starSize != null) __obj.updateDynamic("starSize")(starSize.asInstanceOf[js.Any])
    if (starStyle != null) __obj.updateDynamic("starStyle")(starStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[StarRatingProps]
  }
}

