package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getDistributionMod {
  
  @JSImport("@pulumi/aws/cloudfront/getDistribution", "getDistribution")
  @js.native
  def getDistribution(args: GetDistributionArgs): js.Promise[GetDistributionResult] = js.native
  @JSImport("@pulumi/aws/cloudfront/getDistribution", "getDistribution")
  @js.native
  def getDistribution(args: GetDistributionArgs, opts: InvokeOptions): js.Promise[GetDistributionResult] = js.native
  
  @js.native
  trait GetDistributionArgs extends StObject {
    
    /**
      * The identifier for the distribution. For example: `EDFDVBD632BHDS5`.
      */
    val id: String = js.native
    
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetDistributionArgs {
    
    @scala.inline
    def apply(id: String): GetDistributionArgs = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDistributionArgs]
    }
    
    @scala.inline
    implicit class GetDistributionArgsMutableBuilder[Self <: GetDistributionArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetDistributionResult extends StObject {
    
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
    implicit class GetDistributionResultMutableBuilder[Self <: GetDistributionResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostedZoneId(value: String): Self = StObject.set(x, "hostedZoneId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInProgressValidationBatches(value: Double): Self = StObject.set(x, "inProgressValidationBatches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedTime(value: String): Self = StObject.set(x, "lastModifiedTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
