package typings.pulumiAws.outputMod.elb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLoadBalancerListener extends js.Object {
  
  var instancePort: Double = js.native
  
  var instanceProtocol: String = js.native
  
  var lbPort: Double = js.native
  
  var lbProtocol: String = js.native
  
  var sslCertificateId: String = js.native
}
object GetLoadBalancerListener {
  
  @scala.inline
  def apply(
    instancePort: Double,
    instanceProtocol: String,
    lbPort: Double,
    lbProtocol: String,
    sslCertificateId: String
  ): GetLoadBalancerListener = {
    val __obj = js.Dynamic.literal(instancePort = instancePort.asInstanceOf[js.Any], instanceProtocol = instanceProtocol.asInstanceOf[js.Any], lbPort = lbPort.asInstanceOf[js.Any], lbProtocol = lbProtocol.asInstanceOf[js.Any], sslCertificateId = sslCertificateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLoadBalancerListener]
  }
  
  @scala.inline
  implicit class GetLoadBalancerListenerOps[Self <: GetLoadBalancerListener] (val x: Self) extends AnyVal {
    
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
    def setInstancePort(value: Double): Self = this.set("instancePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceProtocol(value: String): Self = this.set("instanceProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLbPort(value: Double): Self = this.set("lbPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLbProtocol(value: String): Self = this.set("lbProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslCertificateId(value: String): Self = this.set("sslCertificateId", value.asInstanceOf[js.Any])
  }
}
