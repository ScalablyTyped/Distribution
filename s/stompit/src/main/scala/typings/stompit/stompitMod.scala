package typings.stompit

import typings.node.streamMod.Duplex
import typings.node.streamMod.TransformOptions
import typings.std.Error
import typings.stompit.libChannelMod.ChannelOptions
import typings.stompit.libChannelMod.^
import typings.stompit.libChannelPoolMod.ChannelPoolOptions
import typings.stompit.libConnectFailoverMod.ConnectFailoverOptions
import typings.stompit.libConnectMod.ConnectOptions
import typings.stompit.libSocketMod.SocketOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stompit", JSImport.Namespace)
@js.native
object stompitMod extends js.Object {
  @js.native
  class Channel protected () extends ^ {
    def this(connectFailover: typings.stompit.libConnectFailoverMod.^) = this()
    def this(connectFailover: typings.stompit.libConnectFailoverMod.^, options: ChannelOptions) = this()
  }
  
  @js.native
  class ChannelFactory protected ()
    extends typings.stompit.libChannelFactoryMod.^ {
    def this(connectFailover: typings.stompit.libConnectFailoverMod.^) = this()
  }
  
  @js.native
  class ChannelPool protected ()
    extends typings.stompit.libChannelPoolMod.^ {
    def this(connectFailover: typings.stompit.libConnectFailoverMod.^) = this()
    def this(connectFailover: typings.stompit.libConnectFailoverMod.^, options: ChannelPoolOptions) = this()
  }
  
  @js.native
  class Client protected ()
    extends typings.stompit.libClientMod.^ {
    def this(transportSocket: Duplex) = this()
    def this(transportSocket: Duplex, options: SocketOptions) = this()
  }
  
  @js.native
  class ConnectFailover ()
    extends typings.stompit.libConnectFailoverMod.^ {
    def this(servers: String) = this()
    def this(servers: js.Array[ConnectOptions]) = this()
    def this(servers: String, options: ConnectFailoverOptions) = this()
    def this(servers: js.Array[ConnectOptions], options: ConnectFailoverOptions) = this()
  }
  
  @js.native
  class IncomingFrameStream ()
    extends typings.stompit.libIncomingFrameStreamMod.^ {
    def this(opts: TransformOptions) = this()
  }
  
  @js.native
  class OutgoingFrameStream protected ()
    extends typings.stompit.libOutgoingFrameStreamMod.^ {
    def this(destination: Duplex) = this()
  }
  
  @js.native
  object connect extends js.Object {
    def apply(optionsOrPath: String): typings.stompit.libClientMod.^ = js.native
    def apply(
      optionsOrPath: String,
      connectionListener: js.Function2[/* err */ Error | Null, /* client */ typings.stompit.libClientMod.^, Unit]
    ): typings.stompit.libClientMod.^ = js.native
    def apply(optionsOrPath: ConnectOptions): typings.stompit.libClientMod.^ = js.native
    def apply(
      optionsOrPath: ConnectOptions,
      connectionListener: js.Function2[/* err */ Error | Null, /* client */ typings.stompit.libClientMod.^, Unit]
    ): typings.stompit.libClientMod.^ = js.native
    def apply(port: Double): typings.stompit.libClientMod.^ = js.native
    def apply(port: Double, host: String): typings.stompit.libClientMod.^ = js.native
    def apply(
      port: Double,
      host: String,
      connectionListener: js.Function2[/* err */ Error | Null, /* client */ typings.stompit.libClientMod.^, Unit]
    ): typings.stompit.libClientMod.^ = js.native
  }
  
}

