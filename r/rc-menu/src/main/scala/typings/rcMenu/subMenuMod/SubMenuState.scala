package typings.rcMenu.subMenuMod

import typings.rcMenu.interfaceMod.MenuMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubMenuState extends js.Object {
  
  var isOpen: Boolean = js.native
  
  var mode: MenuMode = js.native
}
object SubMenuState {
  
  @scala.inline
  def apply(isOpen: Boolean, mode: MenuMode): SubMenuState = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubMenuState]
  }
  
  @scala.inline
  implicit class SubMenuStateOps[Self <: SubMenuState] (val x: Self) extends AnyVal {
    
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
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: MenuMode): Self = this.set("mode", value.asInstanceOf[js.Any])
  }
}
