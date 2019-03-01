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
    hostedZoneId: java.lang.String,
    id: java.lang.String,
    region: java.lang.String,
    websiteDomain: java.lang.String,
    websiteEndpoint: java.lang.String
  ): GetBucketResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arn")(arn)
    __obj.updateDynamic("bucketDomainName")(bucketDomainName)
    __obj.updateDynamic("hostedZoneId")(hostedZoneId)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("region")(region)
    __obj.updateDynamic("websiteDomain")(websiteDomain)
    __obj.updateDynamic("websiteEndpoint")(websiteEndpoint)
    __obj.asInstanceOf[GetBucketResult]
  }
}

