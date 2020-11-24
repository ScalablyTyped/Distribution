package typings.semanticUiForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'notExactly'> */
@js.native
trait PickImplnotExactly extends js.Object {
  
  var notExactly: String = js.native
}
object PickImplnotExactly {
  
  @scala.inline
  def apply(notExactly: String): PickImplnotExactly = {
    val __obj = js.Dynamic.literal(notExactly = notExactly.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplnotExactly]
  }
  
  @scala.inline
  implicit class PickImplnotExactlyOps[Self <: PickImplnotExactly] (val x: Self) extends AnyVal {
    
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
    def setNotExactly(value: String): Self = this.set("notExactly", value.asInstanceOf[js.Any])
  }
}
