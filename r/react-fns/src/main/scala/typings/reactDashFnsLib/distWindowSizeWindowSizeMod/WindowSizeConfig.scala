package typings
package reactDashFnsLib.distWindowSizeWindowSizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowSizeConfig extends js.Object {
  var throttle: js.UndefOr[scala.Double] = js.undefined
}

object WindowSizeConfig {
  @scala.inline
  def apply(throttle: scala.Int | scala.Double = null): WindowSizeConfig = {
    val __obj = js.Dynamic.literal()
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowSizeConfig]
  }
}

