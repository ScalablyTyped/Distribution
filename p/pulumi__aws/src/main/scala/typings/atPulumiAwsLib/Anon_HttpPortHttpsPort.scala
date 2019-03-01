package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HttpPortHttpsPort extends js.Object {
  var httpPort: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var httpsPort: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var originKeepaliveTimeout: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var originProtocolPolicy: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var originReadTimeout: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var originSslProtocols: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
}

object Anon_HttpPortHttpsPort {
  @scala.inline
  def apply(
    httpPort: atPulumiPulumiLib.outputMod.Input[scala.Double],
    httpsPort: atPulumiPulumiLib.outputMod.Input[scala.Double],
    originProtocolPolicy: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    originSslProtocols: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]],
    originKeepaliveTimeout: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    originReadTimeout: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
  ): Anon_HttpPortHttpsPort = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("httpPort")(httpPort.asInstanceOf[js.Any])
    __obj.updateDynamic("httpsPort")(httpsPort.asInstanceOf[js.Any])
    __obj.updateDynamic("originProtocolPolicy")(originProtocolPolicy.asInstanceOf[js.Any])
    __obj.updateDynamic("originSslProtocols")(originSslProtocols.asInstanceOf[js.Any])
    if (originKeepaliveTimeout != null) __obj.updateDynamic("originKeepaliveTimeout")(originKeepaliveTimeout.asInstanceOf[js.Any])
    if (originReadTimeout != null) __obj.updateDynamic("originReadTimeout")(originReadTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HttpPortHttpsPort]
  }
}

