package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.arrayMod.ArrayTypeKnob
import typings.storybookAddonKnobs.arrayMod.ArrayTypeKnobValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Array.ArrayTypeProps> */
@js.native
trait PartialArrayTypeProps extends js.Object {
  
  var knob: js.UndefOr[ArrayTypeKnob] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* value */ ArrayTypeKnobValue, ArrayTypeKnobValue]] = js.native
}
object PartialArrayTypeProps {
  
  @scala.inline
  def apply(): PartialArrayTypeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialArrayTypeProps]
  }
  
  @scala.inline
  implicit class PartialArrayTypePropsOps[Self <: PartialArrayTypeProps] (val x: Self) extends AnyVal {
    
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
    def setKnob(value: ArrayTypeKnob): Self = this.set("knob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKnob: Self = this.set("knob", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* value */ ArrayTypeKnobValue => ArrayTypeKnobValue): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
  }
}
