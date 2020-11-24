package typings.pulumiAws.getDistributionMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  val tags: js.UndefOr[StringDictionary[String]] = js.native
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
    status: String
  ): GetDistributionResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], hostedZoneId = hostedZoneId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inProgressValidationBatches = inProgressValidationBatches.asInstanceOf[js.Any], lastModifiedTime = lastModifiedTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDistributionResult]
  }
  
  @scala.inline
  implicit class GetDistributionResultOps[Self <: GetDistributionResult] (val x: Self) extends AnyVal {
    
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
    def setDomainName(value: String): Self = this.set("domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostedZoneId(value: String): Self = this.set("hostedZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInProgressValidationBatches(value: Double): Self = this.set("inProgressValidationBatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTime(value: String): Self = this.set("lastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
