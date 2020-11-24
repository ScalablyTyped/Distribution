package typings.storybookUi.headingMod

import typings.storybookUi.menuMod.MenuList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeadingProps extends js.Object {
  
  var menu: MenuList = js.native
  
  var menuHighlighted: js.UndefOr[Boolean] = js.native
}
object HeadingProps {
  
  @scala.inline
  def apply(menu: MenuList): HeadingProps = {
    val __obj = js.Dynamic.literal(menu = menu.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadingProps]
  }
  
  @scala.inline
  implicit class HeadingPropsOps[Self <: HeadingProps] (val x: Self) extends AnyVal {
    
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
    def setMenuHighlighted(value: Boolean): Self = this.set("menuHighlighted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuHighlighted: Self = this.set("menuHighlighted", js.undefined)
  }
}
