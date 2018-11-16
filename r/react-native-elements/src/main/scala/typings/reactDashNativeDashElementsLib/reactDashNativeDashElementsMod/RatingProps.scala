package typings
package reactDashNativeDashElementsLib.reactDashNativeDashElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RatingProps extends js.Object {
  /**
       * The number of decimal places for the rating value; must be between 0 and 20
       *
       * @default undefined
       */
  var fractions: js.UndefOr[scala.Double] = js.undefined
  /**
       * The size of each rating image
       *
       * @default 50
       */
  var imageSize: js.UndefOr[scala.Double] = js.undefined
  /**
       * Pass in a custom background-fill-color for the rating icon; use this along with type='custom' prop above
       *
       * @default 'white'
       */
  var ratingBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Pass in a custom fill-color for the rating icon; use this along with type='custom' prop above
       *
       * @default '#f1c40f'
       */
  var ratingColor: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Number of rating images to display
       *
       * @default 5
       */
  var ratingCount: js.UndefOr[scala.Double] = js.undefined
  /**
       * Pass in a custom image source; use this along with type='custom' prop above
       */
  var ratingImage: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.ImageURISource | java.lang.String | scala.Double
  ] = js.undefined
  /**
       * Whether the rating can be modiefied by the user
       *
       * @default false
       */
  var readonly: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Displays the Built-in Rating UI to show the rating value in real-time
       */
  var showRating: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The initial rating to render
       *
       * @default ratingCount/2
       */
  var startingValue: js.UndefOr[scala.Double] = js.undefined
  /**
       * Exposes style prop to add additonal styling to the container view
       */
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
       * Choose one of the built-in types: star, rocket, bell, heart or use type custom to render a custom image
       */
  var `type`: js.UndefOr[
    reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.star | reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.rocket | reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.bell | reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.heart | reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.custom
  ] = js.undefined
  /**
       * Callback method when the user finishes rating. Gives you the final rating value as a whole number
       */
  def onFinishRating(rating: scala.Double): scala.Unit
}

