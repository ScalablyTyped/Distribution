package typings
package spotifyDashWebDashApiDashNodeLib.spotifyDashWebDashApiDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationMarketOptions
  extends PaginationOptions
     with MarketOptions

object PaginationMarketOptions {
  @scala.inline
  def apply(
    limit: scala.Int | scala.Double = null,
    market: java.lang.String = null,
    offset: scala.Int | scala.Double = null
  ): PaginationMarketOptions = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (market != null) __obj.updateDynamic("market")(market)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationMarketOptions]
  }
}

