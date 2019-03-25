package typings
package reactDashPlayerLib.reactDashPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SoundCloudConfig extends js.Object {
  var options: js.UndefOr[js.Object] = js.undefined
  var preload: js.UndefOr[scala.Boolean] = js.undefined
}

object SoundCloudConfig {
  @scala.inline
  def apply(options: js.Object = null, preload: js.UndefOr[scala.Boolean] = js.undefined): SoundCloudConfig = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options)
    if (!js.isUndefined(preload)) __obj.updateDynamic("preload")(preload)
    __obj.asInstanceOf[SoundCloudConfig]
  }
}

