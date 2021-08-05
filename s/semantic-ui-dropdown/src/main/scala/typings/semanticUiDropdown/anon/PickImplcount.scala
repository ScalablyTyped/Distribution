package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.MessageSettings._Impl, 'count'> */
trait PickImplcount extends StObject {
  
  var count: String
}
object PickImplcount {
  
  inline def apply(count: String): PickImplcount = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcount]
  }
  
  extension [Self <: PickImplcount](x: Self) {
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
  }
}
