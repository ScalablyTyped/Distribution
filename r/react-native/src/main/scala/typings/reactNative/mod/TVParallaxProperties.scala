package typings.reactNative.mod

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
    magnification: js.UndefOr[Double] = js.undefined,
    pressDelay: js.UndefOr[Double] = js.undefined,
    pressDuration: js.UndefOr[Double] = js.undefined,
    pressMagnification: js.UndefOr[Double] = js.undefined,
    shiftDistanceX: js.UndefOr[Double] = js.undefined,
    shiftDistanceY: js.UndefOr[Double] = js.undefined,
    tiltAngle: js.UndefOr[Double] = js.undefined
  ): TVParallaxProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(magnification)) __obj.updateDynamic("magnification")(magnification.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pressDelay)) __obj.updateDynamic("pressDelay")(pressDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pressDuration)) __obj.updateDynamic("pressDuration")(pressDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pressMagnification)) __obj.updateDynamic("pressMagnification")(pressMagnification.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shiftDistanceX)) __obj.updateDynamic("shiftDistanceX")(shiftDistanceX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shiftDistanceY)) __obj.updateDynamic("shiftDistanceY")(shiftDistanceY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tiltAngle)) __obj.updateDynamic("tiltAngle")(tiltAngle.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TVParallaxProperties]
  }
}

