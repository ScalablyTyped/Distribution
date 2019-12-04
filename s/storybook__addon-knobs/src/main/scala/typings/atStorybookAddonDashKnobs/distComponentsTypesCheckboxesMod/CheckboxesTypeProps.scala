package typings.atStorybookAddonDashKnobs.distComponentsTypesCheckboxesMod

import typings.atStorybookAddonDashKnobs.distComponentsTypesTypesMod.KnobControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxesTypeProps
  extends KnobControlProps[CheckboxesTypeKnobValue]
     with CheckboxesWrapperProps {
  @JSName("knob")
  var knob_CheckboxesTypeProps: CheckboxesTypeKnob
}

object CheckboxesTypeProps {
  @scala.inline
  def apply(
    isInline: Boolean,
    knob: CheckboxesTypeKnob,
    onChange: CheckboxesTypeKnobValue => CheckboxesTypeKnobValue
  ): CheckboxesTypeProps = {
    val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any], knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
  
    __obj.asInstanceOf[CheckboxesTypeProps]
  }
}

