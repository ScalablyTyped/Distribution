package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'showOnFocus'> */
trait PickImplshowOnFocus extends StObject {
  
  var showOnFocus: Boolean
}
object PickImplshowOnFocus {
  
  @scala.inline
  def apply(showOnFocus: Boolean): PickImplshowOnFocus = {
    val __obj = js.Dynamic.literal(showOnFocus = showOnFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplshowOnFocus]
  }
  
  @scala.inline
  implicit class PickImplshowOnFocusMutableBuilder[Self <: PickImplshowOnFocus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShowOnFocus(value: Boolean): Self = StObject.set(x, "showOnFocus", value.asInstanceOf[js.Any])
  }
}
