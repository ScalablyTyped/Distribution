package typings.reactCalendar

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.ComponentProps
import typings.react.mod.global.JSX.Element
import typings.reactCalendar.anon.ShowWeekNumbers
import typings.reactCalendar.anon.TypeofDays
import typings.reactCalendar.anon.TypeofWeekdays
import typings.reactCalendar.reactCalendarStrings.Arabic
import typings.reactCalendar.reactCalendarStrings.Hebrew
import typings.reactCalendar.reactCalendarStrings.US
import typings.reactCalendar.reactCalendarStrings.`ISO 8601`
import typings.std.NonNullable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsMonthViewMod {
  
  object default {
    
    inline def apply(props: MonthViewProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-calendar/dist/cjs/MonthView", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("react-calendar/dist/cjs/MonthView", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-calendar/dist/cjs/MonthView", "default.propTypes.activeStartDate")
      @js.native
      def activeStartDate: Validator[js.Date] = js.native
      inline def activeStartDate_=(x: Validator[js.Date]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeStartDate")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/MonthView", "default.propTypes.calendarType")
      @js.native
      def calendarType: Requireable[Arabic | Hebrew | (`ISO 8601`) | US] = js.native
      inline def calendarType_=(x: Requireable[Arabic | Hebrew | (`ISO 8601`) | US]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("calendarType")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/MonthView", "default.propTypes.formatDay")
      @js.native
      def formatDay: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def formatDay_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatDay")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/MonthView", "default.propTypes.formatLongDate")
      @js.native
      def formatLongDate: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def formatLongDate_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatLongDate")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/MonthView", "default.propTypes.formatShortWeekday")
      @js.native
      def formatShortWeekday: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def formatShortWeekday_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatShortWeekday")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/MonthView", "default.propTypes.formatWeekday")
      @js.native
      def formatWeekday: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def formatWeekday_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatWeekday")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/MonthView", "default.propTypes.hover")
      @js.native
      def hover: Requireable[js.Date] = js.native
      inline def hover_=(x: Requireable[js.Date]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hover")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/MonthView", "default.propTypes.locale")
      @js.native
      def locale: Requireable[String] = js.native
      inline def locale_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locale")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/MonthView", "default.propTypes.maxDate")
      @js.native
      def maxDate: js.Function3[
            /* props */ Record[String, Any], 
            /* propName */ String, 
            /* componentName */ String, 
            js.Error | Null
          ] = js.native
      inline def maxDate_=(
        x: js.Function3[
              /* props */ Record[String, Any], 
              /* propName */ String, 
              /* componentName */ String, 
              js.Error | Null
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/MonthView", "default.propTypes.minDate")
      @js.native
      def minDate: js.Function3[
            /* props */ Record[String, Any], 
            /* propName */ String, 
            /* componentName */ String, 
            js.Error | Null
          ] = js.native
      inline def minDate_=(
        x: js.Function3[
              /* props */ Record[String, Any], 
              /* propName */ String, 
              /* componentName */ String, 
              js.Error | Null
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minDate")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/MonthView", "default.propTypes.onClick")
      @js.native
      def onClick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("react-calendar/dist/cjs/MonthView", "default.propTypes.onClickWeekNumber")
      @js.native
      def onClickWeekNumber: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onClickWeekNumber_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClickWeekNumber")(x.asInstanceOf[js.Any])
      
      inline def onClick_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClick")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/MonthView", "default.propTypes.onMouseLeave")
      @js.native
      def onMouseLeave: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onMouseLeave_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/MonthView", "default.propTypes.onMouseOver")
      @js.native
      def onMouseOver: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onMouseOver_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseOver")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/MonthView", "default.propTypes.showFixedNumberOfWeeks")
      @js.native
      def showFixedNumberOfWeeks: Requireable[Boolean] = js.native
      inline def showFixedNumberOfWeeks_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showFixedNumberOfWeeks")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/MonthView", "default.propTypes.showNeighboringMonth")
      @js.native
      def showNeighboringMonth: Requireable[Boolean] = js.native
      inline def showNeighboringMonth_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showNeighboringMonth")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/MonthView", "default.propTypes.showWeekNumbers")
      @js.native
      def showWeekNumbers: Requireable[Boolean] = js.native
      inline def showWeekNumbers_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showWeekNumbers")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/MonthView", "default.propTypes.tileClassName")
      @js.native
      def tileClassName: Requireable[
            NonNullable[
              js.UndefOr[
                (js.Function1[/* repeated */ Any, Any]) | (NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]) | Null
              ]
            ]
          ] = js.native
      inline def tileClassName_=(
        x: Requireable[
              NonNullable[
                js.UndefOr[
                  (js.Function1[/* repeated */ Any, Any]) | (NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]) | Null
                ]
              ]
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tileClassName")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/MonthView", "default.propTypes.tileContent")
      @js.native
      def tileContent: Requireable[NonNullable[ReactNodeLike | (js.Function1[/* repeated */ Any, Any])]] = js.native
      inline def tileContent_=(x: Requireable[NonNullable[ReactNodeLike | (js.Function1[/* repeated */ Any, Any])]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tileContent")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/MonthView", "default.propTypes.value")
      @js.native
      def value: Requireable[NonNullable[js.UndefOr[js.Date | (js.Array[js.UndefOr[js.Date | Null]]) | Null]]] = js.native
      
      @JSImport("react-calendar/dist/cjs/MonthView", "default.propTypes.valueType")
      @js.native
      def valueType: Requireable[String] = js.native
      inline def valueType_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("valueType")(x.asInstanceOf[js.Any])
      
      inline def value_=(x: Requireable[NonNullable[js.UndefOr[js.Date | (js.Array[js.UndefOr[js.Date | Null]]) | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
    }
  }
  
  type MonthViewProps = ShowWeekNumbers & ComponentProps[TypeofWeekdays] & ComponentProps[TypeofDays]
}
