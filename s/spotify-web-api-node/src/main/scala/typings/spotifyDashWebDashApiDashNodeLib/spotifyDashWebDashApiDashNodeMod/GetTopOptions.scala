package typings
package spotifyDashWebDashApiDashNodeLib.spotifyDashWebDashApiDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTopOptions extends PaginationOptions {
  var time_range: js.UndefOr[
    spotifyDashWebDashApiDashNodeLib.spotifyDashWebDashApiDashNodeLibStrings.long_term | spotifyDashWebDashApiDashNodeLib.spotifyDashWebDashApiDashNodeLibStrings.medium_term | spotifyDashWebDashApiDashNodeLib.spotifyDashWebDashApiDashNodeLibStrings.short_term
  ] = js.undefined
}

object GetTopOptions {
  @scala.inline
  def apply(
    limit: scala.Int | scala.Double = null,
    offset: scala.Int | scala.Double = null,
    time_range: spotifyDashWebDashApiDashNodeLib.spotifyDashWebDashApiDashNodeLibStrings.long_term | spotifyDashWebDashApiDashNodeLib.spotifyDashWebDashApiDashNodeLibStrings.medium_term | spotifyDashWebDashApiDashNodeLib.spotifyDashWebDashApiDashNodeLibStrings.short_term = null
  ): GetTopOptions = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (time_range != null) __obj.updateDynamic("time_range")(time_range.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTopOptions]
  }
}

