package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TVParallaxProperties extends js.Object {
  /**
    * If true, parallax effects are enabled.  Defaults to true.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Defaults to 1.0
    */
  var magnification: js.UndefOr[Double] = js.undefined
  /**
    * Defaults to 0.3
    */
  var pressDelay: js.UndefOr[Double] = js.undefined
  /**
    * Defaults to 0.3
    */
  var pressDuration: js.UndefOr[Double] = js.undefined
  /**
    * Defaults to 1.0
    */
  var pressMagnification: js.UndefOr[Double] = js.undefined
  /**
    * Defaults to 2.0.
    */
  var shiftDistanceX: js.UndefOr[Double] = js.undefined
  /**
    * Defaults to 2.0.
    */
  var shiftDistanceY: js.UndefOr[Double] = js.undefined
  /**
    * Defaults to 0.05.
    */
  var tiltAngle: js.UndefOr[Double] = js.undefined
}

object TVParallaxProperties {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    magnification: Int | Double = null,
    pressDelay: Int | Double = null,
    pressDuration: Int | Double = null,
    pressMagnification: Int | Double = null,
    shiftDistanceX: Int | Double = null,
    shiftDistanceY: Int | Double = null,
    tiltAngle: Int | Double = null
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

