package typings.atPulumiAws.typesOutputMod.cloudfront

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistributionOriginCustomOriginConfig extends js.Object {
  /**
    * The HTTP port the custom origin listens on.
    */
  var httpPort: Double
  /**
    * The HTTPS port the custom origin listens on.
    */
  var httpsPort: Double
  /**
    * The Custom KeepAlive timeout, in seconds. By default, AWS enforces a limit of `60`. But you can request an [increase](http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorCustomOrigin.html#request-custom-request-timeout).
    */
  var originKeepaliveTimeout: js.UndefOr[Double] = js.undefined
  /**
    * The origin protocol policy to apply to
    * your origin. One of `http-only`, `https-only`, or `match-viewer`.
    */
  var originProtocolPolicy: String
  /**
    * The Custom Read timeout, in seconds. By default, AWS enforces a limit of `60`. But you can request an [increase](http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorCustomOrigin.html#request-custom-request-timeout).
    */
  var originReadTimeout: js.UndefOr[Double] = js.undefined
  /**
    * The SSL/TLS protocols that you want
    * CloudFront to use when communicating with your origin over HTTPS. A list of
    * one or more of `SSLv3`, `TLSv1`, `TLSv1.1`, and `TLSv1.2`.
    */
  var originSslProtocols: js.Array[String]
}

object DistributionOriginCustomOriginConfig {
  @scala.inline
  def apply(
    httpPort: Double,
    httpsPort: Double,
    originProtocolPolicy: String,
    originSslProtocols: js.Array[String],
    originKeepaliveTimeout: Int | Double = null,
    originReadTimeout: Int | Double = null
  ): DistributionOriginCustomOriginConfig = {
    val __obj = js.Dynamic.literal(httpPort = httpPort, httpsPort = httpsPort, originProtocolPolicy = originProtocolPolicy, originSslProtocols = originSslProtocols)
    if (originKeepaliveTimeout != null) __obj.updateDynamic("originKeepaliveTimeout")(originKeepaliveTimeout.asInstanceOf[js.Any])
    if (originReadTimeout != null) __obj.updateDynamic("originReadTimeout")(originReadTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionOriginCustomOriginConfig]
  }
}

