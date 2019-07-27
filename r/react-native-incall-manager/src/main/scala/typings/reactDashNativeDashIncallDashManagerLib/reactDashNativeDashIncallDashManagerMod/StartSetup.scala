package typings
package reactDashNativeDashIncallDashManagerLib.reactDashNativeDashIncallDashManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartSetup extends js.Object {
  var auto: js.UndefOr[scala.Boolean] = js.undefined
  var media: js.UndefOr[java.lang.String] = js.undefined
  var ringback: js.UndefOr[java.lang.String] = js.undefined
}

object StartSetup {
  @scala.inline
  def apply(
    auto: js.UndefOr[scala.Boolean] = js.undefined,
    media: java.lang.String = null,
    ringback: java.lang.String = null
  ): StartSetup = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(auto)) __obj.updateDynamic("auto")(auto)
    if (media != null) __obj.updateDynamic("media")(media)
    if (ringback != null) __obj.updateDynamic("ringback")(ringback)
    __obj.asInstanceOf[StartSetup]
  }
}

