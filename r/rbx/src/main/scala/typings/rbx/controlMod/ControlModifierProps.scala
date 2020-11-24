package typings.rbx.controlMod

import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.medium
import typings.rbx.rbxStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ControlModifierProps extends js.Object {
  
  var expanded: js.UndefOr[Boolean] = js.native
  
  var iconLeft: js.UndefOr[Boolean] = js.native
  
  var iconRight: js.UndefOr[Boolean] = js.native
  
  var loading: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[small | medium | large] = js.native
}
object ControlModifierProps {
  
  @scala.inline
  def apply(): ControlModifierProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlModifierProps]
  }
  
  @scala.inline
  implicit class ControlModifierPropsOps[Self <: ControlModifierProps] (val x: Self) extends AnyVal {
    
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
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    
    @scala.inline
    def setIconLeft(value: Boolean): Self = this.set("iconLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconLeft: Self = this.set("iconLeft", js.undefined)
    
    @scala.inline
    def setIconRight(value: Boolean): Self = this.set("iconRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconRight: Self = this.set("iconRight", js.undefined)
    
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    
    @scala.inline
    def setSize(value: small | medium | large): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
