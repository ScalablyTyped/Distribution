package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'containExactly'> */
trait PickImplcontainExactly extends StObject {
  
  var containExactly: String
}
object PickImplcontainExactly {
  
  inline def apply(containExactly: String): PickImplcontainExactly = {
    val __obj = js.Dynamic.literal(containExactly = containExactly.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcontainExactly]
  }
  
  extension [Self <: PickImplcontainExactly](x: Self) {
    
    inline def setContainExactly(value: String): Self = StObject.set(x, "containExactly", value.asInstanceOf[js.Any])
  }
}
