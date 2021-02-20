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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stompit", "Channel")
  @js.native
  class Channel protected () extends ^ {
    def this(connectFailover: typings.stompit.connectFailoverMod.^) = this()
    def this(connectFailover: typings.stompit.connectFailoverMod.^, options: ChannelOptions) = this()
  }
  
  @JSImport("stompit", "ChannelFactory")
  @js.native
  class ChannelFactory protected ()
    extends typings.stompit.channelFactoryMod.^ {
    def this(connectFailover: typings.stompit.connectFailoverMod.^) = this()
  }
  
  @JSImport("stompit", "ChannelPool")
  @js.native
  class ChannelPool protected ()
    extends typings.stompit.channelPoolMod.^ {
    def this(connectFailover: typings.stompit.connectFailoverMod.^) = this()
    def this(connectFailover: typings.stompit.connectFailoverMod.^, options: ChannelPoolOptions) = this()
  }
  
  @JSImport("stompit", "Client")
  @js.native
  class Client protected ()
    extends typings.stompit.clientMod.^ {
    def this(transportSocket: Duplex) = this()
    def this(transportSocket: Duplex, options: SocketOptions) = this()
  }
  
  @JSImport("stompit", "ConnectFailover")
  @js.native
  class ConnectFailover ()
    extends typings.stompit.connectFailoverMod.^ {
    def this(servers: String) = this()
    def this(servers: js.Array[ConnectOptions]) = this()
    def this(servers: js.UndefOr[scala.Nothing], options: ConnectFailoverOptions) = this()
    def this(servers: String, options: ConnectFailoverOptions) = this()
    def this(servers: js.Array[ConnectOptions], options: ConnectFailoverOptions) = this()
  }
  
  @JSImport("stompit", "IncomingFrameStream")
  @js.native
  class IncomingFrameStream ()
    extends typings.stompit.incomingFrameStreamMod.^ {
    def this(opts: TransformOptions) = this()
  }
  
  @JSImport("stompit", "OutgoingFrameStream")
  @js.native
  class OutgoingFrameStream protected ()
    extends typings.stompit.outgoingFrameStreamMod.^ {
    def this(destination: Duplex) = this()
  }
  
  object connect {
    
    @JSImport("stompit", "connect")
    @js.native
    def apply(optionsOrPathOrPort: String): typings.stompit.clientMod.^ = js.native
    @JSImport("stompit", "connect")
    @js.native
    def apply(optionsOrPathOrPort: String, connectionListener: ConnectionListener): typings.stompit.clientMod.^ = js.native
    @JSImport("stompit", "connect")
    @js.native
    def apply(optionsOrPathOrPort: Double): typings.stompit.clientMod.^ = js.native
    @JSImport("stompit", "connect")
    @js.native
    def apply(optionsOrPathOrPort: Double, connectionListener: ConnectionListener): typings.stompit.clientMod.^ = js.native
    @JSImport("stompit", "connect")
    @js.native
    def apply(optionsOrPathOrPort: ConnectOptions): typings.stompit.clientMod.^ = js.native
    @JSImport("stompit", "connect")
    @js.native
    def apply(optionsOrPathOrPort: ConnectOptions, connectionListener: ConnectionListener): typings.stompit.clientMod.^ = js.native
    @JSImport("stompit", "connect")
    @js.native
    def apply(port: Double, host: js.UndefOr[scala.Nothing], connectionListener: ConnectionListener): typings.stompit.clientMod.^ = js.native
    @JSImport("stompit", "connect")
    @js.native
    def apply(port: Double, host: String): typings.stompit.clientMod.^ = js.native
    @JSImport("stompit", "connect")
    @js.native
    def apply(port: Double, host: String, connectionListener: ConnectionListener): typings.stompit.clientMod.^ = js.native
  }
}
