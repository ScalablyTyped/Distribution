package typings.pulumiAws.inputMod.cloudfront

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionOrigin extends StObject {
  
  /**
    * One or more sub-resources with `name` and
    * `value` parameters that specify header data that will be sent to the origin
    * (multiples allowed).
    */
  var customHeaders: js.UndefOr[Input[js.Array[Input[DistributionOriginCustomHeader]]]] = js.undefined
  
  /**
    * The CloudFront custom
    * origin configuration information. If an S3
    * origin is required, use `s3OriginConfig` instead.
    */
  var customOriginConfig: js.UndefOr[Input[DistributionOriginCustomOriginConfig]] = js.undefined
  
  /**
    * The DNS domain name of either the S3 bucket, or
    * web site of your custom origin.
    */
  var domainName: Input[String]
  
  /**
    * The unique identifier of the member origin
    */
  var originId: Input[String]
  
  /**
    * An optional element that causes CloudFront to
    * request your content from a directory in your Amazon S3 bucket or your
    * custom origin.
    */
  var originPath: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The CloudFront S3 origin
    * configuration information. If a custom origin is required, use
    * `customOriginConfig` instead.
    */
  var s3OriginConfig: js.UndefOr[Input[DistributionOriginS3OriginConfig]] = js.undefined
}
object DistributionOrigin {
  
  inline def apply(domainName: Input[String], originId: Input[String]): DistributionOrigin = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any], originId = originId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionOrigin]
  }
  
  extension [Self <: DistributionOrigin](x: Self) {
    
    inline def setCustomHeaders(value: Input[js.Array[Input[DistributionOriginCustomHeader]]]): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
    
    inline def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
    
    inline def setCustomHeadersVarargs(value: Input[DistributionOriginCustomHeader]*): Self = StObject.set(x, "customHeaders", js.Array(value :_*))
    
    inline def setCustomOriginConfig(value: Input[DistributionOriginCustomOriginConfig]): Self = StObject.set(x, "customOriginConfig", value.asInstanceOf[js.Any])
    
    inline def setCustomOriginConfigUndefined: Self = StObject.set(x, "customOriginConfig", js.undefined)
    
    inline def setDomainName(value: Input[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setOriginId(value: Input[String]): Self = StObject.set(x, "originId", value.asInstanceOf[js.Any])
    
    inline def setOriginPath(value: Input[String]): Self = StObject.set(x, "originPath", value.asInstanceOf[js.Any])
    
    inline def setOriginPathUndefined: Self = StObject.set(x, "originPath", js.undefined)
    
    inline def setS3OriginConfig(value: Input[DistributionOriginS3OriginConfig]): Self = StObject.set(x, "s3OriginConfig", value.asInstanceOf[js.Any])
    
    inline def setS3OriginConfigUndefined: Self = StObject.set(x, "s3OriginConfig", js.undefined)
  }
}
