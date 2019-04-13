package typings
package stompitLib.libChannelPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stompit/lib/ChannelPool", JSImport.Namespace)
@js.native
class ^ protected () extends ChannelPool {
  def this(connectFailover: stompitLib.libConnectFailoverMod.^) = this()
  def this(connectFailover: stompitLib.libConnectFailoverMod.^, options: ChannelPoolOptions) = this()
  /* CompleteClass */
  override def channel(
    callback: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* channel */ stompitLib.libChannelMod.^, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def close(): scala.Unit = js.native
}

