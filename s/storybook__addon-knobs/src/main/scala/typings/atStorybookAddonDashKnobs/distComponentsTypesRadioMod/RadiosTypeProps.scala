package typings.atStorybookAddonDashKnobs.distComponentsTypesRadioMod

import typings.atStorybookAddonDashKnobs.distComponentsTypesTypesMod.KnobControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadiosTypeProps
  extends KnobControlProps[RadiosTypeKnobValue]
     with RadiosWrapperProps {
  @JSName("knob")
  var knob_RadiosTypeProps: RadiosTypeKnob
}

object RadiosTypeProps {
  @scala.inline
  def apply(isInline: Boolean, knob: RadiosTypeKnob, onChange: RadiosTypeKnobValue => RadiosTypeKnobValue): RadiosTypeProps = {
    val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any], knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
  
    __obj.asInstanceOf[RadiosTypeProps]
  }
}

