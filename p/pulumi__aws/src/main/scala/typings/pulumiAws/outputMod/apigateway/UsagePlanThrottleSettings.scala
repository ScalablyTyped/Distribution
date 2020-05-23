package typings.pulumiAws.outputMod.apigateway

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsagePlanThrottleSettings extends js.Object {
  /**
    * The API request burst limit, the maximum rate limit over a time ranging from one to a few seconds, depending upon whether the underlying token bucket is at its full capacity.
    */
  var burstLimit: js.UndefOr[Double] = js.native
  /**
    * The API request steady-state rate limit.
    */
  var rateLimit: js.UndefOr[Double] = js.native
}

object UsagePlanThrottleSettings {
  @scala.inline
  def apply(burstLimit: js.UndefOr[Double] = js.undefined, rateLimit: js.UndefOr[Double] = js.undefined): UsagePlanThrottleSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(burstLimit)) __obj.updateDynamic("burstLimit")(burstLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rateLimit)) __obj.updateDynamic("rateLimit")(rateLimit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsagePlanThrottleSettings]
  }
}

