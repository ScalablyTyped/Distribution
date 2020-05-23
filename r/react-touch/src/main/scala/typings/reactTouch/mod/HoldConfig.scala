package typings.reactTouch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HoldConfig extends js.Object {
  /** @default 1000 */
  var holdFor: js.UndefOr[Double] = js.undefined
  /** @default 250 */
  var updateEvery: js.UndefOr[Double] = js.undefined
}

object HoldConfig {
  @scala.inline
  def apply(holdFor: js.UndefOr[Double] = js.undefined, updateEvery: js.UndefOr[Double] = js.undefined): HoldConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(holdFor)) __obj.updateDynamic("holdFor")(holdFor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updateEvery)) __obj.updateDynamic("updateEvery")(updateEvery.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoldConfig]
  }
}

