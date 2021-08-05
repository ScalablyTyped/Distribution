package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'useLabels'> */
trait PickImpluseLabels extends StObject {
  
  var useLabels: Boolean
}
object PickImpluseLabels {
  
  inline def apply(useLabels: Boolean): PickImpluseLabels = {
    val __obj = js.Dynamic.literal(useLabels = useLabels.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpluseLabels]
  }
  
  extension [Self <: PickImpluseLabels](x: Self) {
    
    inline def setUseLabels(value: Boolean): Self = StObject.set(x, "useLabels", value.asInstanceOf[js.Any])
  }
}
