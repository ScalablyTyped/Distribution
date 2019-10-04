package typings.atPulumiAws.typesOutputMod.cloudfrontNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistributionDefaultCacheBehaviorForwardedValuesCookies extends js.Object {
  /**
    * Specifies whether you want CloudFront to forward
    * cookies to the origin that is associated with this cache behavior. You can
    * specify `all`, `none` or `whitelist`. If `whitelist`, you must include the
    * subsequent `whitelistedNames`
    */
  var forward: String
  /**
    * If you have specified `whitelist` to
    * `forward`, the whitelisted cookies that you want CloudFront to forward to
    * your origin.
    */
  var whitelistedNames: js.UndefOr[js.Array[String]] = js.undefined
}

object DistributionDefaultCacheBehaviorForwardedValuesCookies {
  @scala.inline
  def apply(forward: String, whitelistedNames: js.Array[String] = null): DistributionDefaultCacheBehaviorForwardedValuesCookies = {
    val __obj = js.Dynamic.literal(forward = forward)
    if (whitelistedNames != null) __obj.updateDynamic("whitelistedNames")(whitelistedNames)
    __obj.asInstanceOf[DistributionDefaultCacheBehaviorForwardedValuesCookies]
  }
}

