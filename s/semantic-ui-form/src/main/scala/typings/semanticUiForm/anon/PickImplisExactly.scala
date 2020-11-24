package typings.semanticUiForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'isExactly'> */
@js.native
trait PickImplisExactly extends js.Object {
  
  var isExactly: String = js.native
}
object PickImplisExactly {
  
  @scala.inline
  def apply(isExactly: String): PickImplisExactly = {
    val __obj = js.Dynamic.literal(isExactly = isExactly.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplisExactly]
  }
  
  @scala.inline
  implicit class PickImplisExactlyOps[Self <: PickImplisExactly] (val x: Self) extends AnyVal {
    
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
    def setIsExactly(value: String): Self = this.set("isExactly", value.asInstanceOf[js.Any])
  }
}
