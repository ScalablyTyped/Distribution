package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.booleanMod.BooleanTypeKnob
import typings.storybookAddonKnobs.booleanMod.BooleanTypeKnobValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Boolean.BooleanTypeProps> */
trait PartialBooleanTypeProps extends StObject {
  
  var knob: js.UndefOr[BooleanTypeKnob] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* value */ BooleanTypeKnobValue, BooleanTypeKnobValue]] = js.undefined
}
object PartialBooleanTypeProps {
  
  inline def apply(): PartialBooleanTypeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBooleanTypeProps]
  }
  
  extension [Self <: PartialBooleanTypeProps](x: Self) {
    
    inline def setKnob(value: BooleanTypeKnob): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    
    inline def setKnobUndefined: Self = StObject.set(x, "knob", js.undefined)
    
    inline def setOnChange(value: /* value */ BooleanTypeKnobValue => BooleanTypeKnobValue): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
  }
}
