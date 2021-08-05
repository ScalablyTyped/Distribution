package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.ErrorSettings._Impl, 'noTransition'> */
trait PickImplnoTransition extends StObject {
  
  var noTransition: String
}
object PickImplnoTransition {
  
  inline def apply(noTransition: String): PickImplnoTransition = {
    val __obj = js.Dynamic.literal(noTransition = noTransition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplnoTransition]
  }
  
  extension [Self <: PickImplnoTransition](x: Self) {
    
    inline def setNoTransition(value: String): Self = StObject.set(x, "noTransition", value.asInstanceOf[js.Any])
  }
}
