package typings.storybookChannels.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelArgs extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var transport: js.UndefOr[ChannelTransport] = js.undefined
}

object ChannelArgs {
  @scala.inline
  def apply(async: js.UndefOr[Boolean] = js.undefined, transport: ChannelTransport = null): ChannelArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (transport != null) __obj.updateDynamic("transport")(transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelArgs]
  }
}

