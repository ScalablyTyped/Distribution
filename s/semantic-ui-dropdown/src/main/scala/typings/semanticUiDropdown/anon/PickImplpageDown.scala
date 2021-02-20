package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.KeySettings._Impl, 'pageDown'> */
@js.native
trait PickImplpageDown extends StObject {
  
  var pageDown: Double = js.native
}
object PickImplpageDown {
  
  @scala.inline
  def apply(pageDown: Double): PickImplpageDown = {
    val __obj = js.Dynamic.literal(pageDown = pageDown.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpageDown]
  }
  
  @scala.inline
  implicit class PickImplpageDownMutableBuilder[Self <: PickImplpageDown] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPageDown(value: Double): Self = StObject.set(x, "pageDown", value.asInstanceOf[js.Any])
  }
}
