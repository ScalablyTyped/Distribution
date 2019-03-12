package typings
package stompitLib.libChannelPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelPool extends js.Object {
  def channel(
    callback: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* channel */ stompitLib.libChannelMod.namespaced, 
      scala.Unit
    ]
  ): scala.Unit
  def close(): scala.Unit
}

object ChannelPool {
  @scala.inline
  def apply(
    channel: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* channel */ stompitLib.libChannelMod.namespaced, 
      scala.Unit
    ] => scala.Unit,
    close: () => scala.Unit
  ): ChannelPool = {
    val __obj = js.Dynamic.literal(channel = js.Any.fromFunction1(channel), close = js.Any.fromFunction0(close))
  
    __obj.asInstanceOf[ChannelPool]
  }
}

