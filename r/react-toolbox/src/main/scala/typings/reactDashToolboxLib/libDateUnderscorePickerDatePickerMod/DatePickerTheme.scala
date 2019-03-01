package typings
package reactDashToolboxLib.libDateUnderscorePickerDatePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerTheme extends js.Object {
  /**
    * Used for the active day and year.
    */
  var active: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the buttons in the dialog.
    */
  var button: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the calendar root element.
    */
  var calendar: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used as wrapper for the calendar component inside dialog.
    */
  var calendarWrapper: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the date element inside header.
    */
  var date: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the day element inside the calendar.
    */
  var day: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the list of days inside a month.
    */
  var days: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the dialog component.
    */
  var dialog: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to day element when day is disabled.
    */
  var disabled: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the dialog header,.
    */
  var header: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for Input element that opens the picker.
    */
  var input: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the month root element.
    */
  var month: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to the root dialog when months are displayed.
    */
  var monthsDisplay: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the next month icon.
    */
  var next: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the prev month icon.
    */
  var prev: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the month title element.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the weekdays wrapper.
    */
  var week: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the year element inside header.
    */
  var year: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the years list in years view.
    */
  var years: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to the root dialog when years are displayed.
    */
  var yearsDisplay: js.UndefOr[java.lang.String] = js.undefined
}

object DatePickerTheme {
  @scala.inline
  def apply(
    active: java.lang.String = null,
    button: java.lang.String = null,
    calendar: java.lang.String = null,
    calendarWrapper: java.lang.String = null,
    date: java.lang.String = null,
    day: java.lang.String = null,
    days: java.lang.String = null,
    dialog: java.lang.String = null,
    disabled: java.lang.String = null,
    header: java.lang.String = null,
    input: java.lang.String = null,
    month: java.lang.String = null,
    monthsDisplay: java.lang.String = null,
    next: java.lang.String = null,
    prev: java.lang.String = null,
    title: java.lang.String = null,
    week: java.lang.String = null,
    year: java.lang.String = null,
    years: java.lang.String = null,
    yearsDisplay: java.lang.String = null
  ): DatePickerTheme = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active)
    if (button != null) __obj.updateDynamic("button")(button)
    if (calendar != null) __obj.updateDynamic("calendar")(calendar)
    if (calendarWrapper != null) __obj.updateDynamic("calendarWrapper")(calendarWrapper)
    if (date != null) __obj.updateDynamic("date")(date)
    if (day != null) __obj.updateDynamic("day")(day)
    if (days != null) __obj.updateDynamic("days")(days)
    if (dialog != null) __obj.updateDynamic("dialog")(dialog)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (header != null) __obj.updateDynamic("header")(header)
    if (input != null) __obj.updateDynamic("input")(input)
    if (month != null) __obj.updateDynamic("month")(month)
    if (monthsDisplay != null) __obj.updateDynamic("monthsDisplay")(monthsDisplay)
    if (next != null) __obj.updateDynamic("next")(next)
    if (prev != null) __obj.updateDynamic("prev")(prev)
    if (title != null) __obj.updateDynamic("title")(title)
    if (week != null) __obj.updateDynamic("week")(week)
    if (year != null) __obj.updateDynamic("year")(year)
    if (years != null) __obj.updateDynamic("years")(years)
    if (yearsDisplay != null) __obj.updateDynamic("yearsDisplay")(yearsDisplay)
    __obj.asInstanceOf[DatePickerTheme]
  }
}

