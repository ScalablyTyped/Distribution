package typings.atPulumiAws.typesOutputMod.elbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadBalancerListener extends js.Object {
  /**
    * The port on the instance to route to
    */
  var instancePort: Double
  /**
    * The protocol to use to the instance. Valid
    * values are `HTTP`, `HTTPS`, `TCP`, or `SSL`
    */
  var instanceProtocol: String
  /**
    * The port to listen on for the load balancer
    */
  var lbPort: Double
  /**
    * The protocol to listen on. Valid values are `HTTP`,
    * `HTTPS`, `TCP`, or `SSL`
    */
  var lbProtocol: String
  /**
    * The ARN of an SSL certificate you have
    * uploaded to AWS IAM. **Note ECDSA-specific restrictions below.  Only valid when `lbProtocol` is either HTTPS or SSL**
    */
  var sslCertificateId: js.UndefOr[String] = js.undefined
}

object LoadBalancerListener {
  @scala.inline
  def apply(
    instancePort: Double,
    instanceProtocol: String,
    lbPort: Double,
    lbProtocol: String,
    sslCertificateId: String = null
  ): LoadBalancerListener = {
    val __obj = js.Dynamic.literal(instancePort = instancePort, instanceProtocol = instanceProtocol, lbPort = lbPort, lbProtocol = lbProtocol)
    if (sslCertificateId != null) __obj.updateDynamic("sslCertificateId")(sslCertificateId)
    __obj.asInstanceOf[LoadBalancerListener]
  }
}

