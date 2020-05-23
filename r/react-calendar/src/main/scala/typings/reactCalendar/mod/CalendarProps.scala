package typings.reactCalendar.mod

import typings.reactCalendar.anon.CalendarTilePropertiesact
import typings.reactCalendar.reactCalendarStrings.end
import typings.reactCalendar.reactCalendarStrings.range
import typings.reactCalendar.reactCalendarStrings.start
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarProps extends js.Object {
  var activeStartDate: js.UndefOr[Date] = js.undefined
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
      String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ _) | Null
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
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ _) | Null
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
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ _) | Null
    ])
  ] = js.undefined
  var tileDisabled: js.UndefOr[js.Function1[/* props */ CalendarTilePropertiesact, Boolean]] = js.undefined
  var value: js.UndefOr[Date | js.Array[Date]] = js.undefined
  var view: js.UndefOr[Detail] = js.undefined
}

object CalendarProps {
  @scala.inline
  def apply(
    activeStartDate: Date = null,
    calendarType: CalendarType = null,
    className: String | js.Array[String] = null,
    defaultActiveStartDate: Date = null,
    defaultValue: Date | js.Array[Date] = null,
    defaultView: Detail = null,
    formatLongDate: (/* locale */ String, /* date */ Date) => String = null,
    formatMonth: (/* locale */ String, /* date */ Date) => String = null,
    formatMonthYear: (/* locale */ String, /* date */ Date) => String = null,
    formatShortWeekday: (/* locale */ String, /* date */ Date) => String = null,
    formatYear: (/* locale */ String, /* date */ Date) => String = null,
    locale: String = null,
    maxDate: Date = null,
    maxDetail: Detail = null,
    minDate: Date = null,
    minDetail: Detail = null,
    navigationAriaLabel: String = null,
    navigationLabel: /* props */ typings.reactCalendar.anon.Date => String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ _) | Null = null,
    next2AriaLabel: String = null,
    next2Label: js.UndefOr[
      Null | String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any)
    ] = js.undefined,
    nextAriaLabel: String = null,
    nextLabel: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any) = null,
    onActiveStartDateChange: /* props */ ViewCallbackProperties => Unit = null,
    onChange: /* date */ Date | js.Array[Date] => Unit = null,
    onClickDay: /* date */ Date => Unit = null,
    onClickDecade: /* date */ Date => Unit = null,
    onClickMonth: /* date */ Date => Unit = null,
    onClickWeekNumber: (/* weekNumber */ Double, /* date */ Date) => Unit = null,
    onClickYear: /* date */ Date => Unit = null,
    onDrillDown: /* props */ ViewCallbackProperties => Unit = null,
    onDrillUp: /* props */ ViewCallbackProperties => Unit = null,
    onViewChange: /* props */ ViewCallbackProperties => Unit = null,
    prev2AriaLabel: String = null,
    prev2Label: js.UndefOr[
      Null | String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any)
    ] = js.undefined,
    prevAriaLabel: String = null,
    prevLabel: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any) = null,
    renderChildren: /* props */ CalendarTileProperties => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ _) | Null = null,
    returnValue: start | end | range = null,
    selectRange: js.UndefOr[Boolean] = js.undefined,
    showDoubleView: js.UndefOr[Boolean] = js.undefined,
    showFixedNumberOfWeeks: js.UndefOr[Boolean] = js.undefined,
    showNavigation: js.UndefOr[Boolean] = js.undefined,
    showNeighboringMonth: js.UndefOr[Boolean] = js.undefined,
    showWeekNumbers: js.UndefOr[Boolean] = js.undefined,
    tileClassName: String | js.Array[String] | (js.Function1[/* props */ CalendarTileProperties, String | js.Array[String] | Null]) = null,
    tileContent: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any) | (js.Function1[
      /* props */ CalendarTileProperties, 
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ _) | Null
    ]) = null,
    tileDisabled: /* props */ CalendarTilePropertiesact => Boolean = null,
    value: Date | js.Array[Date] = null,
    view: Detail = null
  ): CalendarProps = {
    val __obj = js.Dynamic.literal()
    if (activeStartDate != null) __obj.updateDynamic("activeStartDate")(activeStartDate.asInstanceOf[js.Any])
    if (calendarType != null) __obj.updateDynamic("calendarType")(calendarType.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultActiveStartDate != null) __obj.updateDynamic("defaultActiveStartDate")(defaultActiveStartDate.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (defaultView != null) __obj.updateDynamic("defaultView")(defaultView.asInstanceOf[js.Any])
    if (formatLongDate != null) __obj.updateDynamic("formatLongDate")(js.Any.fromFunction2(formatLongDate))
    if (formatMonth != null) __obj.updateDynamic("formatMonth")(js.Any.fromFunction2(formatMonth))
    if (formatMonthYear != null) __obj.updateDynamic("formatMonthYear")(js.Any.fromFunction2(formatMonthYear))
    if (formatShortWeekday != null) __obj.updateDynamic("formatShortWeekday")(js.Any.fromFunction2(formatShortWeekday))
    if (formatYear != null) __obj.updateDynamic("formatYear")(js.Any.fromFunction2(formatYear))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (maxDetail != null) __obj.updateDynamic("maxDetail")(maxDetail.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (minDetail != null) __obj.updateDynamic("minDetail")(minDetail.asInstanceOf[js.Any])
    if (navigationAriaLabel != null) __obj.updateDynamic("navigationAriaLabel")(navigationAriaLabel.asInstanceOf[js.Any])
    if (navigationLabel != null) __obj.updateDynamic("navigationLabel")(js.Any.fromFunction1(navigationLabel))
    if (next2AriaLabel != null) __obj.updateDynamic("next2AriaLabel")(next2AriaLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(next2Label)) __obj.updateDynamic("next2Label")(next2Label.asInstanceOf[js.Any])
    if (nextAriaLabel != null) __obj.updateDynamic("nextAriaLabel")(nextAriaLabel.asInstanceOf[js.Any])
    if (nextLabel != null) __obj.updateDynamic("nextLabel")(nextLabel.asInstanceOf[js.Any])
    if (onActiveStartDateChange != null) __obj.updateDynamic("onActiveStartDateChange")(js.Any.fromFunction1(onActiveStartDateChange))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClickDay != null) __obj.updateDynamic("onClickDay")(js.Any.fromFunction1(onClickDay))
    if (onClickDecade != null) __obj.updateDynamic("onClickDecade")(js.Any.fromFunction1(onClickDecade))
    if (onClickMonth != null) __obj.updateDynamic("onClickMonth")(js.Any.fromFunction1(onClickMonth))
    if (onClickWeekNumber != null) __obj.updateDynamic("onClickWeekNumber")(js.Any.fromFunction2(onClickWeekNumber))
    if (onClickYear != null) __obj.updateDynamic("onClickYear")(js.Any.fromFunction1(onClickYear))
    if (onDrillDown != null) __obj.updateDynamic("onDrillDown")(js.Any.fromFunction1(onDrillDown))
    if (onDrillUp != null) __obj.updateDynamic("onDrillUp")(js.Any.fromFunction1(onDrillUp))
    if (onViewChange != null) __obj.updateDynamic("onViewChange")(js.Any.fromFunction1(onViewChange))
    if (prev2AriaLabel != null) __obj.updateDynamic("prev2AriaLabel")(prev2AriaLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(prev2Label)) __obj.updateDynamic("prev2Label")(prev2Label.asInstanceOf[js.Any])
    if (prevAriaLabel != null) __obj.updateDynamic("prevAriaLabel")(prevAriaLabel.asInstanceOf[js.Any])
    if (prevLabel != null) __obj.updateDynamic("prevLabel")(prevLabel.asInstanceOf[js.Any])
    if (renderChildren != null) __obj.updateDynamic("renderChildren")(js.Any.fromFunction1(renderChildren))
    if (returnValue != null) __obj.updateDynamic("returnValue")(returnValue.asInstanceOf[js.Any])
    if (!js.isUndefined(selectRange)) __obj.updateDynamic("selectRange")(selectRange.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showDoubleView)) __obj.updateDynamic("showDoubleView")(showDoubleView.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showFixedNumberOfWeeks)) __obj.updateDynamic("showFixedNumberOfWeeks")(showFixedNumberOfWeeks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showNavigation)) __obj.updateDynamic("showNavigation")(showNavigation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showNeighboringMonth)) __obj.updateDynamic("showNeighboringMonth")(showNeighboringMonth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showWeekNumbers)) __obj.updateDynamic("showWeekNumbers")(showWeekNumbers.get.asInstanceOf[js.Any])
    if (tileClassName != null) __obj.updateDynamic("tileClassName")(tileClassName.asInstanceOf[js.Any])
    if (tileContent != null) __obj.updateDynamic("tileContent")(tileContent.asInstanceOf[js.Any])
    if (tileDisabled != null) __obj.updateDynamic("tileDisabled")(js.Any.fromFunction1(tileDisabled))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarProps]
  }
}

