package typings
package rcDashTimeDashPickerLib.rcDashTimeDashPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimePickerProps extends js.Object {
  var allowEmpty: scala.Boolean
  var className: java.lang.String
  var clearIcon: reactLib.reactMod.ReactNode
  var clearText: java.lang.String
  var defaultOpenValue: momentLib.momentMod.Moment
  var defaultValue: momentLib.momentMod.Moment
  var disabled: scala.Boolean
  var focusOnOpen: scala.Boolean
  var format: java.lang.String
  var hideDisabledOptions: scala.Boolean
  var hourStep: scala.Double
  var id: java.lang.String
  var inputIcon: reactLib.reactMod.ReactNode
  var inputReadOnly: scala.Boolean
  var minuteStep: scala.Double
  var open: scala.Boolean
  var placeholder: java.lang.String
  var placement: java.lang.String
  var popupClassName: java.lang.String
  var prefixCls: java.lang.String
  var secondStep: scala.Double
  var showHour: scala.Boolean
  var showMinute: scala.Boolean
  var showSecond: scala.Boolean
  var transitionName: java.lang.String
  var use12Hours: scala.Boolean
  var value: momentLib.momentMod.Moment
  def addon(timepicker: TimePicker): reactLib.reactMod.Global.JSXNs.Element
  def disabledHours(): js.Array[scala.Double]
  def disabledMinutes(hour: scala.Double): js.Array[scala.Double]
  def disabledSeconds(hour: scala.Double, minute: scala.Double): js.Array[scala.Double]
  def onChange(value: momentLib.momentMod.Moment): scala.Unit
  def onClose(state: rcDashTimeDashPickerLib.Anon_Open): scala.Unit
  def onOpen(state: rcDashTimeDashPickerLib.Anon_Open): scala.Unit
}

object TimePickerProps {
  @scala.inline
  def apply(
    addon: TimePicker => reactLib.reactMod.Global.JSXNs.Element,
    allowEmpty: scala.Boolean,
    className: java.lang.String,
    clearIcon: reactLib.reactMod.ReactNode,
    clearText: java.lang.String,
    defaultOpenValue: momentLib.momentMod.Moment,
    defaultValue: momentLib.momentMod.Moment,
    disabled: scala.Boolean,
    disabledHours: () => js.Array[scala.Double],
    disabledMinutes: scala.Double => js.Array[scala.Double],
    disabledSeconds: (scala.Double, scala.Double) => js.Array[scala.Double],
    focusOnOpen: scala.Boolean,
    format: java.lang.String,
    hideDisabledOptions: scala.Boolean,
    hourStep: scala.Double,
    id: java.lang.String,
    inputIcon: reactLib.reactMod.ReactNode,
    inputReadOnly: scala.Boolean,
    minuteStep: scala.Double,
    onChange: momentLib.momentMod.Moment => scala.Unit,
    onClose: rcDashTimeDashPickerLib.Anon_Open => scala.Unit,
    onOpen: rcDashTimeDashPickerLib.Anon_Open => scala.Unit,
    open: scala.Boolean,
    placeholder: java.lang.String,
    placement: java.lang.String,
    popupClassName: java.lang.String,
    prefixCls: java.lang.String,
    secondStep: scala.Double,
    showHour: scala.Boolean,
    showMinute: scala.Boolean,
    showSecond: scala.Boolean,
    transitionName: java.lang.String,
    use12Hours: scala.Boolean,
    value: momentLib.momentMod.Moment
  ): TimePickerProps = {
    val __obj = js.Dynamic.literal(addon = js.Any.fromFunction1(addon), allowEmpty = allowEmpty, className = className, clearIcon = clearIcon.asInstanceOf[js.Any], clearText = clearText, defaultOpenValue = defaultOpenValue, defaultValue = defaultValue, disabled = disabled, disabledHours = js.Any.fromFunction0(disabledHours), disabledMinutes = js.Any.fromFunction1(disabledMinutes), disabledSeconds = js.Any.fromFunction2(disabledSeconds), focusOnOpen = focusOnOpen, format = format, hideDisabledOptions = hideDisabledOptions, hourStep = hourStep, id = id, inputIcon = inputIcon.asInstanceOf[js.Any], inputReadOnly = inputReadOnly, minuteStep = minuteStep, onChange = js.Any.fromFunction1(onChange), onClose = js.Any.fromFunction1(onClose), onOpen = js.Any.fromFunction1(onOpen), open = open, placeholder = placeholder, placement = placement, popupClassName = popupClassName, prefixCls = prefixCls, secondStep = secondStep, showHour = showHour, showMinute = showMinute, showSecond = showSecond, transitionName = transitionName, use12Hours = use12Hours, value = value)
  
    __obj.asInstanceOf[TimePickerProps]
  }
}

