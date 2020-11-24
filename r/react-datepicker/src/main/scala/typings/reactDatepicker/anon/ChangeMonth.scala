package typings.reactDatepicker.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeMonth extends js.Object {
  
  def changeMonth(month: Double): Unit = js.native
  
  def changeYear(year: Double): Unit = js.native
  
  var date: Date = js.native
  
  def decreaseMonth(): Unit = js.native
  
  def decreaseYear(): Unit = js.native
  
  def increaseMonth(): Unit = js.native
  
  def increaseYear(): Unit = js.native
  
  var nextMonthButtonDisabled: Boolean = js.native
  
  var nextYearButtonDisabled: Boolean = js.native
  
  var prevMonthButtonDisabled: Boolean = js.native
  
  var prevYearButtonDisabled: Boolean = js.native
}
object ChangeMonth {
  
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
  ): ChangeMonth = {
    val __obj = js.Dynamic.literal(changeMonth = js.Any.fromFunction1(changeMonth), changeYear = js.Any.fromFunction1(changeYear), date = date.asInstanceOf[js.Any], decreaseMonth = js.Any.fromFunction0(decreaseMonth), decreaseYear = js.Any.fromFunction0(decreaseYear), increaseMonth = js.Any.fromFunction0(increaseMonth), increaseYear = js.Any.fromFunction0(increaseYear), nextMonthButtonDisabled = nextMonthButtonDisabled.asInstanceOf[js.Any], nextYearButtonDisabled = nextYearButtonDisabled.asInstanceOf[js.Any], prevMonthButtonDisabled = prevMonthButtonDisabled.asInstanceOf[js.Any], prevYearButtonDisabled = prevYearButtonDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeMonth]
  }
  
  @scala.inline
  implicit class ChangeMonthOps[Self <: ChangeMonth] (val x: Self) extends AnyVal {
    
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
    def setChangeMonth(value: Double => Unit): Self = this.set("changeMonth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeYear(value: Double => Unit): Self = this.set("changeYear", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecreaseMonth(value: () => Unit): Self = this.set("decreaseMonth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDecreaseYear(value: () => Unit): Self = this.set("decreaseYear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIncreaseMonth(value: () => Unit): Self = this.set("increaseMonth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIncreaseYear(value: () => Unit): Self = this.set("increaseYear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNextMonthButtonDisabled(value: Boolean): Self = this.set("nextMonthButtonDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextYearButtonDisabled(value: Boolean): Self = this.set("nextYearButtonDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevMonthButtonDisabled(value: Boolean): Self = this.set("prevMonthButtonDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevYearButtonDisabled(value: Boolean): Self = this.set("prevYearButtonDisabled", value.asInstanceOf[js.Any])
  }
}
