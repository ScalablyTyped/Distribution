package typings.atPulumiAws.typesInputMod.cloudfrontNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistributionOriginCustomOriginConfig extends js.Object {
  /**
    * The HTTP port the custom origin listens on.
    */
  var httpPort: Input[Double]
  /**
    * The HTTPS port the custom origin listens on.
    */
  var httpsPort: Input[Double]
  /**
    * The Custom KeepAlive timeout, in seconds. By default, AWS enforces a limit of `60`. But you can request an [increase](http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorCustomOrigin.html#request-custom-request-timeout).
    */
  var originKeepaliveTimeout: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The origin protocol policy to apply to
    * your origin. One of `http-only`, `https-only`, or `match-viewer`.
    */
  var originProtocolPolicy: Input[String]
  /**
    * The Custom Read timeout, in seconds. By default, AWS enforces a limit of `60`. But you can request an [increase](http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorCustomOrigin.html#request-custom-request-timeout).
    */
  var originReadTimeout: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The SSL/TLS protocols that you want
    * CloudFront to use when communicating with your origin over HTTPS. A list of
    * one or more of `SSLv3`, `TLSv1`, `TLSv1.1`, and `TLSv1.2`.
    */
  var originSslProtocols: Input[js.Array[Input[String]]]
}

object DistributionOriginCustomOriginConfig {
  @scala.inline
  def apply(
    httpPort: Input[Double],
    httpsPort: Input[Double],
    originProtocolPolicy: Input[String],
    originSslProtocols: Input[js.Array[Input[String]]],
    originKeepaliveTimeout: Input[Double] = null,
    originReadTimeout: Input[Double] = null
  ): DistributionOriginCustomOriginConfig = {
    val __obj = js.Dynamic.literal(httpPort = httpPort.asInstanceOf[js.Any], httpsPort = httpsPort.asInstanceOf[js.Any], originProtocolPolicy = originProtocolPolicy.asInstanceOf[js.Any], originSslProtocols = originSslProtocols.asInstanceOf[js.Any])
    if (originKeepaliveTimeout != null) __obj.updateDynamic("originKeepaliveTimeout")(originKeepaliveTimeout.asInstanceOf[js.Any])
    if (originReadTimeout != null) __obj.updateDynamic("originReadTimeout")(originReadTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionOriginCustomOriginConfig]
  }
}

