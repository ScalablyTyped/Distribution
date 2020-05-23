package typings.storybookAddonKnobs.anon

import typings.react.mod.Validator
import typings.storybookAddonKnobs.numberMod.NumberTypeKnob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnobValidator extends js.Object {
  var knob: Validator[NumberTypeKnob]
  var onChange: Validator[js.Function1[/* value */ Double | Null, Double | Null]]
}

object KnobValidator {
  @scala.inline
  def apply(
    knob: Validator[NumberTypeKnob],
    onChange: Validator[js.Function1[/* value */ Double | Null, Double | Null]]
  ): KnobValidator = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnobValidator]
  }
}

