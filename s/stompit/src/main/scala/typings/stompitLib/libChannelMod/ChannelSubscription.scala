package typings
package stompitLib.libChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelSubscription extends js.Object {
  def cancel(): scala.Unit
  def unsubscribe(): scala.Unit
}

object ChannelSubscription {
  @scala.inline
  def apply(cancel: () => scala.Unit, unsubscribe: () => scala.Unit): ChannelSubscription = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), unsubscribe = js.Any.fromFunction0(unsubscribe))
  
    __obj.asInstanceOf[ChannelSubscription]
  }
}

