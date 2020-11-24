package typings.storybookAddonKnobs.textMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/types.KnobControlConfig<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Text.TextTypeKnobValue> & {  value :@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Text.TextTypeKnobValue | undefined} */
@js.native
trait TextTypeKnob extends js.Object {
  
  var defaultValue: js.UndefOr[TextTypeKnobValue] = js.native
  
  var name: String = js.native
  
  var value: TextTypeKnobValue with js.UndefOr[TextTypeKnobValue] = js.native
}
object TextTypeKnob {
  
  @scala.inline
  def apply(name: String, value: TextTypeKnobValue with js.UndefOr[TextTypeKnobValue]): TextTypeKnob = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextTypeKnob]
  }
  
  @scala.inline
  implicit class TextTypeKnobOps[Self <: TextTypeKnob] (val x: Self) extends AnyVal {
    
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
    def setValue(value: TextTypeKnobValue with js.UndefOr[TextTypeKnobValue]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: TextTypeKnobValue): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
  }
}
