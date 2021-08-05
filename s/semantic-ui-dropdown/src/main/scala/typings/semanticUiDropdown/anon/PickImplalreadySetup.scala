package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.ErrorSettings._Impl, 'alreadySetup'> */
trait PickImplalreadySetup extends StObject {
  
  var alreadySetup: String
}
object PickImplalreadySetup {
  
  inline def apply(alreadySetup: String): PickImplalreadySetup = {
    val __obj = js.Dynamic.literal(alreadySetup = alreadySetup.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplalreadySetup]
  }
  
  extension [Self <: PickImplalreadySetup](x: Self) {
    
    inline def setAlreadySetup(value: String): Self = StObject.set(x, "alreadySetup", value.asInstanceOf[js.Any])
  }
}
