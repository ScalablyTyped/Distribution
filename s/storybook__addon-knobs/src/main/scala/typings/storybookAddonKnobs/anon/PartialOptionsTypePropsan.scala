package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.optionsMod.OptionsKnobOptionsDisplay
import typings.storybookAddonKnobs.optionsMod.OptionsTypeKnob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Options.OptionsTypeProps<any>> */
trait PartialOptionsTypePropsan extends StObject {
  
  var display: js.UndefOr[OptionsKnobOptionsDisplay] = js.undefined
  
  var knob: js.UndefOr[OptionsTypeKnob[Any]] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* value */ Any, Any]] = js.undefined
}
object PartialOptionsTypePropsan {
  
  inline def apply(): PartialOptionsTypePropsan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsTypePropsan]
  }
  
  extension [Self <: PartialOptionsTypePropsan](x: Self) {
    
    inline def setDisplay(value: OptionsKnobOptionsDisplay): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setKnob(value: OptionsTypeKnob[Any]): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    
    inline def setKnobUndefined: Self = StObject.set(x, "knob", js.undefined)
    
    inline def setOnChange(value: /* value */ Any => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
  }
}
