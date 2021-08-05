package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.LabelSettings._Impl, 'transition'> */
trait PickImpltransitionTransition extends StObject {
  
  var transition: String
}
object PickImpltransitionTransition {
  
  inline def apply(transition: String): PickImpltransitionTransition = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltransitionTransition]
  }
  
  extension [Self <: PickImpltransitionTransition](x: Self) {
    
    inline def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
  }
}
