package typings
package reactDashDatepickerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChangeMonth extends js.Object {
  var date: stdLib.Date
  var nextMonthButtonDisabled: scala.Boolean
  var prevMonthButtonDisabled: scala.Boolean
  def changeMonth(month: scala.Double): scala.Unit
  def changeYear(year: scala.Double): scala.Unit
  def decreaseMonth(): scala.Unit
  def increaseMonth(): scala.Unit
}

object Anon_ChangeMonth {
  @scala.inline
  def apply(
    changeMonth: scala.Double => scala.Unit,
    changeYear: scala.Double => scala.Unit,
    date: stdLib.Date,
    decreaseMonth: () => scala.Unit,
    increaseMonth: () => scala.Unit,
    nextMonthButtonDisabled: scala.Boolean,
    prevMonthButtonDisabled: scala.Boolean
  ): Anon_ChangeMonth = {
    val __obj = js.Dynamic.literal(changeMonth = js.Any.fromFunction1(changeMonth), changeYear = js.Any.fromFunction1(changeYear), date = date, decreaseMonth = js.Any.fromFunction0(decreaseMonth), increaseMonth = js.Any.fromFunction0(increaseMonth), nextMonthButtonDisabled = nextMonthButtonDisabled, prevMonthButtonDisabled = prevMonthButtonDisabled)
  
    __obj.asInstanceOf[Anon_ChangeMonth]
  }
}

