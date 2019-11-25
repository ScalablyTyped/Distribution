package typings.atStorybookAddonDashKnobs.distComponentsTypesArrayMod

import typings.atStorybookAddonDashKnobs.distComponentsTypesTypesMod.KnobControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayTypeProps extends KnobControlProps[ArrayTypeKnobValue] {
  @JSName("knob")
  var knob_ArrayTypeProps: ArrayTypeKnob
}

object ArrayTypeProps {
  @scala.inline
  def apply(knob: ArrayTypeKnob, onChange: ArrayTypeKnobValue => ArrayTypeKnobValue): ArrayTypeProps = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
  
    __obj.asInstanceOf[ArrayTypeProps]
  }
}

