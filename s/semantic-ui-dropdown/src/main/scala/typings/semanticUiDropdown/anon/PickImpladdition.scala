package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.ClassNameSettings._Impl, 'addition'> */
trait PickImpladdition extends StObject {
  
  var addition: String
}
object PickImpladdition {
  
  inline def apply(addition: String): PickImpladdition = {
    val __obj = js.Dynamic.literal(addition = addition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpladdition]
  }
  
  extension [Self <: PickImpladdition](x: Self) {
    
    inline def setAddition(value: String): Self = StObject.set(x, "addition", value.asInstanceOf[js.Any])
  }
}
