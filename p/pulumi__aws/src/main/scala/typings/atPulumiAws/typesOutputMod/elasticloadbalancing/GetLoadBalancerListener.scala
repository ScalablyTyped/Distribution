package typings.atPulumiAws.typesOutputMod.elasticloadbalancing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLoadBalancerListener extends js.Object {
  var instancePort: Double
  var instanceProtocol: String
  var lbPort: Double
  var lbProtocol: String
  var sslCertificateId: String
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
    val __obj = js.Dynamic.literal(instancePort = instancePort, instanceProtocol = instanceProtocol, lbPort = lbPort, lbProtocol = lbProtocol, sslCertificateId = sslCertificateId)
  
    __obj.asInstanceOf[GetLoadBalancerListener]
  }
}

