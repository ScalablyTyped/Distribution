package typings
package atPulumiAwsLib.s3GetBucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketResult extends js.Object {
  /**
    * The ARN of the bucket. Will be of format `arn:aws:s3:::bucketname`.
    */
  val arn: java.lang.String
  /**
    * The bucket domain name. Will be of format `bucketname.s3.amazonaws.com`.
    */
  val bucketDomainName: java.lang.String
  /**
    * The bucket region-specific domain name. The bucket domain name including the region name, please refer [here](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region) for format. Note: The AWS CloudFront allows specifying S3 region-specific endpoint when creating S3 origin, it will prevent [redirect issues](https://forums.aws.amazon.com/thread.jspa?threadID=216814) from CloudFront to S3 Origin URL.
    */
  val bucketRegionalDomainName: java.lang.String
  /**
    * The [Route 53 Hosted Zone ID](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_website_region_endpoints) for this bucket's region.
    */
  val hostedZoneId: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * The AWS region this bucket resides in.
    */
  val region: java.lang.String
  /**
    * The domain of the website endpoint, if the bucket is configured with a website. If not, this will be an empty string. This is used to create Route 53 alias records.
    */
  val websiteDomain: java.lang.String
  /**
    * The website endpoint, if the bucket is configured with a website. If not, this will be an empty string.
    */
  val websiteEndpoint: java.lang.String
}

object GetBucketResult {
  @scala.inline
  def apply(
    arn: java.lang.String,
    bucketDomainName: java.lang.String,
    bucketRegionalDomainName: java.lang.String,
    hostedZoneId: java.lang.String,
    id: java.lang.String,
    region: java.lang.String,
    websiteDomain: java.lang.String,
    websiteEndpoint: java.lang.String
  ): GetBucketResult = {
    val __obj = js.Dynamic.literal(arn = arn, bucketDomainName = bucketDomainName, bucketRegionalDomainName = bucketRegionalDomainName, hostedZoneId = hostedZoneId, id = id, region = region, websiteDomain = websiteDomain, websiteEndpoint = websiteEndpoint)
  
    __obj.asInstanceOf[GetBucketResult]
  }
}

