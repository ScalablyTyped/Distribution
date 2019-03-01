package typings
package atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmptyNumberOptions extends js.Object {
  var max: js.UndefOr[scala.Nothing] = js.undefined
  var min: js.UndefOr[scala.Nothing] = js.undefined
  var range: js.UndefOr[scala.Nothing] = js.undefined
  var step: js.UndefOr[scala.Nothing] = js.undefined
}

object EmptyNumberOptions {
  @scala.inline
  def apply(
    max: js.UndefOr[scala.Nothing] = js.undefined,
    min: js.UndefOr[scala.Nothing] = js.undefined,
    range: js.UndefOr[scala.Nothing] = js.undefined,
    step: js.UndefOr[scala.Nothing] = js.undefined
  ): EmptyNumberOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max)
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min)
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range)
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step)
    __obj.asInstanceOf[EmptyNumberOptions]
  }
}

