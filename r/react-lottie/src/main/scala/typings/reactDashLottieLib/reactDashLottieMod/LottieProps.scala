package typings
package reactDashLottieLib.reactDashLottieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LottieProps extends js.Object {
  var ariaLabel: js.UndefOr[java.lang.String | reactDashLottieLib.reactDashLottieLibStrings.animation] = js.undefined
  var ariaRole: js.UndefOr[java.lang.String | reactDashLottieLib.reactDashLottieLibStrings.button] = js.undefined
  var direction: js.UndefOr[scala.Double] = js.undefined
  /**
       * Array of objects containing eventName and a callback function that will be registered as eventListeners on the animation object.
       * Refer to Lottie documentation for a list of available events.
       */
  var eventListeners: js.UndefOr[js.Array[EventListener]] = js.undefined
  /**
       * Height size in pixels
       * @default '100%'
       */
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var isClickToPauseDisabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Describes if the animation must be in paused mode
       */
  var isPaused: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Describes if the animation must be in stopped mode
       */
  var isStopped: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Object representing animation settings
       */
  var options: Options
  var segments: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var speed: js.UndefOr[scala.Double] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Width size in pixels
       * @default '100%'
       */
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

