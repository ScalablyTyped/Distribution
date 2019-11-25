package typings.reactDashEasyDashChart.reactDashEasyDashChartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PieData extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var key: String
  var value: Double
}

object PieData {
  @scala.inline
  def apply(key: String, value: Double, color: String = null): PieData = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieData]
  }
}

