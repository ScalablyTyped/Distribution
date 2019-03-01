package typings
package reactDashTouchLib.reactDashTouchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeConfig extends js.Object {
  /** @default 100 */
  var swipeDistance: js.UndefOr[scala.Double] = js.undefined
}

object SwipeConfig {
  @scala.inline
  def apply(swipeDistance: scala.Int | scala.Double = null): SwipeConfig = {
    val __obj = js.Dynamic.literal()
    if (swipeDistance != null) __obj.updateDynamic("swipeDistance")(swipeDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwipeConfig]
  }
}

