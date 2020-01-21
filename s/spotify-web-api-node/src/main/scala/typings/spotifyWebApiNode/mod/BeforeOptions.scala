package typings.spotifyWebApiNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeOptions extends LimitOptions {
  var before: js.UndefOr[Double] = js.undefined
}

object BeforeOptions {
  @scala.inline
  def apply(before: Int | Double = null, limit: Int | Double = null): BeforeOptions = {
    val __obj = js.Dynamic.literal()
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeOptions]
  }
}

