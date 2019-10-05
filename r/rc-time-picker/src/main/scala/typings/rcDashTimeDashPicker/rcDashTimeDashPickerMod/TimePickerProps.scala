package typings.rcDashTimeDashPicker.rcDashTimeDashPickerMod

import typings.moment.momentMod.Moment
import typings.rcDashTimeDashPicker.Anon_Open
import typings.react.reactMod.Global.JSX.Element
import typings.react.reactMod.ReactNode
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
  def onClose(state: Anon_Open): Unit
  def onOpen(state: Anon_Open): Unit
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
    onClose: Anon_Open => Unit,
    onOpen: Anon_Open => Unit,
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
    val __obj = js.Dynamic.literal(addon = js.Any.fromFunction1(addon), allowEmpty = allowEmpty, className = className, clearText = clearText, defaultOpenValue = defaultOpenValue, defaultValue = defaultValue, disabled = disabled, disabledHours = js.Any.fromFunction0(disabledHours), disabledMinutes = js.Any.fromFunction1(disabledMinutes), disabledSeconds = js.Any.fromFunction2(disabledSeconds), focusOnOpen = focusOnOpen, format = format, hideDisabledOptions = hideDisabledOptions, hourStep = hourStep, id = id, inputReadOnly = inputReadOnly, minuteStep = minuteStep, onChange = js.Any.fromFunction1(onChange), onClose = js.Any.fromFunction1(onClose), onOpen = js.Any.fromFunction1(onOpen), open = open, placeholder = placeholder, placement = placement, popupClassName = popupClassName, prefixCls = prefixCls, secondStep = secondStep, showHour = showHour, showMinute = showMinute, showSecond = showSecond, transitionName = transitionName, use12Hours = use12Hours, value = value)
    if (clearIcon != null) __obj.updateDynamic("clearIcon")(clearIcon.asInstanceOf[js.Any])
    if (inputIcon != null) __obj.updateDynamic("inputIcon")(inputIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePickerProps]
  }
}

