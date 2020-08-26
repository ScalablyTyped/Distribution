package typings.reactToolbox.datePickerDatePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatePickerTheme extends js.Object {
  /**
    * Used for the active day and year.
    */
  var active: js.UndefOr[String] = js.native
  /**
    * Used for the buttons in the dialog.
    */
  var button: js.UndefOr[String] = js.native
  /**
    * Used for the calendar root element.
    */
  var calendar: js.UndefOr[String] = js.native
  /**
    * Used as wrapper for the calendar component inside dialog.
    */
  var calendarWrapper: js.UndefOr[String] = js.native
  /**
    * Used for the date element inside header.
    */
  var date: js.UndefOr[String] = js.native
  /**
    * Used for the day element inside the calendar.
    */
  var day: js.UndefOr[String] = js.native
  /**
    * Used for the list of days inside a month.
    */
  var days: js.UndefOr[String] = js.native
  /**
    * Used for the dialog component.
    */
  var dialog: js.UndefOr[String] = js.native
  /**
    * Added to day element when day is disabled.
    */
  var disabled: js.UndefOr[String] = js.native
  /**
    * Used for the dialog header,.
    */
  var header: js.UndefOr[String] = js.native
  /**
    * Used for Input element that opens the picker.
    */
  var input: js.UndefOr[String] = js.native
  /**
    * Used for the month root element.
    */
  var month: js.UndefOr[String] = js.native
  /**
    * Added to the root dialog when months are displayed.
    */
  var monthsDisplay: js.UndefOr[String] = js.native
  /**
    * Used for the next month icon.
    */
  var next: js.UndefOr[String] = js.native
  /**
    * Used for the prev month icon.
    */
  var prev: js.UndefOr[String] = js.native
  /**
    * Used for the month title element.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Used for the weekdays wrapper.
    */
  var week: js.UndefOr[String] = js.native
  /**
    * Used for the year element inside header.
    */
  var year: js.UndefOr[String] = js.native
  /**
    * Used for the years list in years view.
    */
  var years: js.UndefOr[String] = js.native
  /**
    * Added to the root dialog when years are displayed.
    */
  var yearsDisplay: js.UndefOr[String] = js.native
}

object DatePickerTheme {
  @scala.inline
  def apply(): DatePickerTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatePickerTheme]
  }
  @scala.inline
  implicit class DatePickerThemeOps[Self <: DatePickerTheme] (val x: Self) extends AnyVal {
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
    def setActive(value: String): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setButton(value: String): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    @scala.inline
    def setCalendar(value: String): Self = this.set("calendar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalendar: Self = this.set("calendar", js.undefined)
    @scala.inline
    def setCalendarWrapper(value: String): Self = this.set("calendarWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalendarWrapper: Self = this.set("calendarWrapper", js.undefined)
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setDay(value: String): Self = this.set("day", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDay: Self = this.set("day", js.undefined)
    @scala.inline
    def setDays(value: String): Self = this.set("days", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDays: Self = this.set("days", js.undefined)
    @scala.inline
    def setDialog(value: String): Self = this.set("dialog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDialog: Self = this.set("dialog", js.undefined)
    @scala.inline
    def setDisabled(value: String): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setInput(value: String): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setMonth(value: String): Self = this.set("month", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
    @scala.inline
    def setMonthsDisplay(value: String): Self = this.set("monthsDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonthsDisplay: Self = this.set("monthsDisplay", js.undefined)
    @scala.inline
    def setNext(value: String): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    @scala.inline
    def setPrev(value: String): Self = this.set("prev", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrev: Self = this.set("prev", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setWeek(value: String): Self = this.set("week", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeek: Self = this.set("week", js.undefined)
    @scala.inline
    def setYear(value: String): Self = this.set("year", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYear: Self = this.set("year", js.undefined)
    @scala.inline
    def setYears(value: String): Self = this.set("years", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYears: Self = this.set("years", js.undefined)
    @scala.inline
    def setYearsDisplay(value: String): Self = this.set("yearsDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYearsDisplay: Self = this.set("yearsDisplay", js.undefined)
  }
  
}

