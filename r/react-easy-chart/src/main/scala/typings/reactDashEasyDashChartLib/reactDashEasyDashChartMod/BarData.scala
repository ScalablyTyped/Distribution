package typings
package reactDashEasyDashChartLib.reactDashEasyDashChartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarData extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var x: scala.Double | stdLib.Date | java.lang.String
  var y: scala.Double
}

object BarData {
  @scala.inline
  def apply(x: scala.Double | stdLib.Date | java.lang.String, y: scala.Double, color: java.lang.String = null): BarData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    __obj.updateDynamic("y")(y)
    if (color != null) __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[BarData]
  }
}

