package typings.atPulumiAws.typesOutputMod.cloudfrontNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistributionOrigin extends js.Object {
  /**
    * One or more sub-resources with `name` and
    * `value` parameters that specify header data that will be sent to the origin
    * (multiples allowed).
    */
  var customHeaders: js.UndefOr[js.Array[DistributionOriginCustomHeader]] = js.undefined
  /**
    * The CloudFront custom
    * origin configuration information. If an S3
    * origin is required, use `s3OriginConfig` instead.
    */
  var customOriginConfig: js.UndefOr[DistributionOriginCustomOriginConfig] = js.undefined
  /**
    * The DNS domain name of either the S3 bucket, or
    * web site of your custom origin.
    */
  var domainName: String
  /**
    * The unique identifier of the member origin
    */
  var originId: String
  /**
    * An optional element that causes CloudFront to
    * request your content from a directory in your Amazon S3 bucket or your
    * custom origin.
    */
  var originPath: js.UndefOr[String] = js.undefined
  /**
    * The CloudFront S3 origin
    * configuration information. If a custom origin is required, use
    * `customOriginConfig` instead.
    */
  var s3OriginConfig: js.UndefOr[DistributionOriginS3OriginConfig] = js.undefined
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
    val __obj = js.Dynamic.literal(domainName = domainName, originId = originId)
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders)
    if (customOriginConfig != null) __obj.updateDynamic("customOriginConfig")(customOriginConfig)
    if (originPath != null) __obj.updateDynamic("originPath")(originPath)
    if (s3OriginConfig != null) __obj.updateDynamic("s3OriginConfig")(s3OriginConfig)
    __obj.asInstanceOf[DistributionOrigin]
  }
}

