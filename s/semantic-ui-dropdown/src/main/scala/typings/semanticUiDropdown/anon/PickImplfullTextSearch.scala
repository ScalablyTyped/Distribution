package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.semanticUiDropdownStrings.exact
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'fullTextSearch'> */
trait PickImplfullTextSearch extends StObject {
  
  var fullTextSearch: Boolean | exact
}
object PickImplfullTextSearch {
  
  @scala.inline
  def apply(fullTextSearch: Boolean | exact): PickImplfullTextSearch = {
    val __obj = js.Dynamic.literal(fullTextSearch = fullTextSearch.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplfullTextSearch]
  }
  
  @scala.inline
  implicit class PickImplfullTextSearchMutableBuilder[Self <: PickImplfullTextSearch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFullTextSearch(value: Boolean | exact): Self = StObject.set(x, "fullTextSearch", value.asInstanceOf[js.Any])
  }
}
