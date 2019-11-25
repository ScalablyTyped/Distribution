package typings.atStorybookAddonDashKnobs

import typings.atStorybookAddonDashKnobs.distComponentsTypesTypesMod.KnobControlConfig
import typings.propDashTypes.propDashTypesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KnobOnChange extends js.Object {
  var knob: Validator[KnobControlConfig[String]]
  var onChange: Validator[js.Function1[/* value */ String, String]]
}

object Anon_KnobOnChange {
  @scala.inline
  def apply(
    knob: Validator[KnobControlConfig[String]],
    onChange: Validator[js.Function1[/* value */ String, String]]
  ): Anon_KnobOnChange = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_KnobOnChange]
  }
}

