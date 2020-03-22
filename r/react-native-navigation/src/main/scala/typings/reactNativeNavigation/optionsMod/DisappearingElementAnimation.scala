package typings.reactNativeNavigation.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisappearingElementAnimation extends ElementAnimation {
  var to: Double
}

object DisappearingElementAnimation {
  @scala.inline
  def apply(duration: Double, interpolation: Interpolation, to: Double, startDelay: Int | Double = null): DisappearingElementAnimation = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], interpolation = interpolation.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    if (startDelay != null) __obj.updateDynamic("startDelay")(startDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisappearingElementAnimation]
  }
}

