package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Throttle extends js.Object {
  var burstLimit: js.UndefOr[Double | String] = js.undefined
  var rateLimit: js.UndefOr[Double | String] = js.undefined
}

object Throttle {
  @scala.inline
  def apply(burstLimit: Double | String = null, rateLimit: Double | String = null): Throttle = {
    val __obj = js.Dynamic.literal()
    if (burstLimit != null) __obj.updateDynamic("burstLimit")(burstLimit.asInstanceOf[js.Any])
    if (rateLimit != null) __obj.updateDynamic("rateLimit")(rateLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Throttle]
  }
}

