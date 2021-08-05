package typings.storybookAddonKnobs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.ObjectTypeKnob<any>, 'value'> */
trait PickObjectTypeKnobanyvalu extends StObject {
  
  var value: js.Any
}
object PickObjectTypeKnobanyvalu {
  
  inline def apply(value: js.Any): PickObjectTypeKnobanyvalu = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickObjectTypeKnobanyvalu]
  }
  
  extension [Self <: PickObjectTypeKnobanyvalu](x: Self) {
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
