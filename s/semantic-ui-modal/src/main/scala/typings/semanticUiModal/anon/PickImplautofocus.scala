package typings.semanticUiModal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-modal.SemanticUI.ModalSettings._Impl, 'autofocus'> */
@js.native
trait PickImplautofocus extends js.Object {
  
  var autofocus: Boolean = js.native
}
object PickImplautofocus {
  
  @scala.inline
  def apply(autofocus: Boolean): PickImplautofocus = {
    val __obj = js.Dynamic.literal(autofocus = autofocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplautofocus]
  }
  
  @scala.inline
  implicit class PickImplautofocusOps[Self <: PickImplautofocus] (val x: Self) extends AnyVal {
    
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
    def setAutofocus(value: Boolean): Self = this.set("autofocus", value.asInstanceOf[js.Any])
  }
}
