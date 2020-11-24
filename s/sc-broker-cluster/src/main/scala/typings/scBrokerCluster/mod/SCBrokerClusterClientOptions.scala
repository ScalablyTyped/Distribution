package typings.scBrokerCluster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SCBrokerClusterClientOptions extends js.Object {
  
  var brokers: js.Array[String] = js.native
  
  var connectRetryErrorThreshold: Double = js.native
  
  var pubSubBatchDuration: js.UndefOr[Double] = js.native
  
  var secretKey: js.UndefOr[String] = js.native
}
object SCBrokerClusterClientOptions {
  
  @scala.inline
  def apply(brokers: js.Array[String], connectRetryErrorThreshold: Double): SCBrokerClusterClientOptions = {
    val __obj = js.Dynamic.literal(brokers = brokers.asInstanceOf[js.Any], connectRetryErrorThreshold = connectRetryErrorThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[SCBrokerClusterClientOptions]
  }
  
  @scala.inline
  implicit class SCBrokerClusterClientOptionsOps[Self <: SCBrokerClusterClientOptions] (val x: Self) extends AnyVal {
    
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
    def setConnectRetryErrorThreshold(value: Double): Self = this.set("connectRetryErrorThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubSubBatchDuration(value: Double): Self = this.set("pubSubBatchDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePubSubBatchDuration: Self = this.set("pubSubBatchDuration", js.undefined)
    
    @scala.inline
    def setSecretKey(value: String): Self = this.set("secretKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretKey: Self = this.set("secretKey", js.undefined)
  }
}
