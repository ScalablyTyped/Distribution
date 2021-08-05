package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.textMod.TextTypeKnobValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.TextTypeKnob, 'value'> */
trait PickTextTypeKnobvalue extends StObject {
  
  var value: js.UndefOr[TextTypeKnobValue] = js.undefined
}
object PickTextTypeKnobvalue {
  
  inline def apply(): PickTextTypeKnobvalue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickTextTypeKnobvalue]
  }
  
  extension [Self <: PickTextTypeKnobvalue](x: Self) {
    
    inline def setValue(value: TextTypeKnobValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
