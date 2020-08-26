package typings.pulumiAws.inputMod.cloudfront

import typings.pulumiPulumi.outputMod.Input
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
  var customHeaders: js.UndefOr[Input[js.Array[Input[DistributionOriginCustomHeader]]]] = js.native
  /**
    * The CloudFront custom
    * origin configuration information. If an S3
    * origin is required, use `s3OriginConfig` instead.
    */
  var customOriginConfig: js.UndefOr[Input[DistributionOriginCustomOriginConfig]] = js.native
  /**
    * The DNS domain name of either the S3 bucket, or
    * web site of your custom origin.
    */
  var domainName: Input[String] = js.native
  /**
    * The unique identifier of the member origin
    */
  var originId: Input[String] = js.native
  /**
    * An optional element that causes CloudFront to
    * request your content from a directory in your Amazon S3 bucket or your
    * custom origin.
    */
  var originPath: js.UndefOr[Input[String]] = js.native
  /**
    * The CloudFront S3 origin
    * configuration information. If a custom origin is required, use
    * `customOriginConfig` instead.
    */
  var s3OriginConfig: js.UndefOr[Input[DistributionOriginS3OriginConfig]] = js.native
}

object DistributionOrigin {
  @scala.inline
  def apply(domainName: Input[String], originId: Input[String]): DistributionOrigin = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any], originId = originId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionOrigin]
  }
  @scala.inline
  implicit class DistributionOriginOps[Self <: DistributionOrigin] (val x: Self) extends AnyVal {
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
    def setDomainName(value: Input[String]): Self = this.set("domainName", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginId(value: Input[String]): Self = this.set("originId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomHeadersVarargs(value: Input[DistributionOriginCustomHeader]*): Self = this.set("customHeaders", js.Array(value :_*))
    @scala.inline
    def setCustomHeaders(value: Input[js.Array[Input[DistributionOriginCustomHeader]]]): Self = this.set("customHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomHeaders: Self = this.set("customHeaders", js.undefined)
    @scala.inline
    def setCustomOriginConfig(value: Input[DistributionOriginCustomOriginConfig]): Self = this.set("customOriginConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomOriginConfig: Self = this.set("customOriginConfig", js.undefined)
    @scala.inline
    def setOriginPath(value: Input[String]): Self = this.set("originPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginPath: Self = this.set("originPath", js.undefined)
    @scala.inline
    def setS3OriginConfig(value: Input[DistributionOriginS3OriginConfig]): Self = this.set("s3OriginConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3OriginConfig: Self = this.set("s3OriginConfig", js.undefined)
  }
  
}

