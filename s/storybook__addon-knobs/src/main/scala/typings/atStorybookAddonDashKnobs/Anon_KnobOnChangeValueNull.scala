package typings.atStorybookAddonDashKnobs

import typings.atStorybookAddonDashKnobs.distComponentsTypesNumberMod.NumberTypeKnob
import typings.propDashTypes.propDashTypesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KnobOnChangeValueNull extends js.Object {
  var knob: Validator[NumberTypeKnob]
  var onChange: Validator[js.Function1[/* value */ Double | Null, Double | Null]]
}

object Anon_KnobOnChangeValueNull {
  @scala.inline
  def apply(
    knob: Validator[NumberTypeKnob],
    onChange: Validator[js.Function1[/* value */ Double | Null, Double | Null]]
  ): Anon_KnobOnChangeValueNull = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_KnobOnChangeValueNull]
  }
}

