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
  
  @scala.inline
  def apply(): PartialBooleanTypeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBooleanTypeProps]
  }
  
  @scala.inline
  implicit class PartialBooleanTypePropsMutableBuilder[Self <: PartialBooleanTypeProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKnob(value: BooleanTypeKnob): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKnobUndefined: Self = StObject.set(x, "knob", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* value */ BooleanTypeKnobValue => BooleanTypeKnobValue): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
  }
}
