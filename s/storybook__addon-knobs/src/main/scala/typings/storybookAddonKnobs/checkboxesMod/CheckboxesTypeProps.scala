package typings.storybookAddonKnobs.checkboxesMod

import typings.storybookAddonKnobs.typesTypesMod.KnobControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckboxesTypeProps
  extends KnobControlProps[CheckboxesTypeKnobValue]
     with CheckboxesWrapperProps {
  
  @JSName("knob")
  var knob_CheckboxesTypeProps: CheckboxesTypeKnob = js.native
}
object CheckboxesTypeProps {
  
  @scala.inline
  def apply(
    isInline: Boolean,
    knob: CheckboxesTypeKnob,
    onChange: CheckboxesTypeKnobValue => CheckboxesTypeKnobValue
  ): CheckboxesTypeProps = {
    val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any], knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[CheckboxesTypeProps]
  }
  
  @scala.inline
  implicit class CheckboxesTypePropsOps[Self <: CheckboxesTypeProps] (val x: Self) extends AnyVal {
    
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
    def setKnob(value: CheckboxesTypeKnob): Self = this.set("knob", value.asInstanceOf[js.Any])
  }
}
