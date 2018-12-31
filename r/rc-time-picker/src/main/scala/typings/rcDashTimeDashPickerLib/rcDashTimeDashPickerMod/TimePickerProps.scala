package typings
package rcDashTimeDashPickerLib.rcDashTimeDashPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimePickerProps extends js.Object {
  var allowEmpty: scala.Boolean
  var className: java.lang.String
  var clearIcon: reactLib.reactMod.ReactNs.ReactNode
  var clearText: java.lang.String
  var defaultOpenValue: momentLib.momentMod.momentNs.Moment
  var defaultValue: momentLib.momentMod.momentNs.Moment
  var disabled: scala.Boolean
  var focusOnOpen: scala.Boolean
  var format: java.lang.String
  var hideDisabledOptions: scala.Boolean
  var hourStep: scala.Double
  var id: java.lang.String
  var inputIcon: reactLib.reactMod.ReactNs.ReactNode
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
  var value: momentLib.momentMod.momentNs.Moment
  def addon(timepicker: TimePicker): reactLib.reactMod.Global.JSXNs.Element
  def disabledHours(): js.Array[scala.Double]
  def disabledMinutes(hour: scala.Double): js.Array[scala.Double]
  def disabledSeconds(hour: scala.Double, minute: scala.Double): js.Array[scala.Double]
  def onChange(value: momentLib.momentMod.momentNs.Moment): scala.Unit
  def onClose(state: rcDashTimeDashPickerLib.Anon_Open): scala.Unit
  def onOpen(state: rcDashTimeDashPickerLib.Anon_Open): scala.Unit
}

