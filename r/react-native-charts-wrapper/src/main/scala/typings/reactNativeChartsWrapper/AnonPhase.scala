package typings.reactNativeChartsWrapper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPhase extends js.Object {
  var lineLength: Double
  var phase: js.UndefOr[Double] = js.undefined
  var spaceLength: Double
}

object AnonPhase {
  @scala.inline
  def apply(lineLength: Double, spaceLength: Double, phase: Int | Double = null): AnonPhase = {
    val __obj = js.Dynamic.literal(lineLength = lineLength.asInstanceOf[js.Any], spaceLength = spaceLength.asInstanceOf[js.Any])
    if (phase != null) __obj.updateDynamic("phase")(phase.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPhase]
  }
}

