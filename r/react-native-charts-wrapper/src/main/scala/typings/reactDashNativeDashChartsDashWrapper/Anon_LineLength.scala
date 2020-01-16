package typings.reactDashNativeDashChartsDashWrapper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LineLength extends js.Object {
  var lineLength: js.UndefOr[Double] = js.undefined
  var phase: js.UndefOr[Double] = js.undefined
  var spaceLength: js.UndefOr[Double] = js.undefined
}

object Anon_LineLength {
  @scala.inline
  def apply(lineLength: Int | Double = null, phase: Int | Double = null, spaceLength: Int | Double = null): Anon_LineLength = {
    val __obj = js.Dynamic.literal()
    if (lineLength != null) __obj.updateDynamic("lineLength")(lineLength.asInstanceOf[js.Any])
    if (phase != null) __obj.updateDynamic("phase")(phase.asInstanceOf[js.Any])
    if (spaceLength != null) __obj.updateDynamic("spaceLength")(spaceLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LineLength]
  }
}

