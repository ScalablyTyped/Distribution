package typings.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.ErrorSettings._Impl, 'noTransition'> */
@js.native
trait PickImplnoTransition extends js.Object {
  
  var noTransition: String = js.native
}
object PickImplnoTransition {
  
  @scala.inline
  def apply(noTransition: String): PickImplnoTransition = {
    val __obj = js.Dynamic.literal(noTransition = noTransition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplnoTransition]
  }
  
  @scala.inline
  implicit class PickImplnoTransitionOps[Self <: PickImplnoTransition] (val x: Self) extends AnyVal {
    
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
    def setNoTransition(value: String): Self = this.set("noTransition", value.asInstanceOf[js.Any])
  }
}
