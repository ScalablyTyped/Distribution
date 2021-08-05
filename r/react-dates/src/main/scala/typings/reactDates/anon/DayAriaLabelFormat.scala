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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DayAriaLabelFormat extends StObject {
  
  var dayAriaLabelFormat: js.UndefOr[String] = js.undefined
  
  var enableOutsideDays: js.UndefOr[Boolean] = js.undefined
  
  var firstDayOfWeek: js.UndefOr[DayOfWeekShape | Null] = js.undefined
  
  var focusedDate: js.UndefOr[Moment | Null] = js.undefined
  
  var horizontalMonthPadding: js.UndefOr[Double] = js.undefined
  
  var isVisible: js.UndefOr[Boolean] = js.undefined
  
  var modifiers: js.UndefOr[Record[String, ModifiersShape]] = js.undefined
  
  var month: js.UndefOr[Moment] = js.undefined
  
  // indicates focusable day
  // i18n
  var monthFormat: js.UndefOr[String] = js.undefined
  
  var onMonthSelect: js.UndefOr[js.Function2[/* currentMonth */ Moment, /* newMonthVal */ String, Unit]] = js.undefined
  
  var onYearSelect: js.UndefOr[js.Function2[/* currentMonth */ Moment, /* newMonthVal */ String, Unit]] = js.undefined
  
  var orientation: js.UndefOr[ScrollableOrientationShape] = js.undefined
  
  var renderCalendarDay: js.UndefOr[js.Function1[/* props */ CalendarDayShape, ReactNode]] = js.undefined
  
  var setMonthTitleHeight: js.UndefOr[(js.Function1[/* captionHeight */ Double, Unit]) | Null] = js.undefined
  
  var verticalBorderSpacing: js.UndefOr[Double] = js.undefined
}
object DayAriaLabelFormat {
  
  inline def apply(): DayAriaLabelFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DayAriaLabelFormat]
  }
  
  extension [Self <: DayAriaLabelFormat](x: Self) {
    
    inline def setDayAriaLabelFormat(value: String): Self = StObject.set(x, "dayAriaLabelFormat", value.asInstanceOf[js.Any])
    
    inline def setDayAriaLabelFormatUndefined: Self = StObject.set(x, "dayAriaLabelFormat", js.undefined)
    
    inline def setEnableOutsideDays(value: Boolean): Self = StObject.set(x, "enableOutsideDays", value.asInstanceOf[js.Any])
    
    inline def setEnableOutsideDaysUndefined: Self = StObject.set(x, "enableOutsideDays", js.undefined)
    
    inline def setFirstDayOfWeek(value: DayOfWeekShape): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setFirstDayOfWeekNull: Self = StObject.set(x, "firstDayOfWeek", null)
    
    inline def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
    
    inline def setFocusedDate(value: Moment): Self = StObject.set(x, "focusedDate", value.asInstanceOf[js.Any])
    
    inline def setFocusedDateNull: Self = StObject.set(x, "focusedDate", null)
    
    inline def setFocusedDateUndefined: Self = StObject.set(x, "focusedDate", js.undefined)
    
    inline def setHorizontalMonthPadding(value: Double): Self = StObject.set(x, "horizontalMonthPadding", value.asInstanceOf[js.Any])
    
    inline def setHorizontalMonthPaddingUndefined: Self = StObject.set(x, "horizontalMonthPadding", js.undefined)
    
    inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    inline def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
    
    inline def setModifiers(value: Record[String, ModifiersShape]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    inline def setMonth(value: Moment): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setMonthFormat(value: String): Self = StObject.set(x, "monthFormat", value.asInstanceOf[js.Any])
    
    inline def setMonthFormatUndefined: Self = StObject.set(x, "monthFormat", js.undefined)
    
    inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    inline def setOnMonthSelect(value: (/* currentMonth */ Moment, /* newMonthVal */ String) => Unit): Self = StObject.set(x, "onMonthSelect", js.Any.fromFunction2(value))
    
    inline def setOnMonthSelectUndefined: Self = StObject.set(x, "onMonthSelect", js.undefined)
    
    inline def setOnYearSelect(value: (/* currentMonth */ Moment, /* newMonthVal */ String) => Unit): Self = StObject.set(x, "onYearSelect", js.Any.fromFunction2(value))
    
    inline def setOnYearSelectUndefined: Self = StObject.set(x, "onYearSelect", js.undefined)
    
    inline def setOrientation(value: ScrollableOrientationShape): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setRenderCalendarDay(value: /* props */ CalendarDayShape => ReactNode): Self = StObject.set(x, "renderCalendarDay", js.Any.fromFunction1(value))
    
    inline def setRenderCalendarDayUndefined: Self = StObject.set(x, "renderCalendarDay", js.undefined)
    
    inline def setSetMonthTitleHeight(value: /* captionHeight */ Double => Unit): Self = StObject.set(x, "setMonthTitleHeight", js.Any.fromFunction1(value))
    
    inline def setSetMonthTitleHeightNull: Self = StObject.set(x, "setMonthTitleHeight", null)
    
    inline def setSetMonthTitleHeightUndefined: Self = StObject.set(x, "setMonthTitleHeight", js.undefined)
    
    inline def setVerticalBorderSpacing(value: Double): Self = StObject.set(x, "verticalBorderSpacing", value.asInstanceOf[js.Any])
    
    inline def setVerticalBorderSpacingUndefined: Self = StObject.set(x, "verticalBorderSpacing", js.undefined)
  }
}
