package typings.semanticUiForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'decimal'> */
@js.native
trait PickImpldecimal extends js.Object {
  
  var decimal: String = js.native
}
object PickImpldecimal {
  
  @scala.inline
  def apply(decimal: String): PickImpldecimal = {
    val __obj = js.Dynamic.literal(decimal = decimal.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldecimal]
  }
  
  @scala.inline
  implicit class PickImpldecimalOps[Self <: PickImpldecimal] (val x: Self) extends AnyVal {
    
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
    def setDecimal(value: String): Self = this.set("decimal", value.asInstanceOf[js.Any])
  }
}
