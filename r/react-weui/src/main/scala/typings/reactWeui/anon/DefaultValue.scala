package typings.reactWeui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultValue extends js.Object {
  var defaultValue: Double
  var disabled: Boolean
  var max: Double
  var min: Double
  var showValue: Boolean
  var snapToValue: Boolean
  var step: Double
}

object DefaultValue {
  @scala.inline
  def apply(
    defaultValue: Double,
    disabled: Boolean,
    max: Double,
    min: Double,
    showValue: Boolean,
    snapToValue: Boolean,
    step: Double
  ): DefaultValue = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], showValue = showValue.asInstanceOf[js.Any], snapToValue = snapToValue.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultValue]
  }
}

