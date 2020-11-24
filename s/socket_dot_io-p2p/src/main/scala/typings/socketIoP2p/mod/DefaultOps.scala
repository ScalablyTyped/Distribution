package typings.socketIoP2p.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultOps extends js.Object {
  
  var autoUpgrade: Boolean = js.native
  
  var numClients: Double = js.native
}
object DefaultOps {
  
  @scala.inline
  def apply(autoUpgrade: Boolean, numClients: Double): DefaultOps = {
    val __obj = js.Dynamic.literal(autoUpgrade = autoUpgrade.asInstanceOf[js.Any], numClients = numClients.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultOps]
  }
  
  @scala.inline
  implicit class DefaultOpsOps[Self <: DefaultOps] (val x: Self) extends AnyVal {
    
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
    def setAutoUpgrade(value: Boolean): Self = this.set("autoUpgrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumClients(value: Double): Self = this.set("numClients", value.asInstanceOf[js.Any])
  }
}
