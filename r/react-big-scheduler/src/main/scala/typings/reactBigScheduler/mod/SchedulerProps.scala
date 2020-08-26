package typings.reactBigScheduler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchedulerProps extends js.Object {
  var schedulerData: SchedulerData = js.native
  def nextClick(schedulerData: SchedulerData): Unit = js.native
  def onSelectDate(schedulerData: SchedulerData, date: String): Unit = js.native
  def onViewChange(schedulerData: SchedulerData, view: View): Unit = js.native
  def prevClick(schedulerData: SchedulerData): Unit = js.native
}

object SchedulerProps {
  @scala.inline
  def apply(
    nextClick: SchedulerData => Unit,
    onSelectDate: (SchedulerData, String) => Unit,
    onViewChange: (SchedulerData, View) => Unit,
    prevClick: SchedulerData => Unit,
    schedulerData: SchedulerData
  ): SchedulerProps = {
    val __obj = js.Dynamic.literal(nextClick = js.Any.fromFunction1(nextClick), onSelectDate = js.Any.fromFunction2(onSelectDate), onViewChange = js.Any.fromFunction2(onViewChange), prevClick = js.Any.fromFunction1(prevClick), schedulerData = schedulerData.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerProps]
  }
  @scala.inline
  implicit class SchedulerPropsOps[Self <: SchedulerProps] (val x: Self) extends AnyVal {
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
    def setNextClick(value: SchedulerData => Unit): Self = this.set("nextClick", js.Any.fromFunction1(value))
    @scala.inline
    def setOnSelectDate(value: (SchedulerData, String) => Unit): Self = this.set("onSelectDate", js.Any.fromFunction2(value))
    @scala.inline
    def setOnViewChange(value: (SchedulerData, View) => Unit): Self = this.set("onViewChange", js.Any.fromFunction2(value))
    @scala.inline
    def setPrevClick(value: SchedulerData => Unit): Self = this.set("prevClick", js.Any.fromFunction1(value))
    @scala.inline
    def setSchedulerData(value: SchedulerData): Self = this.set("schedulerData", value.asInstanceOf[js.Any])
  }
  
}

