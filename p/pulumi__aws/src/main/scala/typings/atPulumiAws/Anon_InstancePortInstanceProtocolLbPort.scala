package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InstancePortInstanceProtocolLbPort extends js.Object {
  var instancePort: Input[Double]
  var instanceProtocol: Input[String]
  var lbPort: Input[Double]
  var lbProtocol: Input[String]
  var sslCertificateId: js.UndefOr[Input[String]] = js.undefined
}

object Anon_InstancePortInstanceProtocolLbPort {
  @scala.inline
  def apply(
    instancePort: Input[Double],
    instanceProtocol: Input[String],
    lbPort: Input[Double],
    lbProtocol: Input[String],
    sslCertificateId: Input[String] = null
  ): Anon_InstancePortInstanceProtocolLbPort = {
    val __obj = js.Dynamic.literal(instancePort = instancePort.asInstanceOf[js.Any], instanceProtocol = instanceProtocol.asInstanceOf[js.Any], lbPort = lbPort.asInstanceOf[js.Any], lbProtocol = lbProtocol.asInstanceOf[js.Any])
    if (sslCertificateId != null) __obj.updateDynamic("sslCertificateId")(sslCertificateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_InstancePortInstanceProtocolLbPort]
  }
}

