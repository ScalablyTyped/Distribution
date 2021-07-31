package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.optionsMod.OptionsKnobOptionsDisplay
import typings.storybookAddonKnobs.optionsMod.OptionsTypeKnob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Options.OptionsTypeProps<any>> */
trait PartialOptionsTypePropsan extends StObject {
  
  var display: js.UndefOr[OptionsKnobOptionsDisplay] = js.undefined
  
  var knob: js.UndefOr[OptionsTypeKnob[js.Any]] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* value */ js.Any, js.Any]] = js.undefined
}
object PartialOptionsTypePropsan {
  
  @scala.inline
  def apply(): PartialOptionsTypePropsan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsTypePropsan]
  }
  
  @scala.inline
  implicit class PartialOptionsTypePropsanMutableBuilder[Self <: PartialOptionsTypePropsan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplay(value: OptionsKnobOptionsDisplay): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setKnob(value: OptionsTypeKnob[js.Any]): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKnobUndefined: Self = StObject.set(x, "knob", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* value */ js.Any => js.Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
  }
}
