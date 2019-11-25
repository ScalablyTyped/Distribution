package typings.reactDashPlayer.reactDashPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DailyMotionConfig extends js.Object {
  var params: js.UndefOr[js.Object] = js.undefined
  var preload: js.UndefOr[Boolean] = js.undefined
}

object DailyMotionConfig {
  @scala.inline
  def apply(params: js.Object = null, preload: js.UndefOr[Boolean] = js.undefined): DailyMotionConfig = {
    val __obj = js.Dynamic.literal()
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (!js.isUndefined(preload)) __obj.updateDynamic("preload")(preload.asInstanceOf[js.Any])
    __obj.asInstanceOf[DailyMotionConfig]
  }
}

