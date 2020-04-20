package typings.storybookAddonKnobs.booleanMod

import typings.storybookAddonKnobs.typesTypesMod.KnobControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BooleanTypeProps extends KnobControlProps[BooleanTypeKnobValue] {
  @JSName("knob")
  var knob_BooleanTypeProps: BooleanTypeKnob
}

object BooleanTypeProps {
  @scala.inline
  def apply(knob: BooleanTypeKnob, onChange: BooleanTypeKnobValue => BooleanTypeKnobValue): BooleanTypeProps = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[BooleanTypeProps]
  }
}

