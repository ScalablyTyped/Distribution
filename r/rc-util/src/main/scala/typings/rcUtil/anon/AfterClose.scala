package typings.rcUtil.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AfterClose extends js.Object {
  
  var afterClose: js.Function = js.native
  
  var onClose: js.Function = js.native
  
  var visible: Boolean = js.native
}
object AfterClose {
  
  @scala.inline
  def apply(afterClose: js.Function, onClose: js.Function, visible: Boolean): AfterClose = {
    val __obj = js.Dynamic.literal(afterClose = afterClose.asInstanceOf[js.Any], onClose = onClose.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterClose]
  }
  
  @scala.inline
  implicit class AfterCloseOps[Self <: AfterClose] (val x: Self) extends AnyVal {
    
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
    def setAfterClose(value: js.Function): Self = this.set("afterClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClose(value: js.Function): Self = this.set("onClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
}
