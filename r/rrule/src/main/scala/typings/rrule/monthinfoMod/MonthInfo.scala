package typings.rrule.monthinfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonthInfo extends js.Object {
  var lastmonth: Double = js.native
  var lastyear: Double = js.native
  var nwdaymask: js.Array[Double] = js.native
}

object MonthInfo {
  @scala.inline
  def apply(lastmonth: Double, lastyear: Double, nwdaymask: js.Array[Double]): MonthInfo = {
    val __obj = js.Dynamic.literal(lastmonth = lastmonth.asInstanceOf[js.Any], lastyear = lastyear.asInstanceOf[js.Any], nwdaymask = nwdaymask.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonthInfo]
  }
  @scala.inline
  implicit class MonthInfoOps[Self <: MonthInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLastmonth(value: Double): Self = this.set("lastmonth", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastyear(value: Double): Self = this.set("lastyear", value.asInstanceOf[js.Any])
    @scala.inline
    def setNwdaymaskVarargs(value: Double*): Self = this.set("nwdaymask", js.Array(value :_*))
    @scala.inline
    def setNwdaymask(value: js.Array[Double]): Self = this.set("nwdaymask", value.asInstanceOf[js.Any])
  }
  
}

