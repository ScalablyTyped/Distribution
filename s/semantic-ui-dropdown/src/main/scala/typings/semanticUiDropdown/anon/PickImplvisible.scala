package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.ClassNameSettings._Impl, 'visible'> */
@js.native
trait PickImplvisible extends StObject {
  
  var visible: String = js.native
}
object PickImplvisible {
  
  @scala.inline
  def apply(visible: String): PickImplvisible = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplvisible]
  }
  
  @scala.inline
  implicit class PickImplvisibleMutableBuilder[Self <: PickImplvisible] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVisible(value: String): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
