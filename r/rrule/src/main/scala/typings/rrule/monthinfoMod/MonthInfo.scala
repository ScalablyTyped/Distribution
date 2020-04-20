package typings.rrule.monthinfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonthInfo extends js.Object {
  var lastmonth: Double
  var lastyear: Double
  var nwdaymask: js.Array[Double]
}

object MonthInfo {
  @scala.inline
  def apply(lastmonth: Double, lastyear: Double, nwdaymask: js.Array[Double]): MonthInfo = {
    val __obj = js.Dynamic.literal(lastmonth = lastmonth.asInstanceOf[js.Any], lastyear = lastyear.asInstanceOf[js.Any], nwdaymask = nwdaymask.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonthInfo]
  }
}

