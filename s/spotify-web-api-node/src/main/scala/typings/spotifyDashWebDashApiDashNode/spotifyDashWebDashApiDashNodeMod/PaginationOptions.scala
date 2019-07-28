package typings.spotifyDashWebDashApiDashNode.spotifyDashWebDashApiDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationOptions extends LimitOptions {
  var offset: js.UndefOr[Double] = js.undefined
}

object PaginationOptions {
  @scala.inline
  def apply(limit: Int | Double = null, offset: Int | Double = null): PaginationOptions = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationOptions]
  }
}

