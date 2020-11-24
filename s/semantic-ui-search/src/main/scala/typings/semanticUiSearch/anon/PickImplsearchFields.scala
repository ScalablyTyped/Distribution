package typings.semanticUiSearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, 'searchFields'> */
@js.native
trait PickImplsearchFields extends js.Object {
  
  var searchFields: js.Array[String] = js.native
}
object PickImplsearchFields {
  
  @scala.inline
  def apply(searchFields: js.Array[String]): PickImplsearchFields = {
    val __obj = js.Dynamic.literal(searchFields = searchFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsearchFields]
  }
  
  @scala.inline
  implicit class PickImplsearchFieldsOps[Self <: PickImplsearchFields] (val x: Self) extends AnyVal {
    
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
    def setSearchFieldsVarargs(value: String*): Self = this.set("searchFields", js.Array(value :_*))
    
    @scala.inline
    def setSearchFields(value: js.Array[String]): Self = this.set("searchFields", value.asInstanceOf[js.Any])
  }
}
