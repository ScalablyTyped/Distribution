package typings
package reactDashEasyDashChartLib.reactDashEasyDashChartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PieData extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var key: java.lang.String
  var value: scala.Double
}

object PieData {
  @scala.inline
  def apply(key: java.lang.String, value: scala.Double, color: java.lang.String = null): PieData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("value")(value)
    if (color != null) __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[PieData]
  }
}

