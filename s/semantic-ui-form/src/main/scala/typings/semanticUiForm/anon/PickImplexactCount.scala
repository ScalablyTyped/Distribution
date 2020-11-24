package typings.semanticUiForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'exactCount'> */
@js.native
trait PickImplexactCount extends js.Object {
  
  var exactCount: String = js.native
}
object PickImplexactCount {
  
  @scala.inline
  def apply(exactCount: String): PickImplexactCount = {
    val __obj = js.Dynamic.literal(exactCount = exactCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplexactCount]
  }
  
  @scala.inline
  implicit class PickImplexactCountOps[Self <: PickImplexactCount] (val x: Self) extends AnyVal {
    
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
    def setExactCount(value: String): Self = this.set("exactCount", value.asInstanceOf[js.Any])
  }
}
