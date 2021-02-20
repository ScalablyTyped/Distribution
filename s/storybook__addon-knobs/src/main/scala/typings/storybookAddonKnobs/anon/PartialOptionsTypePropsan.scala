package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.optionsMod.OptionsKnobOptionsDisplay
import typings.storybookAddonKnobs.optionsMod.OptionsTypeKnob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Options.OptionsTypeProps<any>> */
@js.native
trait PartialOptionsTypePropsan extends StObject {
  
  var display: js.UndefOr[OptionsKnobOptionsDisplay] = js.native
  
  var knob: js.UndefOr[OptionsTypeKnob[_]] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.native
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
    def setKnob(value: OptionsTypeKnob[_]): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKnobUndefined: Self = StObject.set(x, "knob", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* value */ js.Any => _): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
  }
}
