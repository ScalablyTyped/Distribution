package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.KeySettings._Impl, 'enter'> */
trait PickImplenter extends StObject {
  
  var enter: Double
}
object PickImplenter {
  
  inline def apply(enter: Double): PickImplenter = {
    val __obj = js.Dynamic.literal(enter = enter.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplenter]
  }
  
  extension [Self <: PickImplenter](x: Self) {
    
    inline def setEnter(value: Double): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
  }
}
