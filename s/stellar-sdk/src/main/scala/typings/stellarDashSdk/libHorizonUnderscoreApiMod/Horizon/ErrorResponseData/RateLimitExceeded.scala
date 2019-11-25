package typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.ErrorResponseData

import typings.stellarDashSdk.stellarDashSdkNumbers.`429`
import typings.stellarDashSdk.stellarDashSdkStrings.`Rate Limit Exceeded`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RateLimitExceeded extends Base {
  @JSName("status")
  var status_RateLimitExceeded: `429`
  @JSName("title")
  var title_RateLimitExceeded: `Rate Limit Exceeded`
}

object RateLimitExceeded {
  @scala.inline
  def apply(details: String, instance: String, status: `429`, title: `Rate Limit Exceeded`, `type`: String): RateLimitExceeded = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateLimitExceeded]
  }
}

