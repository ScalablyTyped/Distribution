package typings.spotifyWebApiNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFeaturedPlaylistsOptions
  extends PaginationOptions
     with LocaleOptions {
  var timestamp: js.UndefOr[String] = js.undefined
}

object GetFeaturedPlaylistsOptions {
  @scala.inline
  def apply(
    country: String = null,
    limit: js.UndefOr[Double] = js.undefined,
    locale: String = null,
    offset: js.UndefOr[Double] = js.undefined,
    timestamp: String = null
  ): GetFeaturedPlaylistsOptions = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFeaturedPlaylistsOptions]
  }
}

