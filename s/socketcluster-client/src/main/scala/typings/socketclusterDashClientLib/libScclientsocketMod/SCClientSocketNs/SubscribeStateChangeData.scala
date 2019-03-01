package typings
package socketclusterDashClientLib.libScclientsocketMod.SCClientSocketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribeStateChangeData extends js.Object {
  var channel: java.lang.String
  var newState: scDashChannelLib.scDashChannelMod.ChannelState
  var oldState: scDashChannelLib.scDashChannelMod.ChannelState
  var subscriptionOptions: scDashChannelLib.scDashChannelMod.SCChannelOptions
}

object SubscribeStateChangeData {
  @scala.inline
  def apply(
    channel: java.lang.String,
    newState: scDashChannelLib.scDashChannelMod.ChannelState,
    oldState: scDashChannelLib.scDashChannelMod.ChannelState,
    subscriptionOptions: scDashChannelLib.scDashChannelMod.SCChannelOptions
  ): SubscribeStateChangeData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("channel")(channel)
    __obj.updateDynamic("newState")(newState)
    __obj.updateDynamic("oldState")(oldState)
    __obj.updateDynamic("subscriptionOptions")(subscriptionOptions)
    __obj.asInstanceOf[SubscribeStateChangeData]
  }
}

