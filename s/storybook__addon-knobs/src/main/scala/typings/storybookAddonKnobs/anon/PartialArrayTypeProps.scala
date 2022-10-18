package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.distComponentsTypesArrayMod.ArrayTypeKnob
import typings.storybookAddonKnobs.distComponentsTypesArrayMod.ArrayTypeKnobValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Array.ArrayTypeProps> */
trait PartialArrayTypeProps extends StObject {
  
  var knob: js.UndefOr[ArrayTypeKnob] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* value */ ArrayTypeKnobValue, ArrayTypeKnobValue]] = js.undefined
}
object PartialArrayTypeProps {
  
  inline def apply(): PartialArrayTypeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialArrayTypeProps]
  }
  
  extension [Self <: PartialArrayTypeProps](x: Self) {
    
    inline def setKnob(value: ArrayTypeKnob): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    
    inline def setKnobUndefined: Self = StObject.set(x, "knob", js.undefined)
    
    inline def setOnChange(value: /* value */ ArrayTypeKnobValue => ArrayTypeKnobValue): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
  }
}
