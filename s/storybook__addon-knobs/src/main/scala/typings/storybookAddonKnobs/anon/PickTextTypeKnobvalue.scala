package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.textMod.TextTypeKnobValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.TextTypeKnob, 'value'> */
@js.native
trait PickTextTypeKnobvalue extends js.Object {
  
  var value: TextTypeKnobValue = js.native
}
object PickTextTypeKnobvalue {
  
  @scala.inline
  def apply(value: TextTypeKnobValue): PickTextTypeKnobvalue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickTextTypeKnobvalue]
  }
  
  @scala.inline
  implicit class PickTextTypeKnobvalueOps[Self <: PickTextTypeKnobvalue] (val x: Self) extends AnyVal {
    
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
    def setValue(value: TextTypeKnobValue): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
