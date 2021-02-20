package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.KeySettings._Impl, 'upArrow'> */
@js.native
trait PickImplupArrow extends StObject {
  
  var upArrow: Double = js.native
}
object PickImplupArrow {
  
  @scala.inline
  def apply(upArrow: Double): PickImplupArrow = {
    val __obj = js.Dynamic.literal(upArrow = upArrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplupArrow]
  }
  
  @scala.inline
  implicit class PickImplupArrowMutableBuilder[Self <: PickImplupArrow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUpArrow(value: Double): Self = StObject.set(x, "upArrow", value.asInstanceOf[js.Any])
  }
}
