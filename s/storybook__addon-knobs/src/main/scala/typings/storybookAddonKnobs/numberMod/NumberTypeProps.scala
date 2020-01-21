package typings.storybookAddonKnobs.numberMod

import typings.storybookAddonKnobs.typesTypesMod.KnobControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberTypeProps extends KnobControlProps[NumberTypeKnobValue | Null] {
  @JSName("knob")
  var knob_NumberTypeProps: NumberTypeKnob
}

object NumberTypeProps {
  @scala.inline
  def apply(knob: NumberTypeKnob, onChange: NumberTypeKnobValue | Null => NumberTypeKnobValue | Null): NumberTypeProps = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
  
    __obj.asInstanceOf[NumberTypeProps]
  }
}

