package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.KeySettings._Impl, 'downArrow'> */
trait PickImpldownArrow extends StObject {
  
  var downArrow: Double
}
object PickImpldownArrow {
  
  inline def apply(downArrow: Double): PickImpldownArrow = {
    val __obj = js.Dynamic.literal(downArrow = downArrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldownArrow]
  }
  
  extension [Self <: PickImpldownArrow](x: Self) {
    
    inline def setDownArrow(value: Double): Self = StObject.set(x, "downArrow", value.asInstanceOf[js.Any])
  }
}
