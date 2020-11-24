package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.selectMod.SelectTypeKnob
import typings.storybookAddonKnobs.selectMod.SelectTypeKnobValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeProps<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeKnobValue>> */
@js.native
trait PartialSelectTypePropsSel extends js.Object {
  
  var knob: js.UndefOr[SelectTypeKnob[SelectTypeKnobValue]] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* value */ SelectTypeKnobValue, SelectTypeKnobValue]] = js.native
}
object PartialSelectTypePropsSel {
  
  @scala.inline
  def apply(): PartialSelectTypePropsSel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSelectTypePropsSel]
  }
  
  @scala.inline
  implicit class PartialSelectTypePropsSelOps[Self <: PartialSelectTypePropsSel] (val x: Self) extends AnyVal {
    
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
    def setKnob(value: SelectTypeKnob[SelectTypeKnobValue]): Self = this.set("knob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKnob: Self = this.set("knob", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* value */ SelectTypeKnobValue => SelectTypeKnobValue): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
  }
}
