package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MarketTypeSpotOptions extends js.Object {
  var marketType: js.UndefOr[String] = js.undefined
  var spotOptions: js.UndefOr[Anon_BlockDurationMinutesInstanceInterruptionBehavior] = js.undefined
}

object Anon_MarketTypeSpotOptions {
  @scala.inline
  def apply(
    marketType: String = null,
    spotOptions: Anon_BlockDurationMinutesInstanceInterruptionBehavior = null
  ): Anon_MarketTypeSpotOptions = {
    val __obj = js.Dynamic.literal()
    if (marketType != null) __obj.updateDynamic("marketType")(marketType)
    if (spotOptions != null) __obj.updateDynamic("spotOptions")(spotOptions)
    __obj.asInstanceOf[Anon_MarketTypeSpotOptions]
  }
}

