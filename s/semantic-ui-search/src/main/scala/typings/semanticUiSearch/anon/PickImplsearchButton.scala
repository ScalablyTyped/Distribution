package typings.semanticUiSearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.SelectorSettings._Impl, 'searchButton'> */
@js.native
trait PickImplsearchButton extends js.Object {
  
  var searchButton: String = js.native
}
object PickImplsearchButton {
  
  @scala.inline
  def apply(searchButton: String): PickImplsearchButton = {
    val __obj = js.Dynamic.literal(searchButton = searchButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsearchButton]
  }
  
  @scala.inline
  implicit class PickImplsearchButtonOps[Self <: PickImplsearchButton] (val x: Self) extends AnyVal {
    
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
    def setSearchButton(value: String): Self = this.set("searchButton", value.asInstanceOf[js.Any])
  }
}
