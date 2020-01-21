package typings.stompit

import typings.node.streamMod.Duplex
import typings.node.streamMod.TransformOptions
import typings.std.Error
import typings.stompit.channelMod.ChannelOptions
import typings.stompit.channelMod.^
import typings.stompit.channelPoolMod.ChannelPoolOptions
import typings.stompit.connectFailoverMod.ConnectFailoverOptions
import typings.stompit.connectMod.ConnectOptions
import typings.stompit.socketMod.SocketOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stompit", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Channel protected () extends ^ {
    def this(connectFailover: typings.stompit.connectFailoverMod.^) = this()
    def this(connectFailover: typings.stompit.connectFailoverMod.^, options: ChannelOptions) = this()
  }
  
  @js.native
  class ChannelFactory protected ()
    extends typings.stompit.channelFactoryMod.^ {
    def this(connectFailover: typings.stompit.connectFailoverMod.^) = this()
  }
  
  @js.native
  class ChannelPool protected ()
    extends typings.stompit.channelPoolMod.^ {
    def this(connectFailover: typings.stompit.connectFailoverMod.^) = this()
    def this(connectFailover: typings.stompit.connectFailoverMod.^, options: ChannelPoolOptions) = this()
  }
  
  @js.native
  class Client protected ()
    extends typings.stompit.clientMod.^ {
    def this(transportSocket: Duplex) = this()
    def this(transportSocket: Duplex, options: SocketOptions) = this()
  }
  
  @js.native
  class ConnectFailover ()
    extends typings.stompit.connectFailoverMod.^ {
    def this(servers: String) = this()
    def this(servers: js.Array[ConnectOptions]) = this()
    def this(servers: String, options: ConnectFailoverOptions) = this()
    def this(servers: js.Array[ConnectOptions], options: ConnectFailoverOptions) = this()
  }
  
  @js.native
  class IncomingFrameStream ()
    extends typings.stompit.incomingFrameStreamMod.^ {
    def this(opts: TransformOptions) = this()
  }
  
  @js.native
  class OutgoingFrameStream protected ()
    extends typings.stompit.outgoingFrameStreamMod.^ {
    def this(destination: Duplex) = this()
  }
  
  @js.native
  object connect extends js.Object {
    def apply(optionsOrPath: String): typings.stompit.clientMod.^ = js.native
    def apply(
      optionsOrPath: String,
      connectionListener: js.Function2[/* err */ Error | Null, /* client */ typings.stompit.clientMod.^, Unit]
    ): typings.stompit.clientMod.^ = js.native
    def apply(optionsOrPath: ConnectOptions): typings.stompit.clientMod.^ = js.native
    def apply(
      optionsOrPath: ConnectOptions,
      connectionListener: js.Function2[/* err */ Error | Null, /* client */ typings.stompit.clientMod.^, Unit]
    ): typings.stompit.clientMod.^ = js.native
    def apply(port: Double): typings.stompit.clientMod.^ = js.native
    def apply(port: Double, host: String): typings.stompit.clientMod.^ = js.native
    def apply(
      port: Double,
      host: String,
      connectionListener: js.Function2[/* err */ Error | Null, /* client */ typings.stompit.clientMod.^, Unit]
    ): typings.stompit.clientMod.^ = js.native
  }
  
}

