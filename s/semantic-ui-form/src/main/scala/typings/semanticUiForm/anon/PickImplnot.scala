package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'not'> */
trait PickImplnot extends StObject {
  
  var not: String
}
object PickImplnot {
  
  inline def apply(not: String): PickImplnot = {
    val __obj = js.Dynamic.literal(not = not.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplnot]
  }
  
  extension [Self <: PickImplnot](x: Self) {
    
    inline def setNot(value: String): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
  }
}
