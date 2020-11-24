package typings.semanticUiForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-form.SemanticUI.Form.SelectorSettings._Impl, keyof semantic-ui-form.SemanticUI.Form.SelectorSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplField extends js.Object {
  
  var field: js.UndefOr[String] = js.native
  
  var group: js.UndefOr[String] = js.native
  
  var input: js.UndefOr[String] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var prompt: js.UndefOr[String] = js.native
  
  var submit: js.UndefOr[String] = js.native
}
object PartialPickImplkeyofImplField {
  
  @scala.inline
  def apply(): PartialPickImplkeyofImplField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplField]
  }
  
  @scala.inline
  implicit class PartialPickImplkeyofImplFieldOps[Self <: PartialPickImplkeyofImplField] (val x: Self) extends AnyVal {
    
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
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setInput(value: String): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setPrompt(value: String): Self = this.set("prompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrompt: Self = this.set("prompt", js.undefined)
    
    @scala.inline
    def setSubmit(value: String): Self = this.set("submit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmit: Self = this.set("submit", js.undefined)
  }
}
