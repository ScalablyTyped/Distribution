package typings
package stompitLib.libChannelPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelPool extends js.Object {
  def channel(
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* channel */ stompitLib.libChannelMod.namespaced, 
      scala.Unit
    ]
  ): scala.Unit
  def close(): scala.Unit
}

object ChannelPool {
  @scala.inline
  def apply(
    channel: js.Function1[
      js.Function2[
        /* err */ nodeLib.Error | scala.Null, 
        /* channel */ stompitLib.libChannelMod.namespaced, 
        scala.Unit
      ], 
      scala.Unit
    ],
    close: js.Function0[scala.Unit]
  ): ChannelPool = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("channel")(channel)
    __obj.updateDynamic("close")(close)
    __obj.asInstanceOf[ChannelPool]
  }
}

