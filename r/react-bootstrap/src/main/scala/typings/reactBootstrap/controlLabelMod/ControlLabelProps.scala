package typings.reactBootstrap.controlLabelMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ControlLabelProps
  extends AllHTMLAttributes[ControlLabel]
     with ClassAttributes[ControlLabel] {
  
  var bsClass: js.UndefOr[String] = js.native
  
  var srOnly: js.UndefOr[Boolean] = js.native
}
object ControlLabelProps {
  
  @scala.inline
  def apply(): ControlLabelProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlLabelProps]
  }
  
  @scala.inline
  implicit class ControlLabelPropsOps[Self <: ControlLabelProps] (val x: Self) extends AnyVal {
    
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
    def setSrOnly(value: Boolean): Self = this.set("srOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrOnly: Self = this.set("srOnly", js.undefined)
  }
}
