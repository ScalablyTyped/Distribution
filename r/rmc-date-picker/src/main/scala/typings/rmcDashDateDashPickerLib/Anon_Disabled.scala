package typings
package rmcDashDateDashPickerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Disabled extends js.Object {
  var disabled: scala.Boolean
  var locale: Anon_Am
  var minuteStep: scala.Double
  var mode: java.lang.String
  var pickerPrefixCls: java.lang.String
  var prefixCls: java.lang.String
  var use12Hours: scala.Boolean
  def onDateChange(): scala.Unit
}

object Anon_Disabled {
  @scala.inline
  def apply(
    disabled: scala.Boolean,
    locale: Anon_Am,
    minuteStep: scala.Double,
    mode: java.lang.String,
    onDateChange: () => scala.Unit,
    pickerPrefixCls: java.lang.String,
    prefixCls: java.lang.String,
    use12Hours: scala.Boolean
  ): Anon_Disabled = {
    val __obj = js.Dynamic.literal(disabled = disabled, locale = locale, minuteStep = minuteStep, mode = mode, onDateChange = js.Any.fromFunction0(onDateChange), pickerPrefixCls = pickerPrefixCls, prefixCls = prefixCls, use12Hours = use12Hours)
  
    __obj.asInstanceOf[Anon_Disabled]
  }
}

