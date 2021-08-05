package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.DelaySettings._Impl, 'touch'> */
trait PickImpltouch extends StObject {
  
  var touch: Double
}
object PickImpltouch {
  
  inline def apply(touch: Double): PickImpltouch = {
    val __obj = js.Dynamic.literal(touch = touch.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltouch]
  }
  
  extension [Self <: PickImpltouch](x: Self) {
    
    inline def setTouch(value: Double): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
  }
}
