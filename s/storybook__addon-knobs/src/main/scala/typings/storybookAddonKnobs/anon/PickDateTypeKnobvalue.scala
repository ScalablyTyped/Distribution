package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.dateMod.DateTypeKnobValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.DateTypeKnob, 'value'> */
trait PickDateTypeKnobvalue extends StObject {
  
  var value: DateTypeKnobValue
}
object PickDateTypeKnobvalue {
  
  inline def apply(value: DateTypeKnobValue): PickDateTypeKnobvalue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickDateTypeKnobvalue]
  }
  
  extension [Self <: PickDateTypeKnobvalue](x: Self) {
    
    inline def setValue(value: DateTypeKnobValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
