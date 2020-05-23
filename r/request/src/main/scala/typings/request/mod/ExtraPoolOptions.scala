package typings.request.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtraPoolOptions extends PoolOptions {
  var maxSockets: js.UndefOr[Double] = js.undefined
}

object ExtraPoolOptions {
  @scala.inline
  def apply(maxSockets: js.UndefOr[Double] = js.undefined): ExtraPoolOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxSockets)) __obj.updateDynamic("maxSockets")(maxSockets.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraPoolOptions]
  }
}

