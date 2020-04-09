package typings.reactNativeCalendarPicker.mod

import typings.moment.mod.Moment
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeCalendarPicker.reactNativeCalendarPickerStrings.circle
import typings.reactNativeCalendarPicker.reactNativeCalendarPickerStrings.square
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarPickerProps extends js.Object {
  var allowRangeSelection: js.UndefOr[Boolean] = js.undefined
  var customDatesStyles: js.UndefOr[js.Array[CustomDateStyle]] = js.undefined
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
  var months: js.UndefOr[js.Array[String]] = js.undefined
  var nextTitle: js.UndefOr[String] = js.undefined
  var nextTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var onDateChange: js.UndefOr[DateChangedCallback] = js.undefined
  var onMonthChange: js.UndefOr[DateChangedCallback] = js.undefined
  var onSwipe: js.UndefOr[SwipeCallback] = js.undefined
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
    allowRangeSelection: js.UndefOr[Boolean] = js.undefined,
    customDatesStyles: js.Array[CustomDateStyle] = null,
    dayLabelsWrapper: StyleProp[ViewStyle] = null,
    dayOfWeekStyles: DayOfWeekStyle = null,
    dayShape: circle | square = null,
    disabledDates: js.Array[Date] | DisabledDatesFunc = null,
    disabledDatesTextStyle: StyleProp[TextStyle] = null,
    enableDateChange: js.UndefOr[Boolean] = js.undefined,
    enableSwipe: js.UndefOr[Boolean] = js.undefined,
    headingLevel: Int | Double = null,
    height: Int | Double = null,
    initialDate: Date = null,
    maxDate: Date = null,
    maxRangeDuration: Double | js.Array[MaxDurationArrayItem] = null,
    minDate: Date = null,
    minRangeDuration: Double | js.Array[MinDurationArrayItem] = null,
    months: js.Array[String] = null,
    nextTitle: String = null,
    nextTitleStyle: StyleProp[TextStyle] = null,
    onDateChange: /* date */ Moment => Unit = null,
    onMonthChange: /* date */ Moment => Unit = null,
    onSwipe: /* swipeDirection */ SwipeDirection => Unit = null,
    previousTitle: String = null,
    previousTitleStyle: StyleProp[TextStyle] = null,
    restrictMonthNavigation: js.UndefOr[Boolean] = js.undefined,
    scaleFactor: Int | Double = null,
    selectedDayColor: String = null,
    selectedDayStyle: StyleProp[ViewStyle] = null,
    selectedDayTextColor: String = null,
    selectedEndDate: Date = null,
    selectedRangeEndStyle: StyleProp[ViewStyle] = null,
    selectedRangeStartStyle: StyleProp[ViewStyle] = null,
    selectedRangeStyle: StyleProp[ViewStyle] = null,
    selectedStartDate: Date = null,
    startFromMonday: js.UndefOr[Boolean] = js.undefined,
    swipeConfig: SwipeConfig = null,
    textStyle: StyleProp[TextStyle] = null,
    todayBackgroundColor: String = null,
    todayTextStyle: StyleProp[TextStyle] = null,
    weekdays: js.Array[String] = null,
    width: Int | Double = null
  ): CalendarPickerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowRangeSelection)) __obj.updateDynamic("allowRangeSelection")(allowRangeSelection.asInstanceOf[js.Any])
    if (customDatesStyles != null) __obj.updateDynamic("customDatesStyles")(customDatesStyles.asInstanceOf[js.Any])
    if (dayLabelsWrapper != null) __obj.updateDynamic("dayLabelsWrapper")(dayLabelsWrapper.asInstanceOf[js.Any])
    if (dayOfWeekStyles != null) __obj.updateDynamic("dayOfWeekStyles")(dayOfWeekStyles.asInstanceOf[js.Any])
    if (dayShape != null) __obj.updateDynamic("dayShape")(dayShape.asInstanceOf[js.Any])
    if (disabledDates != null) __obj.updateDynamic("disabledDates")(disabledDates.asInstanceOf[js.Any])
    if (disabledDatesTextStyle != null) __obj.updateDynamic("disabledDatesTextStyle")(disabledDatesTextStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDateChange)) __obj.updateDynamic("enableDateChange")(enableDateChange.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSwipe)) __obj.updateDynamic("enableSwipe")(enableSwipe.asInstanceOf[js.Any])
    if (headingLevel != null) __obj.updateDynamic("headingLevel")(headingLevel.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (initialDate != null) __obj.updateDynamic("initialDate")(initialDate.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (maxRangeDuration != null) __obj.updateDynamic("maxRangeDuration")(maxRangeDuration.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (minRangeDuration != null) __obj.updateDynamic("minRangeDuration")(minRangeDuration.asInstanceOf[js.Any])
    if (months != null) __obj.updateDynamic("months")(months.asInstanceOf[js.Any])
    if (nextTitle != null) __obj.updateDynamic("nextTitle")(nextTitle.asInstanceOf[js.Any])
    if (nextTitleStyle != null) __obj.updateDynamic("nextTitleStyle")(nextTitleStyle.asInstanceOf[js.Any])
    if (onDateChange != null) __obj.updateDynamic("onDateChange")(js.Any.fromFunction1(onDateChange))
    if (onMonthChange != null) __obj.updateDynamic("onMonthChange")(js.Any.fromFunction1(onMonthChange))
    if (onSwipe != null) __obj.updateDynamic("onSwipe")(js.Any.fromFunction1(onSwipe))
    if (previousTitle != null) __obj.updateDynamic("previousTitle")(previousTitle.asInstanceOf[js.Any])
    if (previousTitleStyle != null) __obj.updateDynamic("previousTitleStyle")(previousTitleStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(restrictMonthNavigation)) __obj.updateDynamic("restrictMonthNavigation")(restrictMonthNavigation.asInstanceOf[js.Any])
    if (scaleFactor != null) __obj.updateDynamic("scaleFactor")(scaleFactor.asInstanceOf[js.Any])
    if (selectedDayColor != null) __obj.updateDynamic("selectedDayColor")(selectedDayColor.asInstanceOf[js.Any])
    if (selectedDayStyle != null) __obj.updateDynamic("selectedDayStyle")(selectedDayStyle.asInstanceOf[js.Any])
    if (selectedDayTextColor != null) __obj.updateDynamic("selectedDayTextColor")(selectedDayTextColor.asInstanceOf[js.Any])
    if (selectedEndDate != null) __obj.updateDynamic("selectedEndDate")(selectedEndDate.asInstanceOf[js.Any])
    if (selectedRangeEndStyle != null) __obj.updateDynamic("selectedRangeEndStyle")(selectedRangeEndStyle.asInstanceOf[js.Any])
    if (selectedRangeStartStyle != null) __obj.updateDynamic("selectedRangeStartStyle")(selectedRangeStartStyle.asInstanceOf[js.Any])
    if (selectedRangeStyle != null) __obj.updateDynamic("selectedRangeStyle")(selectedRangeStyle.asInstanceOf[js.Any])
    if (selectedStartDate != null) __obj.updateDynamic("selectedStartDate")(selectedStartDate.asInstanceOf[js.Any])
    if (!js.isUndefined(startFromMonday)) __obj.updateDynamic("startFromMonday")(startFromMonday.asInstanceOf[js.Any])
    if (swipeConfig != null) __obj.updateDynamic("swipeConfig")(swipeConfig.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (todayBackgroundColor != null) __obj.updateDynamic("todayBackgroundColor")(todayBackgroundColor.asInstanceOf[js.Any])
    if (todayTextStyle != null) __obj.updateDynamic("todayTextStyle")(todayTextStyle.asInstanceOf[js.Any])
    if (weekdays != null) __obj.updateDynamic("weekdays")(weekdays.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarPickerProps]
  }
}

