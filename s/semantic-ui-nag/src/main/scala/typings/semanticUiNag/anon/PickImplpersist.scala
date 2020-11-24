package typings.semanticUiNag.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-nag.SemanticUI.NagSettings._Impl, 'persist'> */
@js.native
trait PickImplpersist extends js.Object {
  
  var persist: Boolean = js.native
}
object PickImplpersist {
  
  @scala.inline
  def apply(persist: Boolean): PickImplpersist = {
    val __obj = js.Dynamic.literal(persist = persist.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpersist]
  }
  
  @scala.inline
  implicit class PickImplpersistOps[Self <: PickImplpersist] (val x: Self) extends AnyVal {
    
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
    def setPersist(value: Boolean): Self = this.set("persist", value.asInstanceOf[js.Any])
  }
}
