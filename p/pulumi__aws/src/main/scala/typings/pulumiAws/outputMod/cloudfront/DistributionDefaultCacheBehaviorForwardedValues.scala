package typings.pulumiAws.outputMod.cloudfront

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionDefaultCacheBehaviorForwardedValues extends StObject {
  
  /**
    * The forwarded values cookies
    * that specifies how CloudFront handles cookies (maximum one).
    */
  var cookies: DistributionDefaultCacheBehaviorForwardedValuesCookies
  
  /**
    * Specifies the Headers, if any, that you want
    * CloudFront to vary upon for this cache behavior. Specify `*` to include all
    * headers.
    */
  var headers: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Indicates whether you want CloudFront to forward
    * query strings to the origin that is associated with this cache behavior.
    */
  var queryString: Boolean
  
  /**
    * When specified, along with a value of
    * `true` for `queryString`, all query strings are forwarded, however only the
    * query string keys listed in this argument are cached. When omitted with a
    * value of `true` for `queryString`, all query string keys are cached.
    */
  var queryStringCacheKeys: js.UndefOr[js.Array[String]] = js.undefined
}
object DistributionDefaultCacheBehaviorForwardedValues {
  
  inline def apply(cookies: DistributionDefaultCacheBehaviorForwardedValuesCookies, queryString: Boolean): DistributionDefaultCacheBehaviorForwardedValues = {
    val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionDefaultCacheBehaviorForwardedValues]
  }
  
  extension [Self <: DistributionDefaultCacheBehaviorForwardedValues](x: Self) {
    
    inline def setCookies(value: DistributionDefaultCacheBehaviorForwardedValuesCookies): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    inline def setQueryString(value: Boolean): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    inline def setQueryStringCacheKeys(value: js.Array[String]): Self = StObject.set(x, "queryStringCacheKeys", value.asInstanceOf[js.Any])
    
    inline def setQueryStringCacheKeysUndefined: Self = StObject.set(x, "queryStringCacheKeys", js.undefined)
    
    inline def setQueryStringCacheKeysVarargs(value: String*): Self = StObject.set(x, "queryStringCacheKeys", js.Array(value :_*))
  }
}
