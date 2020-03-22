package typings.storybookAddonKnobs

import typings.react.mod.Validator
import typings.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnChangeValidator extends js.Object {
  var knob: Validator[KnobControlConfig[_]]
  var onChange: Validator[js.Function1[/* value */ _, _]]
}

object AnonOnChangeValidator {
  @scala.inline
  def apply(knob: Validator[KnobControlConfig[_]], onChange: Validator[js.Function1[/* value */ _, _]]): AnonOnChangeValidator = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOnChangeValidator]
  }
}

