package typings.storybookAddonKnobs

import typings.react.mod.Validator
import typings.storybookAddonKnobs.checkboxesMod.CheckboxesTypeKnob
import typings.storybookAddonKnobs.checkboxesMod.CheckboxesTypeKnobValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsInline extends js.Object {
  var isInline: Validator[Boolean]
  var knob: Validator[CheckboxesTypeKnob]
  var onChange: Validator[js.Function1[/* value */ CheckboxesTypeKnobValue, CheckboxesTypeKnobValue]]
}

object AnonIsInline {
  @scala.inline
  def apply(
    isInline: Validator[Boolean],
    knob: Validator[CheckboxesTypeKnob],
    onChange: Validator[js.Function1[/* value */ CheckboxesTypeKnobValue, CheckboxesTypeKnobValue]]
  ): AnonIsInline = {
    val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any], knob = knob.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIsInline]
  }
}

