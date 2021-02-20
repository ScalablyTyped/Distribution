package typings.storybookAddonKnobs.anon

import typings.react.mod.Validator
import typings.storybookAddonKnobs.booleanMod.BooleanTypeKnob
import typings.storybookAddonKnobs.booleanMod.BooleanTypeKnobValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Boolean.BooleanTypeProps> */
@js.native
trait WeakValidationMapBooleanT extends StObject {
  
  var knob: js.UndefOr[Validator[js.UndefOr[BooleanTypeKnob | Null]]] = js.native
  
  var onChange: js.UndefOr[
    Validator[
      js.UndefOr[(js.Function1[/* value */ BooleanTypeKnobValue, BooleanTypeKnobValue]) | Null]
    ]
  ] = js.native
}
object WeakValidationMapBooleanT {
  
  @scala.inline
  def apply(): WeakValidationMapBooleanT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapBooleanT]
  }
  
  @scala.inline
  implicit class WeakValidationMapBooleanTMutableBuilder[Self <: WeakValidationMapBooleanT] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKnob(value: Validator[js.UndefOr[BooleanTypeKnob | Null]]): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKnobUndefined: Self = StObject.set(x, "knob", js.undefined)
    
    @scala.inline
    def setOnChange(
      value: Validator[
          js.UndefOr[(js.Function1[/* value */ BooleanTypeKnobValue, BooleanTypeKnobValue]) | Null]
        ]
    ): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
  }
}
