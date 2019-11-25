package typings.atStorybookAddonDashKnobs

import typings.atStorybookAddonDashKnobs.distComponentsTypesTypesMod.KnobControlConfig
import typings.propDashTypes.propDashTypesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KnobOnChangeValue extends js.Object {
  var knob: Validator[KnobControlConfig[Double]]
  var onChange: Validator[js.Function1[/* value */ Double, Double]]
}

object Anon_KnobOnChangeValue {
  @scala.inline
  def apply(
    knob: Validator[KnobControlConfig[Double]],
    onChange: Validator[js.Function1[/* value */ Double, Double]]
  ): Anon_KnobOnChangeValue = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_KnobOnChangeValue]
  }
}

