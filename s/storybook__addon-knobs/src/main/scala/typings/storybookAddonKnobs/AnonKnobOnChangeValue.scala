package typings.storybookAddonKnobs

import typings.react.mod.Validator
import typings.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKnobOnChangeValue extends js.Object {
  var knob: Validator[KnobControlConfig[Double]]
  var onChange: Validator[js.Function1[/* value */ Double, Double]]
}

object AnonKnobOnChangeValue {
  @scala.inline
  def apply(
    knob: Validator[KnobControlConfig[Double]],
    onChange: Validator[js.Function1[/* value */ Double, Double]]
  ): AnonKnobOnChangeValue = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKnobOnChangeValue]
  }
}

