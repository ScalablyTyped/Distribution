package typings.spotifyWebApiNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AfterOptions extends LimitOptions {
  var after: js.UndefOr[Double] = js.undefined
}

object AfterOptions {
  @scala.inline
  def apply(after: js.UndefOr[Double] = js.undefined, limit: js.UndefOr[Double] = js.undefined): AfterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(after)) __obj.updateDynamic("after")(after.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterOptions]
  }
}

