package typings.scBroker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SCBrokerClientOptions extends js.Object {
  
  var autoReconnect: js.UndefOr[Boolean] = js.native
  
  var autoReconnectOptions: js.UndefOr[AutoReconnectOptions] = js.native
  
  var connectRetryErrorThreshold: js.UndefOr[Double] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  var pubSubBatchDuration: js.UndefOr[Double] = js.native
  
  var secretKey: js.UndefOr[String] = js.native
  
  var socketPath: js.UndefOr[String] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object SCBrokerClientOptions {
  
  @scala.inline
  def apply(): SCBrokerClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SCBrokerClientOptions]
  }
  
  @scala.inline
  implicit class SCBrokerClientOptionsOps[Self <: SCBrokerClientOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoReconnect(value: Boolean): Self = this.set("autoReconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoReconnect: Self = this.set("autoReconnect", js.undefined)
    
    @scala.inline
    def setAutoReconnectOptions(value: AutoReconnectOptions): Self = this.set("autoReconnectOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoReconnectOptions: Self = this.set("autoReconnectOptions", js.undefined)
    
    @scala.inline
    def setConnectRetryErrorThreshold(value: Double): Self = this.set("connectRetryErrorThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectRetryErrorThreshold: Self = this.set("connectRetryErrorThreshold", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setPubSubBatchDuration(value: Double): Self = this.set("pubSubBatchDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePubSubBatchDuration: Self = this.set("pubSubBatchDuration", js.undefined)
    
    @scala.inline
    def setSecretKey(value: String): Self = this.set("secretKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretKey: Self = this.set("secretKey", js.undefined)
    
    @scala.inline
    def setSocketPath(value: String): Self = this.set("socketPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocketPath: Self = this.set("socketPath", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
