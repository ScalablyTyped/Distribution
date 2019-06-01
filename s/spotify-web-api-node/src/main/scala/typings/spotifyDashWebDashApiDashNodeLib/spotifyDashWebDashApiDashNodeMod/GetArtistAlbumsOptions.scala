package typings
package spotifyDashWebDashApiDashNodeLib.spotifyDashWebDashApiDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetArtistAlbumsOptions extends PaginationCountryOptions {
  var include_groups: js.UndefOr[java.lang.String] = js.undefined
}

object GetArtistAlbumsOptions {
  @scala.inline
  def apply(
    country: java.lang.String = null,
    include_groups: java.lang.String = null,
    limit: scala.Int | scala.Double = null,
    offset: scala.Int | scala.Double = null
  ): GetArtistAlbumsOptions = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country)
    if (include_groups != null) __obj.updateDynamic("include_groups")(include_groups)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetArtistAlbumsOptions]
  }
}

