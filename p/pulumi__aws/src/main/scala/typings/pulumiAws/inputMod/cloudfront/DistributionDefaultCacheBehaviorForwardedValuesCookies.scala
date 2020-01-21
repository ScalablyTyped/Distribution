package typings.pulumiAws.inputMod.cloudfront

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionDefaultCacheBehaviorForwardedValuesCookies extends js.Object {
  /**
    * Specifies whether you want CloudFront to forward
    * cookies to the origin that is associated with this cache behavior. You can
    * specify `all`, `none` or `whitelist`. If `whitelist`, you must include the
    * subsequent `whitelistedNames`
    */
  var forward: Input[String] = js.native
  /**
    * If you have specified `whitelist` to
    * `forward`, the whitelisted cookies that you want CloudFront to forward to
    * your origin.
    */
  var whitelistedNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object DistributionDefaultCacheBehaviorForwardedValuesCookies {
  @scala.inline
  def apply(forward: Input[String], whitelistedNames: Input[js.Array[Input[String]]] = null): DistributionDefaultCacheBehaviorForwardedValuesCookies = {
    val __obj = js.Dynamic.literal(forward = forward.asInstanceOf[js.Any])
    if (whitelistedNames != null) __obj.updateDynamic("whitelistedNames")(whitelistedNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionDefaultCacheBehaviorForwardedValuesCookies]
  }
}

