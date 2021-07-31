package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.SelectorSettings._Impl, 'remove'> */
trait PickImplremove extends StObject {
  
  var remove: String
}
object PickImplremove {
  
  @scala.inline
  def apply(remove: String): PickImplremove = {
    val __obj = js.Dynamic.literal(remove = remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplremove]
  }
  
  @scala.inline
  implicit class PickImplremoveMutableBuilder[Self <: PickImplremove] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemove(value: String): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
  }
}
