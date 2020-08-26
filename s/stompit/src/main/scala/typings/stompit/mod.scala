package typings.stompit

import typings.node.streamMod.Duplex
import typings.node.streamMod.TransformOptions
import typings.stompit.channelMod.ChannelOptions
import typings.stompit.channelMod.^
import typings.stompit.channelPoolMod.ChannelPoolOptions
import typings.stompit.connectFailoverMod.ConnectFailoverOptions
import typings.stompit.connectMod.ConnectOptions
import typings.stompit.connectMod.ConnectionListener
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
    def this(servers: js.UndefOr[scala.Nothing], options: ConnectFailoverOptions) = this()
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
    def apply(optionsOrPathOrPort: String): typings.stompit.clientMod.^ = js.native
    def apply(optionsOrPathOrPort: String, connectionListener: ConnectionListener): typings.stompit.clientMod.^ = js.native
    def apply(optionsOrPathOrPort: Double): typings.stompit.clientMod.^ = js.native
    def apply(optionsOrPathOrPort: Double, connectionListener: ConnectionListener): typings.stompit.clientMod.^ = js.native
    def apply(optionsOrPathOrPort: ConnectOptions): typings.stompit.clientMod.^ = js.native
    def apply(optionsOrPathOrPort: ConnectOptions, connectionListener: ConnectionListener): typings.stompit.clientMod.^ = js.native
    def apply(port: Double, host: js.UndefOr[scala.Nothing], connectionListener: ConnectionListener): typings.stompit.clientMod.^ = js.native
    def apply(port: Double, host: String): typings.stompit.clientMod.^ = js.native
    def apply(port: Double, host: String, connectionListener: ConnectionListener): typings.stompit.clientMod.^ = js.native
  }
  
}

