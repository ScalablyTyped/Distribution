package typings
package reactDashWeuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultValue extends js.Object {
  var defaultValue: scala.Double
  var disabled: scala.Boolean
  var max: scala.Double
  var min: scala.Double
  var showValue: scala.Boolean
  var snapToValue: scala.Boolean
  var step: scala.Double
}

object Anon_DefaultValue {
  @scala.inline
  def apply(
    defaultValue: scala.Double,
    disabled: scala.Boolean,
    max: scala.Double,
    min: scala.Double,
    showValue: scala.Boolean,
    snapToValue: scala.Boolean,
    step: scala.Double
  ): Anon_DefaultValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaultValue")(defaultValue)
    __obj.updateDynamic("disabled")(disabled)
    __obj.updateDynamic("max")(max)
    __obj.updateDynamic("min")(min)
    __obj.updateDynamic("showValue")(showValue)
    __obj.updateDynamic("snapToValue")(snapToValue)
    __obj.updateDynamic("step")(step)
    __obj.asInstanceOf[Anon_DefaultValue]
  }
}

