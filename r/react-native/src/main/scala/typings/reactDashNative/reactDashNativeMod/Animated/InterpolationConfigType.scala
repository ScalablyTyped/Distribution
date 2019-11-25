package typings.reactDashNative.reactDashNativeMod.Animated

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterpolationConfigType extends js.Object {
  var easing: js.UndefOr[js.Function1[/* input */ Double, Double]] = js.undefined
  var extrapolate: js.UndefOr[ExtrapolateType] = js.undefined
  var extrapolateLeft: js.UndefOr[ExtrapolateType] = js.undefined
  var extrapolateRight: js.UndefOr[ExtrapolateType] = js.undefined
  var inputRange: js.Array[Double]
  var outputRange: js.Array[Double | String]
}

object InterpolationConfigType {
  @scala.inline
  def apply(
    inputRange: js.Array[Double],
    outputRange: js.Array[Double | String],
    easing: /* input */ Double => Double = null,
    extrapolate: ExtrapolateType = null,
    extrapolateLeft: ExtrapolateType = null,
    extrapolateRight: ExtrapolateType = null
  ): InterpolationConfigType = {
    val __obj = js.Dynamic.literal(inputRange = inputRange.asInstanceOf[js.Any], outputRange = outputRange.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction1(easing))
    if (extrapolate != null) __obj.updateDynamic("extrapolate")(extrapolate.asInstanceOf[js.Any])
    if (extrapolateLeft != null) __obj.updateDynamic("extrapolateLeft")(extrapolateLeft.asInstanceOf[js.Any])
    if (extrapolateRight != null) __obj.updateDynamic("extrapolateRight")(extrapolateRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterpolationConfigType]
  }
}

