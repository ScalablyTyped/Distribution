package typings.atPulumiAws.typesInputMod.cloudfront

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistributionLoggingConfig extends js.Object {
  /**
    * The Amazon S3 bucket to store the access logs in, for
    * example, `myawslogbucket.s3.amazonaws.com`.
    */
  var bucket: Input[String]
  /**
    * Specifies whether you want CloudFront to
    * include cookies in access logs (default: `false`).
    */
  var includeCookies: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * An optional string that you want CloudFront to prefix
    * to the access log filenames for this distribution, for example, `myprefix/`.
    */
  var prefix: js.UndefOr[Input[String]] = js.undefined
}

object DistributionLoggingConfig {
  @scala.inline
  def apply(bucket: Input[String], includeCookies: Input[Boolean] = null, prefix: Input[String] = null): DistributionLoggingConfig = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    if (includeCookies != null) __obj.updateDynamic("includeCookies")(includeCookies.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionLoggingConfig]
  }
}

