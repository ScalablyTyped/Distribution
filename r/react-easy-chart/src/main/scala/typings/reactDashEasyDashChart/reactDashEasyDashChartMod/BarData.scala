package typings.reactDashEasyDashChart.reactDashEasyDashChartMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarData extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var x: Double | Date | String
  var y: Double
}

object BarData {
  @scala.inline
  def apply(x: Double | Date | String, y: Double, color: String = null): BarData = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarData]
  }
}

