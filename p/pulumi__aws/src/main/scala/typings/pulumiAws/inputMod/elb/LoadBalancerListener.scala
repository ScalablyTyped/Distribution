package typings.pulumiAws.inputMod.elb

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadBalancerListener extends js.Object {
  
  /**
    * The port on the instance to route to
    */
  var instancePort: Input[Double] = js.native
  
  /**
    * The protocol to use to the instance. Valid
    * values are `HTTP`, `HTTPS`, `TCP`, or `SSL`
    */
  var instanceProtocol: Input[String] = js.native
  
  /**
    * The port to listen on for the load balancer
    */
  var lbPort: Input[Double] = js.native
  
  /**
    * The protocol to listen on. Valid values are `HTTP`,
    * `HTTPS`, `TCP`, or `SSL`
    */
  var lbProtocol: Input[String] = js.native
  
  /**
    * The ARN of an SSL certificate you have
    * uploaded to AWS IAM. **Note ECDSA-specific restrictions below.  Only valid when `lbProtocol` is either HTTPS or SSL**
    */
  var sslCertificateId: js.UndefOr[Input[String]] = js.native
}
object LoadBalancerListener {
  
  @scala.inline
  def apply(
    instancePort: Input[Double],
    instanceProtocol: Input[String],
    lbPort: Input[Double],
    lbProtocol: Input[String]
  ): LoadBalancerListener = {
    val __obj = js.Dynamic.literal(instancePort = instancePort.asInstanceOf[js.Any], instanceProtocol = instanceProtocol.asInstanceOf[js.Any], lbPort = lbPort.asInstanceOf[js.Any], lbProtocol = lbProtocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerListener]
  }
  
  @scala.inline
  implicit class LoadBalancerListenerOps[Self <: LoadBalancerListener] (val x: Self) extends AnyVal {
    
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
    def setInstancePort(value: Input[Double]): Self = this.set("instancePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceProtocol(value: Input[String]): Self = this.set("instanceProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLbPort(value: Input[Double]): Self = this.set("lbPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLbProtocol(value: Input[String]): Self = this.set("lbProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslCertificateId(value: Input[String]): Self = this.set("sslCertificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslCertificateId: Self = this.set("sslCertificateId", js.undefined)
  }
}
