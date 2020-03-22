package typings.request.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtraPoolOptions extends PoolOptions {
  var maxSockets: js.UndefOr[Double] = js.undefined
}

object ExtraPoolOptions {
  @scala.inline
  def apply(maxSockets: Int | Double = null): ExtraPoolOptions = {
    val __obj = js.Dynamic.literal()
    if (maxSockets != null) __obj.updateDynamic("maxSockets")(maxSockets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraPoolOptions]
  }
}

