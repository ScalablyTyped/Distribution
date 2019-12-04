package typings.atStorybookAddonDashKnobs

import typings.atStorybookAddonDashKnobs.distComponentsTypesCheckboxesMod.CheckboxesTypeKnob
import typings.propDashTypes.propDashTypesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsInline extends js.Object {
  var isInline: Validator[Boolean]
  var knob: Validator[CheckboxesTypeKnob]
  var onChange: Validator[js.Function1[/* value */ js.Array[String], js.Array[String]]]
}

object Anon_IsInline {
  @scala.inline
  def apply(
    isInline: Validator[Boolean],
    knob: Validator[CheckboxesTypeKnob],
    onChange: Validator[js.Function1[/* value */ js.Array[String], js.Array[String]]]
  ): Anon_IsInline = {
    val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any], knob = knob.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_IsInline]
  }
}

