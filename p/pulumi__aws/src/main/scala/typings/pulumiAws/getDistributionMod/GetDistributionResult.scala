package typings.pulumiAws.getDistributionMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDistributionResult extends js.Object {
  /**
    * The ARN (Amazon Resource Name) for the distribution. For example: arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5, where 123456789012 is your AWS account ID.
    */
  val arn: String = js.native
  /**
    * The domain name corresponding to the distribution. For
    * example: `d604721fxaaqy9.cloudfront.net`.
    */
  val domainName: String = js.native
  val enabled: Boolean = js.native
  /**
    * The current version of the distribution's information. For example:
    * `E2QWRUHAPOMQZL`.
    */
  val etag: String = js.native
  /**
    * The CloudFront Route 53 zone ID that can be used to
    * route an [Alias Resource Record Set][7] to. This attribute is simply an
    * alias for the zone ID `Z2FDTNDATAQYW2`.
    */
  val hostedZoneId: String = js.native
  /**
    * The identifier for the distribution. For example: `EDFDVBD632BHDS5`.
    */
  val id: String = js.native
  /**
    * The number of invalidation batches
    * currently in progress.
    */
  val inProgressValidationBatches: Double = js.native
  /**
    * The date and time the distribution was last modified.
    */
  val lastModifiedTime: String = js.native
  /**
    * The current status of the distribution. `Deployed` if the
    * distribution's information is fully propagated throughout the Amazon
    * CloudFront system.
    */
  val status: String = js.native
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetDistributionResult {
  @scala.inline
  def apply(
    arn: String,
    domainName: String,
    enabled: Boolean,
    etag: String,
    hostedZoneId: String,
    id: String,
    inProgressValidationBatches: Double,
    lastModifiedTime: String,
    status: String,
    tags: StringDictionary[js.Any] = null
  ): GetDistributionResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], hostedZoneId = hostedZoneId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inProgressValidationBatches = inProgressValidationBatches.asInstanceOf[js.Any], lastModifiedTime = lastModifiedTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDistributionResult]
  }
}

