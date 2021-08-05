package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.colorMod.ColorTypeKnobValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.ColorTypeKnob, 'value'> */
trait PickColorTypeKnobvalue extends StObject {
  
  var value: ColorTypeKnobValue
}
object PickColorTypeKnobvalue {
  
  inline def apply(value: ColorTypeKnobValue): PickColorTypeKnobvalue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickColorTypeKnobvalue]
  }
  
  extension [Self <: PickColorTypeKnobvalue](x: Self) {
    
    inline def setValue(value: ColorTypeKnobValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
