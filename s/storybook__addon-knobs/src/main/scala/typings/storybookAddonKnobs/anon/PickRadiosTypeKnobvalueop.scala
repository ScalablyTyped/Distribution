package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.radioMod.RadiosTypeKnobValue
import typings.storybookAddonKnobs.radioMod.RadiosTypeOptionsProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.RadiosTypeKnob, 'value' | 'options'> */
@js.native
trait PickRadiosTypeKnobvalueop extends js.Object {
  var options: RadiosTypeOptionsProp[RadiosTypeKnobValue] = js.native
  var value: RadiosTypeKnobValue = js.native
}

object PickRadiosTypeKnobvalueop {
  @scala.inline
  def apply(options: RadiosTypeOptionsProp[RadiosTypeKnobValue]): PickRadiosTypeKnobvalueop = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickRadiosTypeKnobvalueop]
  }
  @scala.inline
  implicit class PickRadiosTypeKnobvalueopOps[Self <: PickRadiosTypeKnobvalueop] (val x: Self) extends AnyVal {
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
    def setOptions(value: RadiosTypeOptionsProp[RadiosTypeKnobValue]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: RadiosTypeKnobValue): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
  
}

