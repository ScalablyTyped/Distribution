package typings.storybookAddonKnobs.anon

import typings.std.Extract
import typings.std.PropertyKey
import typings.storybookAddonKnobs.selectMod.SelectTypeKnobValue
import typings.storybookAddonKnobs.selectMod.SelectTypeOptionsProp
import typings.storybookAddonKnobs.storybookAddonKnobsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.SelectTypeKnob<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeKnobValue>, 'value' | 'options'> & {  selectV2 :true} */
@js.native
trait PickSelectTypeKnobSelectT extends js.Object {
  var options: SelectTypeOptionsProp[SelectTypeKnobValue] = js.native
  var selectV2: `true` = js.native
  var value: SelectTypeKnobValue = js.native
}

object PickSelectTypeKnobSelectT {
  @scala.inline
  def apply(options: SelectTypeOptionsProp[SelectTypeKnobValue], selectV2: `true`): PickSelectTypeKnobSelectT = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], selectV2 = selectV2.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickSelectTypeKnobSelectT]
  }
  @scala.inline
  implicit class PickSelectTypeKnobSelectTOps[Self <: PickSelectTypeKnobSelectT] (val x: Self) extends AnyVal {
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
    def setOptionsVarargs(value: (Extract[SelectTypeKnobValue, PropertyKey])*): Self = this.set("options", js.Array(value :_*))
    @scala.inline
    def setOptions(value: SelectTypeOptionsProp[SelectTypeKnobValue]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectV2(value: `true`): Self = this.set("selectV2", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueVarargs(value: PropertyKey*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: SelectTypeKnobValue): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
  
}

