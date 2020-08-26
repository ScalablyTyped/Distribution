package typings.stellarBase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxTimeMinTime extends js.Object {
  var maxTime: js.UndefOr[Double | String] = js.native
  var minTime: js.UndefOr[Double | String] = js.native
}

object MaxTimeMinTime {
  @scala.inline
  def apply(): MaxTimeMinTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxTimeMinTime]
  }
  @scala.inline
  implicit class MaxTimeMinTimeOps[Self <: MaxTimeMinTime] (val x: Self) extends AnyVal {
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
    def setMaxTime(value: Double | String): Self = this.set("maxTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTime: Self = this.set("maxTime", js.undefined)
    @scala.inline
    def setMinTime(value: Double | String): Self = this.set("minTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinTime: Self = this.set("minTime", js.undefined)
  }
  
}

