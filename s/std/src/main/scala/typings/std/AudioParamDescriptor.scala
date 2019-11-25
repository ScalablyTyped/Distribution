package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioParamDescriptor extends js.Object {
  var automationRate: js.UndefOr[AutomationRate] = js.undefined
  var defaultValue: js.UndefOr[Double] = js.undefined
  var maxValue: js.UndefOr[Double] = js.undefined
  var minValue: js.UndefOr[Double] = js.undefined
  var name: java.lang.String
}

object AudioParamDescriptor {
  @scala.inline
  def apply(
    name: java.lang.String,
    automationRate: AutomationRate = null,
    defaultValue: Int | Double = null,
    maxValue: Int | Double = null,
    minValue: Int | Double = null
  ): AudioParamDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (automationRate != null) __obj.updateDynamic("automationRate")(automationRate.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioParamDescriptor]
  }
}

