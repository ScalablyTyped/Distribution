package typings.socketclusterClient.transportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvokeOptions extends js.Object {
  
  var ackTimeout: js.UndefOr[Double] = js.native
  
  var force: js.UndefOr[Boolean] = js.native
  
  var noTimeout: js.UndefOr[Boolean] = js.native
}
object InvokeOptions {
  
  @scala.inline
  def apply(): InvokeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvokeOptions]
  }
  
  @scala.inline
  implicit class InvokeOptionsOps[Self <: InvokeOptions] (val x: Self) extends AnyVal {
    
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
    def setAckTimeout(value: Double): Self = this.set("ackTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAckTimeout: Self = this.set("ackTimeout", js.undefined)
    
    @scala.inline
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    
    @scala.inline
    def setNoTimeout(value: Boolean): Self = this.set("noTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoTimeout: Self = this.set("noTimeout", js.undefined)
  }
}
