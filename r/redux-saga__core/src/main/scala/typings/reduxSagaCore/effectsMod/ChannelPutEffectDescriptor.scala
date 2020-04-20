package typings.reduxSagaCore.effectsMod

import typings.reduxSagaCore.typesMod.PuttableChannel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelPutEffectDescriptor[T] extends js.Object {
  var action: T
  var channel: PuttableChannel[T]
}

object ChannelPutEffectDescriptor {
  @scala.inline
  def apply[T](action: T, channel: PuttableChannel[T]): ChannelPutEffectDescriptor[T] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelPutEffectDescriptor[T]]
  }
}

