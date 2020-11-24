package typings.storybookUi.anon

import typings.storybookUi.menuMod.MenuList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsHighlighted extends js.Object {
  
  var isHighlighted: Boolean = js.native
  
  var menu: MenuList = js.native
}
object IsHighlighted {
  
  @scala.inline
  def apply(isHighlighted: Boolean, menu: MenuList): IsHighlighted = {
    val __obj = js.Dynamic.literal(isHighlighted = isHighlighted.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsHighlighted]
  }
  
  @scala.inline
  implicit class IsHighlightedOps[Self <: IsHighlighted] (val x: Self) extends AnyVal {
    
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
    def setIsHighlighted(value: Boolean): Self = this.set("isHighlighted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenu(value: MenuList): Self = this.set("menu", value.asInstanceOf[js.Any])
  }
}
