package typings.spotifyWebApiNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeOptions extends LimitOptions {
  var before: js.UndefOr[Double] = js.undefined
}

object BeforeOptions {
  @scala.inline
  def apply(before: js.UndefOr[Double] = js.undefined, limit: js.UndefOr[Double] = js.undefined): BeforeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(before)) __obj.updateDynamic("before")(before.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeOptions]
  }
}

