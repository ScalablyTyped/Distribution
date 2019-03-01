package typings
package reactDashPlayerLib.reactDashPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VimeoConfig extends js.Object {
  var playerOptions: js.UndefOr[js.Object] = js.undefined
  var preload: js.UndefOr[scala.Boolean] = js.undefined
}

object VimeoConfig {
  @scala.inline
  def apply(playerOptions: js.Object = null, preload: js.UndefOr[scala.Boolean] = js.undefined): VimeoConfig = {
    val __obj = js.Dynamic.literal()
    if (playerOptions != null) __obj.updateDynamic("playerOptions")(playerOptions)
    if (!js.isUndefined(preload)) __obj.updateDynamic("preload")(preload)
    __obj.asInstanceOf[VimeoConfig]
  }
}

