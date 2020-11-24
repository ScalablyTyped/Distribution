package typings.semanticUiCheckbox.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-checkbox.SemanticUI.Checkbox.SelectorSettings._Impl, keyof semantic-ui-checkbox.SemanticUI.Checkbox.SelectorSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplInput extends js.Object {
  
  var input: js.UndefOr[String] = js.native
  
  var label: js.UndefOr[String] = js.native
}
object PartialPickImplkeyofImplInput {
  
  @scala.inline
  def apply(): PartialPickImplkeyofImplInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplInput]
  }
  
  @scala.inline
  implicit class PartialPickImplkeyofImplInputOps[Self <: PartialPickImplkeyofImplInput] (val x: Self) extends AnyVal {
    
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
    def setInput(value: String): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
}
