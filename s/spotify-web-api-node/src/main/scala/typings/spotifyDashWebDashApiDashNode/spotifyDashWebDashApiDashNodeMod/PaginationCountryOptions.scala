package typings.spotifyDashWebDashApiDashNode.spotifyDashWebDashApiDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationCountryOptions
  extends PaginationOptions
     with CountryOptions

object PaginationCountryOptions {
  @scala.inline
  def apply(country: String = null, limit: Int | Double = null, offset: Int | Double = null): PaginationCountryOptions = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationCountryOptions]
  }
}

