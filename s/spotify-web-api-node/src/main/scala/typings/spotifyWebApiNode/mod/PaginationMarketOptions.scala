package typings.spotifyWebApiNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationMarketOptions
  extends PaginationOptions
     with MarketOptions

object PaginationMarketOptions {
  @scala.inline
  def apply(limit: Int | Double = null, market: String = null, offset: Int | Double = null): PaginationMarketOptions = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (market != null) __obj.updateDynamic("market")(market.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationMarketOptions]
  }
}

