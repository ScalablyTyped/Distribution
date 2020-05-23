package typings.storybookAddonKnobs.radioMod

import typings.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadiosTypeKnob extends KnobControlConfig[RadiosTypeKnobValue] {
  var options: RadiosTypeOptionsProp[RadiosTypeKnobValue]
}

object RadiosTypeKnob {
  @scala.inline
  def apply(
    name: String,
    options: RadiosTypeOptionsProp[RadiosTypeKnobValue],
    defaultValue: js.UndefOr[Null | RadiosTypeKnobValue] = js.undefined,
    value: js.UndefOr[Null | RadiosTypeKnobValue] = js.undefined
  ): RadiosTypeKnob = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultValue)) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadiosTypeKnob]
  }
}

