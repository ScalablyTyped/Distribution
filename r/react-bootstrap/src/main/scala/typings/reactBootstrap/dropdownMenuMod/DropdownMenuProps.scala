package typings.reactBootstrap.dropdownMenuMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.reactBootstrap.mod.SelectCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropdownMenuProps
  extends AllHTMLAttributes[DropdownMenu]
     with ClassAttributes[DropdownMenu] {
  
  var labelledBy: js.UndefOr[String | Double] = js.native
  
  var onClose: js.UndefOr[js.Function] = js.native
  
  @JSName("onSelect")
  var onSelect_DropdownMenuProps: js.UndefOr[SelectCallback] = js.native
  
  var pullRight: js.UndefOr[Boolean] = js.native
}
object DropdownMenuProps {
  
  @scala.inline
  def apply(): DropdownMenuProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropdownMenuProps]
  }
  
  @scala.inline
  implicit class DropdownMenuPropsOps[Self <: DropdownMenuProps] (val x: Self) extends AnyVal {
    
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
    def setLabelledBy(value: String | Double): Self = this.set("labelledBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelledBy: Self = this.set("labelledBy", js.undefined)
    
    @scala.inline
    def setOnClose(value: js.Function): Self = this.set("onClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnSelect(value: SelectCallback): Self = this.set("onSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    
    @scala.inline
    def setPullRight(value: Boolean): Self = this.set("pullRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullRight: Self = this.set("pullRight", js.undefined)
  }
}
