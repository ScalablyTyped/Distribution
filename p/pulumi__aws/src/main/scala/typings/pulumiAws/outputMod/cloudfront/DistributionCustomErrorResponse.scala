package typings.pulumiAws.outputMod.cloudfront

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionCustomErrorResponse extends StObject {
  
  /**
    * The minimum amount of time you want
    * HTTP error codes to stay in CloudFront caches before CloudFront queries your
    * origin to see whether the object has been updated.
    */
  var errorCachingMinTtl: js.UndefOr[Double] = js.undefined
  
  /**
    * The 4xx or 5xx HTTP status code that you want to
    * customize.
    */
  var errorCode: Double
  
  /**
    * The HTTP status code that you want CloudFront
    * to return with the custom error page to the viewer.
    */
  var responseCode: js.UndefOr[Double] = js.undefined
  
  /**
    * The path of the custom error page (for
    * example, `/custom_404.html`).
    */
  var responsePagePath: js.UndefOr[String] = js.undefined
}
object DistributionCustomErrorResponse {
  
  inline def apply(errorCode: Double): DistributionCustomErrorResponse = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionCustomErrorResponse]
  }
  
  extension [Self <: DistributionCustomErrorResponse](x: Self) {
    
    inline def setErrorCachingMinTtl(value: Double): Self = StObject.set(x, "errorCachingMinTtl", value.asInstanceOf[js.Any])
    
    inline def setErrorCachingMinTtlUndefined: Self = StObject.set(x, "errorCachingMinTtl", js.undefined)
    
    inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setResponseCode(value: Double): Self = StObject.set(x, "responseCode", value.asInstanceOf[js.Any])
    
    inline def setResponseCodeUndefined: Self = StObject.set(x, "responseCode", js.undefined)
    
    inline def setResponsePagePath(value: String): Self = StObject.set(x, "responsePagePath", value.asInstanceOf[js.Any])
    
    inline def setResponsePagePathUndefined: Self = StObject.set(x, "responsePagePath", js.undefined)
  }
}
