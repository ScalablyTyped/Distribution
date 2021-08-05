package typings.storybookAddonKnobs.anon

import typings.react.mod.Validator
import typings.storybookAddonKnobs.optionsMod.OptionsKnobOptionsDisplay
import typings.storybookAddonKnobs.optionsMod.OptionsTypeKnob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Options.OptionsTypeProps<any>> */
trait WeakValidationMapOptionsT extends StObject {
  
  var display: js.UndefOr[Validator[js.UndefOr[Null | OptionsKnobOptionsDisplay]]] = js.undefined
  
  var knob: js.UndefOr[Validator[js.UndefOr[Null | OptionsTypeKnob[js.Any]]]] = js.undefined
  
  var onChange: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* value */ js.Any, js.Any]) | Null]]] = js.undefined
}
object WeakValidationMapOptionsT {
  
  inline def apply(): WeakValidationMapOptionsT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapOptionsT]
  }
  
  extension [Self <: WeakValidationMapOptionsT](x: Self) {
    
    inline def setDisplay(value: Validator[js.UndefOr[Null | OptionsKnobOptionsDisplay]]): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setKnob(value: Validator[js.UndefOr[Null | OptionsTypeKnob[js.Any]]]): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    
    inline def setKnobUndefined: Self = StObject.set(x, "knob", js.undefined)
    
    inline def setOnChange(value: Validator[js.UndefOr[(js.Function1[/* value */ js.Any, js.Any]) | Null]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
  }
}
