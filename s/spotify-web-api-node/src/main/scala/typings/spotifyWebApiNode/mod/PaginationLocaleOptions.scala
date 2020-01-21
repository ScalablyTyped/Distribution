package typings.spotifyWebApiNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationLocaleOptions
  extends PaginationOptions
     with LocaleOptions

object PaginationLocaleOptions {
  @scala.inline
  def apply(
    country: String = null,
    limit: Int | Double = null,
    locale: String = null,
    offset: Int | Double = null
  ): PaginationLocaleOptions = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationLocaleOptions]
  }
}

