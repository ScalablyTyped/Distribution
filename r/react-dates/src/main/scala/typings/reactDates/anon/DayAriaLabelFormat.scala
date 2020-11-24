package typings.reactDates.anon

import typings.moment.mod.Moment
import typings.react.mod.ReactNode
import typings.reactDates.mod.CalendarDayShape
import typings.reactDates.mod.DayOfWeekShape
import typings.reactDates.mod.ModifiersShape
import typings.reactDates.mod.ScrollableOrientationShape
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DayAriaLabelFormat extends js.Object {
  
  var dayAriaLabelFormat: js.UndefOr[String] = js.native
  
  var enableOutsideDays: js.UndefOr[Boolean] = js.native
  
  var firstDayOfWeek: js.UndefOr[DayOfWeekShape | Null] = js.native
  
  var focusedDate: js.UndefOr[Moment | Null] = js.native
  
  var horizontalMonthPadding: js.UndefOr[Double] = js.native
  
  var isVisible: js.UndefOr[Boolean] = js.native
  
  var modifiers: js.UndefOr[Record[String, ModifiersShape]] = js.native
  
  var month: js.UndefOr[Moment] = js.native
  
   // indicates focusable day
  // i18n
  var monthFormat: js.UndefOr[String] = js.native
  
  var onMonthSelect: js.UndefOr[js.Function2[/* currentMonth */ Moment, /* newMonthVal */ String, Unit]] = js.native
  
  var onYearSelect: js.UndefOr[js.Function2[/* currentMonth */ Moment, /* newMonthVal */ String, Unit]] = js.native
  
  var orientation: js.UndefOr[ScrollableOrientationShape] = js.native
  
  var renderCalendarDay: js.UndefOr[js.Function1[/* props */ CalendarDayShape, ReactNode]] = js.native
  
  var setMonthTitleHeight: js.UndefOr[(js.Function1[/* captionHeight */ Double, Unit]) | Null] = js.native
  
  var verticalBorderSpacing: js.UndefOr[Double] = js.native
}
object DayAriaLabelFormat {
  
  @scala.inline
  def apply(): DayAriaLabelFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DayAriaLabelFormat]
  }
  
  @scala.inline
  implicit class DayAriaLabelFormatOps[Self <: DayAriaLabelFormat] (val x: Self) extends AnyVal {
    
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
    def setDayAriaLabelFormat(value: String): Self = this.set("dayAriaLabelFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayAriaLabelFormat: Self = this.set("dayAriaLabelFormat", js.undefined)
    
    @scala.inline
    def setEnableOutsideDays(value: Boolean): Self = this.set("enableOutsideDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableOutsideDays: Self = this.set("enableOutsideDays", js.undefined)
    
    @scala.inline
    def setFirstDayOfWeek(value: DayOfWeekShape): Self = this.set("firstDayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstDayOfWeek: Self = this.set("firstDayOfWeek", js.undefined)
    
    @scala.inline
    def setFirstDayOfWeekNull: Self = this.set("firstDayOfWeek", null)
    
    @scala.inline
    def setFocusedDate(value: Moment): Self = this.set("focusedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusedDate: Self = this.set("focusedDate", js.undefined)
    
    @scala.inline
    def setFocusedDateNull: Self = this.set("focusedDate", null)
    
    @scala.inline
    def setHorizontalMonthPadding(value: Double): Self = this.set("horizontalMonthPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalMonthPadding: Self = this.set("horizontalMonthPadding", js.undefined)
    
    @scala.inline
    def setIsVisible(value: Boolean): Self = this.set("isVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsVisible: Self = this.set("isVisible", js.undefined)
    
    @scala.inline
    def setModifiers(value: Record[String, ModifiersShape]): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiers: Self = this.set("modifiers", js.undefined)
    
    @scala.inline
    def setMonth(value: Moment): Self = this.set("month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
    
    @scala.inline
    def setMonthFormat(value: String): Self = this.set("monthFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthFormat: Self = this.set("monthFormat", js.undefined)
    
    @scala.inline
    def setOnMonthSelect(value: (/* currentMonth */ Moment, /* newMonthVal */ String) => Unit): Self = this.set("onMonthSelect", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnMonthSelect: Self = this.set("onMonthSelect", js.undefined)
    
    @scala.inline
    def setOnYearSelect(value: (/* currentMonth */ Moment, /* newMonthVal */ String) => Unit): Self = this.set("onYearSelect", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnYearSelect: Self = this.set("onYearSelect", js.undefined)
    
    @scala.inline
    def setOrientation(value: ScrollableOrientationShape): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setRenderCalendarDay(value: /* props */ CalendarDayShape => ReactNode): Self = this.set("renderCalendarDay", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderCalendarDay: Self = this.set("renderCalendarDay", js.undefined)
    
    @scala.inline
    def setSetMonthTitleHeight(value: /* captionHeight */ Double => Unit): Self = this.set("setMonthTitleHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMonthTitleHeight: Self = this.set("setMonthTitleHeight", js.undefined)
    
    @scala.inline
    def setSetMonthTitleHeightNull: Self = this.set("setMonthTitleHeight", null)
    
    @scala.inline
    def setVerticalBorderSpacing(value: Double): Self = this.set("verticalBorderSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalBorderSpacing: Self = this.set("verticalBorderSpacing", js.undefined)
  }
}
