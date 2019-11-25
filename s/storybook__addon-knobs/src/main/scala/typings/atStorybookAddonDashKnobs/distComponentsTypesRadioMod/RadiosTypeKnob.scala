package typings.atStorybookAddonDashKnobs.distComponentsTypesRadioMod

import typings.atStorybookAddonDashKnobs.distComponentsTypesTypesMod.KnobControlConfig
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
    defaultValue: RadiosTypeKnobValue = null,
    value: RadiosTypeKnobValue = null
  ): RadiosTypeKnob = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadiosTypeKnob]
  }
}

