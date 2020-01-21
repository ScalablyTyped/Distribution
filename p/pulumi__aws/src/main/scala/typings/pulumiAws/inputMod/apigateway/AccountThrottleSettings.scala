package typings.pulumiAws.inputMod.apigateway

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountThrottleSettings extends js.Object {
  /**
    * The absolute maximum number of times API Gateway allows the API to be called per second (RPS).
    */
  var burstLimit: js.UndefOr[Input[Double]] = js.native
  /**
    * The number of times API Gateway allows the API to be called per second on average (RPS).
    */
  var rateLimit: js.UndefOr[Input[Double]] = js.native
}

object AccountThrottleSettings {
  @scala.inline
  def apply(burstLimit: Input[Double] = null, rateLimit: Input[Double] = null): AccountThrottleSettings = {
    val __obj = js.Dynamic.literal()
    if (burstLimit != null) __obj.updateDynamic("burstLimit")(burstLimit.asInstanceOf[js.Any])
    if (rateLimit != null) __obj.updateDynamic("rateLimit")(rateLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountThrottleSettings]
  }
}

