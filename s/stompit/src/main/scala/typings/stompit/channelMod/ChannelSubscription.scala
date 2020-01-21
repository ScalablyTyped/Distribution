package typings.stompit.channelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelSubscription extends js.Object {
  def cancel(): Unit
  def unsubscribe(): Unit
}

object ChannelSubscription {
  @scala.inline
  def apply(cancel: () => Unit, unsubscribe: () => Unit): ChannelSubscription = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), unsubscribe = js.Any.fromFunction0(unsubscribe))
  
    __obj.asInstanceOf[ChannelSubscription]
  }
}

