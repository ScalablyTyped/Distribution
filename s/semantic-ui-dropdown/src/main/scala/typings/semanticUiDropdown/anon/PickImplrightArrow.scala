package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.KeySettings._Impl, 'rightArrow'> */
trait PickImplrightArrow extends StObject {
  
  var rightArrow: Double
}
object PickImplrightArrow {
  
  inline def apply(rightArrow: Double): PickImplrightArrow = {
    val __obj = js.Dynamic.literal(rightArrow = rightArrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplrightArrow]
  }
  
  extension [Self <: PickImplrightArrow](x: Self) {
    
    inline def setRightArrow(value: Double): Self = StObject.set(x, "rightArrow", value.asInstanceOf[js.Any])
  }
}
