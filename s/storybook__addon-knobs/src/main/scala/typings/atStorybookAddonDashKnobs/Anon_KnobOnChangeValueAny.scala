package typings.atStorybookAddonDashKnobs

import typings.atStorybookAddonDashKnobs.distComponentsTypesTypesMod.KnobControlConfig
import typings.propDashTypes.propDashTypesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KnobOnChangeValueAny extends js.Object {
  var knob: Validator[KnobControlConfig[_]]
  var onChange: Validator[js.Function1[/* value */ _, _]]
}

object Anon_KnobOnChangeValueAny {
  @scala.inline
  def apply(knob: Validator[KnobControlConfig[_]], onChange: Validator[js.Function1[/* value */ _, _]]): Anon_KnobOnChangeValueAny = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_KnobOnChangeValueAny]
  }
}

