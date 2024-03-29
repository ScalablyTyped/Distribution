package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.distComponentsTypesArrayMod.ArrayTypeKnob
import typings.storybookAddonKnobs.distComponentsTypesArrayMod.ArrayTypeKnobValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Array.ArrayTypeProps> */
trait ReadonlyArrayTypeProps extends StObject {
  
  val knob: ArrayTypeKnob
  
  val onChange: js.Function1[/* value */ ArrayTypeKnobValue, ArrayTypeKnobValue]
}
object ReadonlyArrayTypeProps {
  
  inline def apply(knob: ArrayTypeKnob, onChange: /* value */ ArrayTypeKnobValue => ArrayTypeKnobValue): ReadonlyArrayTypeProps = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[ReadonlyArrayTypeProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyArrayTypeProps] (val x: Self) extends AnyVal {
    
    inline def setKnob(value: ArrayTypeKnob): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: /* value */ ArrayTypeKnobValue => ArrayTypeKnobValue): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
  }
}
