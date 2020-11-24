package typings.semanticUiSearch.SemanticUI.Search.TemplatesSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Impl extends js.Object {
  
  def category(response: js.Any): String = js.native
  
  def escape(string: String): String = js.native
  
  def message(message: String, `type`: String): String = js.native
  
  def standard(response: js.Any): String = js.native
}
object Impl {
  
  @scala.inline
  def apply(
    category: js.Any => String,
    escape: String => String,
    message: (String, String) => String,
    standard: js.Any => String
  ): Impl = {
    val __obj = js.Dynamic.literal(category = js.Any.fromFunction1(category), escape = js.Any.fromFunction1(escape), message = js.Any.fromFunction2(message), standard = js.Any.fromFunction1(standard))
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
    def setCategory(value: js.Any => String): Self = this.set("category", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEscape(value: String => String): Self = this.set("escape", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMessage(value: (String, String) => String): Self = this.set("message", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStandard(value: js.Any => String): Self = this.set("standard", js.Any.fromFunction1(value))
  }
}
