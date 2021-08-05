package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.KeySettings._Impl, 'pageDown'> */
trait PickImplpageDown extends StObject {
  
  var pageDown: Double
}
object PickImplpageDown {
  
  inline def apply(pageDown: Double): PickImplpageDown = {
    val __obj = js.Dynamic.literal(pageDown = pageDown.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpageDown]
  }
  
  extension [Self <: PickImplpageDown](x: Self) {
    
    inline def setPageDown(value: Double): Self = StObject.set(x, "pageDown", value.asInstanceOf[js.Any])
  }
}
