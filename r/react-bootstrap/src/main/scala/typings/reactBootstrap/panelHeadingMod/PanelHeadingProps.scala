package typings.reactBootstrap.panelHeadingMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanelHeadingProps
  extends AllHTMLAttributes[PanelHeading]
     with ClassAttributes[PanelHeading] {
  
  var bsClass: js.UndefOr[String] = js.native
  
  var componentClass: js.UndefOr[String] = js.native
}
object PanelHeadingProps {
  
  @scala.inline
  def apply(): PanelHeadingProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanelHeadingProps]
  }
  
  @scala.inline
  implicit class PanelHeadingPropsOps[Self <: PanelHeadingProps] (val x: Self) extends AnyVal {
    
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
  }
}
