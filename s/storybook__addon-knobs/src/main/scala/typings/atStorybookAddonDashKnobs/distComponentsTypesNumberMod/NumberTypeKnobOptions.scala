package typings.atStorybookAddonDashKnobs.distComponentsTypesNumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberTypeKnobOptions extends js.Object {
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var range: js.UndefOr[Boolean] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
}

object NumberTypeKnobOptions {
  @scala.inline
  def apply(
    max: Int | Double = null,
    min: Int | Double = null,
    range: js.UndefOr[Boolean] = js.undefined,
    step: Int | Double = null
  ): NumberTypeKnobOptions = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberTypeKnobOptions]
  }
}

