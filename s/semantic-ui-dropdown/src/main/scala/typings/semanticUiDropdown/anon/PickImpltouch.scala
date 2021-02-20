package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.DelaySettings._Impl, 'touch'> */
@js.native
trait PickImpltouch extends StObject {
  
  var touch: Double = js.native
}
object PickImpltouch {
  
  @scala.inline
  def apply(touch: Double): PickImpltouch = {
    val __obj = js.Dynamic.literal(touch = touch.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltouch]
  }
  
  @scala.inline
  implicit class PickImpltouchMutableBuilder[Self <: PickImpltouch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTouch(value: Double): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
  }
}
