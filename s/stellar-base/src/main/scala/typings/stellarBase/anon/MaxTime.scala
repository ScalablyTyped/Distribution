package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.TimePoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxTime extends js.Object {
  var maxTime: TimePoint = js.native
  var minTime: TimePoint = js.native
}

object MaxTime {
  @scala.inline
  def apply(maxTime: TimePoint, minTime: TimePoint): MaxTime = {
    val __obj = js.Dynamic.literal(maxTime = maxTime.asInstanceOf[js.Any], minTime = minTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxTime]
  }
  @scala.inline
  implicit class MaxTimeOps[Self <: MaxTime] (val x: Self) extends AnyVal {
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
    def setMaxTime(value: TimePoint): Self = this.set("maxTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinTime(value: TimePoint): Self = this.set("minTime", value.asInstanceOf[js.Any])
  }
  
}

