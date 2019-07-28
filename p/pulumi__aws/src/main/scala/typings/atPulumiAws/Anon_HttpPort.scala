package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HttpPort extends js.Object {
  var httpPort: Double
  var httpsPort: Double
  var originKeepaliveTimeout: js.UndefOr[Double] = js.undefined
  var originProtocolPolicy: String
  var originReadTimeout: js.UndefOr[Double] = js.undefined
  var originSslProtocols: js.Array[String]
}

object Anon_HttpPort {
  @scala.inline
  def apply(
    httpPort: Double,
    httpsPort: Double,
    originProtocolPolicy: String,
    originSslProtocols: js.Array[String],
    originKeepaliveTimeout: Int | Double = null,
    originReadTimeout: Int | Double = null
  ): Anon_HttpPort = {
    val __obj = js.Dynamic.literal(httpPort = httpPort, httpsPort = httpsPort, originProtocolPolicy = originProtocolPolicy, originSslProtocols = originSslProtocols)
    if (originKeepaliveTimeout != null) __obj.updateDynamic("originKeepaliveTimeout")(originKeepaliveTimeout.asInstanceOf[js.Any])
    if (originReadTimeout != null) __obj.updateDynamic("originReadTimeout")(originReadTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HttpPort]
  }
}

