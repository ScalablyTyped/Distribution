package typings.spotifyWebApiNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPlaylistTracksOptions
  extends PaginationOptions
     with MarketOptions
     with FieldsOptions

object GetPlaylistTracksOptions {
  @scala.inline
  def apply(
    fields: String = null,
    limit: Int | Double = null,
    market: String = null,
    offset: Int | Double = null
  ): GetPlaylistTracksOptions = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (market != null) __obj.updateDynamic("market")(market.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPlaylistTracksOptions]
  }
}

