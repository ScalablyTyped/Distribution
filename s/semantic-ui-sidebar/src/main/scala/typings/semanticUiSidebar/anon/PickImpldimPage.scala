package typings.semanticUiSidebar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.SidebarSettings._Impl, 'dimPage'> */
@js.native
trait PickImpldimPage extends js.Object {
  
  var dimPage: Boolean = js.native
}
object PickImpldimPage {
  
  @scala.inline
  def apply(dimPage: Boolean): PickImpldimPage = {
    val __obj = js.Dynamic.literal(dimPage = dimPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldimPage]
  }
  
  @scala.inline
  implicit class PickImpldimPageOps[Self <: PickImpldimPage] (val x: Self) extends AnyVal {
    
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
    def setDimPage(value: Boolean): Self = this.set("dimPage", value.asInstanceOf[js.Any])
  }
}
