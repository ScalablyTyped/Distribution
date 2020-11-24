package typings.reactMdMenu.toggleChildrenMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToggleChildrenProps extends js.Object {
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var disableDropdownIcon: Boolean = js.native
  
  var dropdownIcon: ReactNode = js.native
  
  var visible: Boolean = js.native
}
object ToggleChildrenProps {
  
  @scala.inline
  def apply(disableDropdownIcon: Boolean, visible: Boolean): ToggleChildrenProps = {
    val __obj = js.Dynamic.literal(disableDropdownIcon = disableDropdownIcon.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToggleChildrenProps]
  }
  
  @scala.inline
  implicit class ToggleChildrenPropsOps[Self <: ToggleChildrenProps] (val x: Self) extends AnyVal {
    
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
    def setDisableDropdownIcon(value: Boolean): Self = this.set("disableDropdownIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setDropdownIcon(value: ReactNode): Self = this.set("dropdownIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropdownIcon: Self = this.set("dropdownIcon", js.undefined)
  }
}
