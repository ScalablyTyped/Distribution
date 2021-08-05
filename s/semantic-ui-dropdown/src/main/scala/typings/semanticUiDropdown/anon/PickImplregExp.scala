package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.SemanticUI.Dropdown.RegExpSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'regExp'> */
trait PickImplregExp extends StObject {
  
  var regExp: RegExpSettings
}
object PickImplregExp {
  
  inline def apply(regExp: RegExpSettings): PickImplregExp = {
    val __obj = js.Dynamic.literal(regExp = regExp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplregExp]
  }
  
  extension [Self <: PickImplregExp](x: Self) {
    
    inline def setRegExp(value: RegExpSettings): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
  }
}
