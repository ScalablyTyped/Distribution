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
    changeMonth: js.Function1[scala.Double, scala.Unit],
    changeYear: js.Function1[scala.Double, scala.Unit],
    date: stdLib.Date,
    decreaseMonth: js.Function0[scala.Unit],
    increaseMonth: js.Function0[scala.Unit],
    nextMonthButtonDisabled: scala.Boolean,
    prevMonthButtonDisabled: scala.Boolean
  ): Anon_ChangeMonth = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changeMonth")(changeMonth)
    __obj.updateDynamic("changeYear")(changeYear)
    __obj.updateDynamic("date")(date)
    __obj.updateDynamic("decreaseMonth")(decreaseMonth)
    __obj.updateDynamic("increaseMonth")(increaseMonth)
    __obj.updateDynamic("nextMonthButtonDisabled")(nextMonthButtonDisabled)
    __obj.updateDynamic("prevMonthButtonDisabled")(prevMonthButtonDisabled)
    __obj.asInstanceOf[Anon_ChangeMonth]
  }
}

