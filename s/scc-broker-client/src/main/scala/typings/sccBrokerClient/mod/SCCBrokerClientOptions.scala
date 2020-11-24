package typings.sccBrokerClient.mod

import typings.jsonwebtoken.mod.Secret
import typings.sccBrokerClient.sccBrokerClientStrings.simple
import typings.sccBrokerClient.sccBrokerClientStrings.skeletonRendezvous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SCCBrokerClientOptions extends js.Object {
  
  var authKey: js.UndefOr[Secret] = js.native
  
  var brokerRetryDelay: js.UndefOr[Double] = js.native
  
  var clientPoolSize: js.UndefOr[Double] = js.native
  
  var instanceId: js.UndefOr[String] = js.native
  
  var instanceIp: js.UndefOr[String] = js.native
  
  var instanceIpFamily: js.UndefOr[String] = js.native
  
  var instancePort: js.UndefOr[Double] = js.native
  
  var mappingEngine: js.UndefOr[skeletonRendezvous | simple | MappingEngine] = js.native
  
  var noErrorLogging: js.UndefOr[Boolean] = js.native
  
  var pubSubBatchDuration: js.UndefOr[Double] = js.native
  
  var stateServerAckTimeout: js.UndefOr[Double] = js.native
  
  var stateServerConnectTimeout: js.UndefOr[Double] = js.native
  
  var stateServerHost: String = js.native
  
  var stateServerPort: js.UndefOr[Double] = js.native
  
  var stateServerReconnectRandomness: js.UndefOr[Double] = js.native
}
object SCCBrokerClientOptions {
  
  @scala.inline
  def apply(stateServerHost: String): SCCBrokerClientOptions = {
    val __obj = js.Dynamic.literal(stateServerHost = stateServerHost.asInstanceOf[js.Any])
    __obj.asInstanceOf[SCCBrokerClientOptions]
  }
  
  @scala.inline
  implicit class SCCBrokerClientOptionsOps[Self <: SCCBrokerClientOptions] (val x: Self) extends AnyVal {
    
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
    def setStateServerHost(value: String): Self = this.set("stateServerHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthKey(value: Secret): Self = this.set("authKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthKey: Self = this.set("authKey", js.undefined)
    
    @scala.inline
    def setBrokerRetryDelay(value: Double): Self = this.set("brokerRetryDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrokerRetryDelay: Self = this.set("brokerRetryDelay", js.undefined)
    
    @scala.inline
    def setClientPoolSize(value: Double): Self = this.set("clientPoolSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientPoolSize: Self = this.set("clientPoolSize", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("instanceId", js.undefined)
    
    @scala.inline
    def setInstanceIp(value: String): Self = this.set("instanceIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceIp: Self = this.set("instanceIp", js.undefined)
    
    @scala.inline
    def setInstanceIpFamily(value: String): Self = this.set("instanceIpFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceIpFamily: Self = this.set("instanceIpFamily", js.undefined)
    
    @scala.inline
    def setInstancePort(value: Double): Self = this.set("instancePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstancePort: Self = this.set("instancePort", js.undefined)
    
    @scala.inline
    def setMappingEngine(value: skeletonRendezvous | simple | MappingEngine): Self = this.set("mappingEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMappingEngine: Self = this.set("mappingEngine", js.undefined)
    
    @scala.inline
    def setNoErrorLogging(value: Boolean): Self = this.set("noErrorLogging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoErrorLogging: Self = this.set("noErrorLogging", js.undefined)
    
    @scala.inline
    def setPubSubBatchDuration(value: Double): Self = this.set("pubSubBatchDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePubSubBatchDuration: Self = this.set("pubSubBatchDuration", js.undefined)
    
    @scala.inline
    def setStateServerAckTimeout(value: Double): Self = this.set("stateServerAckTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateServerAckTimeout: Self = this.set("stateServerAckTimeout", js.undefined)
    
    @scala.inline
    def setStateServerConnectTimeout(value: Double): Self = this.set("stateServerConnectTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateServerConnectTimeout: Self = this.set("stateServerConnectTimeout", js.undefined)
    
    @scala.inline
    def setStateServerPort(value: Double): Self = this.set("stateServerPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateServerPort: Self = this.set("stateServerPort", js.undefined)
    
    @scala.inline
    def setStateServerReconnectRandomness(value: Double): Self = this.set("stateServerReconnectRandomness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateServerReconnectRandomness: Self = this.set("stateServerReconnectRandomness", js.undefined)
  }
}
