package typings.reactDateRange.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateRangeProps
  extends Range
     with CommonCalendarProps {
  /** default: 2 */
  var calendars: js.UndefOr[Double] = js.native
  /** default: */
  var className: js.UndefOr[String] = js.native
  /** default: MMM d, yyyy */
  var dateDisplayFormat: js.UndefOr[String] = js.native
  /** default: d */
  var dayDisplayFormat: js.UndefOr[String] = js.native
  /** default: vertical */
  var direction: js.UndefOr[String] = js.native
  /** default: */
  var disabledDates: js.UndefOr[js.Array[Date]] = js.native
  /** default: false */
  var editableDateInputs: js.UndefOr[Boolean] = js.native
  /** default: Continuous */
  var endDatePlaceholder: js.UndefOr[String] = js.native
  /** default: false */
  var linkedCalendars: js.UndefOr[Boolean] = js.native
  /** default: enUs from locale. Complete list here https://github.com/Adphorus/react-date-range/blob/next/src/locale/index.js */
  var locale: js.UndefOr[js.Object] = js.native
  /** default: MMM yyyy */
  var monthDisplayFormat: js.UndefOr[String] = js.native
  /** default: 1 */
  var months: js.UndefOr[Double] = js.native
  /** default: false */
  var moveRangeOnFirstSelection: js.UndefOr[Boolean] = js.native
  /** default: [] */
  var rangeColors: js.UndefOr[js.Array[String]] = js.native
  /** default: false */
  var rangedCalendars: js.UndefOr[Boolean] = js.native
  /** default: none */
  var ranges: js.UndefOr[js.Object] = js.native
  /** default: { enabled: false } */
  var scroll: js.UndefOr[js.Object] = js.native
  /** default: true */
  var showMonthAndYearPickers: js.UndefOr[Boolean] = js.native
  /** default: true */
  var showMonthArrow: js.UndefOr[Boolean] = js.native
  /** default: false */
  var showSelectionPreview: js.UndefOr[Boolean] = js.native
  /** default: */
  var shownDate: js.UndefOr[Date] = js.native
  /** default: none */
  var specialDays: js.UndefOr[js.Array[DateContainerType]] = js.native
  /** default: Early */
  var startDatePlaceholder: js.UndefOr[String] = js.native
  /** default: false */
  var twoStepChange: js.UndefOr[Boolean] = js.native
  /** default: */
  var weekStartsOn: js.UndefOr[Double] = js.native
  /** default: E */
  var weekdayDisplayFormat: js.UndefOr[String] = js.native
}

object DateRangeProps {
  @scala.inline
  def apply(): DateRangeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateRangeProps]
  }
  @scala.inline
  implicit class DateRangePropsOps[Self <: DateRangeProps] (val x: Self) extends AnyVal {
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
    def setCalendars(value: Double): Self = this.set("calendars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalendars: Self = this.set("calendars", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDateDisplayFormat(value: String): Self = this.set("dateDisplayFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateDisplayFormat: Self = this.set("dateDisplayFormat", js.undefined)
    @scala.inline
    def setDayDisplayFormat(value: String): Self = this.set("dayDisplayFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayDisplayFormat: Self = this.set("dayDisplayFormat", js.undefined)
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setDisabledDatesVarargs(value: Date*): Self = this.set("disabledDates", js.Array(value :_*))
    @scala.inline
    def setDisabledDates(value: js.Array[Date]): Self = this.set("disabledDates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledDates: Self = this.set("disabledDates", js.undefined)
    @scala.inline
    def setEditableDateInputs(value: Boolean): Self = this.set("editableDateInputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditableDateInputs: Self = this.set("editableDateInputs", js.undefined)
    @scala.inline
    def setEndDatePlaceholder(value: String): Self = this.set("endDatePlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDatePlaceholder: Self = this.set("endDatePlaceholder", js.undefined)
    @scala.inline
    def setLinkedCalendars(value: Boolean): Self = this.set("linkedCalendars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkedCalendars: Self = this.set("linkedCalendars", js.undefined)
    @scala.inline
    def setLocale(value: js.Object): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMonthDisplayFormat(value: String): Self = this.set("monthDisplayFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonthDisplayFormat: Self = this.set("monthDisplayFormat", js.undefined)
    @scala.inline
    def setMonths(value: Double): Self = this.set("months", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonths: Self = this.set("months", js.undefined)
    @scala.inline
    def setMoveRangeOnFirstSelection(value: Boolean): Self = this.set("moveRangeOnFirstSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoveRangeOnFirstSelection: Self = this.set("moveRangeOnFirstSelection", js.undefined)
    @scala.inline
    def setRangeColorsVarargs(value: String*): Self = this.set("rangeColors", js.Array(value :_*))
    @scala.inline
    def setRangeColors(value: js.Array[String]): Self = this.set("rangeColors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeColors: Self = this.set("rangeColors", js.undefined)
    @scala.inline
    def setRangedCalendars(value: Boolean): Self = this.set("rangedCalendars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangedCalendars: Self = this.set("rangedCalendars", js.undefined)
    @scala.inline
    def setRanges(value: js.Object): Self = this.set("ranges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRanges: Self = this.set("ranges", js.undefined)
    @scala.inline
    def setScroll(value: js.Object): Self = this.set("scroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
    @scala.inline
    def setShowMonthAndYearPickers(value: Boolean): Self = this.set("showMonthAndYearPickers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowMonthAndYearPickers: Self = this.set("showMonthAndYearPickers", js.undefined)
    @scala.inline
    def setShowMonthArrow(value: Boolean): Self = this.set("showMonthArrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowMonthArrow: Self = this.set("showMonthArrow", js.undefined)
    @scala.inline
    def setShowSelectionPreview(value: Boolean): Self = this.set("showSelectionPreview", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSelectionPreview: Self = this.set("showSelectionPreview", js.undefined)
    @scala.inline
    def setShownDate(value: Date): Self = this.set("shownDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShownDate: Self = this.set("shownDate", js.undefined)
    @scala.inline
    def setSpecialDaysVarargs(value: DateContainerType*): Self = this.set("specialDays", js.Array(value :_*))
    @scala.inline
    def setSpecialDays(value: js.Array[DateContainerType]): Self = this.set("specialDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpecialDays: Self = this.set("specialDays", js.undefined)
    @scala.inline
    def setStartDatePlaceholder(value: String): Self = this.set("startDatePlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDatePlaceholder: Self = this.set("startDatePlaceholder", js.undefined)
    @scala.inline
    def setTwoStepChange(value: Boolean): Self = this.set("twoStepChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTwoStepChange: Self = this.set("twoStepChange", js.undefined)
    @scala.inline
    def setWeekStartsOn(value: Double): Self = this.set("weekStartsOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeekStartsOn: Self = this.set("weekStartsOn", js.undefined)
    @scala.inline
    def setWeekdayDisplayFormat(value: String): Self = this.set("weekdayDisplayFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeekdayDisplayFormat: Self = this.set("weekdayDisplayFormat", js.undefined)
  }
  
}

