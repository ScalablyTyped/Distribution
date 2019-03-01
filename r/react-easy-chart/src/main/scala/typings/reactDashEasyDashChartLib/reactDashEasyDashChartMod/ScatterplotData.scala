package typings
package reactDashEasyDashChartLib.reactDashEasyDashChartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScatterplotData extends js.Object {
  var `type`: java.lang.String | scala.Double
  var x: scala.Double | stdLib.Date | java.lang.String
  var y: scala.Double | stdLib.Date | java.lang.String
  var z: js.UndefOr[scala.Double] = js.undefined
}

object ScatterplotData {
  @scala.inline
  def apply(
    `type`: java.lang.String | scala.Double,
    x: scala.Double | stdLib.Date | java.lang.String,
    y: scala.Double | stdLib.Date | java.lang.String,
    z: scala.Int | scala.Double = null
  ): ScatterplotData = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScatterplotData]
  }
}

