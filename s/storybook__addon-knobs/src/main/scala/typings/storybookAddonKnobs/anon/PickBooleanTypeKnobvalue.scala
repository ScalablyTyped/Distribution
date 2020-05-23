package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.booleanMod.BooleanTypeKnobValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.BooleanTypeKnob, 'value'> */
trait PickBooleanTypeKnobvalue extends js.Object {
  var value: BooleanTypeKnobValue
}

object PickBooleanTypeKnobvalue {
  @scala.inline
  def apply(value: BooleanTypeKnobValue): PickBooleanTypeKnobvalue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickBooleanTypeKnobvalue]
  }
}

