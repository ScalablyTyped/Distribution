package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.KeySettings._Impl, 'escape'> */
trait PickImplescape extends StObject {
  
  var escape: Double
}
object PickImplescape {
  
  inline def apply(escape: Double): PickImplescape = {
    val __obj = js.Dynamic.literal(escape = escape.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplescape]
  }
  
  extension [Self <: PickImplescape](x: Self) {
    
    inline def setEscape(value: Double): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
  }
}
