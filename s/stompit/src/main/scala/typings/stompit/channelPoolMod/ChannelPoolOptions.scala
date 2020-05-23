package typings.stompit.channelPoolMod

import typings.stompit.channelMod.ChannelOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelPoolOptions extends js.Object {
  var channelOptions: js.UndefOr[ChannelOptions] = js.undefined
  var freeExcessTimeout: js.UndefOr[Double] = js.undefined
  var maxChannels: js.UndefOr[Double] = js.undefined
  var minChannels: js.UndefOr[Double] = js.undefined
  var minFreeChannels: js.UndefOr[Double] = js.undefined
  var requestChannelTimeout: js.UndefOr[Double] = js.undefined
}

object ChannelPoolOptions {
  @scala.inline
  def apply(
    channelOptions: ChannelOptions = null,
    freeExcessTimeout: js.UndefOr[Double] = js.undefined,
    maxChannels: js.UndefOr[Double] = js.undefined,
    minChannels: js.UndefOr[Double] = js.undefined,
    minFreeChannels: js.UndefOr[Double] = js.undefined,
    requestChannelTimeout: js.UndefOr[Double] = js.undefined
  ): ChannelPoolOptions = {
    val __obj = js.Dynamic.literal()
    if (channelOptions != null) __obj.updateDynamic("channelOptions")(channelOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(freeExcessTimeout)) __obj.updateDynamic("freeExcessTimeout")(freeExcessTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxChannels)) __obj.updateDynamic("maxChannels")(maxChannels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minChannels)) __obj.updateDynamic("minChannels")(minChannels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minFreeChannels)) __obj.updateDynamic("minFreeChannels")(minFreeChannels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requestChannelTimeout)) __obj.updateDynamic("requestChannelTimeout")(requestChannelTimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelPoolOptions]
  }
}

