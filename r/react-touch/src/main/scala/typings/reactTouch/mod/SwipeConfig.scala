package typings.reactTouch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeConfig extends js.Object {
  /** @default 100 */
  var swipeDistance: js.UndefOr[Double] = js.undefined
}

object SwipeConfig {
  @scala.inline
  def apply(swipeDistance: js.UndefOr[Double] = js.undefined): SwipeConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(swipeDistance)) __obj.updateDynamic("swipeDistance")(swipeDistance.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwipeConfig]
  }
}

