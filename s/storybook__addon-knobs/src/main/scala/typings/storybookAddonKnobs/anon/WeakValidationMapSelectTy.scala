package typings.storybookAddonKnobs.anon

import typings.react.mod.Validator
import typings.storybookAddonKnobs.selectMod.SelectTypeKnob
import typings.storybookAddonKnobs.selectMod.SelectTypeKnobValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeProps<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeKnobValue>> */
@js.native
trait WeakValidationMapSelectTy extends StObject {
  
  var knob: js.UndefOr[Validator[js.UndefOr[Null | SelectTypeKnob[SelectTypeKnobValue]]]] = js.native
  
  var onChange: js.UndefOr[
    Validator[
      js.UndefOr[(js.Function1[/* value */ SelectTypeKnobValue, SelectTypeKnobValue]) | Null]
    ]
  ] = js.native
}
object WeakValidationMapSelectTy {
  
  @scala.inline
  def apply(): WeakValidationMapSelectTy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapSelectTy]
  }
  
  @scala.inline
  implicit class WeakValidationMapSelectTyMutableBuilder[Self <: WeakValidationMapSelectTy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKnob(value: Validator[js.UndefOr[Null | SelectTypeKnob[SelectTypeKnobValue]]]): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKnobUndefined: Self = StObject.set(x, "knob", js.undefined)
    
    @scala.inline
    def setOnChange(
      value: Validator[
          js.UndefOr[(js.Function1[/* value */ SelectTypeKnobValue, SelectTypeKnobValue]) | Null]
        ]
    ): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
  }
}
