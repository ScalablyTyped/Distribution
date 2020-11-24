package typings.reactMdDialog.useNestedDialogFixesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnValue extends js.Object {
  
  var disableEscapeClose: Boolean = js.native
  
  var disableOverlay: Boolean = js.native
}
object ReturnValue {
  
  @scala.inline
  def apply(disableEscapeClose: Boolean, disableOverlay: Boolean): ReturnValue = {
    val __obj = js.Dynamic.literal(disableEscapeClose = disableEscapeClose.asInstanceOf[js.Any], disableOverlay = disableOverlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnValue]
  }
  
  @scala.inline
  implicit class ReturnValueOps[Self <: ReturnValue] (val x: Self) extends AnyVal {
    
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
    def setDisableEscapeClose(value: Boolean): Self = this.set("disableEscapeClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableOverlay(value: Boolean): Self = this.set("disableOverlay", value.asInstanceOf[js.Any])
  }
}
