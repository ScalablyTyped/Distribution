package typings
package reactDashTouchLib.reactDashTouchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HoldConfig extends js.Object {
  /** @default 1000 */
  var holdFor: js.UndefOr[scala.Double] = js.undefined
  /** @default 250 */
  var updateEvery: js.UndefOr[scala.Double] = js.undefined
}

object HoldConfig {
  @scala.inline
  def apply(holdFor: scala.Int | scala.Double = null, updateEvery: scala.Int | scala.Double = null): HoldConfig = {
    val __obj = js.Dynamic.literal()
    if (holdFor != null) __obj.updateDynamic("holdFor")(holdFor.asInstanceOf[js.Any])
    if (updateEvery != null) __obj.updateDynamic("updateEvery")(updateEvery.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoldConfig]
  }
}

