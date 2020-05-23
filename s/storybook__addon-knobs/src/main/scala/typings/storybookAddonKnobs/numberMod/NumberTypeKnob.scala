package typings.storybookAddonKnobs.numberMod

import typings.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberTypeKnob
  extends KnobControlConfig[NumberTypeKnobValue]
     with NumberTypeKnobOptions

object NumberTypeKnob {
  @scala.inline
  def apply(
    name: String,
    value: NumberTypeKnobValue,
    defaultValue: js.UndefOr[NumberTypeKnobValue] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    range: js.UndefOr[Boolean] = js.undefined,
    step: js.UndefOr[Double] = js.undefined
  ): NumberTypeKnob = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultValue)) __obj.updateDynamic("defaultValue")(defaultValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range.get.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberTypeKnob]
  }
}

