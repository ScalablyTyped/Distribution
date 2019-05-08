package typings
package reactDashBigDashSchedulerLib.reactDashBigDashSchedulerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerProps extends js.Object {
  var schedulerData: SchedulerData
  def nextClick(schedulerData: SchedulerData): scala.Unit
  def onSelectDate(schedulerData: SchedulerData, date: java.lang.String): scala.Unit
  def onViewChange(schedulerData: SchedulerData, view: View): scala.Unit
  def prevClick(schedulerData: SchedulerData): scala.Unit
}

object SchedulerProps {
  @scala.inline
  def apply(
    nextClick: SchedulerData => scala.Unit,
    onSelectDate: (SchedulerData, java.lang.String) => scala.Unit,
    onViewChange: (SchedulerData, View) => scala.Unit,
    prevClick: SchedulerData => scala.Unit,
    schedulerData: SchedulerData
  ): SchedulerProps = {
    val __obj = js.Dynamic.literal(nextClick = js.Any.fromFunction1(nextClick), onSelectDate = js.Any.fromFunction2(onSelectDate), onViewChange = js.Any.fromFunction2(onViewChange), prevClick = js.Any.fromFunction1(prevClick), schedulerData = schedulerData)
  
    __obj.asInstanceOf[SchedulerProps]
  }
}

