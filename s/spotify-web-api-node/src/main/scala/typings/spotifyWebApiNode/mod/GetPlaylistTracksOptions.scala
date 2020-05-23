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
    limit: js.UndefOr[Double] = js.undefined,
    market: String = null,
    offset: js.UndefOr[Double] = js.undefined
  ): GetPlaylistTracksOptions = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (market != null) __obj.updateDynamic("market")(market.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPlaylistTracksOptions]
  }
}

