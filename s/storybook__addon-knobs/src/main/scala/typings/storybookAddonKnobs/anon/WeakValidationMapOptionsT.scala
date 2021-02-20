package typings.storybookAddonKnobs.anon

import typings.react.mod.Validator
import typings.storybookAddonKnobs.optionsMod.OptionsKnobOptionsDisplay
import typings.storybookAddonKnobs.optionsMod.OptionsTypeKnob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Options.OptionsTypeProps<any>> */
@js.native
trait WeakValidationMapOptionsT extends StObject {
  
  var display: js.UndefOr[Validator[js.UndefOr[Null | OptionsKnobOptionsDisplay]]] = js.native
  
  var knob: js.UndefOr[Validator[js.UndefOr[Null | OptionsTypeKnob[_]]]] = js.native
  
  var onChange: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* value */ _, _]) | Null]]] = js.native
}
object WeakValidationMapOptionsT {
  
  @scala.inline
  def apply(): WeakValidationMapOptionsT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapOptionsT]
  }
  
  @scala.inline
  implicit class WeakValidationMapOptionsTMutableBuilder[Self <: WeakValidationMapOptionsT] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplay(value: Validator[js.UndefOr[Null | OptionsKnobOptionsDisplay]]): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setKnob(value: Validator[js.UndefOr[Null | OptionsTypeKnob[_]]]): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKnobUndefined: Self = StObject.set(x, "knob", js.undefined)
    
    @scala.inline
    def setOnChange(value: Validator[js.UndefOr[(js.Function1[/* value */ _, _]) | Null]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
  }
}
