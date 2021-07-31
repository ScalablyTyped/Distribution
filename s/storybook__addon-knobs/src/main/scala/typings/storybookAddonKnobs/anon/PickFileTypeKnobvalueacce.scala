package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.filesMod.DateTypeKnobValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.FileTypeKnob, 'value' | 'accept'> */
trait PickFileTypeKnobvalueacce extends StObject {
  
  var accept: String
  
  var value: DateTypeKnobValue
}
object PickFileTypeKnobvalueacce {
  
  @scala.inline
  def apply(accept: String, value: DateTypeKnobValue): PickFileTypeKnobvalueacce = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickFileTypeKnobvalueacce]
  }
  
  @scala.inline
  implicit class PickFileTypeKnobvalueacceMutableBuilder[Self <: PickFileTypeKnobvalueacce] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: DateTypeKnobValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
