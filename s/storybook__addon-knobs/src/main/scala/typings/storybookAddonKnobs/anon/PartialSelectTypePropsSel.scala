package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.distComponentsTypesSelectMod.SelectTypeKnob
import typings.storybookAddonKnobs.distComponentsTypesSelectMod.SelectTypeKnobValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeProps<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeKnobValue>> */
trait PartialSelectTypePropsSel extends StObject {
  
  var knob: js.UndefOr[SelectTypeKnob[SelectTypeKnobValue]] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* value */ SelectTypeKnobValue, SelectTypeKnobValue]] = js.undefined
}
object PartialSelectTypePropsSel {
  
  inline def apply(): PartialSelectTypePropsSel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSelectTypePropsSel]
  }
  
  extension [Self <: PartialSelectTypePropsSel](x: Self) {
    
    inline def setKnob(value: SelectTypeKnob[SelectTypeKnobValue]): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    
    inline def setKnobUndefined: Self = StObject.set(x, "knob", js.undefined)
    
    inline def setOnChange(value: /* value */ SelectTypeKnobValue => SelectTypeKnobValue): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
  }
}
