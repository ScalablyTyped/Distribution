package typings.reactNativeNavigation.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppearingElementAnimation extends ElementAnimation {
  var from: Double
}

object AppearingElementAnimation {
  @scala.inline
  def apply(duration: Double, from: Double, interpolation: Interpolation, startDelay: Int | Double = null): AppearingElementAnimation = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], interpolation = interpolation.asInstanceOf[js.Any])
    if (startDelay != null) __obj.updateDynamic("startDelay")(startDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppearingElementAnimation]
  }
}

