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
    limit: js.UndefOr[Double] = js.undefined,
    locale: String = null,
    offset: js.UndefOr[Double] = js.undefined
  ): PaginationLocaleOptions = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationLocaleOptions]
  }
}

