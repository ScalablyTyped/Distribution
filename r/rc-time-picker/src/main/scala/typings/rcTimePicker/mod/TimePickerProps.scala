package typings.rcTimePicker.mod

import typings.moment.mod.Moment
import typings.rcTimePicker.AnonOpen
import typings.react.mod.ReactNode
import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimePickerProps extends js.Object {
  var allowEmpty: Boolean
  var className: String
  var clearIcon: ReactNode
  var clearText: String
  var defaultOpenValue: Moment
  var defaultValue: Moment
  var disabled: Boolean
  var focusOnOpen: Boolean
  var format: String
  var hideDisabledOptions: Boolean
  var hourStep: Double
  var id: String
  var inputIcon: ReactNode
  var inputReadOnly: Boolean
  var minuteStep: Double
  var open: Boolean
  var placeholder: String
  var placement: String
  var popupClassName: String
  var prefixCls: String
  var secondStep: Double
  var showHour: Boolean
  var showMinute: Boolean
  var showSecond: Boolean
  var transitionName: String
  var use12Hours: Boolean
  var value: Moment
  def addon(timepicker: TimePicker): Element
  def disabledHours(): js.Array[Double]
  def disabledMinutes(hour: Double): js.Array[Double]
  def disabledSeconds(hour: Double, minute: Double): js.Array[Double]
  def onChange(value: Moment): Unit
  def onClose(state: AnonOpen): Unit
  def onOpen(state: AnonOpen): Unit
}

object TimePickerProps {
  @scala.inline
  def apply(
    addon: TimePicker => Element,
    allowEmpty: Boolean,
    className: String,
    clearText: String,
    defaultOpenValue: Moment,
    defaultValue: Moment,
    disabled: Boolean,
    disabledHours: () => js.Array[Double],
    disabledMinutes: Double => js.Array[Double],
    disabledSeconds: (Double, Double) => js.Array[Double],
    focusOnOpen: Boolean,
    format: String,
    hideDisabledOptions: Boolean,
    hourStep: Double,
    id: String,
    inputReadOnly: Boolean,
    minuteStep: Double,
    onChange: Moment => Unit,
    onClose: AnonOpen => Unit,
    onOpen: AnonOpen => Unit,
    open: Boolean,
    placeholder: String,
    placement: String,
    popupClassName: String,
    prefixCls: String,
    secondStep: Double,
    showHour: Boolean,
    showMinute: Boolean,
    showSecond: Boolean,
    transitionName: String,
    use12Hours: Boolean,
    value: Moment,
    clearIcon: ReactNode = null,
    inputIcon: ReactNode = null
  ): TimePickerProps = {
    val __obj = js.Dynamic.literal(addon = js.Any.fromFunction1(addon), allowEmpty = allowEmpty.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], clearText = clearText.asInstanceOf[js.Any], defaultOpenValue = defaultOpenValue.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], disabledHours = js.Any.fromFunction0(disabledHours), disabledMinutes = js.Any.fromFunction1(disabledMinutes), disabledSeconds = js.Any.fromFunction2(disabledSeconds), focusOnOpen = focusOnOpen.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], hideDisabledOptions = hideDisabledOptions.asInstanceOf[js.Any], hourStep = hourStep.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputReadOnly = inputReadOnly.asInstanceOf[js.Any], minuteStep = minuteStep.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), onClose = js.Any.fromFunction1(onClose), onOpen = js.Any.fromFunction1(onOpen), open = open.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], popupClassName = popupClassName.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], secondStep = secondStep.asInstanceOf[js.Any], showHour = showHour.asInstanceOf[js.Any], showMinute = showMinute.asInstanceOf[js.Any], showSecond = showSecond.asInstanceOf[js.Any], transitionName = transitionName.asInstanceOf[js.Any], use12Hours = use12Hours.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (clearIcon != null) __obj.updateDynamic("clearIcon")(clearIcon.asInstanceOf[js.Any])
    if (inputIcon != null) __obj.updateDynamic("inputIcon")(inputIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePickerProps]
  }
}

