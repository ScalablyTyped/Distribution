package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TVParallaxProperties extends js.Object {
  /**
    * If true, parallax effects are enabled.  Defaults to true.
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Defaults to 1.0
    */
  var magnification: js.UndefOr[scala.Double] = js.undefined
  /**
    * Defaults to 0.3
    */
  var pressDelay: js.UndefOr[scala.Double] = js.undefined
  /**
    * Defaults to 0.3
    */
  var pressDuration: js.UndefOr[scala.Double] = js.undefined
  /**
    * Defaults to 1.0
    */
  var pressMagnification: js.UndefOr[scala.Double] = js.undefined
  /**
    * Defaults to 2.0.
    */
  var shiftDistanceX: js.UndefOr[scala.Double] = js.undefined
  /**
    * Defaults to 2.0.
    */
  var shiftDistanceY: js.UndefOr[scala.Double] = js.undefined
  /**
    * Defaults to 0.05.
    */
  var tiltAngle: js.UndefOr[scala.Double] = js.undefined
}

object TVParallaxProperties {
  @scala.inline
  def apply(
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    magnification: scala.Int | scala.Double = null,
    pressDelay: scala.Int | scala.Double = null,
    pressDuration: scala.Int | scala.Double = null,
    pressMagnification: scala.Int | scala.Double = null,
    shiftDistanceX: scala.Int | scala.Double = null,
    shiftDistanceY: scala.Int | scala.Double = null,
    tiltAngle: scala.Int | scala.Double = null
  ): TVParallaxProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (magnification != null) __obj.updateDynamic("magnification")(magnification.asInstanceOf[js.Any])
    if (pressDelay != null) __obj.updateDynamic("pressDelay")(pressDelay.asInstanceOf[js.Any])
    if (pressDuration != null) __obj.updateDynamic("pressDuration")(pressDuration.asInstanceOf[js.Any])
    if (pressMagnification != null) __obj.updateDynamic("pressMagnification")(pressMagnification.asInstanceOf[js.Any])
    if (shiftDistanceX != null) __obj.updateDynamic("shiftDistanceX")(shiftDistanceX.asInstanceOf[js.Any])
    if (shiftDistanceY != null) __obj.updateDynamic("shiftDistanceY")(shiftDistanceY.asInstanceOf[js.Any])
    if (tiltAngle != null) __obj.updateDynamic("tiltAngle")(tiltAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TVParallaxProperties]
  }
}

