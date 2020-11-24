package typings.reactDateRange.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-date-range.react-date-range.ClassNames> */
@js.native
trait PartialClassNames extends js.Object {
  
  var calendarWrapper: js.UndefOr[String] = js.native
  
  var dateDisplay: js.UndefOr[String] = js.native
  
  var dateDisplayItem: js.UndefOr[String] = js.native
  
  var dateDisplayItemActive: js.UndefOr[String] = js.native
  
  var dateDisplayWrapper: js.UndefOr[String] = js.native
  
  var dateRangePickerWrapper: js.UndefOr[String] = js.native
  
  var dateRangeWrapper: js.UndefOr[String] = js.native
  
  var day: js.UndefOr[String] = js.native
  
  var dayActive: js.UndefOr[String] = js.native
  
  var dayDisabled: js.UndefOr[String] = js.native
  
  var dayEndOfMonth: js.UndefOr[String] = js.native
  
  var dayEndOfWeek: js.UndefOr[String] = js.native
  
  var dayEndPreview: js.UndefOr[String] = js.native
  
  var dayHovered: js.UndefOr[String] = js.native
  
  var dayInPreview: js.UndefOr[String] = js.native
  
  var dayNumber: js.UndefOr[String] = js.native
  
  var dayPassive: js.UndefOr[String] = js.native
  
  var daySelected: js.UndefOr[String] = js.native
  
  var dayStartOfMonth: js.UndefOr[String] = js.native
  
  var dayStartOfWeek: js.UndefOr[String] = js.native
  
  var dayStartPreview: js.UndefOr[String] = js.native
  
  var dayToday: js.UndefOr[String] = js.native
  
  var dayWeekend: js.UndefOr[String] = js.native
  
  var days: js.UndefOr[String] = js.native
  
  var definedRangesWrapper: js.UndefOr[String] = js.native
  
  var endEdge: js.UndefOr[String] = js.native
  
  var inRange: js.UndefOr[String] = js.native
  
  var infiniteMonths: js.UndefOr[String] = js.native
  
  var inputRange: js.UndefOr[String] = js.native
  
  var inputRangeInput: js.UndefOr[String] = js.native
  
  var inputRanges: js.UndefOr[String] = js.native
  
  var month: js.UndefOr[String] = js.native
  
  var monthAndYearPickers: js.UndefOr[String] = js.native
  
  var monthAndYearWrapper: js.UndefOr[String] = js.native
  
  var monthName: js.UndefOr[String] = js.native
  
  var monthPicker: js.UndefOr[String] = js.native
  
  var months: js.UndefOr[String] = js.native
  
  var monthsHorizontal: js.UndefOr[String] = js.native
  
  var monthsVertical: js.UndefOr[String] = js.native
  
  var nextButton: js.UndefOr[String] = js.native
  
  var nextPrevButton: js.UndefOr[String] = js.native
  
  var prevButton: js.UndefOr[String] = js.native
  
  var selected: js.UndefOr[String] = js.native
  
  var startEdge: js.UndefOr[String] = js.native
  
  var staticRange: js.UndefOr[String] = js.native
  
  var staticRangeLabel: js.UndefOr[String] = js.native
  
  var staticRangeSelected: js.UndefOr[String] = js.native
  
  var staticRanges: js.UndefOr[String] = js.native
  
  var weekDay: js.UndefOr[String] = js.native
  
  var weekDays: js.UndefOr[String] = js.native
  
  var yearPicker: js.UndefOr[String] = js.native
}
object PartialClassNames {
  
  @scala.inline
  def apply(): PartialClassNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNames]
  }
  
  @scala.inline
  implicit class PartialClassNamesOps[Self <: PartialClassNames] (val x: Self) extends AnyVal {
    
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
    def setCalendarWrapper(value: String): Self = this.set("calendarWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendarWrapper: Self = this.set("calendarWrapper", js.undefined)
    
    @scala.inline
    def setDateDisplay(value: String): Self = this.set("dateDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateDisplay: Self = this.set("dateDisplay", js.undefined)
    
    @scala.inline
    def setDateDisplayItem(value: String): Self = this.set("dateDisplayItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateDisplayItem: Self = this.set("dateDisplayItem", js.undefined)
    
    @scala.inline
    def setDateDisplayItemActive(value: String): Self = this.set("dateDisplayItemActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateDisplayItemActive: Self = this.set("dateDisplayItemActive", js.undefined)
    
    @scala.inline
    def setDateDisplayWrapper(value: String): Self = this.set("dateDisplayWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateDisplayWrapper: Self = this.set("dateDisplayWrapper", js.undefined)
    
    @scala.inline
    def setDateRangePickerWrapper(value: String): Self = this.set("dateRangePickerWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateRangePickerWrapper: Self = this.set("dateRangePickerWrapper", js.undefined)
    
    @scala.inline
    def setDateRangeWrapper(value: String): Self = this.set("dateRangeWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateRangeWrapper: Self = this.set("dateRangeWrapper", js.undefined)
    
    @scala.inline
    def setDay(value: String): Self = this.set("day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDay: Self = this.set("day", js.undefined)
    
    @scala.inline
    def setDayActive(value: String): Self = this.set("dayActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayActive: Self = this.set("dayActive", js.undefined)
    
    @scala.inline
    def setDayDisabled(value: String): Self = this.set("dayDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayDisabled: Self = this.set("dayDisabled", js.undefined)
    
    @scala.inline
    def setDayEndOfMonth(value: String): Self = this.set("dayEndOfMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayEndOfMonth: Self = this.set("dayEndOfMonth", js.undefined)
    
    @scala.inline
    def setDayEndOfWeek(value: String): Self = this.set("dayEndOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayEndOfWeek: Self = this.set("dayEndOfWeek", js.undefined)
    
    @scala.inline
    def setDayEndPreview(value: String): Self = this.set("dayEndPreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayEndPreview: Self = this.set("dayEndPreview", js.undefined)
    
    @scala.inline
    def setDayHovered(value: String): Self = this.set("dayHovered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayHovered: Self = this.set("dayHovered", js.undefined)
    
    @scala.inline
    def setDayInPreview(value: String): Self = this.set("dayInPreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayInPreview: Self = this.set("dayInPreview", js.undefined)
    
    @scala.inline
    def setDayNumber(value: String): Self = this.set("dayNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayNumber: Self = this.set("dayNumber", js.undefined)
    
    @scala.inline
    def setDayPassive(value: String): Self = this.set("dayPassive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayPassive: Self = this.set("dayPassive", js.undefined)
    
    @scala.inline
    def setDaySelected(value: String): Self = this.set("daySelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDaySelected: Self = this.set("daySelected", js.undefined)
    
    @scala.inline
    def setDayStartOfMonth(value: String): Self = this.set("dayStartOfMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayStartOfMonth: Self = this.set("dayStartOfMonth", js.undefined)
    
    @scala.inline
    def setDayStartOfWeek(value: String): Self = this.set("dayStartOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayStartOfWeek: Self = this.set("dayStartOfWeek", js.undefined)
    
    @scala.inline
    def setDayStartPreview(value: String): Self = this.set("dayStartPreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayStartPreview: Self = this.set("dayStartPreview", js.undefined)
    
    @scala.inline
    def setDayToday(value: String): Self = this.set("dayToday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayToday: Self = this.set("dayToday", js.undefined)
    
    @scala.inline
    def setDayWeekend(value: String): Self = this.set("dayWeekend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayWeekend: Self = this.set("dayWeekend", js.undefined)
    
    @scala.inline
    def setDays(value: String): Self = this.set("days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDays: Self = this.set("days", js.undefined)
    
    @scala.inline
    def setDefinedRangesWrapper(value: String): Self = this.set("definedRangesWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefinedRangesWrapper: Self = this.set("definedRangesWrapper", js.undefined)
    
    @scala.inline
    def setEndEdge(value: String): Self = this.set("endEdge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndEdge: Self = this.set("endEdge", js.undefined)
    
    @scala.inline
    def setInRange(value: String): Self = this.set("inRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInRange: Self = this.set("inRange", js.undefined)
    
    @scala.inline
    def setInfiniteMonths(value: String): Self = this.set("infiniteMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfiniteMonths: Self = this.set("infiniteMonths", js.undefined)
    
    @scala.inline
    def setInputRange(value: String): Self = this.set("inputRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputRange: Self = this.set("inputRange", js.undefined)
    
    @scala.inline
    def setInputRangeInput(value: String): Self = this.set("inputRangeInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputRangeInput: Self = this.set("inputRangeInput", js.undefined)
    
    @scala.inline
    def setInputRanges(value: String): Self = this.set("inputRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputRanges: Self = this.set("inputRanges", js.undefined)
    
    @scala.inline
    def setMonth(value: String): Self = this.set("month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
    
    @scala.inline
    def setMonthAndYearPickers(value: String): Self = this.set("monthAndYearPickers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthAndYearPickers: Self = this.set("monthAndYearPickers", js.undefined)
    
    @scala.inline
    def setMonthAndYearWrapper(value: String): Self = this.set("monthAndYearWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthAndYearWrapper: Self = this.set("monthAndYearWrapper", js.undefined)
    
    @scala.inline
    def setMonthName(value: String): Self = this.set("monthName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthName: Self = this.set("monthName", js.undefined)
    
    @scala.inline
    def setMonthPicker(value: String): Self = this.set("monthPicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthPicker: Self = this.set("monthPicker", js.undefined)
    
    @scala.inline
    def setMonths(value: String): Self = this.set("months", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonths: Self = this.set("months", js.undefined)
    
    @scala.inline
    def setMonthsHorizontal(value: String): Self = this.set("monthsHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthsHorizontal: Self = this.set("monthsHorizontal", js.undefined)
    
    @scala.inline
    def setMonthsVertical(value: String): Self = this.set("monthsVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthsVertical: Self = this.set("monthsVertical", js.undefined)
    
    @scala.inline
    def setNextButton(value: String): Self = this.set("nextButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextButton: Self = this.set("nextButton", js.undefined)
    
    @scala.inline
    def setNextPrevButton(value: String): Self = this.set("nextPrevButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPrevButton: Self = this.set("nextPrevButton", js.undefined)
    
    @scala.inline
    def setPrevButton(value: String): Self = this.set("prevButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevButton: Self = this.set("prevButton", js.undefined)
    
    @scala.inline
    def setSelected(value: String): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setStartEdge(value: String): Self = this.set("startEdge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartEdge: Self = this.set("startEdge", js.undefined)
    
    @scala.inline
    def setStaticRange(value: String): Self = this.set("staticRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaticRange: Self = this.set("staticRange", js.undefined)
    
    @scala.inline
    def setStaticRangeLabel(value: String): Self = this.set("staticRangeLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaticRangeLabel: Self = this.set("staticRangeLabel", js.undefined)
    
    @scala.inline
    def setStaticRangeSelected(value: String): Self = this.set("staticRangeSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaticRangeSelected: Self = this.set("staticRangeSelected", js.undefined)
    
    @scala.inline
    def setStaticRanges(value: String): Self = this.set("staticRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaticRanges: Self = this.set("staticRanges", js.undefined)
    
    @scala.inline
    def setWeekDay(value: String): Self = this.set("weekDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekDay: Self = this.set("weekDay", js.undefined)
    
    @scala.inline
    def setWeekDays(value: String): Self = this.set("weekDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekDays: Self = this.set("weekDays", js.undefined)
    
    @scala.inline
    def setYearPicker(value: String): Self = this.set("yearPicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYearPicker: Self = this.set("yearPicker", js.undefined)
  }
}
