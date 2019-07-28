package typings.rmcDashDateDashPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Disabled extends js.Object {
  var disabled: Boolean
  var locale: Anon_Am
  var minuteStep: Double
  var mode: String
  var pickerPrefixCls: String
  var prefixCls: String
  var use12Hours: Boolean
  def onDateChange(): Unit
}

object Anon_Disabled {
  @scala.inline
  def apply(
    disabled: Boolean,
    locale: Anon_Am,
    minuteStep: Double,
    mode: String,
    onDateChange: () => Unit,
    pickerPrefixCls: String,
    prefixCls: String,
    use12Hours: Boolean
  ): Anon_Disabled = {
    val __obj = js.Dynamic.literal(disabled = disabled, locale = locale, minuteStep = minuteStep, mode = mode, onDateChange = js.Any.fromFunction0(onDateChange), pickerPrefixCls = pickerPrefixCls, prefixCls = prefixCls, use12Hours = use12Hours)
  
    __obj.asInstanceOf[Anon_Disabled]
  }
}

