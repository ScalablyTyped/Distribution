package typings.reactBigScheduler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerProps extends js.Object {
  var schedulerData: SchedulerData
  def nextClick(schedulerData: SchedulerData): Unit
  def onSelectDate(schedulerData: SchedulerData, date: String): Unit
  def onViewChange(schedulerData: SchedulerData, view: View): Unit
  def prevClick(schedulerData: SchedulerData): Unit
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
}

