package typings.pulumiAws.outputMod.cloudfront

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistributionOrigin extends StObject {
  
  /**
    * One or more sub-resources with `name` and
    * `value` parameters that specify header data that will be sent to the origin
    * (multiples allowed).
    */
  var customHeaders: js.UndefOr[js.Array[DistributionOriginCustomHeader]] = js.native
  
  /**
    * The CloudFront custom
    * origin configuration information. If an S3
    * origin is required, use `s3OriginConfig` instead.
    */
  var customOriginConfig: js.UndefOr[DistributionOriginCustomOriginConfig] = js.native
  
  /**
    * The DNS domain name of either the S3 bucket, or
    * web site of your custom origin.
    */
  var domainName: String = js.native
  
  /**
    * The unique identifier of the member origin
    */
  var originId: String = js.native
  
  /**
    * An optional element that causes CloudFront to
    * request your content from a directory in your Amazon S3 bucket or your
    * custom origin.
    */
  var originPath: js.UndefOr[String] = js.native
  
  /**
    * The CloudFront S3 origin
    * configuration information. If a custom origin is required, use
    * `customOriginConfig` instead.
    */
  var s3OriginConfig: js.UndefOr[DistributionOriginS3OriginConfig] = js.native
}
object DistributionOrigin {
  
  @scala.inline
  def apply(domainName: String, originId: String): DistributionOrigin = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any], originId = originId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionOrigin]
  }
  
  @scala.inline
  implicit class DistributionOriginMutableBuilder[Self <: DistributionOrigin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomHeaders(value: js.Array[DistributionOriginCustomHeader]): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
    
    @scala.inline
    def setCustomHeadersVarargs(value: DistributionOriginCustomHeader*): Self = StObject.set(x, "customHeaders", js.Array(value :_*))
    
    @scala.inline
    def setCustomOriginConfig(value: DistributionOriginCustomOriginConfig): Self = StObject.set(x, "customOriginConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomOriginConfigUndefined: Self = StObject.set(x, "customOriginConfig", js.undefined)
    
    @scala.inline
    def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginId(value: String): Self = StObject.set(x, "originId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginPath(value: String): Self = StObject.set(x, "originPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginPathUndefined: Self = StObject.set(x, "originPath", js.undefined)
    
    @scala.inline
    def setS3OriginConfig(value: DistributionOriginS3OriginConfig): Self = StObject.set(x, "s3OriginConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3OriginConfigUndefined: Self = StObject.set(x, "s3OriginConfig", js.undefined)
  }
}
