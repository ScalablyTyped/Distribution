package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.arrayMod.ArrayTypeKnob
import typings.storybookAddonKnobs.arrayMod.ArrayTypeKnobValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Array.ArrayTypeProps> */
@js.native
trait ReadonlyArrayTypeProps extends js.Object {
  
  val knob: ArrayTypeKnob = js.native
  
  val onChange: js.Function1[/* value */ ArrayTypeKnobValue, ArrayTypeKnobValue] = js.native
}
object ReadonlyArrayTypeProps {
  
  @scala.inline
  def apply(knob: ArrayTypeKnob, onChange: /* value */ ArrayTypeKnobValue => ArrayTypeKnobValue): ReadonlyArrayTypeProps = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[ReadonlyArrayTypeProps]
  }
  
  @scala.inline
  implicit class ReadonlyArrayTypePropsOps[Self <: ReadonlyArrayTypeProps] (val x: Self) extends AnyVal {
    
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
    def setOnChange(value: /* value */ ArrayTypeKnobValue => ArrayTypeKnobValue): Self = this.set("onChange", js.Any.fromFunction1(value))
  }
}
