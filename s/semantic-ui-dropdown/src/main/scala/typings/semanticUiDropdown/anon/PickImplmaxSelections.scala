package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.semanticUiDropdownBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'maxSelections'> */
trait PickImplmaxSelections extends StObject {
  
  var maxSelections: `false` | Double
}
object PickImplmaxSelections {
  
  inline def apply(maxSelections: `false` | Double): PickImplmaxSelections = {
    val __obj = js.Dynamic.literal(maxSelections = maxSelections.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmaxSelections]
  }
  
  extension [Self <: PickImplmaxSelections](x: Self) {
    
    inline def setMaxSelections(value: `false` | Double): Self = StObject.set(x, "maxSelections", value.asInstanceOf[js.Any])
  }
}
