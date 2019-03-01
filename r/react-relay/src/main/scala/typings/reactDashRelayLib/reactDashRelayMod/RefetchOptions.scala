package typings
package reactDashRelayLib.reactDashRelayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefetchOptions extends js.Object {
  var force: js.UndefOr[scala.Boolean] = js.undefined
  var rerunParamExperimental: js.UndefOr[relayDashRuntimeLib.relayDashRuntimeMod.RerunParam] = js.undefined
}

object RefetchOptions {
  @scala.inline
  def apply(
    force: js.UndefOr[scala.Boolean] = js.undefined,
    rerunParamExperimental: relayDashRuntimeLib.relayDashRuntimeMod.RerunParam = null
  ): RefetchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (rerunParamExperimental != null) __obj.updateDynamic("rerunParamExperimental")(rerunParamExperimental)
    __obj.asInstanceOf[RefetchOptions]
  }
}

