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
    defaultValue: js.UndefOr[Double] = js.undefined,
    maxValue: js.UndefOr[Double] = js.undefined,
    minValue: js.UndefOr[Double] = js.undefined
  ): AudioParamDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (automationRate != null) __obj.updateDynamic("automationRate")(automationRate.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultValue)) __obj.updateDynamic("defaultValue")(defaultValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxValue)) __obj.updateDynamic("maxValue")(maxValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minValue)) __obj.updateDynamic("minValue")(minValue.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioParamDescriptor]
  }
}

