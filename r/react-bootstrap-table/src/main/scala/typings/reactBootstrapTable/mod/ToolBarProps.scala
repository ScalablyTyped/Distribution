package typings.reactBootstrapTable.mod

import typings.reactBootstrapTable.anon.ButtonGroupPropssearchPan
import typings.reactBootstrapTable.anon.CloseInsertModal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolBarProps extends js.Object {
  
  /**
    * Rendered components to use in the toolbar.
    */
  var components: ButtonGroupPropssearchPan = js.native
  
  /**
    * Event callbacks to use with a custom toolbar.
    */
  var event: CloseInsertModal = js.native
}
object ToolBarProps {
  
  @scala.inline
  def apply(components: ButtonGroupPropssearchPan, event: CloseInsertModal): ToolBarProps = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolBarProps]
  }
  
  @scala.inline
  implicit class ToolBarPropsOps[Self <: ToolBarProps] (val x: Self) extends AnyVal {
    
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
    def setComponents(value: ButtonGroupPropssearchPan): Self = this.set("components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: CloseInsertModal): Self = this.set("event", value.asInstanceOf[js.Any])
  }
}
