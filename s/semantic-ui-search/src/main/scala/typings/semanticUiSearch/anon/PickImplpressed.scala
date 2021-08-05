package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.ClassNameSettings._Impl, 'pressed'> */
trait PickImplpressed extends StObject {
  
  var pressed: String
}
object PickImplpressed {
  
  inline def apply(pressed: String): PickImplpressed = {
    val __obj = js.Dynamic.literal(pressed = pressed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpressed]
  }
  
  extension [Self <: PickImplpressed](x: Self) {
    
    inline def setPressed(value: String): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
  }
}
