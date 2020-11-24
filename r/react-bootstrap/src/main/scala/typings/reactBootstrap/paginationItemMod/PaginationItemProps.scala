package typings.reactBootstrap.paginationItemMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaginationItemProps
  extends AllHTMLAttributes[PaginationItem]
     with ClassAttributes[PaginationItem] {
  
  var active: js.UndefOr[Boolean] = js.native
}
object PaginationItemProps {
  
  @scala.inline
  def apply(): PaginationItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaginationItemProps]
  }
  
  @scala.inline
  implicit class PaginationItemPropsOps[Self <: PaginationItemProps] (val x: Self) extends AnyVal {
    
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
  }
}
