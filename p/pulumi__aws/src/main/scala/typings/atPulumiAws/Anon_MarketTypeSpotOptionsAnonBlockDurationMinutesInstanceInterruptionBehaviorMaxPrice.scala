package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MarketTypeSpotOptionsAnonBlockDurationMinutesInstanceInterruptionBehaviorMaxPrice extends js.Object {
  var marketType: js.UndefOr[Input[String]] = js.undefined
  var spotOptions: js.UndefOr[Input[Anon_BlockDurationMinutesInstanceInterruptionBehaviorMaxPrice]] = js.undefined
}

object Anon_MarketTypeSpotOptionsAnonBlockDurationMinutesInstanceInterruptionBehaviorMaxPrice {
  @scala.inline
  def apply(
    marketType: Input[String] = null,
    spotOptions: Input[Anon_BlockDurationMinutesInstanceInterruptionBehaviorMaxPrice] = null
  ): Anon_MarketTypeSpotOptionsAnonBlockDurationMinutesInstanceInterruptionBehaviorMaxPrice = {
    val __obj = js.Dynamic.literal()
    if (marketType != null) __obj.updateDynamic("marketType")(marketType.asInstanceOf[js.Any])
    if (spotOptions != null) __obj.updateDynamic("spotOptions")(spotOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MarketTypeSpotOptionsAnonBlockDurationMinutesInstanceInterruptionBehaviorMaxPrice]
  }
}

