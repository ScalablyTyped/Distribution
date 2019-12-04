package typings.atStorybookAddonDashKnobs.distComponentsTypesCheckboxesMod

import typings.atStorybookAddonDashKnobs.distComponentsTypesTypesMod.KnobControlConfig
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxesTypeKnob extends KnobControlConfig[CheckboxesTypeKnobValue] {
  var options: Record[String, String]
}

object CheckboxesTypeKnob {
  @scala.inline
  def apply(
    name: String,
    options: Record[String, String],
    value: CheckboxesTypeKnobValue,
    defaultValue: CheckboxesTypeKnobValue = null
  ): CheckboxesTypeKnob = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxesTypeKnob]
  }
}

