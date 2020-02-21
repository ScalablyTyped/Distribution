package typings.reactDatepicker

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChangeMonth extends js.Object {
  var date: Date
  var nextMonthButtonDisabled: Boolean
  var nextYearButtonDisabled: Boolean
  var prevMonthButtonDisabled: Boolean
  var prevYearButtonDisabled: Boolean
  def changeMonth(month: Double): Unit
  def changeYear(year: Double): Unit
  def decreaseMonth(): Unit
  def decreaseYear(): Unit
  def increaseMonth(): Unit
  def increaseYear(): Unit
}

object AnonChangeMonth {
  @scala.inline
  def apply(
    changeMonth: Double => Unit,
    changeYear: Double => Unit,
    date: Date,
    decreaseMonth: () => Unit,
    decreaseYear: () => Unit,
    increaseMonth: () => Unit,
    increaseYear: () => Unit,
    nextMonthButtonDisabled: Boolean,
    nextYearButtonDisabled: Boolean,
    prevMonthButtonDisabled: Boolean,
    prevYearButtonDisabled: Boolean
  ): AnonChangeMonth = {
    val __obj = js.Dynamic.literal(changeMonth = js.Any.fromFunction1(changeMonth), changeYear = js.Any.fromFunction1(changeYear), date = date.asInstanceOf[js.Any], decreaseMonth = js.Any.fromFunction0(decreaseMonth), decreaseYear = js.Any.fromFunction0(decreaseYear), increaseMonth = js.Any.fromFunction0(increaseMonth), increaseYear = js.Any.fromFunction0(increaseYear), nextMonthButtonDisabled = nextMonthButtonDisabled.asInstanceOf[js.Any], nextYearButtonDisabled = nextYearButtonDisabled.asInstanceOf[js.Any], prevMonthButtonDisabled = prevMonthButtonDisabled.asInstanceOf[js.Any], prevYearButtonDisabled = prevYearButtonDisabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChangeMonth]
  }
}

