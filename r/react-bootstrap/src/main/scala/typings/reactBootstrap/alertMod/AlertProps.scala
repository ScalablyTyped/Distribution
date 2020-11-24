package typings.reactBootstrap.alertMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.reactBootstrap.mod.Sizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlertProps
  extends AllHTMLAttributes[Alert]
     with ClassAttributes[Alert] {
  
  var bsClass: js.UndefOr[String] = js.native
  
  var bsSize: js.UndefOr[Sizes] = js.native
  
  var bsStyle: js.UndefOr[String] = js.native
  
  var closeLabel: js.UndefOr[String] = js.native
  
  /** @deprecated since v0.29.0 */ var dismissAfter: js.UndefOr[Double] = js.native
  
  // TODO: Add more specific type
  var onDismiss: js.UndefOr[js.Function] = js.native
}
object AlertProps {
  
  @scala.inline
  def apply(): AlertProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertProps]
  }
  
  @scala.inline
  implicit class AlertPropsOps[Self <: AlertProps] (val x: Self) extends AnyVal {
    
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
    def setBsSize(value: Sizes): Self = this.set("bsSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBsSize: Self = this.set("bsSize", js.undefined)
    
    @scala.inline
    def setBsStyle(value: String): Self = this.set("bsStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBsStyle: Self = this.set("bsStyle", js.undefined)
    
    @scala.inline
    def setCloseLabel(value: String): Self = this.set("closeLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseLabel: Self = this.set("closeLabel", js.undefined)
    
    @scala.inline
    def setDismissAfter(value: Double): Self = this.set("dismissAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDismissAfter: Self = this.set("dismissAfter", js.undefined)
    
    @scala.inline
    def setOnDismiss(value: js.Function): Self = this.set("onDismiss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDismiss: Self = this.set("onDismiss", js.undefined)
  }
}
