package typings.atPulumiAws.typesInputMod.elb

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadBalancerListener extends js.Object {
  /**
    * The port on the instance to route to
    */
  var instancePort: Input[Double]
  /**
    * The protocol to use to the instance. Valid
    * values are `HTTP`, `HTTPS`, `TCP`, or `SSL`
    */
  var instanceProtocol: Input[String]
  /**
    * The port to listen on for the load balancer
    */
  var lbPort: Input[Double]
  /**
    * The protocol to listen on. Valid values are `HTTP`,
    * `HTTPS`, `TCP`, or `SSL`
    */
  var lbProtocol: Input[String]
  /**
    * The ARN of an SSL certificate you have
    * uploaded to AWS IAM. **Note ECDSA-specific restrictions below.  Only valid when `lbProtocol` is either HTTPS or SSL**
    */
  var sslCertificateId: js.UndefOr[Input[String]] = js.undefined
}

object LoadBalancerListener {
  @scala.inline
  def apply(
    instancePort: Input[Double],
    instanceProtocol: Input[String],
    lbPort: Input[Double],
    lbProtocol: Input[String],
    sslCertificateId: Input[String] = null
  ): LoadBalancerListener = {
    val __obj = js.Dynamic.literal(instancePort = instancePort.asInstanceOf[js.Any], instanceProtocol = instanceProtocol.asInstanceOf[js.Any], lbPort = lbPort.asInstanceOf[js.Any], lbProtocol = lbProtocol.asInstanceOf[js.Any])
    if (sslCertificateId != null) __obj.updateDynamic("sslCertificateId")(sslCertificateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerListener]
  }
}

