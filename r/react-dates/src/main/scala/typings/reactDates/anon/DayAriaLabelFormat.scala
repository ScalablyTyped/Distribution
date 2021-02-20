package typings.reactDates.anon

import typings.moment.mod.Moment
import typings.react.mod.ReactNode
import typings.reactDates.mod.CalendarDayShape
import typings.reactDates.mod.DayOfWeekShape
import typings.reactDates.mod.ModifiersShape
import typings.reactDates.mod.ScrollableOrientationShape
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DayAriaLabelFormat extends StObject {
  
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
  implicit class DayAriaLabelFormatMutableBuilder[Self <: DayAriaLabelFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDayAriaLabelFormat(value: String): Self = StObject.set(x, "dayAriaLabelFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayAriaLabelFormatUndefined: Self = StObject.set(x, "dayAriaLabelFormat", js.undefined)
    
    @scala.inline
    def setEnableOutsideDays(value: Boolean): Self = StObject.set(x, "enableOutsideDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableOutsideDaysUndefined: Self = StObject.set(x, "enableOutsideDays", js.undefined)
    
    @scala.inline
    def setFirstDayOfWeek(value: DayOfWeekShape): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstDayOfWeekNull: Self = StObject.set(x, "firstDayOfWeek", null)
    
    @scala.inline
    def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
    
    @scala.inline
    def setFocusedDate(value: Moment): Self = StObject.set(x, "focusedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusedDateNull: Self = StObject.set(x, "focusedDate", null)
    
    @scala.inline
    def setFocusedDateUndefined: Self = StObject.set(x, "focusedDate", js.undefined)
    
    @scala.inline
    def setHorizontalMonthPadding(value: Double): Self = StObject.set(x, "horizontalMonthPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalMonthPaddingUndefined: Self = StObject.set(x, "horizontalMonthPadding", js.undefined)
    
    @scala.inline
    def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
    
    @scala.inline
    def setModifiers(value: Record[String, ModifiersShape]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    @scala.inline
    def setMonth(value: Moment): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthFormat(value: String): Self = StObject.set(x, "monthFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthFormatUndefined: Self = StObject.set(x, "monthFormat", js.undefined)
    
    @scala.inline
    def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    @scala.inline
    def setOnMonthSelect(value: (/* currentMonth */ Moment, /* newMonthVal */ String) => Unit): Self = StObject.set(x, "onMonthSelect", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnMonthSelectUndefined: Self = StObject.set(x, "onMonthSelect", js.undefined)
    
    @scala.inline
    def setOnYearSelect(value: (/* currentMonth */ Moment, /* newMonthVal */ String) => Unit): Self = StObject.set(x, "onYearSelect", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnYearSelectUndefined: Self = StObject.set(x, "onYearSelect", js.undefined)
    
    @scala.inline
    def setOrientation(value: ScrollableOrientationShape): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setRenderCalendarDay(value: /* props */ CalendarDayShape => ReactNode): Self = StObject.set(x, "renderCalendarDay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderCalendarDayUndefined: Self = StObject.set(x, "renderCalendarDay", js.undefined)
    
    @scala.inline
    def setSetMonthTitleHeight(value: /* captionHeight */ Double => Unit): Self = StObject.set(x, "setMonthTitleHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMonthTitleHeightNull: Self = StObject.set(x, "setMonthTitleHeight", null)
    
    @scala.inline
    def setSetMonthTitleHeightUndefined: Self = StObject.set(x, "setMonthTitleHeight", js.undefined)
    
    @scala.inline
    def setVerticalBorderSpacing(value: Double): Self = StObject.set(x, "verticalBorderSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalBorderSpacingUndefined: Self = StObject.set(x, "verticalBorderSpacing", js.undefined)
  }
}
