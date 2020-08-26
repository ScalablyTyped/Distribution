package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.booleanMod.BooleanTypeKnobValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.BooleanTypeKnob, 'value'> */
@js.native
trait PickBooleanTypeKnobvalue extends js.Object {
  var value: BooleanTypeKnobValue = js.native
}

object PickBooleanTypeKnobvalue {
  @scala.inline
  def apply(value: BooleanTypeKnobValue): PickBooleanTypeKnobvalue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickBooleanTypeKnobvalue]
  }
  @scala.inline
  implicit class PickBooleanTypeKnobvalueOps[Self <: PickBooleanTypeKnobvalue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setValue(value: BooleanTypeKnobValue): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

