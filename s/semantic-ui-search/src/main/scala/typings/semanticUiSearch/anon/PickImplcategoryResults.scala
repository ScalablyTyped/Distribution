package typings.semanticUiSearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.FieldsSettings._Impl, 'categoryResults'> */
@js.native
trait PickImplcategoryResults extends js.Object {
  
  var categoryResults: String = js.native
}
object PickImplcategoryResults {
  
  @scala.inline
  def apply(categoryResults: String): PickImplcategoryResults = {
    val __obj = js.Dynamic.literal(categoryResults = categoryResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcategoryResults]
  }
  
  @scala.inline
  implicit class PickImplcategoryResultsOps[Self <: PickImplcategoryResults] (val x: Self) extends AnyVal {
    
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
    def setCategoryResults(value: String): Self = this.set("categoryResults", value.asInstanceOf[js.Any])
  }
}
