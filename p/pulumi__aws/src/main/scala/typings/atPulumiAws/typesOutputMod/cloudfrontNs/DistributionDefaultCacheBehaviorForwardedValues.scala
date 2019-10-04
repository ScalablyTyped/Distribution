package typings.atPulumiAws.typesOutputMod.cloudfrontNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistributionDefaultCacheBehaviorForwardedValues extends js.Object {
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
  @scala.inline
  def apply(
    cookies: DistributionDefaultCacheBehaviorForwardedValuesCookies,
    queryString: Boolean,
    headers: js.Array[String] = null,
    queryStringCacheKeys: js.Array[String] = null
  ): DistributionDefaultCacheBehaviorForwardedValues = {
    val __obj = js.Dynamic.literal(cookies = cookies, queryString = queryString)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (queryStringCacheKeys != null) __obj.updateDynamic("queryStringCacheKeys")(queryStringCacheKeys)
    __obj.asInstanceOf[DistributionDefaultCacheBehaviorForwardedValues]
  }
}

