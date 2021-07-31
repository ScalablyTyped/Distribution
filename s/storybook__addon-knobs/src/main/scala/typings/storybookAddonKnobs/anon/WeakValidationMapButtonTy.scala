package typings.storybookAddonKnobs.anon

import typings.react.mod.Validator
import typings.storybookAddonKnobs.buttonMod.ButtonTypeKnob
import typings.storybookAddonKnobs.buttonMod.ButtonTypeOnClickProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Button.ButtonTypeProps> */
trait WeakValidationMapButtonTy extends StObject {
  
  var knob: js.UndefOr[Validator[js.UndefOr[ButtonTypeKnob | Null]]] = js.undefined
  
  var onChange: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* value */ scala.Nothing, scala.Nothing]) | Null]]
  ] = js.undefined
  
  var onClick: js.UndefOr[Validator[js.UndefOr[ButtonTypeOnClickProp | Null]]] = js.undefined
}
object WeakValidationMapButtonTy {
  
  @scala.inline
  def apply(): WeakValidationMapButtonTy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapButtonTy]
  }
  
  @scala.inline
  implicit class WeakValidationMapButtonTyMutableBuilder[Self <: WeakValidationMapButtonTy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKnob(value: Validator[js.UndefOr[ButtonTypeKnob | Null]]): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKnobUndefined: Self = StObject.set(x, "knob", js.undefined)
    
    @scala.inline
    def setOnChange(value: Validator[js.UndefOr[(js.Function1[/* value */ scala.Nothing, scala.Nothing]) | Null]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnClick(value: Validator[js.UndefOr[ButtonTypeOnClickProp | Null]]): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
