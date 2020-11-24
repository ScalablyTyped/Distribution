package typings.semanticUiModal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-modal.SemanticUI.Modal.SelectorSettings._Impl, 'deny'> */
@js.native
trait PickImpldeny extends js.Object {
  
  var deny: String = js.native
}
object PickImpldeny {
  
  @scala.inline
  def apply(deny: String): PickImpldeny = {
    val __obj = js.Dynamic.literal(deny = deny.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldeny]
  }
  
  @scala.inline
  implicit class PickImpldenyOps[Self <: PickImpldeny] (val x: Self) extends AnyVal {
    
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
    def setDeny(value: String): Self = this.set("deny", value.asInstanceOf[js.Any])
  }
}
