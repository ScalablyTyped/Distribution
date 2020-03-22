package typings.reactNativeNavigation.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementAnimation extends js.Object {
  var duration: Double
  var interpolation: Interpolation
  var startDelay: js.UndefOr[Double] = js.undefined
}

object ElementAnimation {
  @scala.inline
  def apply(duration: Double, interpolation: Interpolation, startDelay: Int | Double = null): ElementAnimation = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], interpolation = interpolation.asInstanceOf[js.Any])
    if (startDelay != null) __obj.updateDynamic("startDelay")(startDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementAnimation]
  }
}

