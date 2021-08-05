package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.ErrorSettings._Impl, 'labels'> */
trait PickImpllabels extends StObject {
  
  var labels: String
}
object PickImpllabels {
  
  inline def apply(labels: String): PickImpllabels = {
    val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpllabels]
  }
  
  extension [Self <: PickImpllabels](x: Self) {
    
    inline def setLabels(value: String): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
  }
}
