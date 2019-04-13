package typings
package atStorybookChannelsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Async extends js.Object {
  var async: js.UndefOr[scala.Boolean] = js.undefined
  var transport: js.UndefOr[atStorybookChannelsLib.atStorybookChannelsMod.Transport] = js.undefined
}

object Anon_Async {
  @scala.inline
  def apply(
    async: js.UndefOr[scala.Boolean] = js.undefined,
    transport: atStorybookChannelsLib.atStorybookChannelsMod.Transport = null
  ): Anon_Async = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (transport != null) __obj.updateDynamic("transport")(transport)
    __obj.asInstanceOf[Anon_Async]
  }
}

