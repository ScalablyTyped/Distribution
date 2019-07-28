package typings.stompit.libChannelPoolMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stompit/lib/ChannelPool", JSImport.Namespace)
@js.native
class ^ protected () extends ChannelPool {
  def this(connectFailover: typings.stompit.libConnectFailoverMod.^) = this()
  def this(connectFailover: typings.stompit.libConnectFailoverMod.^, options: ChannelPoolOptions) = this()
  /* CompleteClass */
  override def channel(
    callback: js.Function2[/* err */ Error | Null, /* channel */ typings.stompit.libChannelMod.^, Unit]
  ): Unit = js.native
  /* CompleteClass */
  override def close(): Unit = js.native
}

