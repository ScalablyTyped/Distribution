package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.distComponentsTypesButtonMod.ButtonTypeKnob
import typings.storybookAddonKnobs.distComponentsTypesButtonMod.ButtonTypeOnClickProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Button.ButtonTypeProps> */
trait PartialButtonTypeProps extends StObject {
  
  var knob: js.UndefOr[ButtonTypeKnob] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* value */ scala.Nothing, scala.Nothing]] = js.undefined
  
  var onClick: js.UndefOr[ButtonTypeOnClickProp] = js.undefined
}
object PartialButtonTypeProps {
  
  inline def apply(): PartialButtonTypeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialButtonTypeProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialButtonTypeProps] (val x: Self) extends AnyVal {
    
    inline def setKnob(value: ButtonTypeKnob): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    
    inline def setKnobUndefined: Self = StObject.set(x, "knob", js.undefined)
    
    inline def setOnClick(value: /* knob */ ButtonTypeKnob => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
