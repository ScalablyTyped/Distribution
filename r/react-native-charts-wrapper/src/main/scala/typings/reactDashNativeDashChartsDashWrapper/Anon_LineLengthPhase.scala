package typings.reactDashNativeDashChartsDashWrapper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LineLengthPhase extends js.Object {
  var lineLength: Double
  var phase: js.UndefOr[Double] = js.undefined
  var spaceLength: Double
}

object Anon_LineLengthPhase {
  @scala.inline
  def apply(lineLength: Double, spaceLength: Double, phase: Int | Double = null): Anon_LineLengthPhase = {
    val __obj = js.Dynamic.literal(lineLength = lineLength.asInstanceOf[js.Any], spaceLength = spaceLength.asInstanceOf[js.Any])
    if (phase != null) __obj.updateDynamic("phase")(phase.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LineLengthPhase]
  }
}

