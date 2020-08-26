package typings.reactNativeCalendarPicker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MinDurationArrayItem extends js.Object {
  var date: MomentParsable = js.native
  var minDuration: Double = js.native
}

object MinDurationArrayItem {
  @scala.inline
  def apply(date: MomentParsable, minDuration: Double): MinDurationArrayItem = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], minDuration = minDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinDurationArrayItem]
  }
  @scala.inline
  implicit class MinDurationArrayItemOps[Self <: MinDurationArrayItem] (val x: Self) extends AnyVal {
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
    def setDateVarargs(value: (Double | String)*): Self = this.set("date", js.Array(value :_*))
    @scala.inline
    def setDate(value: MomentParsable): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinDuration(value: Double): Self = this.set("minDuration", value.asInstanceOf[js.Any])
  }
  
}

