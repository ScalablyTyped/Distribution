package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.arrayMod.ArrayTypeKnob
import typings.storybookAddonKnobs.arrayMod.ArrayTypeKnobValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Array.ArrayTypeProps> */
@js.native
trait ReadonlyArrayTypeProps extends StObject {
  
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
  implicit class ReadonlyArrayTypePropsMutableBuilder[Self <: ReadonlyArrayTypeProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKnob(value: ArrayTypeKnob): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChange(value: /* value */ ArrayTypeKnobValue => ArrayTypeKnobValue): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
  }
}
