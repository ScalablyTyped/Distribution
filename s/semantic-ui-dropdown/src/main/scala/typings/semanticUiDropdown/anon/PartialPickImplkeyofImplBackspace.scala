package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.semanticUiDropdownBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.KeySettings._Impl, keyof semantic-ui-dropdown.SemanticUI.Dropdown.KeySettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplBackspace extends js.Object {
  
  var backspace: js.UndefOr[Double] = js.native
  
  var deleteKey: js.UndefOr[Double] = js.native
  
  var delimiter: js.UndefOr[Double | `false`] = js.native
  
  var downArrow: js.UndefOr[Double] = js.native
  
  var enter: js.UndefOr[Double] = js.native
  
  var escape: js.UndefOr[Double] = js.native
  
  var leftArrow: js.UndefOr[Double] = js.native
  
  var pageDown: js.UndefOr[Double] = js.native
  
  var pageUp: js.UndefOr[Double] = js.native
  
  var rightArrow: js.UndefOr[Double] = js.native
  
  var upArrow: js.UndefOr[Double] = js.native
}
object PartialPickImplkeyofImplBackspace {
  
  @scala.inline
  def apply(): PartialPickImplkeyofImplBackspace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplBackspace]
  }
  
  @scala.inline
  implicit class PartialPickImplkeyofImplBackspaceOps[Self <: PartialPickImplkeyofImplBackspace] (val x: Self) extends AnyVal {
    
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
    def setBackspace(value: Double): Self = this.set("backspace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackspace: Self = this.set("backspace", js.undefined)
    
    @scala.inline
    def setDeleteKey(value: Double): Self = this.set("deleteKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteKey: Self = this.set("deleteKey", js.undefined)
    
    @scala.inline
    def setDelimiter(value: Double | `false`): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    
    @scala.inline
    def setDownArrow(value: Double): Self = this.set("downArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownArrow: Self = this.set("downArrow", js.undefined)
    
    @scala.inline
    def setEnter(value: Double): Self = this.set("enter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    
    @scala.inline
    def setEscape(value: Double): Self = this.set("escape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEscape: Self = this.set("escape", js.undefined)
    
    @scala.inline
    def setLeftArrow(value: Double): Self = this.set("leftArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftArrow: Self = this.set("leftArrow", js.undefined)
    
    @scala.inline
    def setPageDown(value: Double): Self = this.set("pageDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageDown: Self = this.set("pageDown", js.undefined)
    
    @scala.inline
    def setPageUp(value: Double): Self = this.set("pageUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageUp: Self = this.set("pageUp", js.undefined)
    
    @scala.inline
    def setRightArrow(value: Double): Self = this.set("rightArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightArrow: Self = this.set("rightArrow", js.undefined)
    
    @scala.inline
    def setUpArrow(value: Double): Self = this.set("upArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpArrow: Self = this.set("upArrow", js.undefined)
  }
}
