package typings.spotifyWebApiNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationOptions extends LimitOptions {
  var offset: js.UndefOr[Double] = js.undefined
}

object PaginationOptions {
  @scala.inline
  def apply(limit: js.UndefOr[Double] = js.undefined, offset: js.UndefOr[Double] = js.undefined): PaginationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationOptions]
  }
}

