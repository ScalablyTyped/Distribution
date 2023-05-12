package typings.reactCalendar

import org.scalablytyped.runtime.StringDictionary
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.ComponentProps
import typings.react.mod.global.JSX.Element
import typings.reactCalendar.anon.FormatMonth
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

object distCjsYearViewMonthMod {
  
  object default {
    
    inline def apply(param0: MonthProps): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-calendar/dist/cjs/YearView/Month", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("react-calendar/dist/cjs/YearView/Month", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-calendar/dist/cjs/YearView/Month", "default.propTypes.activeStartDate")
      @js.native
      def activeStartDate: Validator[js.Date] = js.native
      inline def activeStartDate_=(x: Validator[js.Date]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeStartDate")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/YearView/Month", "default.propTypes.classes")
      @js.native
      def classes: Validator[js.Array[js.UndefOr[String | Null]]] = js.native
      inline def classes_=(x: Validator[js.Array[js.UndefOr[String | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("classes")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/YearView/Month", "default.propTypes.date")
      @js.native
      def date: Validator[js.Date] = js.native
      inline def date_=(x: Validator[js.Date]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("date")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/YearView/Month", "default.propTypes.formatMonth")
      @js.native
      def formatMonth: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("react-calendar/dist/cjs/YearView/Month", "default.propTypes.formatMonthYear")
      @js.native
      def formatMonthYear: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def formatMonthYear_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatMonthYear")(x.asInstanceOf[js.Any])
      
      inline def formatMonth_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatMonth")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/YearView/Month", "default.propTypes.locale")
      @js.native
      def locale: Requireable[String] = js.native
      inline def locale_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locale")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/YearView/Month", "default.propTypes.maxDate")
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
      
      @JSImport("react-calendar/dist/cjs/YearView/Month", "default.propTypes.minDate")
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
      
      @JSImport("react-calendar/dist/cjs/YearView/Month", "default.propTypes.onClick")
      @js.native
      def onClick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onClick_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClick")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/YearView/Month", "default.propTypes.onMouseOver")
      @js.native
      def onMouseOver: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onMouseOver_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseOver")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/YearView/Month", "default.propTypes.style")
      @js.native
      def style: Requireable[
            StringDictionary[js.UndefOr[(NonNullable[js.UndefOr[String | Double | Null]]) | Null]]
          ] = js.native
      inline def style_=(
        x: Requireable[
              StringDictionary[js.UndefOr[(NonNullable[js.UndefOr[String | Double | Null]]) | Null]]
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("style")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/YearView/Month", "default.propTypes.tileClassName")
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
      
      @JSImport("react-calendar/dist/cjs/YearView/Month", "default.propTypes.tileContent")
      @js.native
      def tileContent: Requireable[NonNullable[ReactNodeLike | (js.Function1[/* repeated */ Any, Any])]] = js.native
      inline def tileContent_=(x: Requireable[NonNullable[ReactNodeLike | (js.Function1[/* repeated */ Any, Any])]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tileContent")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/YearView/Month", "default.propTypes.tileDisabled")
      @js.native
      def tileDisabled: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def tileDisabled_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tileDisabled")(x.asInstanceOf[js.Any])
    }
  }
  
  type MonthProps = FormatMonth & (Omit[
    ComponentProps[TypeofTile], 
    children | formatAbbr | maxDateTransform | minDateTransform | view
  ])
}
