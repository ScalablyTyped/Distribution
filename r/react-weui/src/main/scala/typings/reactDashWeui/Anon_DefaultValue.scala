package typings.reactDashWeui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultValue extends js.Object {
  var defaultValue: Double
  var disabled: Boolean
  var max: Double
  var min: Double
  var showValue: Boolean
  var snapToValue: Boolean
  var step: Double
}

object Anon_DefaultValue {
  @scala.inline
  def apply(
    defaultValue: Double,
    disabled: Boolean,
    max: Double,
    min: Double,
    showValue: Boolean,
    snapToValue: Boolean,
    step: Double
  ): Anon_DefaultValue = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue, disabled = disabled, max = max, min = min, showValue = showValue, snapToValue = snapToValue, step = step)
  
    __obj.asInstanceOf[Anon_DefaultValue]
  }
}

