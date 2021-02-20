package typings.semanticUiCheckbox.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-checkbox.SemanticUI.Checkbox.ClassNameSettings._Impl, 'radio'> */
@js.native
trait PickImplradio extends StObject {
  
  var radio: String = js.native
}
object PickImplradio {
  
  @scala.inline
  def apply(radio: String): PickImplradio = {
    val __obj = js.Dynamic.literal(radio = radio.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplradio]
  }
  
  @scala.inline
  implicit class PickImplradioMutableBuilder[Self <: PickImplradio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRadio(value: String): Self = StObject.set(x, "radio", value.asInstanceOf[js.Any])
  }
}
