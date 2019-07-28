package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HttpPortHttpsPort extends js.Object {
  var httpPort: Input[Double]
  var httpsPort: Input[Double]
  var originKeepaliveTimeout: js.UndefOr[Input[Double]] = js.undefined
  var originProtocolPolicy: Input[String]
  var originReadTimeout: js.UndefOr[Input[Double]] = js.undefined
  var originSslProtocols: Input[js.Array[Input[String]]]
}

object Anon_HttpPortHttpsPort {
  @scala.inline
  def apply(
    httpPort: Input[Double],
    httpsPort: Input[Double],
    originProtocolPolicy: Input[String],
    originSslProtocols: Input[js.Array[Input[String]]],
    originKeepaliveTimeout: Input[Double] = null,
    originReadTimeout: Input[Double] = null
  ): Anon_HttpPortHttpsPort = {
    val __obj = js.Dynamic.literal(httpPort = httpPort.asInstanceOf[js.Any], httpsPort = httpsPort.asInstanceOf[js.Any], originProtocolPolicy = originProtocolPolicy.asInstanceOf[js.Any], originSslProtocols = originSslProtocols.asInstanceOf[js.Any])
    if (originKeepaliveTimeout != null) __obj.updateDynamic("originKeepaliveTimeout")(originKeepaliveTimeout.asInstanceOf[js.Any])
    if (originReadTimeout != null) __obj.updateDynamic("originReadTimeout")(originReadTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HttpPortHttpsPort]
  }
}

