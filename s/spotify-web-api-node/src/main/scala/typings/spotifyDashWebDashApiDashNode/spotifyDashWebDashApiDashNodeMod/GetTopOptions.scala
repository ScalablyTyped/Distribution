package typings.spotifyDashWebDashApiDashNode.spotifyDashWebDashApiDashNodeMod

import typings.spotifyDashWebDashApiDashNode.spotifyDashWebDashApiDashNodeStrings.long_term
import typings.spotifyDashWebDashApiDashNode.spotifyDashWebDashApiDashNodeStrings.medium_term
import typings.spotifyDashWebDashApiDashNode.spotifyDashWebDashApiDashNodeStrings.short_term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTopOptions extends PaginationOptions {
  var time_range: js.UndefOr[long_term | medium_term | short_term] = js.undefined
}

object GetTopOptions {
  @scala.inline
  def apply(
    limit: Int | Double = null,
    offset: Int | Double = null,
    time_range: long_term | medium_term | short_term = null
  ): GetTopOptions = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (time_range != null) __obj.updateDynamic("time_range")(time_range.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTopOptions]
  }
}

