package typings.spotifyDashWebDashApiDashNode.spotifyDashWebDashApiDashNodeMod

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
    limit: Int | Double = null,
    offset: Int | Double = null
  ): GetArtistAlbumsOptions = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country)
    if (include_groups != null) __obj.updateDynamic("include_groups")(include_groups)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetArtistAlbumsOptions]
  }
}

