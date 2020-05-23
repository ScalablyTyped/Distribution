package typings.reactFns.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-fns.react-fns/dist/WindowSize/WindowSize.WindowSizeConfig> */
trait PartialWindowSizeConfig extends js.Object {
  var throttle: js.UndefOr[Double] = js.undefined
}

object PartialWindowSizeConfig {
  @scala.inline
  def apply(throttle: js.UndefOr[Double] = js.undefined): PartialWindowSizeConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(throttle)) __obj.updateDynamic("throttle")(throttle.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialWindowSizeConfig]
  }
}

