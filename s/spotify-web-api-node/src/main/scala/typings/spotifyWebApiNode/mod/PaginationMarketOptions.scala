package typings.spotifyWebApiNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationMarketOptions
  extends PaginationOptions
     with MarketOptions

object PaginationMarketOptions {
  @scala.inline
  def apply(
    limit: js.UndefOr[Double] = js.undefined,
    market: String = null,
    offset: js.UndefOr[Double] = js.undefined
  ): PaginationMarketOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (market != null) __obj.updateDynamic("market")(market.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationMarketOptions]
  }
}

