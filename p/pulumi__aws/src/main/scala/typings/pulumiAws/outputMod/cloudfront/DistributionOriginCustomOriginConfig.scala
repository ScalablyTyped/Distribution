package typings.pulumiAws.outputMod.cloudfront

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionOriginCustomOriginConfig extends js.Object {
  /**
    * The HTTP port the custom origin listens on.
    */
  var httpPort: Double = js.native
  /**
    * The HTTPS port the custom origin listens on.
    */
  var httpsPort: Double = js.native
  /**
    * The Custom KeepAlive timeout, in seconds. By default, AWS enforces a limit of `60`. But you can request an [increase](http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorCustomOrigin.html#request-custom-request-timeout).
    */
  var originKeepaliveTimeout: js.UndefOr[Double] = js.native
  /**
    * The origin protocol policy to apply to
    * your origin. One of `http-only`, `https-only`, or `match-viewer`.
    */
  var originProtocolPolicy: String = js.native
  /**
    * The Custom Read timeout, in seconds. By default, AWS enforces a limit of `60`. But you can request an [increase](http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorCustomOrigin.html#request-custom-request-timeout).
    */
  var originReadTimeout: js.UndefOr[Double] = js.native
  /**
    * The SSL/TLS protocols that you want
    * CloudFront to use when communicating with your origin over HTTPS. A list of
    * one or more of `SSLv3`, `TLSv1`, `TLSv1.1`, and `TLSv1.2`.
    */
  var originSslProtocols: js.Array[String] = js.native
}

object DistributionOriginCustomOriginConfig {
  @scala.inline
  def apply(
    httpPort: Double,
    httpsPort: Double,
    originProtocolPolicy: String,
    originSslProtocols: js.Array[String]
  ): DistributionOriginCustomOriginConfig = {
    val __obj = js.Dynamic.literal(httpPort = httpPort.asInstanceOf[js.Any], httpsPort = httpsPort.asInstanceOf[js.Any], originProtocolPolicy = originProtocolPolicy.asInstanceOf[js.Any], originSslProtocols = originSslProtocols.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionOriginCustomOriginConfig]
  }
  @scala.inline
  implicit class DistributionOriginCustomOriginConfigOps[Self <: DistributionOriginCustomOriginConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHttpPort(value: Double): Self = this.set("httpPort", value.asInstanceOf[js.Any])
    @scala.inline
    def setHttpsPort(value: Double): Self = this.set("httpsPort", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginProtocolPolicy(value: String): Self = this.set("originProtocolPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginSslProtocolsVarargs(value: String*): Self = this.set("originSslProtocols", js.Array(value :_*))
    @scala.inline
    def setOriginSslProtocols(value: js.Array[String]): Self = this.set("originSslProtocols", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginKeepaliveTimeout(value: Double): Self = this.set("originKeepaliveTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginKeepaliveTimeout: Self = this.set("originKeepaliveTimeout", js.undefined)
    @scala.inline
    def setOriginReadTimeout(value: Double): Self = this.set("originReadTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginReadTimeout: Self = this.set("originReadTimeout", js.undefined)
  }
  
}

