package typings.reactCalendar.anon

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.reactCalendar.reactCalendarStrings.Arabic
import typings.reactCalendar.reactCalendarStrings.Hebrew
import typings.reactCalendar.reactCalendarStrings.US
import typings.reactCalendar.reactCalendarStrings.`ISO 8601`
import typings.reactCalendar.reactCalendarStrings.century
import typings.reactCalendar.reactCalendarStrings.decade
import typings.reactCalendar.reactCalendarStrings.month
import typings.reactCalendar.reactCalendarStrings.year
import typings.std.NonNullable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveStartDate extends StObject {
  
  var activeStartDate: Requireable[js.Date]
  
  var allowPartialRange: Requireable[Boolean]
  
  var calendarType: Requireable[Arabic | Hebrew | (`ISO 8601`) | US]
  
  var className: Requireable[NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]]
  
  var defaultActiveStartDate: Requireable[js.Date]
  
  var defaultValue: Requireable[
    NonNullable[
      js.UndefOr[
        (NonNullable[js.UndefOr[String | js.Date | Null]]) | (js.Array[js.UndefOr[(NonNullable[js.UndefOr[String | js.Date | Null]]) | Null]]) | Null
      ]
    ]
  ]
  
  var defaultView: TypeofisView
  
  var formatDay: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var formatLongDate: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var formatMonth: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var formatMonthYear: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var formatShortWeekday: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var formatWeekday: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var formatYear: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var goToRangeStartOnSelect: Requireable[Boolean]
  
  var inputRef: Requireable[
    NonNullable[js.UndefOr[(js.Function1[/* repeated */ Any, Any]) | InferProps[Current] | Null]]
  ]
  
  var locale: Requireable[String]
  
  var maxDate: js.Function3[
    /* props */ Record[String, Any], 
    /* propName */ String, 
    /* componentName */ String, 
    js.Error | Null
  ]
  
  var maxDetail: Requireable[month | year | century | decade]
  
  var minDate: js.Function3[
    /* props */ Record[String, Any], 
    /* propName */ String, 
    /* componentName */ String, 
    js.Error | Null
  ]
  
  var minDetail: Requireable[month | year | century | decade]
  
  var navigationAriaLabel: Requireable[String]
  
  var navigationAriaLive: Requireable[String]
  
  var navigationLabel: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var next2AriaLabel: Requireable[String]
  
  var next2Label: Requireable[ReactNodeLike]
  
  var nextAriaLabel: Requireable[String]
  
  var nextLabel: Requireable[ReactNodeLike]
  
  var onActiveStartDateChange: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var onChange: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var onClickDay: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var onClickDecade: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var onClickMonth: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var onClickWeekNumber: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var onClickYear: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var onDrillDown: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var onDrillUp: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var onViewChange: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var prev2AriaLabel: Requireable[String]
  
  var prev2Label: Requireable[ReactNodeLike]
  
  var prevAriaLabel: Requireable[String]
  
  var prevLabel: Requireable[ReactNodeLike]
  
  var returnValue: Requireable[String]
  
  var selectRange: Requireable[Boolean]
  
  var showDoubleView: Requireable[Boolean]
  
  var showFixedNumberOfWeeks: Requireable[Boolean]
  
  var showNavigation: Requireable[Boolean]
  
  var showNeighboringMonth: Requireable[Boolean]
  
  var showWeekNumbers: Requireable[Boolean]
  
  var tileClassName: Requireable[
    NonNullable[
      js.UndefOr[
        (js.Function1[/* repeated */ Any, Any]) | (NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]) | Null
      ]
    ]
  ]
  
  var tileContent: Requireable[NonNullable[ReactNodeLike | (js.Function1[/* repeated */ Any, Any])]]
  
  var tileDisabled: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var value: Requireable[
    NonNullable[
      js.UndefOr[
        (NonNullable[js.UndefOr[String | js.Date | Null]]) | (js.Array[js.UndefOr[(NonNullable[js.UndefOr[String | js.Date | Null]]) | Null]]) | Null
      ]
    ]
  ]
  
  var view: TypeofisView
}
object ActiveStartDate {
  
  inline def apply(
    activeStartDate: Requireable[js.Date],
    allowPartialRange: Requireable[Boolean],
    calendarType: Requireable[Arabic | Hebrew | (`ISO 8601`) | US],
    className: Requireable[NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]],
    defaultActiveStartDate: Requireable[js.Date],
    defaultValue: Requireable[
      NonNullable[
        js.UndefOr[
          (NonNullable[js.UndefOr[String | js.Date | Null]]) | (js.Array[js.UndefOr[(NonNullable[js.UndefOr[String | js.Date | Null]]) | Null]]) | Null
        ]
      ]
    ],
    defaultView: TypeofisView,
    formatDay: Requireable[js.Function1[/* repeated */ Any, Any]],
    formatLongDate: Requireable[js.Function1[/* repeated */ Any, Any]],
    formatMonth: Requireable[js.Function1[/* repeated */ Any, Any]],
    formatMonthYear: Requireable[js.Function1[/* repeated */ Any, Any]],
    formatShortWeekday: Requireable[js.Function1[/* repeated */ Any, Any]],
    formatWeekday: Requireable[js.Function1[/* repeated */ Any, Any]],
    formatYear: Requireable[js.Function1[/* repeated */ Any, Any]],
    goToRangeStartOnSelect: Requireable[Boolean],
    inputRef: Requireable[
      NonNullable[js.UndefOr[(js.Function1[/* repeated */ Any, Any]) | InferProps[Current] | Null]]
    ],
    locale: Requireable[String],
    maxDate: (/* props */ Record[String, Any], /* propName */ String, /* componentName */ String) => js.Error | Null,
    maxDetail: Requireable[month | year | century | decade],
    minDate: (/* props */ Record[String, Any], /* propName */ String, /* componentName */ String) => js.Error | Null,
    minDetail: Requireable[month | year | century | decade],
    navigationAriaLabel: Requireable[String],
    navigationAriaLive: Requireable[String],
    navigationLabel: Requireable[js.Function1[/* repeated */ Any, Any]],
    next2AriaLabel: Requireable[String],
    next2Label: Requireable[ReactNodeLike],
    nextAriaLabel: Requireable[String],
    nextLabel: Requireable[ReactNodeLike],
    onActiveStartDateChange: Requireable[js.Function1[/* repeated */ Any, Any]],
    onChange: Requireable[js.Function1[/* repeated */ Any, Any]],
    onClickDay: Requireable[js.Function1[/* repeated */ Any, Any]],
    onClickDecade: Requireable[js.Function1[/* repeated */ Any, Any]],
    onClickMonth: Requireable[js.Function1[/* repeated */ Any, Any]],
    onClickWeekNumber: Requireable[js.Function1[/* repeated */ Any, Any]],
    onClickYear: Requireable[js.Function1[/* repeated */ Any, Any]],
    onDrillDown: Requireable[js.Function1[/* repeated */ Any, Any]],
    onDrillUp: Requireable[js.Function1[/* repeated */ Any, Any]],
    onViewChange: Requireable[js.Function1[/* repeated */ Any, Any]],
    prev2AriaLabel: Requireable[String],
    prev2Label: Requireable[ReactNodeLike],
    prevAriaLabel: Requireable[String],
    prevLabel: Requireable[ReactNodeLike],
    returnValue: Requireable[String],
    selectRange: Requireable[Boolean],
    showDoubleView: Requireable[Boolean],
    showFixedNumberOfWeeks: Requireable[Boolean],
    showNavigation: Requireable[Boolean],
    showNeighboringMonth: Requireable[Boolean],
    showWeekNumbers: Requireable[Boolean],
    tileClassName: Requireable[
      NonNullable[
        js.UndefOr[
          (js.Function1[/* repeated */ Any, Any]) | (NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]) | Null
        ]
      ]
    ],
    tileContent: Requireable[NonNullable[ReactNodeLike | (js.Function1[/* repeated */ Any, Any])]],
    tileDisabled: Requireable[js.Function1[/* repeated */ Any, Any]],
    value: Requireable[
      NonNullable[
        js.UndefOr[
          (NonNullable[js.UndefOr[String | js.Date | Null]]) | (js.Array[js.UndefOr[(NonNullable[js.UndefOr[String | js.Date | Null]]) | Null]]) | Null
        ]
      ]
    ],
    view: TypeofisView
  ): ActiveStartDate = {
    val __obj = js.Dynamic.literal(activeStartDate = activeStartDate.asInstanceOf[js.Any], allowPartialRange = allowPartialRange.asInstanceOf[js.Any], calendarType = calendarType.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], defaultActiveStartDate = defaultActiveStartDate.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], defaultView = defaultView.asInstanceOf[js.Any], formatDay = formatDay.asInstanceOf[js.Any], formatLongDate = formatLongDate.asInstanceOf[js.Any], formatMonth = formatMonth.asInstanceOf[js.Any], formatMonthYear = formatMonthYear.asInstanceOf[js.Any], formatShortWeekday = formatShortWeekday.asInstanceOf[js.Any], formatWeekday = formatWeekday.asInstanceOf[js.Any], formatYear = formatYear.asInstanceOf[js.Any], goToRangeStartOnSelect = goToRangeStartOnSelect.asInstanceOf[js.Any], inputRef = inputRef.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], maxDate = js.Any.fromFunction3(maxDate), maxDetail = maxDetail.asInstanceOf[js.Any], minDate = js.Any.fromFunction3(minDate), minDetail = minDetail.asInstanceOf[js.Any], navigationAriaLabel = navigationAriaLabel.asInstanceOf[js.Any], navigationAriaLive = navigationAriaLive.asInstanceOf[js.Any], navigationLabel = navigationLabel.asInstanceOf[js.Any], next2AriaLabel = next2AriaLabel.asInstanceOf[js.Any], next2Label = next2Label.asInstanceOf[js.Any], nextAriaLabel = nextAriaLabel.asInstanceOf[js.Any], nextLabel = nextLabel.asInstanceOf[js.Any], onActiveStartDateChange = onActiveStartDateChange.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], onClickDay = onClickDay.asInstanceOf[js.Any], onClickDecade = onClickDecade.asInstanceOf[js.Any], onClickMonth = onClickMonth.asInstanceOf[js.Any], onClickWeekNumber = onClickWeekNumber.asInstanceOf[js.Any], onClickYear = onClickYear.asInstanceOf[js.Any], onDrillDown = onDrillDown.asInstanceOf[js.Any], onDrillUp = onDrillUp.asInstanceOf[js.Any], onViewChange = onViewChange.asInstanceOf[js.Any], prev2AriaLabel = prev2AriaLabel.asInstanceOf[js.Any], prev2Label = prev2Label.asInstanceOf[js.Any], prevAriaLabel = prevAriaLabel.asInstanceOf[js.Any], prevLabel = prevLabel.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any], selectRange = selectRange.asInstanceOf[js.Any], showDoubleView = showDoubleView.asInstanceOf[js.Any], showFixedNumberOfWeeks = showFixedNumberOfWeeks.asInstanceOf[js.Any], showNavigation = showNavigation.asInstanceOf[js.Any], showNeighboringMonth = showNeighboringMonth.asInstanceOf[js.Any], showWeekNumbers = showWeekNumbers.asInstanceOf[js.Any], tileClassName = tileClassName.asInstanceOf[js.Any], tileContent = tileContent.asInstanceOf[js.Any], tileDisabled = tileDisabled.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveStartDate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActiveStartDate] (val x: Self) extends AnyVal {
    
    inline def setActiveStartDate(value: Requireable[js.Date]): Self = StObject.set(x, "activeStartDate", value.asInstanceOf[js.Any])
    
    inline def setAllowPartialRange(value: Requireable[Boolean]): Self = StObject.set(x, "allowPartialRange", value.asInstanceOf[js.Any])
    
    inline def setCalendarType(value: Requireable[Arabic | Hebrew | (`ISO 8601`) | US]): Self = StObject.set(x, "calendarType", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: Requireable[NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setDefaultActiveStartDate(value: Requireable[js.Date]): Self = StObject.set(x, "defaultActiveStartDate", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(
      value: Requireable[
          NonNullable[
            js.UndefOr[
              (NonNullable[js.UndefOr[String | js.Date | Null]]) | (js.Array[js.UndefOr[(NonNullable[js.UndefOr[String | js.Date | Null]]) | Null]]) | Null
            ]
          ]
        ]
    ): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultView(value: TypeofisView): Self = StObject.set(x, "defaultView", value.asInstanceOf[js.Any])
    
    inline def setFormatDay(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "formatDay", value.asInstanceOf[js.Any])
    
    inline def setFormatLongDate(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "formatLongDate", value.asInstanceOf[js.Any])
    
    inline def setFormatMonth(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "formatMonth", value.asInstanceOf[js.Any])
    
    inline def setFormatMonthYear(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "formatMonthYear", value.asInstanceOf[js.Any])
    
    inline def setFormatShortWeekday(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "formatShortWeekday", value.asInstanceOf[js.Any])
    
    inline def setFormatWeekday(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "formatWeekday", value.asInstanceOf[js.Any])
    
    inline def setFormatYear(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "formatYear", value.asInstanceOf[js.Any])
    
    inline def setGoToRangeStartOnSelect(value: Requireable[Boolean]): Self = StObject.set(x, "goToRangeStartOnSelect", value.asInstanceOf[js.Any])
    
    inline def setInputRef(
      value: Requireable[
          NonNullable[js.UndefOr[(js.Function1[/* repeated */ Any, Any]) | InferProps[Current] | Null]]
        ]
    ): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Requireable[String]): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setMaxDate(
      value: (/* props */ Record[String, Any], /* propName */ String, /* componentName */ String) => js.Error | Null
    ): Self = StObject.set(x, "maxDate", js.Any.fromFunction3(value))
    
    inline def setMaxDetail(value: Requireable[month | year | century | decade]): Self = StObject.set(x, "maxDetail", value.asInstanceOf[js.Any])
    
    inline def setMinDate(
      value: (/* props */ Record[String, Any], /* propName */ String, /* componentName */ String) => js.Error | Null
    ): Self = StObject.set(x, "minDate", js.Any.fromFunction3(value))
    
    inline def setMinDetail(value: Requireable[month | year | century | decade]): Self = StObject.set(x, "minDetail", value.asInstanceOf[js.Any])
    
    inline def setNavigationAriaLabel(value: Requireable[String]): Self = StObject.set(x, "navigationAriaLabel", value.asInstanceOf[js.Any])
    
    inline def setNavigationAriaLive(value: Requireable[String]): Self = StObject.set(x, "navigationAriaLive", value.asInstanceOf[js.Any])
    
    inline def setNavigationLabel(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "navigationLabel", value.asInstanceOf[js.Any])
    
    inline def setNext2AriaLabel(value: Requireable[String]): Self = StObject.set(x, "next2AriaLabel", value.asInstanceOf[js.Any])
    
    inline def setNext2Label(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "next2Label", value.asInstanceOf[js.Any])
    
    inline def setNextAriaLabel(value: Requireable[String]): Self = StObject.set(x, "nextAriaLabel", value.asInstanceOf[js.Any])
    
    inline def setNextLabel(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "nextLabel", value.asInstanceOf[js.Any])
    
    inline def setOnActiveStartDateChange(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onActiveStartDateChange", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setOnClickDay(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onClickDay", value.asInstanceOf[js.Any])
    
    inline def setOnClickDecade(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onClickDecade", value.asInstanceOf[js.Any])
    
    inline def setOnClickMonth(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onClickMonth", value.asInstanceOf[js.Any])
    
    inline def setOnClickWeekNumber(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onClickWeekNumber", value.asInstanceOf[js.Any])
    
    inline def setOnClickYear(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onClickYear", value.asInstanceOf[js.Any])
    
    inline def setOnDrillDown(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onDrillDown", value.asInstanceOf[js.Any])
    
    inline def setOnDrillUp(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onDrillUp", value.asInstanceOf[js.Any])
    
    inline def setOnViewChange(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onViewChange", value.asInstanceOf[js.Any])
    
    inline def setPrev2AriaLabel(value: Requireable[String]): Self = StObject.set(x, "prev2AriaLabel", value.asInstanceOf[js.Any])
    
    inline def setPrev2Label(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "prev2Label", value.asInstanceOf[js.Any])
    
    inline def setPrevAriaLabel(value: Requireable[String]): Self = StObject.set(x, "prevAriaLabel", value.asInstanceOf[js.Any])
    
    inline def setPrevLabel(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "prevLabel", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Requireable[String]): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
    
    inline def setSelectRange(value: Requireable[Boolean]): Self = StObject.set(x, "selectRange", value.asInstanceOf[js.Any])
    
    inline def setShowDoubleView(value: Requireable[Boolean]): Self = StObject.set(x, "showDoubleView", value.asInstanceOf[js.Any])
    
    inline def setShowFixedNumberOfWeeks(value: Requireable[Boolean]): Self = StObject.set(x, "showFixedNumberOfWeeks", value.asInstanceOf[js.Any])
    
    inline def setShowNavigation(value: Requireable[Boolean]): Self = StObject.set(x, "showNavigation", value.asInstanceOf[js.Any])
    
    inline def setShowNeighboringMonth(value: Requireable[Boolean]): Self = StObject.set(x, "showNeighboringMonth", value.asInstanceOf[js.Any])
    
    inline def setShowWeekNumbers(value: Requireable[Boolean]): Self = StObject.set(x, "showWeekNumbers", value.asInstanceOf[js.Any])
    
    inline def setTileClassName(
      value: Requireable[
          NonNullable[
            js.UndefOr[
              (js.Function1[/* repeated */ Any, Any]) | (NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]) | Null
            ]
          ]
        ]
    ): Self = StObject.set(x, "tileClassName", value.asInstanceOf[js.Any])
    
    inline def setTileContent(value: Requireable[NonNullable[ReactNodeLike | (js.Function1[/* repeated */ Any, Any])]]): Self = StObject.set(x, "tileContent", value.asInstanceOf[js.Any])
    
    inline def setTileDisabled(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "tileDisabled", value.asInstanceOf[js.Any])
    
    inline def setValue(
      value: Requireable[
          NonNullable[
            js.UndefOr[
              (NonNullable[js.UndefOr[String | js.Date | Null]]) | (js.Array[js.UndefOr[(NonNullable[js.UndefOr[String | js.Date | Null]]) | Null]]) | Null
            ]
          ]
        ]
    ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setView(value: TypeofisView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
