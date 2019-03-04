package typings
package stompitLib.libChannelMod.ChannelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelSubscription extends js.Object {
  def cancel(): scala.Unit
  def unsubscribe(): scala.Unit
}

object ChannelSubscription {
  @scala.inline
  def apply(cancel: js.Function0[scala.Unit], unsubscribe: js.Function0[scala.Unit]): ChannelSubscription = {
    val __obj = js.Dynamic.literal(cancel = cancel, unsubscribe = unsubscribe)
  
    __obj.asInstanceOf[ChannelSubscription]
  }
}

