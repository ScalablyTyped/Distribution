package typings
package atReduxDashSagaCoreLib.effectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelPutEffectDescriptor[T] extends js.Object {
  var action: T
  var channel: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.PuttableChannel[T]
}

object ChannelPutEffectDescriptor {
  @scala.inline
  def apply[T](action: T, channel: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.PuttableChannel[T]): ChannelPutEffectDescriptor[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    __obj.updateDynamic("channel")(channel)
    __obj.asInstanceOf[ChannelPutEffectDescriptor[T]]
  }
}

