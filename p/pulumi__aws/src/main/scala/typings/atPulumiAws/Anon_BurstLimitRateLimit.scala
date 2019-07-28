package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BurstLimitRateLimit extends js.Object {
  var burstLimit: js.UndefOr[Input[Double]] = js.undefined
  var rateLimit: js.UndefOr[Input[Double]] = js.undefined
}

object Anon_BurstLimitRateLimit {
  @scala.inline
  def apply(burstLimit: Input[Double] = null, rateLimit: Input[Double] = null): Anon_BurstLimitRateLimit = {
    val __obj = js.Dynamic.literal()
    if (burstLimit != null) __obj.updateDynamic("burstLimit")(burstLimit.asInstanceOf[js.Any])
    if (rateLimit != null) __obj.updateDynamic("rateLimit")(rateLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BurstLimitRateLimit]
  }
}

