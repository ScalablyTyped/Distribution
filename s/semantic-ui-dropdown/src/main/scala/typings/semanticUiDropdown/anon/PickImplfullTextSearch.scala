package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.semanticUiDropdownStrings.exact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'fullTextSearch'> */
@js.native
trait PickImplfullTextSearch extends js.Object {
  
  var fullTextSearch: Boolean | exact = js.native
}
object PickImplfullTextSearch {
  
  @scala.inline
  def apply(fullTextSearch: Boolean | exact): PickImplfullTextSearch = {
    val __obj = js.Dynamic.literal(fullTextSearch = fullTextSearch.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplfullTextSearch]
  }
  
  @scala.inline
  implicit class PickImplfullTextSearchOps[Self <: PickImplfullTextSearch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFullTextSearch(value: Boolean | exact): Self = this.set("fullTextSearch", value.asInstanceOf[js.Any])
  }
}
