package typings.storybookUi.anon

import typings.storybookUi.menuMod.MenuList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Menu extends js.Object {
  
  var menu: MenuList = js.native
  
  def onHide(): Unit = js.native
}
object Menu {
  
  @scala.inline
  def apply(menu: MenuList, onHide: () => Unit): Menu = {
    val __obj = js.Dynamic.literal(menu = menu.asInstanceOf[js.Any], onHide = js.Any.fromFunction0(onHide))
    __obj.asInstanceOf[Menu]
  }
  
  @scala.inline
  implicit class MenuOps[Self <: Menu] (val x: Self) extends AnyVal {
    
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
    def setMenu(value: MenuList): Self = this.set("menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnHide(value: () => Unit): Self = this.set("onHide", js.Any.fromFunction0(value))
  }
}
