package typings.reactDatepicker

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChangeMonth extends js.Object {
  var date: Date
  var nextMonthButtonDisabled: Boolean
  var prevMonthButtonDisabled: Boolean
  def changeMonth(month: Double): Unit
  def changeYear(year: Double): Unit
  def decreaseMonth(): Unit
  def increaseMonth(): Unit
}

object AnonChangeMonth {
  @scala.inline
  def apply(
    changeMonth: Double => Unit,
    changeYear: Double => Unit,
    date: Date,
    decreaseMonth: () => Unit,
    increaseMonth: () => Unit,
    nextMonthButtonDisabled: Boolean,
    prevMonthButtonDisabled: Boolean
  ): AnonChangeMonth = {
    val __obj = js.Dynamic.literal(changeMonth = js.Any.fromFunction1(changeMonth), changeYear = js.Any.fromFunction1(changeYear), date = date.asInstanceOf[js.Any], decreaseMonth = js.Any.fromFunction0(decreaseMonth), increaseMonth = js.Any.fromFunction0(increaseMonth), nextMonthButtonDisabled = nextMonthButtonDisabled.asInstanceOf[js.Any], prevMonthButtonDisabled = prevMonthButtonDisabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChangeMonth]
  }
}

