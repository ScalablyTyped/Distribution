package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.ClassNameSettings._Impl, 'search'> */
trait PickImplsearchSearch extends StObject {
  
  var search: String
}
object PickImplsearchSearch {
  
  @scala.inline
  def apply(search: String): PickImplsearchSearch = {
    val __obj = js.Dynamic.literal(search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsearchSearch]
  }
  
  @scala.inline
  implicit class PickImplsearchSearchMutableBuilder[Self <: PickImplsearchSearch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
  }
}
