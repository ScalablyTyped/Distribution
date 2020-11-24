package typings.scBrokerCluster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SCBrokerClusterServerOptions extends js.Object {
  
  var appBrokerControllerPath: js.UndefOr[String] = js.native
  
  var brokerOptions: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AGServerOptions */ js.Any
  ] = js.native
  
  var brokers: js.Array[String] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var downgradeToUser: Double | String = js.native
  
  var expiryAccuracy: js.UndefOr[Double] = js.native
  
  var inspect: js.UndefOr[Boolean] = js.native
  
  var instanceId: js.UndefOr[String] = js.native
  
  var ipcAckTimeout: js.UndefOr[Double] = js.native
  
  var processTermTimeout: js.UndefOr[Double] = js.native
  
  var secretKey: js.UndefOr[String] = js.native
}
object SCBrokerClusterServerOptions {
  
  @scala.inline
  def apply(brokers: js.Array[String], downgradeToUser: Double | String): SCBrokerClusterServerOptions = {
    val __obj = js.Dynamic.literal(brokers = brokers.asInstanceOf[js.Any], downgradeToUser = downgradeToUser.asInstanceOf[js.Any])
    __obj.asInstanceOf[SCBrokerClusterServerOptions]
  }
  
  @scala.inline
  implicit class SCBrokerClusterServerOptionsOps[Self <: SCBrokerClusterServerOptions] (val x: Self) extends AnyVal {
    
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
    def setBrokersVarargs(value: String*): Self = this.set("brokers", js.Array(value :_*))
    
    @scala.inline
    def setBrokers(value: js.Array[String]): Self = this.set("brokers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDowngradeToUser(value: Double | String): Self = this.set("downgradeToUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppBrokerControllerPath(value: String): Self = this.set("appBrokerControllerPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppBrokerControllerPath: Self = this.set("appBrokerControllerPath", js.undefined)
    
    @scala.inline
    def setBrokerOptions(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AGServerOptions */ js.Any
    ): Self = this.set("brokerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrokerOptions: Self = this.set("brokerOptions", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setExpiryAccuracy(value: Double): Self = this.set("expiryAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiryAccuracy: Self = this.set("expiryAccuracy", js.undefined)
    
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
    def setProcessTermTimeout(value: Double): Self = this.set("processTermTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessTermTimeout: Self = this.set("processTermTimeout", js.undefined)
    
    @scala.inline
    def setSecretKey(value: String): Self = this.set("secretKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretKey: Self = this.set("secretKey", js.undefined)
  }
}
