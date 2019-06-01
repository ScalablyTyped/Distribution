package typings
package spotifyDashWebDashApiDashNodeLib.spotifyDashWebDashApiDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPlaylistTracksOptions
  extends PaginationMarketOptions
     with FieldsOptions

object GetPlaylistTracksOptions {
  @scala.inline
  def apply(
    fields: java.lang.String = null,
    limit: scala.Int | scala.Double = null,
    market: java.lang.String = null,
    offset: scala.Int | scala.Double = null
  ): GetPlaylistTracksOptions = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (market != null) __obj.updateDynamic("market")(market)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPlaylistTracksOptions]
  }
}

