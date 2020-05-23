package typings.reactNativeChartsWrapper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Phase extends js.Object {
  var lineLength: Double
  var phase: js.UndefOr[Double] = js.undefined
  var spaceLength: Double
}

object Phase {
  @scala.inline
  def apply(lineLength: Double, spaceLength: Double, phase: js.UndefOr[Double] = js.undefined): Phase = {
    val __obj = js.Dynamic.literal(lineLength = lineLength.asInstanceOf[js.Any], spaceLength = spaceLength.asInstanceOf[js.Any])
    if (!js.isUndefined(phase)) __obj.updateDynamic("phase")(phase.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Phase]
  }
}

