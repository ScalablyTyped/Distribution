package typings.semanticUiForm.SemanticUI.Form.TemplatesSettings

import typings.semanticUiForm.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Impl extends js.Object {
  
  def error(errors: js.Array[String]): JQuery = js.native
  
  def prompt(errors: js.Array[String]): JQuery = js.native
}
object Impl {
  
  @scala.inline
  def apply(error: js.Array[String] => JQuery, prompt: js.Array[String] => JQuery): Impl = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), prompt = js.Any.fromFunction1(prompt))
    __obj.asInstanceOf[Impl]
  }
  
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
    
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
    def setError(value: js.Array[String] => JQuery): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPrompt(value: js.Array[String] => JQuery): Self = this.set("prompt", js.Any.fromFunction1(value))
  }
}
