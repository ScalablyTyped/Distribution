package typings.rmcCalendar.dataTypesMod.Models

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellData extends js.Object {
  var dayOfMonth: Double = js.native
  var isFirstOfMonth: Boolean = js.native
  var isLastOfMonth: Boolean = js.native
  var outOfDate: Boolean = js.native
  var selected: SelectType = js.native
  var tick: Double = js.native
}

object CellData {
  @scala.inline
  def apply(
    dayOfMonth: Double,
    isFirstOfMonth: Boolean,
    isLastOfMonth: Boolean,
    outOfDate: Boolean,
    selected: SelectType,
    tick: Double
  ): CellData = {
    val __obj = js.Dynamic.literal(dayOfMonth = dayOfMonth.asInstanceOf[js.Any], isFirstOfMonth = isFirstOfMonth.asInstanceOf[js.Any], isLastOfMonth = isLastOfMonth.asInstanceOf[js.Any], outOfDate = outOfDate.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], tick = tick.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellData]
  }
  @scala.inline
  implicit class CellDataOps[Self <: CellData] (val x: Self) extends AnyVal {
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
    def setDayOfMonth(value: Double): Self = this.set("dayOfMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFirstOfMonth(value: Boolean): Self = this.set("isFirstOfMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsLastOfMonth(value: Boolean): Self = this.set("isLastOfMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutOfDate(value: Boolean): Self = this.set("outOfDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelected(value: SelectType): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def setTick(value: Double): Self = this.set("tick", value.asInstanceOf[js.Any])
  }
  
}

