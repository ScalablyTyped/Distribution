package typings.atStorybookAddonDashKnobs.distComponentsTypesArrayMod

import typings.atStorybookAddonDashKnobs.distComponentsTypesTypesMod.KnobControlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayTypeKnob extends KnobControlConfig[ArrayTypeKnobValue] {
  var separator: String
}

object ArrayTypeKnob {
  @scala.inline
  def apply(
    name: String,
    separator: String,
    value: ArrayTypeKnobValue,
    defaultValue: ArrayTypeKnobValue = null
  ): ArrayTypeKnob = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayTypeKnob]
  }
}

