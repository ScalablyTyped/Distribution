package typings.semanticUiSidebar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.SidebarSettings._Impl, 'mobileTransition'> */
@js.native
trait PickImplmobileTransition extends js.Object {
  
  var mobileTransition: String = js.native
}
object PickImplmobileTransition {
  
  @scala.inline
  def apply(mobileTransition: String): PickImplmobileTransition = {
    val __obj = js.Dynamic.literal(mobileTransition = mobileTransition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmobileTransition]
  }
  
  @scala.inline
  implicit class PickImplmobileTransitionOps[Self <: PickImplmobileTransition] (val x: Self) extends AnyVal {
    
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
    def setMobileTransition(value: String): Self = this.set("mobileTransition", value.asInstanceOf[js.Any])
  }
}
