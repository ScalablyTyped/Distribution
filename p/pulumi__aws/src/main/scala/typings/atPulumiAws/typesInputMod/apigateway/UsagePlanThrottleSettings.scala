package typings.atPulumiAws.typesInputMod.apigateway

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsagePlanThrottleSettings extends js.Object {
  /**
    * The API request burst limit, the maximum rate limit over a time ranging from one to a few seconds, depending upon whether the underlying token bucket is at its full capacity.
    */
  var burstLimit: js.UndefOr[Input[Double]] = js.native
  /**
    * The API request steady-state rate limit.
    */
  var rateLimit: js.UndefOr[Input[Double]] = js.native
}

object UsagePlanThrottleSettings {
  @scala.inline
  def apply(burstLimit: Input[Double] = null, rateLimit: Input[Double] = null): UsagePlanThrottleSettings = {
    val __obj = js.Dynamic.literal()
    if (burstLimit != null) __obj.updateDynamic("burstLimit")(burstLimit.asInstanceOf[js.Any])
    if (rateLimit != null) __obj.updateDynamic("rateLimit")(rateLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsagePlanThrottleSettings]
  }
}

