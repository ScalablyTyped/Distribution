package typings
package stompitLib.libChannelPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stompit/lib/ChannelPool", JSImport.Namespace)
@js.native
class namespaced protected () extends ChannelPool {
  def this(connectFailover: stompitLib.libConnectFailoverMod.namespaced) = this()
  def this(connectFailover: stompitLib.libConnectFailoverMod.namespaced, options: stompitLib.libChannelPoolMod.ChannelPoolNs.ChannelPoolOptions) = this()
  /* CompleteClass */
  override def channel(
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* channel */ stompitLib.libChannelMod.namespaced, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def close(): scala.Unit = js.native
}

