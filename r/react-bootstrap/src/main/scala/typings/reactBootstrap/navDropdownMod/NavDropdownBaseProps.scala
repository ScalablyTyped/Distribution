package typings.reactBootstrap.navDropdownMod

import typings.react.mod.ReactNode
import typings.reactBootstrap.dropdownMod.DropdownBaseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavDropdownBaseProps extends DropdownBaseProps {
  
  var active: js.UndefOr[Boolean] = js.native
  
  var eventKey: js.UndefOr[js.Any] = js.native
  
  var noCaret: js.UndefOr[Boolean] = js.native
  
  var title: ReactNode = js.native
}
object NavDropdownBaseProps {
  
  @scala.inline
  def apply(id: String): NavDropdownBaseProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavDropdownBaseProps]
  }
  
  @scala.inline
  implicit class NavDropdownBasePropsOps[Self <: NavDropdownBaseProps] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setEventKey(value: js.Any): Self = this.set("eventKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventKey: Self = this.set("eventKey", js.undefined)
    
    @scala.inline
    def setNoCaret(value: Boolean): Self = this.set("noCaret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoCaret: Self = this.set("noCaret", js.undefined)
    
    @scala.inline
    def setTitle(value: ReactNode): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
