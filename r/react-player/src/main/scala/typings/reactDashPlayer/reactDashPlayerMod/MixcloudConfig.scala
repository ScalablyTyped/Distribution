package typings.reactDashPlayer.reactDashPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MixcloudConfig extends js.Object {
  var options: js.UndefOr[js.Object] = js.undefined
}

object MixcloudConfig {
  @scala.inline
  def apply(options: js.Object = null): MixcloudConfig = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[MixcloudConfig]
  }
}

