package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.KeySettings._Impl, 'backspace'> */
@js.native
trait PickImplbackspace extends StObject {
  
  var backspace: Double = js.native
}
object PickImplbackspace {
  
  @scala.inline
  def apply(backspace: Double): PickImplbackspace = {
    val __obj = js.Dynamic.literal(backspace = backspace.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplbackspace]
  }
  
  @scala.inline
  implicit class PickImplbackspaceMutableBuilder[Self <: PickImplbackspace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackspace(value: Double): Self = StObject.set(x, "backspace", value.asInstanceOf[js.Any])
  }
}
