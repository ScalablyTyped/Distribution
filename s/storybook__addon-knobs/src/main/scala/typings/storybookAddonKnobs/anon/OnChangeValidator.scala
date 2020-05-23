package typings.storybookAddonKnobs.anon

import typings.react.mod.Validator
import typings.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnChangeValidator extends js.Object {
  var knob: Validator[KnobControlConfig[_]]
  var onChange: Validator[js.Function1[/* value */ _, _]]
}

object OnChangeValidator {
  @scala.inline
  def apply(knob: Validator[KnobControlConfig[_]], onChange: Validator[js.Function1[/* value */ _, _]]): OnChangeValidator = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnChangeValidator]
  }
}

