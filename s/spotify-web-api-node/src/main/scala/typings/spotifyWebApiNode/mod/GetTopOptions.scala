package typings.spotifyWebApiNode.mod

import typings.spotifyWebApiNode.spotifyWebApiNodeStrings.long_term
import typings.spotifyWebApiNode.spotifyWebApiNodeStrings.medium_term
import typings.spotifyWebApiNode.spotifyWebApiNodeStrings.short_term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTopOptions extends PaginationOptions {
  var time_range: js.UndefOr[long_term | medium_term | short_term] = js.undefined
}

object GetTopOptions {
  @scala.inline
  def apply(
    limit: js.UndefOr[Double] = js.undefined,
    offset: js.UndefOr[Double] = js.undefined,
    time_range: long_term | medium_term | short_term = null
  ): GetTopOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (time_range != null) __obj.updateDynamic("time_range")(time_range.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTopOptions]
  }
}

