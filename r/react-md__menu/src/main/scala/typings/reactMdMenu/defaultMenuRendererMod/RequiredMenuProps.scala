package typings.reactMdMenu.defaultMenuRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<@react-md/menu.@react-md/menu/types/Menu.MenuProps, 'id' | 'visible' | 'onRequestClose' | 'controlId' | 'children' | 'defaultFocus'>> */
@js.native
trait RequiredMenuProps extends js.Object {
  
  var children: js.Any = js.native
  
  var controlId: js.Any = js.native
  
  var defaultFocus: js.Any = js.native
  
  var id: js.Any = js.native
  
  var onRequestClose: js.Any = js.native
  
  var visible: js.Any = js.native
}
object RequiredMenuProps {
  
  @scala.inline
  def apply(
    children: js.Any,
    controlId: js.Any,
    defaultFocus: js.Any,
    id: js.Any,
    onRequestClose: js.Any,
    visible: js.Any
  ): RequiredMenuProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], controlId = controlId.asInstanceOf[js.Any], defaultFocus = defaultFocus.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onRequestClose = onRequestClose.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredMenuProps]
  }
  
  @scala.inline
  implicit class RequiredMenuPropsOps[Self <: RequiredMenuProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: js.Any): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlId(value: js.Any): Self = this.set("controlId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultFocus(value: js.Any): Self = this.set("defaultFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: js.Any): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRequestClose(value: js.Any): Self = this.set("onRequestClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: js.Any): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
}
