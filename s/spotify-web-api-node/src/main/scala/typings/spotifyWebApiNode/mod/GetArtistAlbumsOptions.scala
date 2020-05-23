package typings.spotifyWebApiNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetArtistAlbumsOptions
  extends PaginationOptions
     with CountryOptions {
  var include_groups: js.UndefOr[String] = js.undefined
}

object GetArtistAlbumsOptions {
  @scala.inline
  def apply(
    country: String = null,
    include_groups: String = null,
    limit: js.UndefOr[Double] = js.undefined,
    offset: js.UndefOr[Double] = js.undefined
  ): GetArtistAlbumsOptions = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (include_groups != null) __obj.updateDynamic("include_groups")(include_groups.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetArtistAlbumsOptions]
  }
}

