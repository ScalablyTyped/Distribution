package typings.reactNativeNavigation.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppearingElementAnimation extends ElementAnimation {
  var from: Double
}

object AppearingElementAnimation {
  @scala.inline
  def apply(
    duration: Double,
    from: Double,
    interpolation: Interpolation,
    startDelay: js.UndefOr[Double] = js.undefined
  ): AppearingElementAnimation = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], interpolation = interpolation.asInstanceOf[js.Any])
    if (!js.isUndefined(startDelay)) __obj.updateDynamic("startDelay")(startDelay.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppearingElementAnimation]
  }
}

