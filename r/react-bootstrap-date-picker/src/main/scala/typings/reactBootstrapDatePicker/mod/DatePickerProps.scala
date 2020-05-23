package typings.reactBootstrapDatePicker.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerProps extends js.Object {
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var calendarContainer: js.UndefOr[js.Any] = js.undefined
  var calendarPlacement: js.UndefOr[String] = js.undefined
  var cellPadding: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var clearButtonElement: js.UndefOr[ReactNode] = js.undefined
  var customControl: js.UndefOr[StatelessComponent[_] | (ComponentClass[_, ComponentState])] = js.undefined
  var dateFormat: js.UndefOr[String] = js.undefined
  var dayLabels: js.UndefOr[js.Array[String]] = js.undefined
  var defaultValue: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var maxDate: js.UndefOr[String] = js.undefined
  var minDate: js.UndefOr[String] = js.undefined
  var monthLabels: js.UndefOr[js.Array[String]] = js.undefined
  var nextButtonElement: js.UndefOr[ReactNode] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[_]] = js.undefined
  var onChange: js.UndefOr[ChangeCallback] = js.undefined
  var onClear: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onFocus: js.UndefOr[FocusEventHandler[_]] = js.undefined
  var previousButtonElement: js.UndefOr[ReactNode] = js.undefined
  var showClearButton: js.UndefOr[Boolean] = js.undefined
  var showTodayButton: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var todayButtonLabel: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
  var weekStartsOnMonday: js.UndefOr[Boolean] = js.undefined
}

object DatePickerProps {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    calendarContainer: js.Any = null,
    calendarPlacement: String = null,
    cellPadding: String = null,
    className: String = null,
    clearButtonElement: ReactNode = null,
    customControl: StatelessComponent[_] | (ComponentClass[_, ComponentState]) = null,
    dateFormat: String = null,
    dayLabels: js.Array[String] = null,
    defaultValue: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    maxDate: String = null,
    minDate: String = null,
    monthLabels: js.Array[String] = null,
    nextButtonElement: ReactNode = null,
    onBlur: FocusEvent[_] => Unit = null,
    onChange: (/* value */ String, /* formattedValue */ String) => Unit = null,
    onClear: () => Unit = null,
    onFocus: FocusEvent[_] => Unit = null,
    previousButtonElement: ReactNode = null,
    showClearButton: js.UndefOr[Boolean] = js.undefined,
    showTodayButton: js.UndefOr[Boolean] = js.undefined,
    style: js.Any = null,
    todayButtonLabel: String = null,
    value: String = null,
    weekStartsOnMonday: js.UndefOr[Boolean] = js.undefined
  ): DatePickerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.get.asInstanceOf[js.Any])
    if (calendarContainer != null) __obj.updateDynamic("calendarContainer")(calendarContainer.asInstanceOf[js.Any])
    if (calendarPlacement != null) __obj.updateDynamic("calendarPlacement")(calendarPlacement.asInstanceOf[js.Any])
    if (cellPadding != null) __obj.updateDynamic("cellPadding")(cellPadding.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (clearButtonElement != null) __obj.updateDynamic("clearButtonElement")(clearButtonElement.asInstanceOf[js.Any])
    if (customControl != null) __obj.updateDynamic("customControl")(customControl.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (dayLabels != null) __obj.updateDynamic("dayLabels")(dayLabels.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (monthLabels != null) __obj.updateDynamic("monthLabels")(monthLabels.asInstanceOf[js.Any])
    if (nextButtonElement != null) __obj.updateDynamic("nextButtonElement")(nextButtonElement.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onClear != null) __obj.updateDynamic("onClear")(js.Any.fromFunction0(onClear))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (previousButtonElement != null) __obj.updateDynamic("previousButtonElement")(previousButtonElement.asInstanceOf[js.Any])
    if (!js.isUndefined(showClearButton)) __obj.updateDynamic("showClearButton")(showClearButton.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showTodayButton)) __obj.updateDynamic("showTodayButton")(showTodayButton.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (todayButtonLabel != null) __obj.updateDynamic("todayButtonLabel")(todayButtonLabel.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(weekStartsOnMonday)) __obj.updateDynamic("weekStartsOnMonday")(weekStartsOnMonday.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePickerProps]
  }
}

