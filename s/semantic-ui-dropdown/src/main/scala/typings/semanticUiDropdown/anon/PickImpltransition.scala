package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.semanticUiDropdownStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'transition'> */
trait PickImpltransition extends StObject {
  
  var transition: auto | String
}
object PickImpltransition {
  
  inline def apply(transition: auto | String): PickImpltransition = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltransition]
  }
  
  extension [Self <: PickImpltransition](x: Self) {
    
    inline def setTransition(value: auto | String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
  }
}
