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
    * id is the provider-assigned unique ID for this managed resource.
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
}

