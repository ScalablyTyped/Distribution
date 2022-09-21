package typings.stompit

import typings.node.streamMod.Duplex
import typings.node.streamMod.TransformOptions
import typings.stompit.channelMod.ChannelOptions
import typings.stompit.channelPoolMod.ChannelPoolOptions
import typings.stompit.connectFailoverMod.ConnectFailoverOptions
import typings.stompit.connectMod.ConnectOptions
import typings.stompit.connectMod.ConnectionListener
import typings.stompit.socketMod.SocketOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stompit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("stompit", "Channel")
  @js.native
  open class Channel protected ()
    extends typings.stompit.channelMod.^ {
    def this(connectFailover: typings.stompit.connectFailoverMod.^) = this()
    def this(connectFailover: typings.stompit.connectFailoverMod.^, options: ChannelOptions) = this()
  }
  
  @JSImport("stompit", "ChannelFactory")
  @js.native
  open class ChannelFactory protected ()
    extends typings.stompit.channelFactoryMod.^ {
    def this(connectFailover: typings.stompit.connectFailoverMod.^) = this()
  }
  
  @JSImport("stompit", "ChannelPool")
  @js.native
  open class ChannelPool protected ()
    extends typings.stompit.channelPoolMod.^ {
    def this(connectFailover: typings.stompit.connectFailoverMod.^) = this()
    def this(connectFailover: typings.stompit.connectFailoverMod.^, options: ChannelPoolOptions) = this()
  }
  
  @JSImport("stompit", "Client")
  @js.native
  open class Client protected ()
    extends typings.stompit.clientMod.^ {
    def this(transportSocket: Duplex) = this()
    def this(transportSocket: Duplex, options: SocketOptions) = this()
  }
  
  @JSImport("stompit", "ConnectFailover")
  @js.native
  open class ConnectFailover ()
    extends typings.stompit.connectFailoverMod.^ {
    def this(servers: String) = this()
    def this(servers: js.Array[ConnectOptions]) = this()
    def this(servers: String, options: ConnectFailoverOptions) = this()
    def this(servers: js.Array[ConnectOptions], options: ConnectFailoverOptions) = this()
    def this(servers: Unit, options: ConnectFailoverOptions) = this()
  }
  
  @JSImport("stompit", "IncomingFrameStream")
  @js.native
  open class IncomingFrameStream ()
    extends typings.stompit.incomingFrameStreamMod.^ {
    def this(opts: TransformOptions) = this()
  }
  
  @JSImport("stompit", "OutgoingFrameStream")
  @js.native
  open class OutgoingFrameStream protected ()
    extends typings.stompit.outgoingFrameStreamMod.^ {
    def this(destination: Duplex) = this()
  }
  
  inline def connect(optionsOrPathOrPort: String): typings.stompit.clientMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(optionsOrPathOrPort.asInstanceOf[js.Any]).asInstanceOf[typings.stompit.clientMod.^]
  inline def connect(optionsOrPathOrPort: String, connectionListener: ConnectionListener): typings.stompit.clientMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(optionsOrPathOrPort.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[typings.stompit.clientMod.^]
  inline def connect(optionsOrPathOrPort: Double): typings.stompit.clientMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(optionsOrPathOrPort.asInstanceOf[js.Any]).asInstanceOf[typings.stompit.clientMod.^]
  inline def connect(optionsOrPathOrPort: Double, connectionListener: ConnectionListener): typings.stompit.clientMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(optionsOrPathOrPort.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[typings.stompit.clientMod.^]
  inline def connect(optionsOrPathOrPort: ConnectOptions): typings.stompit.clientMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(optionsOrPathOrPort.asInstanceOf[js.Any]).asInstanceOf[typings.stompit.clientMod.^]
  inline def connect(optionsOrPathOrPort: ConnectOptions, connectionListener: ConnectionListener): typings.stompit.clientMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(optionsOrPathOrPort.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[typings.stompit.clientMod.^]
  inline def connect(port: Double, host: String): typings.stompit.clientMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[typings.stompit.clientMod.^]
  inline def connect(port: Double, host: String, connectionListener: ConnectionListener): typings.stompit.clientMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[typings.stompit.clientMod.^]
  inline def connect(port: Double, host: Unit, connectionListener: ConnectionListener): typings.stompit.clientMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[typings.stompit.clientMod.^]
}
