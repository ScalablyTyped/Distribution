package typings.reactCalendar

import typings.propTypes.mod.Requireable
import typings.react.mod.global.JSX.Element
import typings.reactCalendar.distCjsSharedTypesMod.CalendarType
import typings.reactCalendar.reactCalendarStrings.Arabic
import typings.reactCalendar.reactCalendarStrings.Hebrew
import typings.reactCalendar.reactCalendarStrings.US
import typings.reactCalendar.reactCalendarStrings.`ISO 8601`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsMonthViewWeekdaysMod {
  
  object default {
    
    inline def apply(props: WeekdaysProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-calendar/dist/cjs/MonthView/Weekdays", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("react-calendar/dist/cjs/MonthView/Weekdays", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-calendar/dist/cjs/MonthView/Weekdays", "default.propTypes.calendarType")
      @js.native
      def calendarType: Requireable[Arabic | Hebrew | (`ISO 8601`) | US] = js.native
      inline def calendarType_=(x: Requireable[Arabic | Hebrew | (`ISO 8601`) | US]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("calendarType")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/MonthView/Weekdays", "default.propTypes.formatShortWeekday")
      @js.native
      def formatShortWeekday: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def formatShortWeekday_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatShortWeekday")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/MonthView/Weekdays", "default.propTypes.formatWeekday")
      @js.native
      def formatWeekday: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def formatWeekday_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatWeekday")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/MonthView/Weekdays", "default.propTypes.locale")
      @js.native
      def locale: Requireable[String] = js.native
      inline def locale_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locale")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/MonthView/Weekdays", "default.propTypes.onMouseLeave")
      @js.native
      def onMouseLeave: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onMouseLeave_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(x.asInstanceOf[js.Any])
    }
  }
  
  trait WeekdaysProps extends StObject {
    
    var calendarType: CalendarType
    
    var formatShortWeekday: js.UndefOr[js.Function2[/* locale */ js.UndefOr[String], /* date */ js.Date, String]] = js.undefined
    
    var formatWeekday: js.UndefOr[js.Function2[/* locale */ js.UndefOr[String], /* date */ js.Date, String]] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var onMouseLeave: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object WeekdaysProps {
    
    inline def apply(calendarType: CalendarType): WeekdaysProps = {
      val __obj = js.Dynamic.literal(calendarType = calendarType.asInstanceOf[js.Any])
      __obj.asInstanceOf[WeekdaysProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WeekdaysProps] (val x: Self) extends AnyVal {
      
      inline def setCalendarType(value: CalendarType): Self = StObject.set(x, "calendarType", value.asInstanceOf[js.Any])
      
      inline def setFormatShortWeekday(value: (/* locale */ js.UndefOr[String], /* date */ js.Date) => String): Self = StObject.set(x, "formatShortWeekday", js.Any.fromFunction2(value))
      
      inline def setFormatShortWeekdayUndefined: Self = StObject.set(x, "formatShortWeekday", js.undefined)
      
      inline def setFormatWeekday(value: (/* locale */ js.UndefOr[String], /* date */ js.Date) => String): Self = StObject.set(x, "formatWeekday", js.Any.fromFunction2(value))
      
      inline def setFormatWeekdayUndefined: Self = StObject.set(x, "formatWeekday", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setOnMouseLeave(value: () => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction0(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    }
  }
}
