package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getDistributionMod {
  
  @JSImport("@pulumi/aws/cloudfront/getDistribution", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDistribution(args: GetDistributionArgs): js.Promise[GetDistributionResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDistribution")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetDistributionResult]]
  inline def getDistribution(args: GetDistributionArgs, opts: InvokeOptions): js.Promise[GetDistributionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDistribution")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetDistributionResult]]
  
  trait GetDistributionArgs extends StObject {
    
    /**
      * The identifier for the distribution. For example: `EDFDVBD632BHDS5`.
      */
    val id: String
    
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetDistributionArgs {
    
    inline def apply(id: String): GetDistributionArgs = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDistributionArgs]
    }
    
    extension [Self <: GetDistributionArgs](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait GetDistributionResult extends StObject {
    
    /**
      * The ARN (Amazon Resource Name) for the distribution. For example: arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5, where 123456789012 is your AWS account ID.
      */
    val arn: String
    
    /**
      * The domain name corresponding to the distribution. For
      * example: `d604721fxaaqy9.cloudfront.net`.
      */
    val domainName: String
    
    val enabled: Boolean
    
    /**
      * The current version of the distribution's information. For example:
      * `E2QWRUHAPOMQZL`.
      */
    val etag: String
    
    /**
      * The CloudFront Route 53 zone ID that can be used to
      * route an [Alias Resource Record Set][7] to. This attribute is simply an
      * alias for the zone ID `Z2FDTNDATAQYW2`.
      */
    val hostedZoneId: String
    
    /**
      * The identifier for the distribution. For example: `EDFDVBD632BHDS5`.
      */
    val id: String
    
    /**
      * The number of invalidation batches
      * currently in progress.
      */
    val inProgressValidationBatches: Double
    
    /**
      * The date and time the distribution was last modified.
      */
    val lastModifiedTime: String
    
    /**
      * The current status of the distribution. `Deployed` if the
      * distribution's information is fully propagated throughout the Amazon
      * CloudFront system.
      */
    val status: String
    
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetDistributionResult {
    
    inline def apply(
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
    
    extension [Self <: GetDistributionResult](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
      
      inline def setHostedZoneId(value: String): Self = StObject.set(x, "hostedZoneId", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInProgressValidationBatches(value: Double): Self = StObject.set(x, "inProgressValidationBatches", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedTime(value: String): Self = StObject.set(x, "lastModifiedTime", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
