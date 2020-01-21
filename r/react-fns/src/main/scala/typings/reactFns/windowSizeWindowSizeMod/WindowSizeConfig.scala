package typings.reactFns.windowSizeWindowSizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowSizeConfig extends js.Object {
  var throttle: js.UndefOr[Double] = js.undefined
}

object WindowSizeConfig {
  @scala.inline
  def apply(throttle: Int | Double = null): WindowSizeConfig = {
    val __obj = js.Dynamic.literal()
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowSizeConfig]
  }
}

