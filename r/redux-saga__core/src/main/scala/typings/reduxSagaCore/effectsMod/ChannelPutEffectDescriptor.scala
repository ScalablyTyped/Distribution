package typings.reduxSagaCore.effectsMod

import typings.reduxSagaCore.typesMod.PuttableChannel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelPutEffectDescriptor[T] extends js.Object {
  var action: T = js.native
  var channel: PuttableChannel[T] = js.native
}

object ChannelPutEffectDescriptor {
  @scala.inline
  def apply[T](action: T, channel: PuttableChannel[T]): ChannelPutEffectDescriptor[T] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelPutEffectDescriptor[T]]
  }
  @scala.inline
  implicit class ChannelPutEffectDescriptorOps[Self <: ChannelPutEffectDescriptor[_], T] (val x: Self with ChannelPutEffectDescriptor[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAction(value: T): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannel(value: PuttableChannel[T]): Self = this.set("channel", value.asInstanceOf[js.Any])
  }
  
}

