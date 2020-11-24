package typings.reactMdMenu.defaultMenuRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@react-md/menu.@react-md/menu/types/Menu.MenuProps, 'anchor' | 'horizontal' | 'positionOptions' | 'closeOnScroll' | 'closeOnResize'> */
@js.native
trait MenuPositionProps extends js.Object {
  
  var anchor: js.UndefOr[js.Any] = js.native
  
  var closeOnResize: js.UndefOr[js.Any] = js.native
  
  var closeOnScroll: js.UndefOr[js.Any] = js.native
  
  var horizontal: js.UndefOr[js.Any] = js.native
  
  var positionOptions: js.UndefOr[js.Any] = js.native
}
object MenuPositionProps {
  
  @scala.inline
  def apply(): MenuPositionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuPositionProps]
  }
  
  @scala.inline
  implicit class MenuPositionPropsOps[Self <: MenuPositionProps] (val x: Self) extends AnyVal {
    
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
    def setAnchor(value: js.Any): Self = this.set("anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    
    @scala.inline
    def setCloseOnResize(value: js.Any): Self = this.set("closeOnResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnResize: Self = this.set("closeOnResize", js.undefined)
    
    @scala.inline
    def setCloseOnScroll(value: js.Any): Self = this.set("closeOnScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnScroll: Self = this.set("closeOnScroll", js.undefined)
    
    @scala.inline
    def setHorizontal(value: js.Any): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    
    @scala.inline
    def setPositionOptions(value: js.Any): Self = this.set("positionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionOptions: Self = this.set("positionOptions", js.undefined)
  }
}
