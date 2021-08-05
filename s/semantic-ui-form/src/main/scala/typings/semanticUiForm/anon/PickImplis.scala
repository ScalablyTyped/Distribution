package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'is'> */
trait PickImplis extends StObject {
  
  var is: String
}
object PickImplis {
  
  inline def apply(is: String): PickImplis = {
    val __obj = js.Dynamic.literal(is = is.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplis]
  }
  
  extension [Self <: PickImplis](x: Self) {
    
    inline def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
  }
}
