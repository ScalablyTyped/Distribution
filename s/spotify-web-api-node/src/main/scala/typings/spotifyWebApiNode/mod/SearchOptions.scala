package typings.spotifyWebApiNode.mod

import typings.spotifyWebApiNode.spotifyWebApiNodeStrings.audio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchOptions
  extends PaginationOptions
     with MarketOptions {
  var include_external: js.UndefOr[audio] = js.undefined
}

object SearchOptions {
  @scala.inline
  def apply(
    include_external: audio = null,
    limit: js.UndefOr[Double] = js.undefined,
    market: String = null,
    offset: js.UndefOr[Double] = js.undefined
  ): SearchOptions = {
    val __obj = js.Dynamic.literal()
    if (include_external != null) __obj.updateDynamic("include_external")(include_external.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (market != null) __obj.updateDynamic("market")(market.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptions]
  }
}

