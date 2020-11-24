package typings.senchaTouch.Ext.ux

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IActionOverFlowMenuButton extends IMenuButton {
  
  /** [Property] () */
  var menuItems: js.UndefOr[js.Any] = js.native
}
object IActionOverFlowMenuButton {
  
  @scala.inline
  def apply(): IActionOverFlowMenuButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IActionOverFlowMenuButton]
  }
  
  @scala.inline
  implicit class IActionOverFlowMenuButtonOps[Self <: IActionOverFlowMenuButton] (val x: Self) extends AnyVal {
    
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
    def setMenuItems(value: js.Any): Self = this.set("menuItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuItems: Self = this.set("menuItems", js.undefined)
  }
}
