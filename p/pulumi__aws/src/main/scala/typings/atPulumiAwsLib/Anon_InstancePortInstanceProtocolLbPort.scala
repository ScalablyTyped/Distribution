package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InstancePortInstanceProtocolLbPort extends js.Object {
  var instancePort: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var instanceProtocol: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var lbPort: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var lbProtocol: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var sslCertificateId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_InstancePortInstanceProtocolLbPort {
  @scala.inline
  def apply(
    instancePort: atPulumiPulumiLib.outputMod.Input[scala.Double],
    instanceProtocol: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    lbPort: atPulumiPulumiLib.outputMod.Input[scala.Double],
    lbProtocol: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    sslCertificateId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_InstancePortInstanceProtocolLbPort = {
    val __obj = js.Dynamic.literal(instancePort = instancePort.asInstanceOf[js.Any], instanceProtocol = instanceProtocol.asInstanceOf[js.Any], lbPort = lbPort.asInstanceOf[js.Any], lbProtocol = lbProtocol.asInstanceOf[js.Any])
    if (sslCertificateId != null) __obj.updateDynamic("sslCertificateId")(sslCertificateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_InstancePortInstanceProtocolLbPort]
  }
}

