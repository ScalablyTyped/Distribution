package typings.atPulumiAws.typesOutputMod.cloudfrontNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistributionLoggingConfig extends js.Object {
  /**
    * The Amazon S3 bucket to store the access logs in, for
    * example, `myawslogbucket.s3.amazonaws.com`.
    */
  var bucket: String
  /**
    * Specifies whether you want CloudFront to
    * include cookies in access logs (default: `false`).
    */
  var includeCookies: js.UndefOr[Boolean] = js.undefined
  /**
    * An optional string that you want CloudFront to prefix
    * to the access log filenames for this distribution, for example, `myprefix/`.
    */
  var prefix: js.UndefOr[String] = js.undefined
}

object DistributionLoggingConfig {
  @scala.inline
  def apply(bucket: String, includeCookies: js.UndefOr[Boolean] = js.undefined, prefix: String = null): DistributionLoggingConfig = {
    val __obj = js.Dynamic.literal(bucket = bucket)
    if (!js.isUndefined(includeCookies)) __obj.updateDynamic("includeCookies")(includeCookies)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[DistributionLoggingConfig]
  }
}

