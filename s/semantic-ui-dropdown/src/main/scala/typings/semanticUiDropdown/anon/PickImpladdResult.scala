package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.MessageSettings._Impl, 'addResult'> */
trait PickImpladdResult extends StObject {
  
  var addResult: String
}
object PickImpladdResult {
  
  inline def apply(addResult: String): PickImpladdResult = {
    val __obj = js.Dynamic.literal(addResult = addResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpladdResult]
  }
  
  extension [Self <: PickImpladdResult](x: Self) {
    
    inline def setAddResult(value: String): Self = StObject.set(x, "addResult", value.asInstanceOf[js.Any])
  }
}
