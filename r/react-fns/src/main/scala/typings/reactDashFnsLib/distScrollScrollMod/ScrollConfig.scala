package typings
package reactDashFnsLib.distScrollScrollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollConfig extends js.Object {
  var throttle: js.UndefOr[scala.Double] = js.undefined
}

object ScrollConfig {
  @scala.inline
  def apply(throttle: scala.Int | scala.Double = null): ScrollConfig = {
    val __obj = js.Dynamic.literal()
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollConfig]
  }
}

