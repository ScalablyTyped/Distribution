package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchableWithoutFeedbackPropsIOS extends js.Object {
  /**
    * *(Apple TV only)* TV preferred focus (see documentation for the View component).
    *
    * @platform ios
    */
  var hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined
  /**
    * *(Apple TV only)* Object with properties to control Apple TV parallax effects.
    *
    * enabled: If true, parallax effects are enabled.  Defaults to true.
    * shiftDistanceX: Defaults to 2.0.
    * shiftDistanceY: Defaults to 2.0.
    * tiltAngle: Defaults to 0.05.
    * magnification: Defaults to 1.0.
    * pressMagnification: Defaults to 1.0.
    * pressDuration: Defaults to 0.3.
    * pressDelay: Defaults to 0.0.
    *
    * @platform ios
    */
  var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.undefined
}

object TouchableWithoutFeedbackPropsIOS {
  @scala.inline
  def apply(
    hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined,
    tvParallaxProperties: TVParallaxProperties = null
  ): TouchableWithoutFeedbackPropsIOS = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasTVPreferredFocus)) __obj.updateDynamic("hasTVPreferredFocus")(hasTVPreferredFocus.asInstanceOf[js.Any])
    if (tvParallaxProperties != null) __obj.updateDynamic("tvParallaxProperties")(tvParallaxProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchableWithoutFeedbackPropsIOS]
  }
}

