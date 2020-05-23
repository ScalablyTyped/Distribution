package typings.reactFns.windowSizeWindowSizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowSizeConfig extends js.Object {
  var throttle: js.UndefOr[Double] = js.undefined
}

object WindowSizeConfig {
  @scala.inline
  def apply(throttle: js.UndefOr[Double] = js.undefined): WindowSizeConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(throttle)) __obj.updateDynamic("throttle")(throttle.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowSizeConfig]
  }
}

