package typings.reactCalendar

import org.scalablytyped.runtime.StringDictionary
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.ComponentProps
import typings.react.mod.global.JSX.Element
import typings.reactCalendar.anon.CurrentMonthIndex
import typings.reactCalendar.anon.TypeofTile
import typings.reactCalendar.reactCalendarStrings.children
import typings.reactCalendar.reactCalendarStrings.formatAbbr
import typings.reactCalendar.reactCalendarStrings.maxDateTransform
import typings.reactCalendar.reactCalendarStrings.minDateTransform
import typings.reactCalendar.reactCalendarStrings.view
import typings.std.NonNullable
import typings.std.Omit
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsMonthViewDayMod {
  
  object default {
    
    inline def apply(param0: DayProps): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-calendar/dist/cjs/MonthView/Day", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("react-calendar/dist/cjs/MonthView/Day", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-calendar/dist/cjs/MonthView/Day", "default.propTypes.activeStartDate")
      @js.native
      def activeStartDate: Validator[js.Date] = js.native
      inline def activeStartDate_=(x: Validator[js.Date]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeStartDate")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/MonthView/Day", "default.propTypes.classes")
      @js.native
      def classes: Validator[js.Array[js.UndefOr[String | Null]]] = js.native
      inline def classes_=(x: Validator[js.Array[js.UndefOr[String | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("classes")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/MonthView/Day", "default.propTypes.currentMonthIndex")
      @js.native
      def currentMonthIndex: Validator[Double] = js.native
      inline def currentMonthIndex_=(x: Validator[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentMonthIndex")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/MonthView/Day", "default.propTypes.date")
      @js.native
      def date: Validator[js.Date] = js.native
      inline def date_=(x: Validator[js.Date]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("date")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/MonthView/Day", "default.propTypes.formatDay")
      @js.native
      def formatDay: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def formatDay_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatDay")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/MonthView/Day", "default.propTypes.formatLongDate")
      @js.native
      def formatLongDate: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def formatLongDate_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatLongDate")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/MonthView/Day", "default.propTypes.locale")
      @js.native
      def locale: Requireable[String] = js.native
      inline def locale_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locale")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/MonthView/Day", "default.propTypes.maxDate")
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
      
      @JSImport("react-calendar/dist/cjs/MonthView/Day", "default.propTypes.minDate")
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
      
      @JSImport("react-calendar/dist/cjs/MonthView/Day", "default.propTypes.onClick")
      @js.native
      def onClick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onClick_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClick")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/MonthView/Day", "default.propTypes.onMouseOver")
      @js.native
      def onMouseOver: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onMouseOver_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseOver")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/MonthView/Day", "default.propTypes.style")
      @js.native
      def style: Requireable[
            StringDictionary[js.UndefOr[(NonNullable[js.UndefOr[String | Double | Null]]) | Null]]
          ] = js.native
      inline def style_=(
        x: Requireable[
              StringDictionary[js.UndefOr[(NonNullable[js.UndefOr[String | Double | Null]]) | Null]]
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("style")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/MonthView/Day", "default.propTypes.tileClassName")
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
      
      @JSImport("react-calendar/dist/cjs/MonthView/Day", "default.propTypes.tileContent")
      @js.native
      def tileContent: Requireable[NonNullable[ReactNodeLike | (js.Function1[/* repeated */ Any, Any])]] = js.native
      inline def tileContent_=(x: Requireable[NonNullable[ReactNodeLike | (js.Function1[/* repeated */ Any, Any])]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tileContent")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/MonthView/Day", "default.propTypes.tileDisabled")
      @js.native
      def tileDisabled: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def tileDisabled_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tileDisabled")(x.asInstanceOf[js.Any])
    }
  }
  
  type DayProps = CurrentMonthIndex & (Omit[
    ComponentProps[TypeofTile], 
    children | formatAbbr | maxDateTransform | minDateTransform | view
  ])
}
