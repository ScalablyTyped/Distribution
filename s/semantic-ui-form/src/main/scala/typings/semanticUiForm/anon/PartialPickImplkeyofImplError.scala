package typings.semanticUiForm.anon

import typings.semanticUiForm.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-form.SemanticUI.Form.TemplatesSettings._Impl, keyof semantic-ui-form.SemanticUI.Form.TemplatesSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplError extends js.Object {
  
  var error: js.UndefOr[js.Function1[/* errors */ js.Array[String], JQuery]] = js.native
  
  var prompt: js.UndefOr[js.Function1[/* errors */ js.Array[String], JQuery]] = js.native
}
object PartialPickImplkeyofImplError {
  
  @scala.inline
  def apply(): PartialPickImplkeyofImplError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplError]
  }
  
  @scala.inline
  implicit class PartialPickImplkeyofImplErrorOps[Self <: PartialPickImplkeyofImplError] (val x: Self) extends AnyVal {
    
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
    def setError(value: /* errors */ js.Array[String] => JQuery): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setPrompt(value: /* errors */ js.Array[String] => JQuery): Self = this.set("prompt", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePrompt: Self = this.set("prompt", js.undefined)
  }
}
