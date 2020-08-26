package typings.pulumiAws.getBucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketResult extends js.Object {
  /**
    * The ARN of the bucket. Will be of format `arn:aws:s3:::bucketname`.
    */
  val arn: String = js.native
  val bucket: String = js.native
  /**
    * The bucket domain name. Will be of format `bucketname.s3.amazonaws.com`.
    */
  val bucketDomainName: String = js.native
  /**
    * The bucket region-specific domain name. The bucket domain name including the region name, please refer [here](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region) for format. Note: The AWS CloudFront allows specifying S3 region-specific endpoint when creating S3 origin, it will prevent [redirect issues](https://forums.aws.amazon.com/thread.jspa?threadID=216814) from CloudFront to S3 Origin URL.
    */
  val bucketRegionalDomainName: String = js.native
  /**
    * The [Route 53 Hosted Zone ID](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_website_region_endpoints) for this bucket's region.
    */
  val hostedZoneId: String = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The AWS region this bucket resides in.
    */
  val region: String = js.native
  /**
    * The domain of the website endpoint, if the bucket is configured with a website. If not, this will be an empty string. This is used to create Route 53 alias records.
    */
  val websiteDomain: String = js.native
  /**
    * The website endpoint, if the bucket is configured with a website. If not, this will be an empty string.
    */
  val websiteEndpoint: String = js.native
}

object GetBucketResult {
  @scala.inline
  def apply(
    arn: String,
    bucket: String,
    bucketDomainName: String,
    bucketRegionalDomainName: String,
    hostedZoneId: String,
    id: String,
    region: String,
    websiteDomain: String,
    websiteEndpoint: String
  ): GetBucketResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], bucket = bucket.asInstanceOf[js.Any], bucketDomainName = bucketDomainName.asInstanceOf[js.Any], bucketRegionalDomainName = bucketRegionalDomainName.asInstanceOf[js.Any], hostedZoneId = hostedZoneId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], websiteDomain = websiteDomain.asInstanceOf[js.Any], websiteEndpoint = websiteEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketResult]
  }
  @scala.inline
  implicit class GetBucketResultOps[Self <: GetBucketResult] (val x: Self) extends AnyVal {
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setBucket(value: String): Self = this.set("bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def setBucketDomainName(value: String): Self = this.set("bucketDomainName", value.asInstanceOf[js.Any])
    @scala.inline
    def setBucketRegionalDomainName(value: String): Self = this.set("bucketRegionalDomainName", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostedZoneId(value: String): Self = this.set("hostedZoneId", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebsiteDomain(value: String): Self = this.set("websiteDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebsiteEndpoint(value: String): Self = this.set("websiteEndpoint", value.asInstanceOf[js.Any])
  }
  
}

