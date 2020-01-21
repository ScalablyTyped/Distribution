package typings.spotifyWebApiNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AfterOptions extends LimitOptions {
  var after: js.UndefOr[Double] = js.undefined
}

object AfterOptions {
  @scala.inline
  def apply(after: Int | Double = null, limit: Int | Double = null): AfterOptions = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterOptions]
  }
}

