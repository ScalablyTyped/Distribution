package typings.storybookAddonKnobs.numberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/types.KnobControlConfig<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Number.NumberTypeKnobValue> & @storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Number.NumberTypeKnobOptions & {  value :@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Number.NumberTypeKnobValue | undefined} */
@js.native
trait NumberTypeKnob extends js.Object {
  
  var defaultValue: js.UndefOr[NumberTypeKnobValue] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var name: String = js.native
  
  var range: js.UndefOr[Boolean] = js.native
  
  var step: js.UndefOr[Double] = js.native
  
  var value: NumberTypeKnobValue with js.UndefOr[NumberTypeKnobValue] = js.native
}
object NumberTypeKnob {
  
  @scala.inline
  def apply(name: String, value: NumberTypeKnobValue with js.UndefOr[NumberTypeKnobValue]): NumberTypeKnob = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberTypeKnob]
  }
  
  @scala.inline
  implicit class NumberTypeKnobOps[Self <: NumberTypeKnob] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: NumberTypeKnobValue with js.UndefOr[NumberTypeKnobValue]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: NumberTypeKnobValue): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setRange(value: Boolean): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
  }
}
