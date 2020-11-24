package typings.pulumiAws.outputMod.cloudfront

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistributionDefaultCacheBehaviorForwardedValues extends js.Object {
  
  /**
    * The forwarded values cookies
    * that specifies how CloudFront handles cookies (maximum one).
    */
  var cookies: DistributionDefaultCacheBehaviorForwardedValuesCookies = js.native
  
  /**
    * Specifies the Headers, if any, that you want
    * CloudFront to vary upon for this cache behavior. Specify `*` to include all
    * headers.
    */
  var headers: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Indicates whether you want CloudFront to forward
    * query strings to the origin that is associated with this cache behavior.
    */
  var queryString: Boolean = js.native
  
  /**
    * When specified, along with a value of
    * `true` for `queryString`, all query strings are forwarded, however only the
    * query string keys listed in this argument are cached. When omitted with a
    * value of `true` for `queryString`, all query string keys are cached.
    */
  var queryStringCacheKeys: js.UndefOr[js.Array[String]] = js.native
}
object DistributionDefaultCacheBehaviorForwardedValues {
  
  @scala.inline
  def apply(cookies: DistributionDefaultCacheBehaviorForwardedValuesCookies, queryString: Boolean): DistributionDefaultCacheBehaviorForwardedValues = {
    val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionDefaultCacheBehaviorForwardedValues]
  }
  
  @scala.inline
  implicit class DistributionDefaultCacheBehaviorForwardedValuesOps[Self <: DistributionDefaultCacheBehaviorForwardedValues] (val x: Self) extends AnyVal {
    
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
    def setCookies(value: DistributionDefaultCacheBehaviorForwardedValuesCookies): Self = this.set("cookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryString(value: Boolean): Self = this.set("queryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersVarargs(value: String*): Self = this.set("headers", js.Array(value :_*))
    
    @scala.inline
    def setHeaders(value: js.Array[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setQueryStringCacheKeysVarargs(value: String*): Self = this.set("queryStringCacheKeys", js.Array(value :_*))
    
    @scala.inline
    def setQueryStringCacheKeys(value: js.Array[String]): Self = this.set("queryStringCacheKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryStringCacheKeys: Self = this.set("queryStringCacheKeys", js.undefined)
  }
}
