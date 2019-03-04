package typings
package reactDashEasyDashChartLib.reactDashEasyDashChartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineData extends js.Object {
  var x: scala.Double | stdLib.Date | java.lang.String
  var y: scala.Double | stdLib.Date | java.lang.String
}

object LineData {
  @scala.inline
  def apply(x: scala.Double | stdLib.Date | java.lang.String, y: scala.Double | stdLib.Date | java.lang.String): LineData = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LineData]
  }
}

