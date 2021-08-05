package typings.semanticUiCheckbox.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-checkbox.SemanticUI.Checkbox.ClassNameSettings._Impl, 'radio'> */
trait PickImplradio extends StObject {
  
  var radio: String
}
object PickImplradio {
  
  inline def apply(radio: String): PickImplradio = {
    val __obj = js.Dynamic.literal(radio = radio.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplradio]
  }
  
  extension [Self <: PickImplradio](x: Self) {
    
    inline def setRadio(value: String): Self = StObject.set(x, "radio", value.asInstanceOf[js.Any])
  }
}
