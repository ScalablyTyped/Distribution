package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.ClassNameSettings._Impl, 'upward'> */
trait PickImplupward extends StObject {
  
  var upward: String
}
object PickImplupward {
  
  inline def apply(upward: String): PickImplupward = {
    val __obj = js.Dynamic.literal(upward = upward.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplupward]
  }
  
  extension [Self <: PickImplupward](x: Self) {
    
    inline def setUpward(value: String): Self = StObject.set(x, "upward", value.asInstanceOf[js.Any])
  }
}
