package typings
package spotifyDashWebDashApiDashNodeLib.spotifyDashWebDashApiDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchOptions extends PaginationMarketOptions {
  var include_external: js.UndefOr[spotifyDashWebDashApiDashNodeLib.spotifyDashWebDashApiDashNodeLibStrings.audio] = js.undefined
}

object SearchOptions {
  @scala.inline
  def apply(
    include_external: spotifyDashWebDashApiDashNodeLib.spotifyDashWebDashApiDashNodeLibStrings.audio = null,
    limit: scala.Int | scala.Double = null,
    market: java.lang.String = null,
    offset: scala.Int | scala.Double = null
  ): SearchOptions = {
    val __obj = js.Dynamic.literal()
    if (include_external != null) __obj.updateDynamic("include_external")(include_external)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (market != null) __obj.updateDynamic("market")(market)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptions]
  }
}

