package typings.semanticUiSidebar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.SidebarSettings._Impl, 'returnScroll'> */
@js.native
trait PickImplreturnScroll extends js.Object {
  
  var returnScroll: Boolean = js.native
}
object PickImplreturnScroll {
  
  @scala.inline
  def apply(returnScroll: Boolean): PickImplreturnScroll = {
    val __obj = js.Dynamic.literal(returnScroll = returnScroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplreturnScroll]
  }
  
  @scala.inline
  implicit class PickImplreturnScrollOps[Self <: PickImplreturnScroll] (val x: Self) extends AnyVal {
    
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
    def setReturnScroll(value: Boolean): Self = this.set("returnScroll", value.asInstanceOf[js.Any])
  }
}
