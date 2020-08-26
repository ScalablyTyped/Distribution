package typings.reactToolbox.datePickerDatePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatePickerLocale extends js.Object {
  /**
    * Month names.
    */
  var months: js.UndefOr[js.Array[String]] = js.native
  /**
    * Month short names.
    */
  var monthsShort: js.UndefOr[js.Array[String]] = js.native
  /**
    * Day names starting from Sunday.
    */
  var weekdays: js.UndefOr[js.Array[String]] = js.native
  /**
    * Day letters starting from Sunday.
    */
  var weekdaysLetter: js.UndefOr[js.Array[String]] = js.native
  /**
    * Day short names starting from Sunday.
    */
  var weekdaysShort: js.UndefOr[js.Array[String]] = js.native
}

object DatePickerLocale {
  @scala.inline
  def apply(): DatePickerLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatePickerLocale]
  }
  @scala.inline
  implicit class DatePickerLocaleOps[Self <: DatePickerLocale] (val x: Self) extends AnyVal {
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
    def setMonthsVarargs(value: String*): Self = this.set("months", js.Array(value :_*))
    @scala.inline
    def setMonths(value: js.Array[String]): Self = this.set("months", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonths: Self = this.set("months", js.undefined)
    @scala.inline
    def setMonthsShortVarargs(value: String*): Self = this.set("monthsShort", js.Array(value :_*))
    @scala.inline
    def setMonthsShort(value: js.Array[String]): Self = this.set("monthsShort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonthsShort: Self = this.set("monthsShort", js.undefined)
    @scala.inline
    def setWeekdaysVarargs(value: String*): Self = this.set("weekdays", js.Array(value :_*))
    @scala.inline
    def setWeekdays(value: js.Array[String]): Self = this.set("weekdays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeekdays: Self = this.set("weekdays", js.undefined)
    @scala.inline
    def setWeekdaysLetterVarargs(value: String*): Self = this.set("weekdaysLetter", js.Array(value :_*))
    @scala.inline
    def setWeekdaysLetter(value: js.Array[String]): Self = this.set("weekdaysLetter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeekdaysLetter: Self = this.set("weekdaysLetter", js.undefined)
    @scala.inline
    def setWeekdaysShortVarargs(value: String*): Self = this.set("weekdaysShort", js.Array(value :_*))
    @scala.inline
    def setWeekdaysShort(value: js.Array[String]): Self = this.set("weekdaysShort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeekdaysShort: Self = this.set("weekdaysShort", js.undefined)
  }
  
}

