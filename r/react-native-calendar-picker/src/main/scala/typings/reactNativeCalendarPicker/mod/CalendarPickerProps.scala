package typings.reactNativeCalendarPicker.mod

import typings.moment.mod.Moment
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeCalendarPicker.reactNativeCalendarPickerStrings.END_DATE
import typings.reactNativeCalendarPicker.reactNativeCalendarPickerStrings.START_DATE
import typings.reactNativeCalendarPicker.reactNativeCalendarPickerStrings.circle
import typings.reactNativeCalendarPicker.reactNativeCalendarPickerStrings.customDates
import typings.reactNativeCalendarPicker.reactNativeCalendarPickerStrings.dayOfWeek
import typings.reactNativeCalendarPicker.reactNativeCalendarPickerStrings.square
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarPickerProps extends js.Object {
  var allowBackwardRangeSelect: js.UndefOr[Boolean] = js.undefined
  var allowRangeSelection: js.UndefOr[Boolean] = js.undefined
  var customDatesStyles: js.UndefOr[js.Array[CustomDateStyle]] = js.undefined
  var customDatesStylesPriority: js.UndefOr[dayOfWeek | customDates] = js.undefined
  var dayLabelsWrapper: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var dayOfWeekStyles: js.UndefOr[DayOfWeekStyle] = js.undefined
  var dayShape: js.UndefOr[circle | square] = js.undefined
  var disabledDates: js.UndefOr[js.Array[Date] | DisabledDatesFunc] = js.undefined
  var disabledDatesTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var enableDateChange: js.UndefOr[Boolean] = js.undefined
  var enableSwipe: js.UndefOr[Boolean] = js.undefined
  var headingLevel: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var initialDate: js.UndefOr[Date] = js.undefined
  var maxDate: js.UndefOr[Date] = js.undefined
  var maxRangeDuration: js.UndefOr[Double | js.Array[MaxDurationArrayItem]] = js.undefined
  var minDate: js.UndefOr[Date] = js.undefined
  var minRangeDuration: js.UndefOr[Double | js.Array[MinDurationArrayItem]] = js.undefined
  var monthYearHeaderWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var months: js.UndefOr[js.Array[String]] = js.undefined
  var nextComponent: js.UndefOr[ReactNode] = js.undefined
  var nextTitle: js.UndefOr[String] = js.undefined
  var nextTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var onDateChange: js.UndefOr[DateChangedCallback] = js.undefined
  var onMonthChange: js.UndefOr[DateChangedCallback] = js.undefined
  var onSwipe: js.UndefOr[SwipeCallback] = js.undefined
  var previousComponent: js.UndefOr[ReactNode] = js.undefined
  var previousTitle: js.UndefOr[String] = js.undefined
  var previousTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var restrictMonthNavigation: js.UndefOr[Boolean] = js.undefined
  var scaleFactor: js.UndefOr[Double] = js.undefined
  var selectedDayColor: js.UndefOr[String] = js.undefined
  var selectedDayStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var selectedDayTextColor: js.UndefOr[String] = js.undefined
  var selectedEndDate: js.UndefOr[Date] = js.undefined
  var selectedRangeEndStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var selectedRangeStartStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var selectedRangeStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var selectedStartDate: js.UndefOr[Date] = js.undefined
  var showDayStragglers: js.UndefOr[Boolean] = js.undefined
  var startFromMonday: js.UndefOr[Boolean] = js.undefined
  var swipeConfig: js.UndefOr[SwipeConfig] = js.undefined
  var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var todayBackgroundColor: js.UndefOr[String] = js.undefined
  var todayTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var weekdays: js.UndefOr[js.Array[String]] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object CalendarPickerProps {
  @scala.inline
  def apply(
    allowBackwardRangeSelect: js.UndefOr[Boolean] = js.undefined,
    allowRangeSelection: js.UndefOr[Boolean] = js.undefined,
    customDatesStyles: js.Array[CustomDateStyle] = null,
    customDatesStylesPriority: dayOfWeek | customDates = null,
    dayLabelsWrapper: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    dayOfWeekStyles: DayOfWeekStyle = null,
    dayShape: circle | square = null,
    disabledDates: js.Array[Date] | DisabledDatesFunc = null,
    disabledDatesTextStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    enableDateChange: js.UndefOr[Boolean] = js.undefined,
    enableSwipe: js.UndefOr[Boolean] = js.undefined,
    headingLevel: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    initialDate: Date = null,
    maxDate: Date = null,
    maxRangeDuration: Double | js.Array[MaxDurationArrayItem] = null,
    minDate: Date = null,
    minRangeDuration: Double | js.Array[MinDurationArrayItem] = null,
    monthYearHeaderWrapperStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    months: js.Array[String] = null,
    nextComponent: ReactNode = null,
    nextTitle: String = null,
    nextTitleStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    onDateChange: (/* date */ Moment, /* type */ js.UndefOr[START_DATE | END_DATE]) => Unit = null,
    onMonthChange: (/* date */ Moment, /* type */ js.UndefOr[START_DATE | END_DATE]) => Unit = null,
    onSwipe: /* swipeDirection */ SwipeDirection => Unit = null,
    previousComponent: ReactNode = null,
    previousTitle: String = null,
    previousTitleStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    restrictMonthNavigation: js.UndefOr[Boolean] = js.undefined,
    scaleFactor: js.UndefOr[Double] = js.undefined,
    selectedDayColor: String = null,
    selectedDayStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    selectedDayTextColor: String = null,
    selectedEndDate: Date = null,
    selectedRangeEndStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    selectedRangeStartStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    selectedRangeStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    selectedStartDate: Date = null,
    showDayStragglers: js.UndefOr[Boolean] = js.undefined,
    startFromMonday: js.UndefOr[Boolean] = js.undefined,
    swipeConfig: SwipeConfig = null,
    textStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    todayBackgroundColor: String = null,
    todayTextStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    weekdays: js.Array[String] = null,
    width: js.UndefOr[Double] = js.undefined
  ): CalendarPickerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowBackwardRangeSelect)) __obj.updateDynamic("allowBackwardRangeSelect")(allowBackwardRangeSelect.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowRangeSelection)) __obj.updateDynamic("allowRangeSelection")(allowRangeSelection.get.asInstanceOf[js.Any])
    if (customDatesStyles != null) __obj.updateDynamic("customDatesStyles")(customDatesStyles.asInstanceOf[js.Any])
    if (customDatesStylesPriority != null) __obj.updateDynamic("customDatesStylesPriority")(customDatesStylesPriority.asInstanceOf[js.Any])
    if (!js.isUndefined(dayLabelsWrapper)) __obj.updateDynamic("dayLabelsWrapper")(dayLabelsWrapper.asInstanceOf[js.Any])
    if (dayOfWeekStyles != null) __obj.updateDynamic("dayOfWeekStyles")(dayOfWeekStyles.asInstanceOf[js.Any])
    if (dayShape != null) __obj.updateDynamic("dayShape")(dayShape.asInstanceOf[js.Any])
    if (disabledDates != null) __obj.updateDynamic("disabledDates")(disabledDates.asInstanceOf[js.Any])
    if (!js.isUndefined(disabledDatesTextStyle)) __obj.updateDynamic("disabledDatesTextStyle")(disabledDatesTextStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDateChange)) __obj.updateDynamic("enableDateChange")(enableDateChange.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSwipe)) __obj.updateDynamic("enableSwipe")(enableSwipe.get.asInstanceOf[js.Any])
    if (!js.isUndefined(headingLevel)) __obj.updateDynamic("headingLevel")(headingLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (initialDate != null) __obj.updateDynamic("initialDate")(initialDate.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (maxRangeDuration != null) __obj.updateDynamic("maxRangeDuration")(maxRangeDuration.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (minRangeDuration != null) __obj.updateDynamic("minRangeDuration")(minRangeDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(monthYearHeaderWrapperStyle)) __obj.updateDynamic("monthYearHeaderWrapperStyle")(monthYearHeaderWrapperStyle.asInstanceOf[js.Any])
    if (months != null) __obj.updateDynamic("months")(months.asInstanceOf[js.Any])
    if (nextComponent != null) __obj.updateDynamic("nextComponent")(nextComponent.asInstanceOf[js.Any])
    if (nextTitle != null) __obj.updateDynamic("nextTitle")(nextTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(nextTitleStyle)) __obj.updateDynamic("nextTitleStyle")(nextTitleStyle.asInstanceOf[js.Any])
    if (onDateChange != null) __obj.updateDynamic("onDateChange")(js.Any.fromFunction2(onDateChange))
    if (onMonthChange != null) __obj.updateDynamic("onMonthChange")(js.Any.fromFunction2(onMonthChange))
    if (onSwipe != null) __obj.updateDynamic("onSwipe")(js.Any.fromFunction1(onSwipe))
    if (previousComponent != null) __obj.updateDynamic("previousComponent")(previousComponent.asInstanceOf[js.Any])
    if (previousTitle != null) __obj.updateDynamic("previousTitle")(previousTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(previousTitleStyle)) __obj.updateDynamic("previousTitleStyle")(previousTitleStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(restrictMonthNavigation)) __obj.updateDynamic("restrictMonthNavigation")(restrictMonthNavigation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleFactor)) __obj.updateDynamic("scaleFactor")(scaleFactor.get.asInstanceOf[js.Any])
    if (selectedDayColor != null) __obj.updateDynamic("selectedDayColor")(selectedDayColor.asInstanceOf[js.Any])
    if (!js.isUndefined(selectedDayStyle)) __obj.updateDynamic("selectedDayStyle")(selectedDayStyle.asInstanceOf[js.Any])
    if (selectedDayTextColor != null) __obj.updateDynamic("selectedDayTextColor")(selectedDayTextColor.asInstanceOf[js.Any])
    if (selectedEndDate != null) __obj.updateDynamic("selectedEndDate")(selectedEndDate.asInstanceOf[js.Any])
    if (!js.isUndefined(selectedRangeEndStyle)) __obj.updateDynamic("selectedRangeEndStyle")(selectedRangeEndStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(selectedRangeStartStyle)) __obj.updateDynamic("selectedRangeStartStyle")(selectedRangeStartStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(selectedRangeStyle)) __obj.updateDynamic("selectedRangeStyle")(selectedRangeStyle.asInstanceOf[js.Any])
    if (selectedStartDate != null) __obj.updateDynamic("selectedStartDate")(selectedStartDate.asInstanceOf[js.Any])
    if (!js.isUndefined(showDayStragglers)) __obj.updateDynamic("showDayStragglers")(showDayStragglers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startFromMonday)) __obj.updateDynamic("startFromMonday")(startFromMonday.get.asInstanceOf[js.Any])
    if (swipeConfig != null) __obj.updateDynamic("swipeConfig")(swipeConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(textStyle)) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (todayBackgroundColor != null) __obj.updateDynamic("todayBackgroundColor")(todayBackgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(todayTextStyle)) __obj.updateDynamic("todayTextStyle")(todayTextStyle.asInstanceOf[js.Any])
    if (weekdays != null) __obj.updateDynamic("weekdays")(weekdays.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarPickerProps]
  }
}

