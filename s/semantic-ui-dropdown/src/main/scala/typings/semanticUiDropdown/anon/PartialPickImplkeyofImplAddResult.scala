package typings.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.MessageSettings._Impl, keyof semantic-ui-dropdown.SemanticUI.Dropdown.MessageSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplAddResult extends js.Object {
  
  var addResult: js.UndefOr[String] = js.native
  
  var count: js.UndefOr[String] = js.native
  
  var maxSelections: js.UndefOr[String] = js.native
  
  var noResults: js.UndefOr[String] = js.native
}
object PartialPickImplkeyofImplAddResult {
  
  @scala.inline
  def apply(): PartialPickImplkeyofImplAddResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplAddResult]
  }
  
  @scala.inline
  implicit class PartialPickImplkeyofImplAddResultOps[Self <: PartialPickImplkeyofImplAddResult] (val x: Self) extends AnyVal {
    
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
    def setAddResult(value: String): Self = this.set("addResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddResult: Self = this.set("addResult", js.undefined)
    
    @scala.inline
    def setCount(value: String): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setMaxSelections(value: String): Self = this.set("maxSelections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSelections: Self = this.set("maxSelections", js.undefined)
    
    @scala.inline
    def setNoResults(value: String): Self = this.set("noResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoResults: Self = this.set("noResults", js.undefined)
  }
}
