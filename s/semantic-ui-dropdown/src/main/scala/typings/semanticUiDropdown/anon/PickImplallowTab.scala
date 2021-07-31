package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'allowTab'> */
trait PickImplallowTab extends StObject {
  
  var allowTab: Boolean
}
object PickImplallowTab {
  
  @scala.inline
  def apply(allowTab: Boolean): PickImplallowTab = {
    val __obj = js.Dynamic.literal(allowTab = allowTab.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplallowTab]
  }
  
  @scala.inline
  implicit class PickImplallowTabMutableBuilder[Self <: PickImplallowTab] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowTab(value: Boolean): Self = StObject.set(x, "allowTab", value.asInstanceOf[js.Any])
  }
}
