package typings.spotifyDashWebDashApiDashNode.spotifyDashWebDashApiDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarketOptions extends js.Object {
  var market: js.UndefOr[String] = js.undefined
}

object MarketOptions {
  @scala.inline
  def apply(market: String = null): MarketOptions = {
    val __obj = js.Dynamic.literal()
    if (market != null) __obj.updateDynamic("market")(market)
    __obj.asInstanceOf[MarketOptions]
  }
}

