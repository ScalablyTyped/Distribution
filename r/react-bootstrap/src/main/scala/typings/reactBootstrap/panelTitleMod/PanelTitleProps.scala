package typings.reactBootstrap.panelTitleMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanelTitleProps
  extends AllHTMLAttributes[PanelTitle]
     with ClassAttributes[PanelTitle] {
  
  var bsClass: js.UndefOr[String] = js.native
  
  var componentClass: js.UndefOr[String] = js.native
  
  var toggle: js.UndefOr[Boolean] = js.native
}
object PanelTitleProps {
  
  @scala.inline
  def apply(): PanelTitleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanelTitleProps]
  }
  
  @scala.inline
  implicit class PanelTitlePropsOps[Self <: PanelTitleProps] (val x: Self) extends AnyVal {
    
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
    def setComponentClass(value: String): Self = this.set("componentClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentClass: Self = this.set("componentClass", js.undefined)
    
    @scala.inline
    def setToggle(value: Boolean): Self = this.set("toggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggle: Self = this.set("toggle", js.undefined)
  }
}
