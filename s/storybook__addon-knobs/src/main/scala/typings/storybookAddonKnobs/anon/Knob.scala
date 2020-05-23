package typings.storybookAddonKnobs.anon

import typings.react.mod.Validator
import typings.storybookAddonKnobs.arrayMod.ArrayTypeKnob
import typings.storybookAddonKnobs.arrayMod.ArrayTypeKnobValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Knob extends js.Object {
  var knob: Validator[ArrayTypeKnob]
  var onChange: Validator[js.Function1[/* value */ ArrayTypeKnobValue, ArrayTypeKnobValue]]
}

object Knob {
  @scala.inline
  def apply(
    knob: Validator[ArrayTypeKnob],
    onChange: Validator[js.Function1[/* value */ ArrayTypeKnobValue, ArrayTypeKnobValue]]
  ): Knob = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[Knob]
  }
}

