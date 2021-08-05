package typings.reactCalendar

import typings.reactCalendar.anon.CalendarTilePropertiesact
import typings.reactCalendar.reactCalendarStrings.end
import typings.reactCalendar.reactCalendarStrings.range
import typings.reactCalendar.reactCalendarStrings.start
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-calendar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: CalendarProps): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def CenturyView(props: DetailViewProps): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("CenturyView")(props.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def DecadeView(props: DetailViewProps): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("DecadeView")(props.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def MonthView(props: DetailViewProps): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("MonthView")(props.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def YearView(props: DetailViewProps): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("YearView")(props.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  trait CalendarProps extends StObject {
    
    var activeStartDate: js.UndefOr[Date] = js.undefined
    
    var allowPartialRange: js.UndefOr[Boolean] = js.undefined
    
    var calendarType: js.UndefOr[CalendarType] = js.undefined
    
    var className: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var defaultActiveStartDate: js.UndefOr[Date] = js.undefined
    
    var defaultValue: js.UndefOr[Date | js.Array[Date]] = js.undefined
    
    var defaultView: js.UndefOr[Detail] = js.undefined
    
    var formatLongDate: js.UndefOr[FormatterCallback] = js.undefined
    
    var formatMonth: js.UndefOr[FormatterCallback] = js.undefined
    
    var formatMonthYear: js.UndefOr[FormatterCallback] = js.undefined
    
    var formatShortWeekday: js.UndefOr[FormatterCallback] = js.undefined
    
    var formatYear: js.UndefOr[FormatterCallback] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var maxDate: js.UndefOr[Date] = js.undefined
    
    var maxDetail: js.UndefOr[Detail] = js.undefined
    
    var minDate: js.UndefOr[Date] = js.undefined
    
    var minDetail: js.UndefOr[Detail] = js.undefined
    
    var navigationAriaLabel: js.UndefOr[String] = js.undefined
    
    var navigationLabel: js.UndefOr[
        js.Function1[
          /* props */ typings.reactCalendar.anon.Date, 
          String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any) | Null
        ]
      ] = js.undefined
    
    var next2AriaLabel: js.UndefOr[String] = js.undefined
    
    var next2Label: js.UndefOr[
        String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any) | Null
      ] = js.undefined
    
    var nextAriaLabel: js.UndefOr[String] = js.undefined
    
    var nextLabel: js.UndefOr[
        String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any)
      ] = js.undefined
    
    var onActiveStartDateChange: js.UndefOr[ViewCallback] = js.undefined
    
    var onChange: js.UndefOr[OnChangeDateCallback] = js.undefined
    
    var onClickDay: js.UndefOr[DateCallback] = js.undefined
    
    var onClickDecade: js.UndefOr[DateCallback] = js.undefined
    
    var onClickMonth: js.UndefOr[DateCallback] = js.undefined
    
    var onClickWeekNumber: js.UndefOr[ClickWeekNumberCallback] = js.undefined
    
    var onClickYear: js.UndefOr[DateCallback] = js.undefined
    
    var onDrillDown: js.UndefOr[ViewCallback] = js.undefined
    
    var onDrillUp: js.UndefOr[ViewCallback] = js.undefined
    
    var onViewChange: js.UndefOr[ViewCallback] = js.undefined
    
    var prev2AriaLabel: js.UndefOr[String] = js.undefined
    
    var prev2Label: js.UndefOr[
        String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any) | Null
      ] = js.undefined
    
    var prevAriaLabel: js.UndefOr[String] = js.undefined
    
    var prevLabel: js.UndefOr[
        String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any)
      ] = js.undefined
    
    var renderChildren: js.UndefOr[
        js.Function1[
          /* props */ CalendarTileProperties, 
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any) | Null
        ]
      ] = js.undefined
    
    // For backwards compatibility
    var returnValue: js.UndefOr[start | end | range] = js.undefined
    
    var selectRange: js.UndefOr[Boolean] = js.undefined
    
    var showDoubleView: js.UndefOr[Boolean] = js.undefined
    
    var showFixedNumberOfWeeks: js.UndefOr[Boolean] = js.undefined
    
    var showNavigation: js.UndefOr[Boolean] = js.undefined
    
    var showNeighboringMonth: js.UndefOr[Boolean] = js.undefined
    
    var showWeekNumbers: js.UndefOr[Boolean] = js.undefined
    
    var tileClassName: js.UndefOr[
        String | js.Array[String] | (js.Function1[/* props */ CalendarTileProperties, String | js.Array[String] | Null])
      ] = js.undefined
    
    var tileContent: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any) | (js.Function1[
          /* props */ CalendarTileProperties, 
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any) | Null
        ])
      ] = js.undefined
    
    var tileDisabled: js.UndefOr[js.Function1[/* props */ CalendarTilePropertiesact, Boolean]] = js.undefined
    
    var value: js.UndefOr[Date | js.Array[Date] | Null] = js.undefined
    
    var view: js.UndefOr[Detail] = js.undefined
  }
  object CalendarProps {
    
    inline def apply(): CalendarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CalendarProps]
    }
    
    extension [Self <: CalendarProps](x: Self) {
      
      inline def setActiveStartDate(value: Date): Self = StObject.set(x, "activeStartDate", value.asInstanceOf[js.Any])
      
      inline def setActiveStartDateUndefined: Self = StObject.set(x, "activeStartDate", js.undefined)
      
      inline def setAllowPartialRange(value: Boolean): Self = StObject.set(x, "allowPartialRange", value.asInstanceOf[js.Any])
      
      inline def setAllowPartialRangeUndefined: Self = StObject.set(x, "allowPartialRange", js.undefined)
      
      inline def setCalendarType(value: CalendarType): Self = StObject.set(x, "calendarType", value.asInstanceOf[js.Any])
      
      inline def setCalendarTypeUndefined: Self = StObject.set(x, "calendarType", js.undefined)
      
      inline def setClassName(value: String | js.Array[String]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClassNameVarargs(value: String*): Self = StObject.set(x, "className", js.Array(value :_*))
      
      inline def setDefaultActiveStartDate(value: Date): Self = StObject.set(x, "defaultActiveStartDate", value.asInstanceOf[js.Any])
      
      inline def setDefaultActiveStartDateUndefined: Self = StObject.set(x, "defaultActiveStartDate", js.undefined)
      
      inline def setDefaultValue(value: Date | js.Array[Date]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: Date*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      inline def setDefaultView(value: Detail): Self = StObject.set(x, "defaultView", value.asInstanceOf[js.Any])
      
      inline def setDefaultViewUndefined: Self = StObject.set(x, "defaultView", js.undefined)
      
      inline def setFormatLongDate(value: (/* locale */ String, /* date */ Date) => String): Self = StObject.set(x, "formatLongDate", js.Any.fromFunction2(value))
      
      inline def setFormatLongDateUndefined: Self = StObject.set(x, "formatLongDate", js.undefined)
      
      inline def setFormatMonth(value: (/* locale */ String, /* date */ Date) => String): Self = StObject.set(x, "formatMonth", js.Any.fromFunction2(value))
      
      inline def setFormatMonthUndefined: Self = StObject.set(x, "formatMonth", js.undefined)
      
      inline def setFormatMonthYear(value: (/* locale */ String, /* date */ Date) => String): Self = StObject.set(x, "formatMonthYear", js.Any.fromFunction2(value))
      
      inline def setFormatMonthYearUndefined: Self = StObject.set(x, "formatMonthYear", js.undefined)
      
      inline def setFormatShortWeekday(value: (/* locale */ String, /* date */ Date) => String): Self = StObject.set(x, "formatShortWeekday", js.Any.fromFunction2(value))
      
      inline def setFormatShortWeekdayUndefined: Self = StObject.set(x, "formatShortWeekday", js.undefined)
      
      inline def setFormatYear(value: (/* locale */ String, /* date */ Date) => String): Self = StObject.set(x, "formatYear", js.Any.fromFunction2(value))
      
      inline def setFormatYearUndefined: Self = StObject.set(x, "formatYear", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaxDate(value: Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMaxDetail(value: Detail): Self = StObject.set(x, "maxDetail", value.asInstanceOf[js.Any])
      
      inline def setMaxDetailUndefined: Self = StObject.set(x, "maxDetail", js.undefined)
      
      inline def setMinDate(value: Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setMinDetail(value: Detail): Self = StObject.set(x, "minDetail", value.asInstanceOf[js.Any])
      
      inline def setMinDetailUndefined: Self = StObject.set(x, "minDetail", js.undefined)
      
      inline def setNavigationAriaLabel(value: String): Self = StObject.set(x, "navigationAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setNavigationAriaLabelUndefined: Self = StObject.set(x, "navigationAriaLabel", js.undefined)
      
      inline def setNavigationLabel(
        value: /* props */ typings.reactCalendar.anon.Date => String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any) | Null
      ): Self = StObject.set(x, "navigationLabel", js.Any.fromFunction1(value))
      
      inline def setNavigationLabelUndefined: Self = StObject.set(x, "navigationLabel", js.undefined)
      
      inline def setNext2AriaLabel(value: String): Self = StObject.set(x, "next2AriaLabel", value.asInstanceOf[js.Any])
      
      inline def setNext2AriaLabelUndefined: Self = StObject.set(x, "next2AriaLabel", js.undefined)
      
      inline def setNext2Label(
        value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any)
      ): Self = StObject.set(x, "next2Label", value.asInstanceOf[js.Any])
      
      inline def setNext2LabelNull: Self = StObject.set(x, "next2Label", null)
      
      inline def setNext2LabelUndefined: Self = StObject.set(x, "next2Label", js.undefined)
      
      inline def setNextAriaLabel(value: String): Self = StObject.set(x, "nextAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setNextAriaLabelUndefined: Self = StObject.set(x, "nextAriaLabel", js.undefined)
      
      inline def setNextLabel(
        value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any)
      ): Self = StObject.set(x, "nextLabel", value.asInstanceOf[js.Any])
      
      inline def setNextLabelUndefined: Self = StObject.set(x, "nextLabel", js.undefined)
      
      inline def setOnActiveStartDateChange(value: /* props */ ViewCallbackProperties => Unit): Self = StObject.set(x, "onActiveStartDateChange", js.Any.fromFunction1(value))
      
      inline def setOnActiveStartDateChangeUndefined: Self = StObject.set(x, "onActiveStartDateChange", js.undefined)
      
      inline def setOnChange(value: /* date */ Date | js.Array[Date] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClickDay(value: /* date */ Date => Unit): Self = StObject.set(x, "onClickDay", js.Any.fromFunction1(value))
      
      inline def setOnClickDayUndefined: Self = StObject.set(x, "onClickDay", js.undefined)
      
      inline def setOnClickDecade(value: /* date */ Date => Unit): Self = StObject.set(x, "onClickDecade", js.Any.fromFunction1(value))
      
      inline def setOnClickDecadeUndefined: Self = StObject.set(x, "onClickDecade", js.undefined)
      
      inline def setOnClickMonth(value: /* date */ Date => Unit): Self = StObject.set(x, "onClickMonth", js.Any.fromFunction1(value))
      
      inline def setOnClickMonthUndefined: Self = StObject.set(x, "onClickMonth", js.undefined)
      
      inline def setOnClickWeekNumber(value: (/* weekNumber */ Double, /* date */ Date) => Unit): Self = StObject.set(x, "onClickWeekNumber", js.Any.fromFunction2(value))
      
      inline def setOnClickWeekNumberUndefined: Self = StObject.set(x, "onClickWeekNumber", js.undefined)
      
      inline def setOnClickYear(value: /* date */ Date => Unit): Self = StObject.set(x, "onClickYear", js.Any.fromFunction1(value))
      
      inline def setOnClickYearUndefined: Self = StObject.set(x, "onClickYear", js.undefined)
      
      inline def setOnDrillDown(value: /* props */ ViewCallbackProperties => Unit): Self = StObject.set(x, "onDrillDown", js.Any.fromFunction1(value))
      
      inline def setOnDrillDownUndefined: Self = StObject.set(x, "onDrillDown", js.undefined)
      
      inline def setOnDrillUp(value: /* props */ ViewCallbackProperties => Unit): Self = StObject.set(x, "onDrillUp", js.Any.fromFunction1(value))
      
      inline def setOnDrillUpUndefined: Self = StObject.set(x, "onDrillUp", js.undefined)
      
      inline def setOnViewChange(value: /* props */ ViewCallbackProperties => Unit): Self = StObject.set(x, "onViewChange", js.Any.fromFunction1(value))
      
      inline def setOnViewChangeUndefined: Self = StObject.set(x, "onViewChange", js.undefined)
      
      inline def setPrev2AriaLabel(value: String): Self = StObject.set(x, "prev2AriaLabel", value.asInstanceOf[js.Any])
      
      inline def setPrev2AriaLabelUndefined: Self = StObject.set(x, "prev2AriaLabel", js.undefined)
      
      inline def setPrev2Label(
        value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any)
      ): Self = StObject.set(x, "prev2Label", value.asInstanceOf[js.Any])
      
      inline def setPrev2LabelNull: Self = StObject.set(x, "prev2Label", null)
      
      inline def setPrev2LabelUndefined: Self = StObject.set(x, "prev2Label", js.undefined)
      
      inline def setPrevAriaLabel(value: String): Self = StObject.set(x, "prevAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setPrevAriaLabelUndefined: Self = StObject.set(x, "prevAriaLabel", js.undefined)
      
      inline def setPrevLabel(
        value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any)
      ): Self = StObject.set(x, "prevLabel", value.asInstanceOf[js.Any])
      
      inline def setPrevLabelUndefined: Self = StObject.set(x, "prevLabel", js.undefined)
      
      inline def setRenderChildren(
        value: /* props */ CalendarTileProperties => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any) | Null
      ): Self = StObject.set(x, "renderChildren", js.Any.fromFunction1(value))
      
      inline def setRenderChildrenUndefined: Self = StObject.set(x, "renderChildren", js.undefined)
      
      inline def setReturnValue(value: start | end | range): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
      
      inline def setReturnValueUndefined: Self = StObject.set(x, "returnValue", js.undefined)
      
      inline def setSelectRange(value: Boolean): Self = StObject.set(x, "selectRange", value.asInstanceOf[js.Any])
      
      inline def setSelectRangeUndefined: Self = StObject.set(x, "selectRange", js.undefined)
      
      inline def setShowDoubleView(value: Boolean): Self = StObject.set(x, "showDoubleView", value.asInstanceOf[js.Any])
      
      inline def setShowDoubleViewUndefined: Self = StObject.set(x, "showDoubleView", js.undefined)
      
      inline def setShowFixedNumberOfWeeks(value: Boolean): Self = StObject.set(x, "showFixedNumberOfWeeks", value.asInstanceOf[js.Any])
      
      inline def setShowFixedNumberOfWeeksUndefined: Self = StObject.set(x, "showFixedNumberOfWeeks", js.undefined)
      
      inline def setShowNavigation(value: Boolean): Self = StObject.set(x, "showNavigation", value.asInstanceOf[js.Any])
      
      inline def setShowNavigationUndefined: Self = StObject.set(x, "showNavigation", js.undefined)
      
      inline def setShowNeighboringMonth(value: Boolean): Self = StObject.set(x, "showNeighboringMonth", value.asInstanceOf[js.Any])
      
      inline def setShowNeighboringMonthUndefined: Self = StObject.set(x, "showNeighboringMonth", js.undefined)
      
      inline def setShowWeekNumbers(value: Boolean): Self = StObject.set(x, "showWeekNumbers", value.asInstanceOf[js.Any])
      
      inline def setShowWeekNumbersUndefined: Self = StObject.set(x, "showWeekNumbers", js.undefined)
      
      inline def setTileClassName(
        value: String | js.Array[String] | (js.Function1[/* props */ CalendarTileProperties, String | js.Array[String] | Null])
      ): Self = StObject.set(x, "tileClassName", value.asInstanceOf[js.Any])
      
      inline def setTileClassNameFunction1(value: /* props */ CalendarTileProperties => String | js.Array[String] | Null): Self = StObject.set(x, "tileClassName", js.Any.fromFunction1(value))
      
      inline def setTileClassNameUndefined: Self = StObject.set(x, "tileClassName", js.undefined)
      
      inline def setTileClassNameVarargs(value: String*): Self = StObject.set(x, "tileClassName", js.Array(value :_*))
      
      inline def setTileContent(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any) | (js.Function1[
              /* props */ CalendarTileProperties, 
              (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any) | Null
            ])
      ): Self = StObject.set(x, "tileContent", value.asInstanceOf[js.Any])
      
      inline def setTileContentFunction1(
        value: /* props */ CalendarTileProperties => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any) | Null
      ): Self = StObject.set(x, "tileContent", js.Any.fromFunction1(value))
      
      inline def setTileContentUndefined: Self = StObject.set(x, "tileContent", js.undefined)
      
      inline def setTileDisabled(value: /* props */ CalendarTilePropertiesact => Boolean): Self = StObject.set(x, "tileDisabled", js.Any.fromFunction1(value))
      
      inline def setTileDisabledUndefined: Self = StObject.set(x, "tileDisabled", js.undefined)
      
      inline def setValue(value: Date | js.Array[Date]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: Date*): Self = StObject.set(x, "value", js.Array(value :_*))
      
      inline def setView(value: Detail): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    }
  }
  
  trait CalendarTileProperties extends StObject {
    
    var activeStartDate: Date
    
    var date: Date
    
    var view: Detail
  }
  object CalendarTileProperties {
    
    inline def apply(activeStartDate: Date, date: Date, view: Detail): CalendarTileProperties = {
      val __obj = js.Dynamic.literal(activeStartDate = activeStartDate.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalendarTileProperties]
    }
    
    extension [Self <: CalendarTileProperties](x: Self) {
      
      inline def setActiveStartDate(value: Date): Self = StObject.set(x, "activeStartDate", value.asInstanceOf[js.Any])
      
      inline def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setView(value: Detail): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactCalendar.reactCalendarStrings.`ISO 8601`
    - typings.reactCalendar.reactCalendarStrings.US
    - typings.reactCalendar.reactCalendarStrings.Arabic
    - typings.reactCalendar.reactCalendarStrings.Hebrew
  */
  trait CalendarType extends StObject
  object CalendarType {
    
    inline def Arabic: typings.reactCalendar.reactCalendarStrings.Arabic = "Arabic".asInstanceOf[typings.reactCalendar.reactCalendarStrings.Arabic]
    
    inline def Hebrew: typings.reactCalendar.reactCalendarStrings.Hebrew = "Hebrew".asInstanceOf[typings.reactCalendar.reactCalendarStrings.Hebrew]
    
    inline def `ISO 8601`: typings.reactCalendar.reactCalendarStrings.`ISO 8601` = ("ISO 8601").asInstanceOf[typings.reactCalendar.reactCalendarStrings.`ISO 8601`]
    
    inline def US: typings.reactCalendar.reactCalendarStrings.US = "US".asInstanceOf[typings.reactCalendar.reactCalendarStrings.US]
  }
  
  type ClickWeekNumberCallback = js.Function2[/* weekNumber */ Double, /* date */ Date, Unit]
  
  type DateCallback = js.Function1[/* date */ Date, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactCalendar.reactCalendarStrings.month
    - typings.reactCalendar.reactCalendarStrings.year
    - typings.reactCalendar.reactCalendarStrings.decade
    - typings.reactCalendar.reactCalendarStrings.century
  */
  trait Detail extends StObject
  object Detail {
    
    inline def century: typings.reactCalendar.reactCalendarStrings.century = "century".asInstanceOf[typings.reactCalendar.reactCalendarStrings.century]
    
    inline def decade: typings.reactCalendar.reactCalendarStrings.decade = "decade".asInstanceOf[typings.reactCalendar.reactCalendarStrings.decade]
    
    inline def month: typings.reactCalendar.reactCalendarStrings.month = "month".asInstanceOf[typings.reactCalendar.reactCalendarStrings.month]
    
    inline def year: typings.reactCalendar.reactCalendarStrings.year = "year".asInstanceOf[typings.reactCalendar.reactCalendarStrings.year]
  }
  
  trait DetailViewProps extends StObject {
    
    var activeStartDate: Date
    
    var calendarType: js.UndefOr[CalendarType] = js.undefined
    
    var hover: js.UndefOr[Date] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var maxDate: js.UndefOr[Date] = js.undefined
    
    var minDate: js.UndefOr[Date] = js.undefined
    
    var onClick: js.UndefOr[DateCallback] = js.undefined
    
    var onMouseOver: js.UndefOr[DateCallback] = js.undefined
    
    var renderChildren: js.UndefOr[
        js.Function1[
          /* props */ CalendarTileProperties, 
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any) | Null
        ]
      ] = js.undefined
    
    // For backwards compatibility
    var tileClassName: js.UndefOr[
        String | js.Array[String] | (js.Function1[/* props */ CalendarTileProperties, String | js.Array[String] | Null])
      ] = js.undefined
    
    var tileContent: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any) | (js.Function1[
          /* props */ CalendarTileProperties, 
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any) | Null
        ])
      ] = js.undefined
    
    var tileDisabled: js.UndefOr[js.Function1[/* props */ CalendarTileProperties, Boolean]] = js.undefined
    
    var value: js.UndefOr[Date | js.Array[Date]] = js.undefined
  }
  object DetailViewProps {
    
    inline def apply(activeStartDate: Date): DetailViewProps = {
      val __obj = js.Dynamic.literal(activeStartDate = activeStartDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[DetailViewProps]
    }
    
    extension [Self <: DetailViewProps](x: Self) {
      
      inline def setActiveStartDate(value: Date): Self = StObject.set(x, "activeStartDate", value.asInstanceOf[js.Any])
      
      inline def setCalendarType(value: CalendarType): Self = StObject.set(x, "calendarType", value.asInstanceOf[js.Any])
      
      inline def setCalendarTypeUndefined: Self = StObject.set(x, "calendarType", js.undefined)
      
      inline def setHover(value: Date): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
      
      inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaxDate(value: Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setOnClick(value: /* date */ Date => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseOver(value: /* date */ Date => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      inline def setRenderChildren(
        value: /* props */ CalendarTileProperties => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any) | Null
      ): Self = StObject.set(x, "renderChildren", js.Any.fromFunction1(value))
      
      inline def setRenderChildrenUndefined: Self = StObject.set(x, "renderChildren", js.undefined)
      
      inline def setTileClassName(
        value: String | js.Array[String] | (js.Function1[/* props */ CalendarTileProperties, String | js.Array[String] | Null])
      ): Self = StObject.set(x, "tileClassName", value.asInstanceOf[js.Any])
      
      inline def setTileClassNameFunction1(value: /* props */ CalendarTileProperties => String | js.Array[String] | Null): Self = StObject.set(x, "tileClassName", js.Any.fromFunction1(value))
      
      inline def setTileClassNameUndefined: Self = StObject.set(x, "tileClassName", js.undefined)
      
      inline def setTileClassNameVarargs(value: String*): Self = StObject.set(x, "tileClassName", js.Array(value :_*))
      
      inline def setTileContent(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any) | (js.Function1[
              /* props */ CalendarTileProperties, 
              (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any) | Null
            ])
      ): Self = StObject.set(x, "tileContent", value.asInstanceOf[js.Any])
      
      inline def setTileContentFunction1(
        value: /* props */ CalendarTileProperties => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any) | Null
      ): Self = StObject.set(x, "tileContent", js.Any.fromFunction1(value))
      
      inline def setTileContentUndefined: Self = StObject.set(x, "tileContent", js.undefined)
      
      inline def setTileDisabled(value: /* props */ CalendarTileProperties => Boolean): Self = StObject.set(x, "tileDisabled", js.Any.fromFunction1(value))
      
      inline def setTileDisabledUndefined: Self = StObject.set(x, "tileDisabled", js.undefined)
      
      inline def setValue(value: Date | js.Array[Date]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: Date*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  type FormatterCallback = js.Function2[/* locale */ String, /* date */ Date, String]
  
  type OnChangeDateCallback = js.Function1[/* date */ Date | js.Array[Date], Unit]
  
  type ViewCallback = js.Function1[/* props */ ViewCallbackProperties, Unit]
  
  trait ViewCallbackProperties extends StObject {
    
    var activeStartDate: Date
    
    var view: Detail
  }
  object ViewCallbackProperties {
    
    inline def apply(activeStartDate: Date, view: Detail): ViewCallbackProperties = {
      val __obj = js.Dynamic.literal(activeStartDate = activeStartDate.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewCallbackProperties]
    }
    
    extension [Self <: ViewCallbackProperties](x: Self) {
      
      inline def setActiveStartDate(value: Date): Self = StObject.set(x, "activeStartDate", value.asInstanceOf[js.Any])
      
      inline def setView(value: Detail): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
}
