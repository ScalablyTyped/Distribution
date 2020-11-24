package typings.semanticUiForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'integer'> */
@js.native
trait PickImplinteger extends js.Object {
  
  var integer: String = js.native
}
object PickImplinteger {
  
  @scala.inline
  def apply(integer: String): PickImplinteger = {
    val __obj = js.Dynamic.literal(integer = integer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplinteger]
  }
  
  @scala.inline
  implicit class PickImplintegerOps[Self <: PickImplinteger] (val x: Self) extends AnyVal {
    
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
    def setInteger(value: String): Self = this.set("integer", value.asInstanceOf[js.Any])
  }
}
