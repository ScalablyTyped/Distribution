package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'doesntContain'> */
trait PickImpldoesntContain extends StObject {
  
  var doesntContain: String
}
object PickImpldoesntContain {
  
  inline def apply(doesntContain: String): PickImpldoesntContain = {
    val __obj = js.Dynamic.literal(doesntContain = doesntContain.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldoesntContain]
  }
  
  extension [Self <: PickImpldoesntContain](x: Self) {
    
    inline def setDoesntContain(value: String): Self = StObject.set(x, "doesntContain", value.asInstanceOf[js.Any])
  }
}
