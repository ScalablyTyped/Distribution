package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.KeySettings._Impl, 'downArrow'> */
@js.native
trait PickImpldownArrow extends StObject {
  
  var downArrow: Double = js.native
}
object PickImpldownArrow {
  
  @scala.inline
  def apply(downArrow: Double): PickImpldownArrow = {
    val __obj = js.Dynamic.literal(downArrow = downArrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldownArrow]
  }
  
  @scala.inline
  implicit class PickImpldownArrowMutableBuilder[Self <: PickImpldownArrow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDownArrow(value: Double): Self = StObject.set(x, "downArrow", value.asInstanceOf[js.Any])
  }
}
