package typings.reactCalendar

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.reactCalendar.distCjsSharedTypesMod.CalendarType
import typings.reactCalendar.distCjsSharedTypesMod.OnClickWeekNumberFunc
import typings.reactCalendar.reactCalendarStrings.Arabic
import typings.reactCalendar.reactCalendarStrings.Hebrew
import typings.reactCalendar.reactCalendarStrings.US
import typings.reactCalendar.reactCalendarStrings.`ISO 8601`
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsMonthViewWeekNumbersMod {
  
  object default {
    
    inline def apply(props: WeekNumbersProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-calendar/dist/cjs/MonthView/WeekNumbers", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("react-calendar/dist/cjs/MonthView/WeekNumbers", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-calendar/dist/cjs/MonthView/WeekNumbers", "default.propTypes.activeStartDate")
      @js.native
      def activeStartDate: Validator[js.Date] = js.native
      inline def activeStartDate_=(x: Validator[js.Date]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeStartDate")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/MonthView/WeekNumbers", "default.propTypes.calendarType")
      @js.native
      def calendarType: Requireable[Arabic | Hebrew | (`ISO 8601`) | US] = js.native
      inline def calendarType_=(x: Requireable[Arabic | Hebrew | (`ISO 8601`) | US]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("calendarType")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/MonthView/WeekNumbers", "default.propTypes.onClickWeekNumber")
      @js.native
      def onClickWeekNumber: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onClickWeekNumber_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClickWeekNumber")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/MonthView/WeekNumbers", "default.propTypes.onMouseLeave")
      @js.native
      def onMouseLeave: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onMouseLeave_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/MonthView/WeekNumbers", "default.propTypes.showFixedNumberOfWeeks")
      @js.native
      def showFixedNumberOfWeeks: Requireable[Boolean] = js.native
      inline def showFixedNumberOfWeeks_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showFixedNumberOfWeeks")(x.asInstanceOf[js.Any])
    }
  }
  
  trait WeekNumbersProps extends StObject {
    
    var activeStartDate: js.Date
    
    var calendarType: CalendarType
    
    var onClickWeekNumber: js.UndefOr[OnClickWeekNumberFunc] = js.undefined
    
    var onMouseLeave: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var showFixedNumberOfWeeks: js.UndefOr[Boolean] = js.undefined
  }
  object WeekNumbersProps {
    
    inline def apply(activeStartDate: js.Date, calendarType: CalendarType): WeekNumbersProps = {
      val __obj = js.Dynamic.literal(activeStartDate = activeStartDate.asInstanceOf[js.Any], calendarType = calendarType.asInstanceOf[js.Any])
      __obj.asInstanceOf[WeekNumbersProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WeekNumbersProps] (val x: Self) extends AnyVal {
      
      inline def setActiveStartDate(value: js.Date): Self = StObject.set(x, "activeStartDate", value.asInstanceOf[js.Any])
      
      inline def setCalendarType(value: CalendarType): Self = StObject.set(x, "calendarType", value.asInstanceOf[js.Any])
      
      inline def setOnClickWeekNumber(
        value: (/* weekNumber */ Double, /* date */ js.Date, /* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onClickWeekNumber", js.Any.fromFunction3(value))
      
      inline def setOnClickWeekNumberUndefined: Self = StObject.set(x, "onClickWeekNumber", js.undefined)
      
      inline def setOnMouseLeave(value: () => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction0(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setShowFixedNumberOfWeeks(value: Boolean): Self = StObject.set(x, "showFixedNumberOfWeeks", value.asInstanceOf[js.Any])
      
      inline def setShowFixedNumberOfWeeksUndefined: Self = StObject.set(x, "showFixedNumberOfWeeks", js.undefined)
    }
  }
}
