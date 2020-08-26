package typings.reactDateRange.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarTheme extends js.Object {
  var Calendar: js.UndefOr[CSSProperties] = js.native
  var DateRange: js.UndefOr[CSSProperties] = js.native
  var Day: js.UndefOr[CSSProperties] = js.native
  var DayActive: js.UndefOr[CSSProperties] = js.native
  var DayEndEdge: js.UndefOr[CSSProperties] = js.native
  var DayHover: js.UndefOr[CSSProperties] = js.native
  var DayInRange: js.UndefOr[CSSProperties] = js.native
  var DayPassive: js.UndefOr[CSSProperties] = js.native
  var DaySelected: js.UndefOr[CSSProperties] = js.native
  var DaySpecialDay: js.UndefOr[CSSProperties] = js.native
  var DayStartEdge: js.UndefOr[CSSProperties] = js.native
  var DaySunday: js.UndefOr[CSSProperties] = js.native
  var DayToday: js.UndefOr[CSSProperties] = js.native
  var MonthAndYear: js.UndefOr[CSSProperties] = js.native
  var MonthArrow: js.UndefOr[CSSProperties] = js.native
  var MonthArrowNext: js.UndefOr[CSSProperties] = js.native
  var MonthArrowPrev: js.UndefOr[CSSProperties] = js.native
  var MonthButton: js.UndefOr[CSSProperties] = js.native
  var PredefinedRanges: js.UndefOr[CSSProperties] = js.native
  var PredefinedRangesItem: js.UndefOr[CSSProperties] = js.native
  var PredefinedRangesItemActive: js.UndefOr[CSSProperties] = js.native
  var Weekday: js.UndefOr[CSSProperties] = js.native
}

object CalendarTheme {
  @scala.inline
  def apply(): CalendarTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarTheme]
  }
  @scala.inline
  implicit class CalendarThemeOps[Self <: CalendarTheme] (val x: Self) extends AnyVal {
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
    def setCalendar(value: CSSProperties): Self = this.set("Calendar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalendar: Self = this.set("Calendar", js.undefined)
    @scala.inline
    def setDateRange(value: CSSProperties): Self = this.set("DateRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateRange: Self = this.set("DateRange", js.undefined)
    @scala.inline
    def setDay(value: CSSProperties): Self = this.set("Day", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDay: Self = this.set("Day", js.undefined)
    @scala.inline
    def setDayActive(value: CSSProperties): Self = this.set("DayActive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayActive: Self = this.set("DayActive", js.undefined)
    @scala.inline
    def setDayEndEdge(value: CSSProperties): Self = this.set("DayEndEdge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayEndEdge: Self = this.set("DayEndEdge", js.undefined)
    @scala.inline
    def setDayHover(value: CSSProperties): Self = this.set("DayHover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayHover: Self = this.set("DayHover", js.undefined)
    @scala.inline
    def setDayInRange(value: CSSProperties): Self = this.set("DayInRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayInRange: Self = this.set("DayInRange", js.undefined)
    @scala.inline
    def setDayPassive(value: CSSProperties): Self = this.set("DayPassive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayPassive: Self = this.set("DayPassive", js.undefined)
    @scala.inline
    def setDaySelected(value: CSSProperties): Self = this.set("DaySelected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDaySelected: Self = this.set("DaySelected", js.undefined)
    @scala.inline
    def setDaySpecialDay(value: CSSProperties): Self = this.set("DaySpecialDay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDaySpecialDay: Self = this.set("DaySpecialDay", js.undefined)
    @scala.inline
    def setDayStartEdge(value: CSSProperties): Self = this.set("DayStartEdge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayStartEdge: Self = this.set("DayStartEdge", js.undefined)
    @scala.inline
    def setDaySunday(value: CSSProperties): Self = this.set("DaySunday", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDaySunday: Self = this.set("DaySunday", js.undefined)
    @scala.inline
    def setDayToday(value: CSSProperties): Self = this.set("DayToday", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayToday: Self = this.set("DayToday", js.undefined)
    @scala.inline
    def setMonthAndYear(value: CSSProperties): Self = this.set("MonthAndYear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonthAndYear: Self = this.set("MonthAndYear", js.undefined)
    @scala.inline
    def setMonthArrow(value: CSSProperties): Self = this.set("MonthArrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonthArrow: Self = this.set("MonthArrow", js.undefined)
    @scala.inline
    def setMonthArrowNext(value: CSSProperties): Self = this.set("MonthArrowNext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonthArrowNext: Self = this.set("MonthArrowNext", js.undefined)
    @scala.inline
    def setMonthArrowPrev(value: CSSProperties): Self = this.set("MonthArrowPrev", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonthArrowPrev: Self = this.set("MonthArrowPrev", js.undefined)
    @scala.inline
    def setMonthButton(value: CSSProperties): Self = this.set("MonthButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonthButton: Self = this.set("MonthButton", js.undefined)
    @scala.inline
    def setPredefinedRanges(value: CSSProperties): Self = this.set("PredefinedRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePredefinedRanges: Self = this.set("PredefinedRanges", js.undefined)
    @scala.inline
    def setPredefinedRangesItem(value: CSSProperties): Self = this.set("PredefinedRangesItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePredefinedRangesItem: Self = this.set("PredefinedRangesItem", js.undefined)
    @scala.inline
    def setPredefinedRangesItemActive(value: CSSProperties): Self = this.set("PredefinedRangesItemActive", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePredefinedRangesItemActive: Self = this.set("PredefinedRangesItemActive", js.undefined)
    @scala.inline
    def setWeekday(value: CSSProperties): Self = this.set("Weekday", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeekday: Self = this.set("Weekday", js.undefined)
  }
  
}

