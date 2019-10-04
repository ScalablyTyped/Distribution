package typings.atPulumiAws.typesOutputMod.apigatewayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsagePlanThrottleSettings extends js.Object {
  /**
    * The API request burst limit, the maximum rate limit over a time ranging from one to a few seconds, depending upon whether the underlying token bucket is at its full capacity.
    */
  var burstLimit: js.UndefOr[Double] = js.undefined
  /**
    * The API request steady-state rate limit.
    */
  var rateLimit: js.UndefOr[Double] = js.undefined
}

object UsagePlanThrottleSettings {
  @scala.inline
  def apply(burstLimit: Int | Double = null, rateLimit: Int | Double = null): UsagePlanThrottleSettings = {
    val __obj = js.Dynamic.literal()
    if (burstLimit != null) __obj.updateDynamic("burstLimit")(burstLimit.asInstanceOf[js.Any])
    if (rateLimit != null) __obj.updateDynamic("rateLimit")(rateLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsagePlanThrottleSettings]
  }
}

