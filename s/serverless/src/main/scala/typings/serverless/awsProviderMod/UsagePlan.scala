package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsagePlan extends js.Object {
  var quota: js.UndefOr[Quota] = js.undefined
  var throttle: js.UndefOr[Throttle] = js.undefined
}

object UsagePlan {
  @scala.inline
  def apply(quota: Quota = null, throttle: Throttle = null): UsagePlan = {
    val __obj = js.Dynamic.literal()
    if (quota != null) __obj.updateDynamic("quota")(quota.asInstanceOf[js.Any])
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsagePlan]
  }
}

