package typings.reactNative.mod.Animated

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParallelConfig extends js.Object {
  var stopTogether: js.UndefOr[Boolean] = js.undefined
}

object ParallelConfig {
  @scala.inline
  def apply(stopTogether: js.UndefOr[Boolean] = js.undefined): ParallelConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(stopTogether)) __obj.updateDynamic("stopTogether")(stopTogether.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParallelConfig]
  }
}

