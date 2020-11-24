package typings.reactBootstrap.panelCollapseMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanelCollapseProps
  extends AllHTMLAttributes[PanelCollapse]
     with ClassAttributes[PanelCollapse] {
  
  var bsClass: js.UndefOr[String] = js.native
  
  var onEnter: js.UndefOr[js.Function] = js.native
  
  var onEntered: js.UndefOr[js.Function] = js.native
  
  var onEntering: js.UndefOr[js.Function] = js.native
  
  var onExit: js.UndefOr[js.Function] = js.native
  
  var onExited: js.UndefOr[js.Function] = js.native
  
  var onExiting: js.UndefOr[js.Function] = js.native
}
object PanelCollapseProps {
  
  @scala.inline
  def apply(): PanelCollapseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanelCollapseProps]
  }
  
  @scala.inline
  implicit class PanelCollapsePropsOps[Self <: PanelCollapseProps] (val x: Self) extends AnyVal {
    
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
    def setBsClass(value: String): Self = this.set("bsClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBsClass: Self = this.set("bsClass", js.undefined)
    
    @scala.inline
    def setOnEnter(value: js.Function): Self = this.set("onEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnEnter: Self = this.set("onEnter", js.undefined)
    
    @scala.inline
    def setOnEntered(value: js.Function): Self = this.set("onEntered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnEntered: Self = this.set("onEntered", js.undefined)
    
    @scala.inline
    def setOnEntering(value: js.Function): Self = this.set("onEntering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnEntering: Self = this.set("onEntering", js.undefined)
    
    @scala.inline
    def setOnExit(value: js.Function): Self = this.set("onExit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnExit: Self = this.set("onExit", js.undefined)
    
    @scala.inline
    def setOnExited(value: js.Function): Self = this.set("onExited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnExited: Self = this.set("onExited", js.undefined)
    
    @scala.inline
    def setOnExiting(value: js.Function): Self = this.set("onExiting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnExiting: Self = this.set("onExiting", js.undefined)
  }
}
