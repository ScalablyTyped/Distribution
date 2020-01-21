package typings.spotifyWebApiNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LimitOptions extends js.Object {
  var limit: js.UndefOr[Double] = js.undefined
}

object LimitOptions {
  @scala.inline
  def apply(limit: Int | Double = null): LimitOptions = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitOptions]
  }
}

