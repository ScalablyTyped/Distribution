package typings.reactCalendar

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.global.JSX.Element
import typings.reactCalendar.anon.ActiveStartDate
import typings.reactCalendar.anon.GoToRangeStartOnSelect
import typings.reactCalendar.distCjsCalendarNavigationMod.NavigationProps
import typings.reactCalendar.distCjsCenturyViewMod.CenturyViewProps
import typings.reactCalendar.distCjsDecadeViewMod.DecadeViewProps
import typings.reactCalendar.distCjsMonthViewMod.MonthViewProps
import typings.reactCalendar.distCjsYearViewMod.YearViewProps
import typings.reactCalendar.reactCalendarStrings.Arabic
import typings.reactCalendar.reactCalendarStrings.Hebrew
import typings.reactCalendar.reactCalendarStrings.US
import typings.reactCalendar.reactCalendarStrings.`ISO 8601`
import typings.std.NonNullable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-calendar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-calendar", JSImport.Default)
  @js.native
  open class default ()
    extends typings.reactCalendar.distCjsCalendarMod.default
  /* static members */
  object default {
    
    @JSImport("react-calendar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-calendar", "default.defaultProps")
    @js.native
    def defaultProps: GoToRangeStartOnSelect = js.native
    inline def defaultProps_=(x: GoToRangeStartOnSelect): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-calendar", "default.propTypes")
    @js.native
    def propTypes: ActiveStartDate = js.native
    inline def propTypes_=(x: ActiveStartDate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-calendar", "Calendar")
  @js.native
  open class Calendar ()
    extends typings.reactCalendar.distCjsCalendarMod.default
  /* static members */
  object Calendar {
    
    @JSImport("react-calendar", "Calendar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-calendar", "Calendar.defaultProps")
    @js.native
    def defaultProps: GoToRangeStartOnSelect = js.native
    inline def defaultProps_=(x: GoToRangeStartOnSelect): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-calendar", "Calendar.propTypes")
    @js.native
    def propTypes: ActiveStartDate = js.native
    inline def propTypes_=(x: ActiveStartDate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  inline def CenturyView(props: CenturyViewProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CenturyView")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def DecadeView(props: DecadeViewProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DecadeView")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object MonthView {
    
    inline def apply(props: MonthViewProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-calendar", "MonthView")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("react-calendar", "MonthView.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-calendar", "MonthView.propTypes.activeStartDate")
      @js.native
      def activeStartDate: Validator[js.Date] = js.native
      inline def activeStartDate_=(x: Validator[js.Date]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeStartDate")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar", "MonthView.propTypes.calendarType")
      @js.native
      def calendarType: Requireable[Arabic | Hebrew | (`ISO 8601`) | US] = js.native
      inline def calendarType_=(x: Requireable[Arabic | Hebrew | (`ISO 8601`) | US]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("calendarType")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar", "MonthView.propTypes.formatDay")
      @js.native
      def formatDay: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def formatDay_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatDay")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar", "MonthView.propTypes.formatLongDate")
      @js.native
      def formatLongDate: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def formatLongDate_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatLongDate")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar", "MonthView.propTypes.formatShortWeekday")
      @js.native
      def formatShortWeekday: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def formatShortWeekday_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatShortWeekday")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar", "MonthView.propTypes.formatWeekday")
      @js.native
      def formatWeekday: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def formatWeekday_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatWeekday")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar", "MonthView.propTypes.hover")
      @js.native
      def hover: Requireable[js.Date] = js.native
      inline def hover_=(x: Requireable[js.Date]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hover")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar", "MonthView.propTypes.locale")
      @js.native
      def locale: Requireable[String] = js.native
      inline def locale_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locale")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar", "MonthView.propTypes.maxDate")
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
      
      @JSImport("react-calendar", "MonthView.propTypes.minDate")
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
      
      @JSImport("react-calendar", "MonthView.propTypes.onClick")
      @js.native
      def onClick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("react-calendar", "MonthView.propTypes.onClickWeekNumber")
      @js.native
      def onClickWeekNumber: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onClickWeekNumber_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClickWeekNumber")(x.asInstanceOf[js.Any])
      
      inline def onClick_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClick")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar", "MonthView.propTypes.onMouseLeave")
      @js.native
      def onMouseLeave: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onMouseLeave_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar", "MonthView.propTypes.onMouseOver")
      @js.native
      def onMouseOver: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onMouseOver_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseOver")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar", "MonthView.propTypes.showFixedNumberOfWeeks")
      @js.native
      def showFixedNumberOfWeeks: Requireable[Boolean] = js.native
      inline def showFixedNumberOfWeeks_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showFixedNumberOfWeeks")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar", "MonthView.propTypes.showNeighboringMonth")
      @js.native
      def showNeighboringMonth: Requireable[Boolean] = js.native
      inline def showNeighboringMonth_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showNeighboringMonth")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar", "MonthView.propTypes.showWeekNumbers")
      @js.native
      def showWeekNumbers: Requireable[Boolean] = js.native
      inline def showWeekNumbers_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showWeekNumbers")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar", "MonthView.propTypes.tileClassName")
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
      
      @JSImport("react-calendar", "MonthView.propTypes.tileContent")
      @js.native
      def tileContent: Requireable[NonNullable[ReactNodeLike | (js.Function1[/* repeated */ Any, Any])]] = js.native
      inline def tileContent_=(x: Requireable[NonNullable[ReactNodeLike | (js.Function1[/* repeated */ Any, Any])]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tileContent")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar", "MonthView.propTypes.value")
      @js.native
      def value: Requireable[NonNullable[js.UndefOr[js.Date | (js.Array[js.UndefOr[js.Date | Null]]) | Null]]] = js.native
      
      @JSImport("react-calendar", "MonthView.propTypes.valueType")
      @js.native
      def valueType: Requireable[String] = js.native
      inline def valueType_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("valueType")(x.asInstanceOf[js.Any])
      
      inline def value_=(x: Requireable[NonNullable[js.UndefOr[js.Date | (js.Array[js.UndefOr[js.Date | Null]]) | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
    }
  }
  
  object Navigation {
    
    inline def apply(param0: NavigationProps): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-calendar", "Navigation")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("react-calendar", "Navigation.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-calendar", "Navigation.propTypes.activeStartDate")
      @js.native
      def activeStartDate: Validator[js.Date] = js.native
      inline def activeStartDate_=(x: Validator[js.Date]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeStartDate")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar", "Navigation.propTypes.drillUp")
      @js.native
      def drillUp: Validator[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def drillUp_=(x: Validator[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("drillUp")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar", "Navigation.propTypes.formatMonthYear")
      @js.native
      def formatMonthYear: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def formatMonthYear_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatMonthYear")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar", "Navigation.propTypes.formatYear")
      @js.native
      def formatYear: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def formatYear_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatYear")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar", "Navigation.propTypes.locale")
      @js.native
      def locale: Requireable[String] = js.native
      inline def locale_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locale")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar", "Navigation.propTypes.maxDate")
      @js.native
      def maxDate: Requireable[js.Date] = js.native
      inline def maxDate_=(x: Requireable[js.Date]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar", "Navigation.propTypes.minDate")
      @js.native
      def minDate: Requireable[js.Date] = js.native
      inline def minDate_=(x: Requireable[js.Date]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minDate")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar", "Navigation.propTypes.navigationAriaLabel")
      @js.native
      def navigationAriaLabel: Requireable[String] = js.native
      inline def navigationAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navigationAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar", "Navigation.propTypes.navigationAriaLive")
      @js.native
      def navigationAriaLive: Requireable[String] = js.native
      inline def navigationAriaLive_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navigationAriaLive")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar", "Navigation.propTypes.navigationLabel")
      @js.native
      def navigationLabel: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def navigationLabel_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navigationLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar", "Navigation.propTypes.next2AriaLabel")
      @js.native
      def next2AriaLabel: Requireable[String] = js.native
      inline def next2AriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("next2AriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar", "Navigation.propTypes.next2Label")
      @js.native
      def next2Label: Requireable[ReactNodeLike] = js.native
      inline def next2Label_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("next2Label")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar", "Navigation.propTypes.nextAriaLabel")
      @js.native
      def nextAriaLabel: Requireable[String] = js.native
      inline def nextAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nextAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar", "Navigation.propTypes.nextLabel")
      @js.native
      def nextLabel: Requireable[ReactNodeLike] = js.native
      inline def nextLabel_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nextLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar", "Navigation.propTypes.prev2AriaLabel")
      @js.native
      def prev2AriaLabel: Requireable[String] = js.native
      inline def prev2AriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prev2AriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar", "Navigation.propTypes.prev2Label")
      @js.native
      def prev2Label: Requireable[ReactNodeLike] = js.native
      inline def prev2Label_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prev2Label")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar", "Navigation.propTypes.prevAriaLabel")
      @js.native
      def prevAriaLabel: Requireable[String] = js.native
      inline def prevAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prevAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar", "Navigation.propTypes.prevLabel")
      @js.native
      def prevLabel: Requireable[ReactNodeLike] = js.native
      inline def prevLabel_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prevLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar", "Navigation.propTypes.setActiveStartDate")
      @js.native
      def setActiveStartDate: Validator[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def setActiveStartDate_=(x: Validator[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setActiveStartDate")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar", "Navigation.propTypes.showDoubleView")
      @js.native
      def showDoubleView: Requireable[Boolean] = js.native
      inline def showDoubleView_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showDoubleView")(x.asInstanceOf[js.Any])
      
      inline def view(props: Record[String, Any], propName: String, componentName: String): js.Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("view")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
      
      @JSImport("react-calendar", "Navigation.propTypes.views")
      @js.native
      def views: Validator[js.Array[js.UndefOr[String | Null]]] = js.native
      inline def views_=(x: Validator[js.Array[js.UndefOr[String | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("views")(x.asInstanceOf[js.Any])
    }
  }
  
  inline def YearView(props: YearViewProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("YearView")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
