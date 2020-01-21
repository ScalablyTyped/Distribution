package typings.reactEasyChart.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineData extends js.Object {
  var x: Double | Date | String
  var y: Double | Date | String
}

object LineData {
  @scala.inline
  def apply(x: Double | Date | String, y: Double | Date | String): LineData = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LineData]
  }
}

