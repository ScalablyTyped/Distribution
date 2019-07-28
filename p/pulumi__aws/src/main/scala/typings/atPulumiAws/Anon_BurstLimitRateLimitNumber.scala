package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BurstLimitRateLimitNumber extends js.Object {
  var burstLimit: js.UndefOr[Double] = js.undefined
  var rateLimit: js.UndefOr[Double] = js.undefined
}

object Anon_BurstLimitRateLimitNumber {
  @scala.inline
  def apply(burstLimit: Int | Double = null, rateLimit: Int | Double = null): Anon_BurstLimitRateLimitNumber = {
    val __obj = js.Dynamic.literal()
    if (burstLimit != null) __obj.updateDynamic("burstLimit")(burstLimit.asInstanceOf[js.Any])
    if (rateLimit != null) __obj.updateDynamic("rateLimit")(rateLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BurstLimitRateLimitNumber]
  }
}

