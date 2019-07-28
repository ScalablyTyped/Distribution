package typings.atStorybookChannels

import typings.atStorybookChannels.atStorybookChannelsMod.Transport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Async extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var transport: js.UndefOr[Transport] = js.undefined
}

object Anon_Async {
  @scala.inline
  def apply(async: js.UndefOr[Boolean] = js.undefined, transport: Transport = null): Anon_Async = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (transport != null) __obj.updateDynamic("transport")(transport)
    __obj.asInstanceOf[Anon_Async]
  }
}

