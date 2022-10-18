package typings.stompit

import typings.node.streamMod.Duplex
import typings.node.streamMod.TransformOptions
import typings.stompit.libChannelMod.ChannelOptions
import typings.stompit.libChannelPoolMod.ChannelPoolOptions
import typings.stompit.libConnectFailoverMod.ConnectFailoverOptions
import typings.stompit.libConnectMod.ConnectOptions
import typings.stompit.libConnectMod.ConnectionListener
import typings.stompit.libSocketMod.SocketOptions
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
    extends typings.stompit.libChannelMod.^ {
    def this(connectFailover: typings.stompit.libConnectFailoverMod.^) = this()
    def this(connectFailover: typings.stompit.libConnectFailoverMod.^, options: ChannelOptions) = this()
  }
  
  @JSImport("stompit", "ChannelFactory")
  @js.native
  open class ChannelFactory protected ()
    extends typings.stompit.libChannelFactoryMod.^ {
    def this(connectFailover: typings.stompit.libConnectFailoverMod.^) = this()
  }
  
  @JSImport("stompit", "ChannelPool")
  @js.native
  open class ChannelPool protected ()
    extends typings.stompit.libChannelPoolMod.^ {
    def this(connectFailover: typings.stompit.libConnectFailoverMod.^) = this()
    def this(connectFailover: typings.stompit.libConnectFailoverMod.^, options: ChannelPoolOptions) = this()
  }
  
  @JSImport("stompit", "Client")
  @js.native
  open class Client protected ()
    extends typings.stompit.libClientMod.^ {
    def this(transportSocket: Duplex) = this()
    def this(transportSocket: Duplex, options: SocketOptions) = this()
  }
  
  @JSImport("stompit", "ConnectFailover")
  @js.native
  open class ConnectFailover ()
    extends typings.stompit.libConnectFailoverMod.^ {
    def this(servers: String) = this()
    def this(servers: js.Array[ConnectOptions]) = this()
    def this(servers: String, options: ConnectFailoverOptions) = this()
    def this(servers: js.Array[ConnectOptions], options: ConnectFailoverOptions) = this()
    def this(servers: Unit, options: ConnectFailoverOptions) = this()
  }
  
  @JSImport("stompit", "IncomingFrameStream")
  @js.native
  open class IncomingFrameStream ()
    extends typings.stompit.libIncomingFrameStreamMod.^ {
    def this(opts: TransformOptions) = this()
  }
  
  @JSImport("stompit", "OutgoingFrameStream")
  @js.native
  open class OutgoingFrameStream protected ()
    extends typings.stompit.libOutgoingFrameStreamMod.^ {
    def this(destination: Duplex) = this()
  }
  
  inline def connect(optionsOrPathOrPort: String): typings.stompit.libClientMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(optionsOrPathOrPort.asInstanceOf[js.Any]).asInstanceOf[typings.stompit.libClientMod.^]
  inline def connect(optionsOrPathOrPort: String, connectionListener: ConnectionListener): typings.stompit.libClientMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(optionsOrPathOrPort.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[typings.stompit.libClientMod.^]
  inline def connect(optionsOrPathOrPort: Double): typings.stompit.libClientMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(optionsOrPathOrPort.asInstanceOf[js.Any]).asInstanceOf[typings.stompit.libClientMod.^]
  inline def connect(optionsOrPathOrPort: Double, connectionListener: ConnectionListener): typings.stompit.libClientMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(optionsOrPathOrPort.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[typings.stompit.libClientMod.^]
  inline def connect(optionsOrPathOrPort: ConnectOptions): typings.stompit.libClientMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(optionsOrPathOrPort.asInstanceOf[js.Any]).asInstanceOf[typings.stompit.libClientMod.^]
  inline def connect(optionsOrPathOrPort: ConnectOptions, connectionListener: ConnectionListener): typings.stompit.libClientMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(optionsOrPathOrPort.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[typings.stompit.libClientMod.^]
  inline def connect(port: Double, host: String): typings.stompit.libClientMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[typings.stompit.libClientMod.^]
  inline def connect(port: Double, host: String, connectionListener: ConnectionListener): typings.stompit.libClientMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[typings.stompit.libClientMod.^]
  inline def connect(port: Double, host: Unit, connectionListener: ConnectionListener): typings.stompit.libClientMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[typings.stompit.libClientMod.^]
}
