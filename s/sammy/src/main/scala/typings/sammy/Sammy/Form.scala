package typings.sammy.Sammy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Form extends js.Object {
  
  def formFor(name: String, `object`: js.Any, content_callback: js.Function): FormBuilder = js.native
}
object Form {
  
  @scala.inline
  def apply(formFor: (String, js.Any, js.Function) => FormBuilder): Form = {
    val __obj = js.Dynamic.literal(formFor = js.Any.fromFunction3(formFor))
    __obj.asInstanceOf[Form]
  }
  
  @scala.inline
  implicit class FormOps[Self <: Form] (val x: Self) extends AnyVal {
    
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
    def setFormFor(value: (String, js.Any, js.Function) => FormBuilder): Self = this.set("formFor", js.Any.fromFunction3(value))
  }
}
