package typings.scBroker.mod

import typings.scBroker.scbrokerMod.SCBrokerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SCBrokerServerOptions extends js.Object {
  
  var brokerControllerPath: js.UndefOr[String] = js.native
  
  var brokerOptions: js.UndefOr[SCBrokerOptions] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var downgradeToUser: js.UndefOr[Double | String] = js.native
  
  var expiryAccuracy: js.UndefOr[Double] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var inspect: js.UndefOr[Boolean] = js.native
  
  var instanceId: js.UndefOr[String] = js.native
  
  var ipcAckTimeout: js.UndefOr[Double] = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  var processTermTimeout: js.UndefOr[Double] = js.native
  
  var secretKey: js.UndefOr[String] = js.native
  
  var socketPath: js.UndefOr[String] = js.native
}
object SCBrokerServerOptions {
  
  @scala.inline
  def apply(): SCBrokerServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SCBrokerServerOptions]
  }
  
  @scala.inline
  implicit class SCBrokerServerOptionsOps[Self <: SCBrokerServerOptions] (val x: Self) extends AnyVal {
    
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
    def setBrokerControllerPath(value: String): Self = this.set("brokerControllerPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrokerControllerPath: Self = this.set("brokerControllerPath", js.undefined)
    
    @scala.inline
    def setBrokerOptions(value: SCBrokerOptions): Self = this.set("brokerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrokerOptions: Self = this.set("brokerOptions", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setDowngradeToUser(value: Double | String): Self = this.set("downgradeToUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDowngradeToUser: Self = this.set("downgradeToUser", js.undefined)
    
    @scala.inline
    def setExpiryAccuracy(value: Double): Self = this.set("expiryAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiryAccuracy: Self = this.set("expiryAccuracy", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInspect(value: Boolean): Self = this.set("inspect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInspect: Self = this.set("inspect", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("instanceId", js.undefined)
    
    @scala.inline
    def setIpcAckTimeout(value: Double): Self = this.set("ipcAckTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpcAckTimeout: Self = this.set("ipcAckTimeout", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setProcessTermTimeout(value: Double): Self = this.set("processTermTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessTermTimeout: Self = this.set("processTermTimeout", js.undefined)
    
    @scala.inline
    def setSecretKey(value: String): Self = this.set("secretKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretKey: Self = this.set("secretKey", js.undefined)
    
    @scala.inline
    def setSocketPath(value: String): Self = this.set("socketPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocketPath: Self = this.set("socketPath", js.undefined)
  }
}
