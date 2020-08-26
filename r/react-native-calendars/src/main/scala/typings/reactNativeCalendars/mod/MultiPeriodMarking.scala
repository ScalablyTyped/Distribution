package typings.reactNativeCalendars.mod

import typings.reactNativeCalendars.anon.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiPeriodMarking extends Marking {
  var periods: js.Array[Color] = js.native
}

object MultiPeriodMarking {
  @scala.inline
  def apply(periods: js.Array[Color]): MultiPeriodMarking = {
    val __obj = js.Dynamic.literal(periods = periods.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiPeriodMarking]
  }
  @scala.inline
  implicit class MultiPeriodMarkingOps[Self <: MultiPeriodMarking] (val x: Self) extends AnyVal {
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
    def setPeriodsVarargs(value: Color*): Self = this.set("periods", js.Array(value :_*))
    @scala.inline
    def setPeriods(value: js.Array[Color]): Self = this.set("periods", value.asInstanceOf[js.Any])
  }
  
}

