package typings.stellarBase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MinTime extends js.Object {
  var maxTime: String = js.native
  var minTime: String = js.native
}

object MinTime {
  @scala.inline
  def apply(maxTime: String, minTime: String): MinTime = {
    val __obj = js.Dynamic.literal(maxTime = maxTime.asInstanceOf[js.Any], minTime = minTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinTime]
  }
  @scala.inline
  implicit class MinTimeOps[Self <: MinTime] (val x: Self) extends AnyVal {
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
    def setMaxTime(value: String): Self = this.set("maxTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinTime(value: String): Self = this.set("minTime", value.asInstanceOf[js.Any])
  }
  
}

