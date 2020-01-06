package typings.atPulumiAws.typesOutputMod.elb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

