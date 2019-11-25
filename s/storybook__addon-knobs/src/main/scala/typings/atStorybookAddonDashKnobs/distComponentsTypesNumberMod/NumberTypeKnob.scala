package typings.atStorybookAddonDashKnobs.distComponentsTypesNumberMod

import typings.atStorybookAddonDashKnobs.distComponentsTypesTypesMod.KnobControlConfig
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
    defaultValue: Int | Double = null,
    max: Int | Double = null,
    min: Int | Double = null,
    range: js.UndefOr[Boolean] = js.undefined,
    step: Int | Double = null
  ): NumberTypeKnob = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberTypeKnob]
  }
}

