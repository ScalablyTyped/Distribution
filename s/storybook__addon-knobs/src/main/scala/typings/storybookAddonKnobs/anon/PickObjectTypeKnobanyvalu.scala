package typings.storybookAddonKnobs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.ObjectTypeKnob<any>, 'value'> */
@js.native
trait PickObjectTypeKnobanyvalu extends StObject {
  
  var value: js.Any = js.native
}
object PickObjectTypeKnobanyvalu {
  
  @scala.inline
  def apply(value: js.Any): PickObjectTypeKnobanyvalu = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickObjectTypeKnobanyvalu]
  }
  
  @scala.inline
  implicit class PickObjectTypeKnobanyvaluMutableBuilder[Self <: PickObjectTypeKnobanyvalu] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
