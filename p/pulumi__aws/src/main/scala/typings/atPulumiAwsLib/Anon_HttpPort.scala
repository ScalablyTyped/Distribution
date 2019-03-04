package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HttpPort extends js.Object {
  var httpPort: scala.Double
  var httpsPort: scala.Double
  var originKeepaliveTimeout: js.UndefOr[scala.Double] = js.undefined
  var originProtocolPolicy: java.lang.String
  var originReadTimeout: js.UndefOr[scala.Double] = js.undefined
  var originSslProtocols: js.Array[java.lang.String]
}

object Anon_HttpPort {
  @scala.inline
  def apply(
    httpPort: scala.Double,
    httpsPort: scala.Double,
    originProtocolPolicy: java.lang.String,
    originSslProtocols: js.Array[java.lang.String],
    originKeepaliveTimeout: scala.Int | scala.Double = null,
    originReadTimeout: scala.Int | scala.Double = null
  ): Anon_HttpPort = {
    val __obj = js.Dynamic.literal(httpPort = httpPort, httpsPort = httpsPort, originProtocolPolicy = originProtocolPolicy, originSslProtocols = originSslProtocols)
    if (originKeepaliveTimeout != null) __obj.updateDynamic("originKeepaliveTimeout")(originKeepaliveTimeout.asInstanceOf[js.Any])
    if (originReadTimeout != null) __obj.updateDynamic("originReadTimeout")(originReadTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HttpPort]
  }
}

