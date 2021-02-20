package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.buttonMod.ButtonTypeKnob
import typings.storybookAddonKnobs.buttonMod.ButtonTypeOnClickProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Button.ButtonTypeProps> */
@js.native
trait PartialButtonTypeProps extends StObject {
  
  var knob: js.UndefOr[ButtonTypeKnob] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* value */ scala.Nothing, scala.Nothing]] = js.native
  
  var onClick: js.UndefOr[ButtonTypeOnClickProp] = js.native
}
object PartialButtonTypeProps {
  
  @scala.inline
  def apply(): PartialButtonTypeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialButtonTypeProps]
  }
  
  @scala.inline
  implicit class PartialButtonTypePropsMutableBuilder[Self <: PartialButtonTypeProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKnob(value: ButtonTypeKnob): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKnobUndefined: Self = StObject.set(x, "knob", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* knob */ ButtonTypeKnob => js.Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
