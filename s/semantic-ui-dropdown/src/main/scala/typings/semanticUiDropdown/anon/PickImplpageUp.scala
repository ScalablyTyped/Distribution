package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.KeySettings._Impl, 'pageUp'> */
trait PickImplpageUp extends StObject {
  
  var pageUp: Double
}
object PickImplpageUp {
  
  inline def apply(pageUp: Double): PickImplpageUp = {
    val __obj = js.Dynamic.literal(pageUp = pageUp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpageUp]
  }
  
  extension [Self <: PickImplpageUp](x: Self) {
    
    inline def setPageUp(value: Double): Self = StObject.set(x, "pageUp", value.asInstanceOf[js.Any])
  }
}
