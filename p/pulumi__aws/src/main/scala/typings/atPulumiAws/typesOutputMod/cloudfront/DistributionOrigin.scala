package typings.atPulumiAws.typesOutputMod.cloudfront

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionOrigin extends js.Object {
  /**
    * One or more sub-resources with `name` and
    * `value` parameters that specify header data that will be sent to the origin
    * (multiples allowed).
    */
  var customHeaders: js.UndefOr[js.Array[DistributionOriginCustomHeader]] = js.native
  /**
    * The CloudFront custom
    * origin configuration information. If an S3
    * origin is required, use `s3OriginConfig` instead.
    */
  var customOriginConfig: js.UndefOr[DistributionOriginCustomOriginConfig] = js.native
  /**
    * The DNS domain name of either the S3 bucket, or
    * web site of your custom origin.
    */
  var domainName: String = js.native
  /**
    * The unique identifier of the member origin
    */
  var originId: String = js.native
  /**
    * An optional element that causes CloudFront to
    * request your content from a directory in your Amazon S3 bucket or your
    * custom origin.
    */
  var originPath: js.UndefOr[String] = js.native
  /**
    * The CloudFront S3 origin
    * configuration information. If a custom origin is required, use
    * `customOriginConfig` instead.
    */
  var s3OriginConfig: js.UndefOr[DistributionOriginS3OriginConfig] = js.native
}

object DistributionOrigin {
  @scala.inline
  def apply(
    domainName: String,
    originId: String,
    customHeaders: js.Array[DistributionOriginCustomHeader] = null,
    customOriginConfig: DistributionOriginCustomOriginConfig = null,
    originPath: String = null,
    s3OriginConfig: DistributionOriginS3OriginConfig = null
  ): DistributionOrigin = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any], originId = originId.asInstanceOf[js.Any])
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders.asInstanceOf[js.Any])
    if (customOriginConfig != null) __obj.updateDynamic("customOriginConfig")(customOriginConfig.asInstanceOf[js.Any])
    if (originPath != null) __obj.updateDynamic("originPath")(originPath.asInstanceOf[js.Any])
    if (s3OriginConfig != null) __obj.updateDynamic("s3OriginConfig")(s3OriginConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionOrigin]
  }
}

