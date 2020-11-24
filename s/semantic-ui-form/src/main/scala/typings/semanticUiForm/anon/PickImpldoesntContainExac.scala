package typings.semanticUiForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'doesntContainExactly'> */
@js.native
trait PickImpldoesntContainExac extends js.Object {
  
  var doesntContainExactly: String = js.native
}
object PickImpldoesntContainExac {
  
  @scala.inline
  def apply(doesntContainExactly: String): PickImpldoesntContainExac = {
    val __obj = js.Dynamic.literal(doesntContainExactly = doesntContainExactly.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldoesntContainExac]
  }
  
  @scala.inline
  implicit class PickImpldoesntContainExacOps[Self <: PickImpldoesntContainExac] (val x: Self) extends AnyVal {
    
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
    def setDoesntContainExactly(value: String): Self = this.set("doesntContainExactly", value.asInstanceOf[js.Any])
  }
}
