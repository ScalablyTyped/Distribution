package typings.semanticUiForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'different'> */
@js.native
trait PickImpldifferent extends js.Object {
  
  var different: String = js.native
}
object PickImpldifferent {
  
  @scala.inline
  def apply(different: String): PickImpldifferent = {
    val __obj = js.Dynamic.literal(different = different.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldifferent]
  }
  
  @scala.inline
  implicit class PickImpldifferentOps[Self <: PickImpldifferent] (val x: Self) extends AnyVal {
    
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
    def setDifferent(value: String): Self = this.set("different", value.asInstanceOf[js.Any])
  }
}
