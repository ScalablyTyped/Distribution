package typings
package stompitLib.libChannelPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelPoolOptions extends js.Object {
  var channelOptions: js.UndefOr[stompitLib.libChannelMod.ChannelOptions] = js.undefined
  var freeExcessTimeout: js.UndefOr[scala.Double] = js.undefined
  var maxChannels: js.UndefOr[scala.Double] = js.undefined
  var minChannels: js.UndefOr[scala.Double] = js.undefined
  var minFreeChannels: js.UndefOr[scala.Double] = js.undefined
  var requestChannelTimeout: js.UndefOr[scala.Double] = js.undefined
}

object ChannelPoolOptions {
  @scala.inline
  def apply(
    channelOptions: stompitLib.libChannelMod.ChannelOptions = null,
    freeExcessTimeout: scala.Int | scala.Double = null,
    maxChannels: scala.Int | scala.Double = null,
    minChannels: scala.Int | scala.Double = null,
    minFreeChannels: scala.Int | scala.Double = null,
    requestChannelTimeout: scala.Int | scala.Double = null
  ): ChannelPoolOptions = {
    val __obj = js.Dynamic.literal()
    if (channelOptions != null) __obj.updateDynamic("channelOptions")(channelOptions)
    if (freeExcessTimeout != null) __obj.updateDynamic("freeExcessTimeout")(freeExcessTimeout.asInstanceOf[js.Any])
    if (maxChannels != null) __obj.updateDynamic("maxChannels")(maxChannels.asInstanceOf[js.Any])
    if (minChannels != null) __obj.updateDynamic("minChannels")(minChannels.asInstanceOf[js.Any])
    if (minFreeChannels != null) __obj.updateDynamic("minFreeChannels")(minFreeChannels.asInstanceOf[js.Any])
    if (requestChannelTimeout != null) __obj.updateDynamic("requestChannelTimeout")(requestChannelTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelPoolOptions]
  }
}

