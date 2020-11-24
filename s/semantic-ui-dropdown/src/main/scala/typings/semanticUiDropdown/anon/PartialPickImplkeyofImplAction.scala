package typings.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.ErrorSettings._Impl, keyof semantic-ui-dropdown.SemanticUI.Dropdown.ErrorSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplAction extends js.Object {
  
  var action: js.UndefOr[String] = js.native
  
  var alreadySetup: js.UndefOr[String] = js.native
  
  var labels: js.UndefOr[String] = js.native
  
  var method: js.UndefOr[String] = js.native
  
  var noTransition: js.UndefOr[String] = js.native
}
object PartialPickImplkeyofImplAction {
  
  @scala.inline
  def apply(): PartialPickImplkeyofImplAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplAction]
  }
  
  @scala.inline
  implicit class PartialPickImplkeyofImplActionOps[Self <: PartialPickImplkeyofImplAction] (val x: Self) extends AnyVal {
    
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setAlreadySetup(value: String): Self = this.set("alreadySetup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlreadySetup: Self = this.set("alreadySetup", js.undefined)
    
    @scala.inline
    def setLabels(value: String): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setNoTransition(value: String): Self = this.set("noTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoTransition: Self = this.set("noTransition", js.undefined)
  }
}
