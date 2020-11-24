package typings.rbx.navbarDropdownMod

import typings.rbx.rbxStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavbarDropdownModifierProps extends js.Object {
  
  var align: js.UndefOr[right] = js.native
  
  var boxed: js.UndefOr[Boolean] = js.native
}
object NavbarDropdownModifierProps {
  
  @scala.inline
  def apply(): NavbarDropdownModifierProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavbarDropdownModifierProps]
  }
  
  @scala.inline
  implicit class NavbarDropdownModifierPropsOps[Self <: NavbarDropdownModifierProps] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: right): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setBoxed(value: Boolean): Self = this.set("boxed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxed: Self = this.set("boxed", js.undefined)
  }
}
