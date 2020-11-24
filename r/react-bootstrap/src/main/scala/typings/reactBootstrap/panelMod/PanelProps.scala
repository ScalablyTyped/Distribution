package typings.reactBootstrap.panelMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.reactBootstrap.mod.SelectCallback
import typings.reactBootstrap.mod.TransitionCallbacks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanelProps
  extends AllHTMLAttributes[Panel]
     with TransitionCallbacks
     with ClassAttributes[Panel] {
  
  var bsStyle: js.UndefOr[String] = js.native
  
  var defaultExpanded: js.UndefOr[Boolean] = js.native
  
  var eventKey: js.UndefOr[js.Any] = js.native
  
  var expanded: js.UndefOr[Boolean] = js.native
  
  @JSName("onSelect")
  var onSelect_PanelProps: js.UndefOr[SelectCallback] = js.native
  
  var onToggle: js.UndefOr[SelectCallback] = js.native
}
object PanelProps {
  
  @scala.inline
  def apply(): PanelProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanelProps]
  }
  
  @scala.inline
  implicit class PanelPropsOps[Self <: PanelProps] (val x: Self) extends AnyVal {
    
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
    def setBsStyle(value: String): Self = this.set("bsStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBsStyle: Self = this.set("bsStyle", js.undefined)
    
    @scala.inline
    def setDefaultExpanded(value: Boolean): Self = this.set("defaultExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultExpanded: Self = this.set("defaultExpanded", js.undefined)
    
    @scala.inline
    def setEventKey(value: js.Any): Self = this.set("eventKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventKey: Self = this.set("eventKey", js.undefined)
    
    @scala.inline
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    
    @scala.inline
    def setOnSelect(value: SelectCallback): Self = this.set("onSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    
    @scala.inline
    def setOnToggle(value: SelectCallback): Self = this.set("onToggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnToggle: Self = this.set("onToggle", js.undefined)
  }
}
