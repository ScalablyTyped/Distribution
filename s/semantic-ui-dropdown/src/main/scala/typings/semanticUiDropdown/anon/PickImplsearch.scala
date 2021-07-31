package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.DelaySettings._Impl, 'search'> */
trait PickImplsearch extends StObject {
  
  var search: Double
}
object PickImplsearch {
  
  @scala.inline
  def apply(search: Double): PickImplsearch = {
    val __obj = js.Dynamic.literal(search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsearch]
  }
  
  @scala.inline
  implicit class PickImplsearchMutableBuilder[Self <: PickImplsearch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSearch(value: Double): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
  }
}
