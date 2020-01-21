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
    freeExcessTimeout: Int | Double = null,
    maxChannels: Int | Double = null,
    minChannels: Int | Double = null,
    minFreeChannels: Int | Double = null,
    requestChannelTimeout: Int | Double = null
  ): ChannelPoolOptions = {
    val __obj = js.Dynamic.literal()
    if (channelOptions != null) __obj.updateDynamic("channelOptions")(channelOptions.asInstanceOf[js.Any])
    if (freeExcessTimeout != null) __obj.updateDynamic("freeExcessTimeout")(freeExcessTimeout.asInstanceOf[js.Any])
    if (maxChannels != null) __obj.updateDynamic("maxChannels")(maxChannels.asInstanceOf[js.Any])
    if (minChannels != null) __obj.updateDynamic("minChannels")(minChannels.asInstanceOf[js.Any])
    if (minFreeChannels != null) __obj.updateDynamic("minFreeChannels")(minFreeChannels.asInstanceOf[js.Any])
    if (requestChannelTimeout != null) __obj.updateDynamic("requestChannelTimeout")(requestChannelTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelPoolOptions]
  }
}

