package typings.spotifyWebApiNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LimitOptions extends js.Object {
  var limit: js.UndefOr[Double] = js.undefined
}

object LimitOptions {
  @scala.inline
  def apply(limit: js.UndefOr[Double] = js.undefined): LimitOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitOptions]
  }
}

