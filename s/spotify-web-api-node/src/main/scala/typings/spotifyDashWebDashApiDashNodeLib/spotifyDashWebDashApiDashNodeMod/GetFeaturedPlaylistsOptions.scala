package typings
package spotifyDashWebDashApiDashNodeLib.spotifyDashWebDashApiDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFeaturedPlaylistsOptions extends PaginationLocaleOptions {
  var timestamp: js.UndefOr[java.lang.String] = js.undefined
}

object GetFeaturedPlaylistsOptions {
  @scala.inline
  def apply(
    country: java.lang.String = null,
    limit: scala.Int | scala.Double = null,
    locale: java.lang.String = null,
    offset: scala.Int | scala.Double = null,
    timestamp: java.lang.String = null
  ): GetFeaturedPlaylistsOptions = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[GetFeaturedPlaylistsOptions]
  }
}

