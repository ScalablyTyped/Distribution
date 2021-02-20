package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.selectMod.SelectTypeKnob
import typings.storybookAddonKnobs.selectMod.SelectTypeKnobValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeProps<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeKnobValue>> */
@js.native
trait PartialSelectTypePropsSel extends StObject {
  
  var knob: js.UndefOr[SelectTypeKnob[SelectTypeKnobValue]] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* value */ SelectTypeKnobValue, SelectTypeKnobValue]] = js.native
}
object PartialSelectTypePropsSel {
  
  @scala.inline
  def apply(): PartialSelectTypePropsSel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSelectTypePropsSel]
  }
  
  @scala.inline
  implicit class PartialSelectTypePropsSelMutableBuilder[Self <: PartialSelectTypePropsSel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKnob(value: SelectTypeKnob[SelectTypeKnobValue]): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKnobUndefined: Self = StObject.set(x, "knob", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* value */ SelectTypeKnobValue => SelectTypeKnobValue): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
  }
}
