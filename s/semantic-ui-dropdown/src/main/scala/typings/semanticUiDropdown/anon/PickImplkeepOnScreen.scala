package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'keepOnScreen'> */
trait PickImplkeepOnScreen extends StObject {
  
  var keepOnScreen: Boolean
}
object PickImplkeepOnScreen {
  
  inline def apply(keepOnScreen: Boolean): PickImplkeepOnScreen = {
    val __obj = js.Dynamic.literal(keepOnScreen = keepOnScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplkeepOnScreen]
  }
  
  extension [Self <: PickImplkeepOnScreen](x: Self) {
    
    inline def setKeepOnScreen(value: Boolean): Self = StObject.set(x, "keepOnScreen", value.asInstanceOf[js.Any])
  }
}
