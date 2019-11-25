package typings.spotifyDashWebDashApiDashNode.spotifyDashWebDashApiDashNodeMod

import typings.spotifyDashWebDashApiDashNode.spotifyDashWebDashApiDashNodeStrings.audio
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
    limit: Int | Double = null,
    market: String = null,
    offset: Int | Double = null
  ): SearchOptions = {
    val __obj = js.Dynamic.literal()
    if (include_external != null) __obj.updateDynamic("include_external")(include_external.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (market != null) __obj.updateDynamic("market")(market.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptions]
  }
}

