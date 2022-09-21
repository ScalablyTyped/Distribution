package typings.storybookAddonKnobs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.ObjectTypeKnob<any>, 'value'> */
trait PickObjectTypeKnobanyvalu extends StObject {
  
  var value: Any
}
object PickObjectTypeKnobanyvalu {
  
  inline def apply(value: Any): PickObjectTypeKnobanyvalu = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickObjectTypeKnobanyvalu]
  }
  
  extension [Self <: PickObjectTypeKnobanyvalu](x: Self) {
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
