package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'forceSelection'> */
trait PickImplforceSelection extends StObject {
  
  var forceSelection: Boolean
}
object PickImplforceSelection {
  
  inline def apply(forceSelection: Boolean): PickImplforceSelection = {
    val __obj = js.Dynamic.literal(forceSelection = forceSelection.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplforceSelection]
  }
  
  extension [Self <: PickImplforceSelection](x: Self) {
    
    inline def setForceSelection(value: Boolean): Self = StObject.set(x, "forceSelection", value.asInstanceOf[js.Any])
  }
}
