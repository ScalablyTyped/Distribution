package typings.reactBootstrap.dropdownToggleMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropdownToggleProps
  extends AllHTMLAttributes[DropdownToggle]
     with ClassAttributes[DropdownToggle] {
  
  var bsClass: js.UndefOr[String] = js.native
  
  var bsRole: js.UndefOr[String] = js.native
  
  var bsSize: js.UndefOr[String] = js.native
  
   // Added since v0.30.0
  var bsStyle: js.UndefOr[String | Null] = js.native
  
  var noCaret: js.UndefOr[Boolean] = js.native
  
  var useAnchor: js.UndefOr[Boolean] = js.native
}
object DropdownToggleProps {
  
  @scala.inline
  def apply(): DropdownToggleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropdownToggleProps]
  }
  
  @scala.inline
  implicit class DropdownTogglePropsOps[Self <: DropdownToggleProps] (val x: Self) extends AnyVal {
    
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
    def setBsRole(value: String): Self = this.set("bsRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBsRole: Self = this.set("bsRole", js.undefined)
    
    @scala.inline
    def setBsSize(value: String): Self = this.set("bsSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBsSize: Self = this.set("bsSize", js.undefined)
    
    @scala.inline
    def setBsStyle(value: String): Self = this.set("bsStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBsStyle: Self = this.set("bsStyle", js.undefined)
    
    @scala.inline
    def setBsStyleNull: Self = this.set("bsStyle", null)
    
    @scala.inline
    def setNoCaret(value: Boolean): Self = this.set("noCaret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoCaret: Self = this.set("noCaret", js.undefined)
    
    @scala.inline
    def setUseAnchor(value: Boolean): Self = this.set("useAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseAnchor: Self = this.set("useAnchor", js.undefined)
  }
}
