package typings.stompit

import typings.node.netMod.IpcNetConnectOpts
import typings.node.netMod.Socket
import typings.node.netMod.TcpNetConnectOpts
import typings.node.tlsMod.ConnectionOptions
import typings.std.Error
import typings.stompit.clientMod.^
import typings.stompit.socketMod.SocketOptions
import typings.stompit.stompitBooleans.`false`
import typings.stompit.stompitBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectMod {
  
  @JSImport("stompit/lib/connect", JSImport.Namespace)
  @js.native
  def apply(optionsOrPathOrPort: String): ^ = js.native
  @JSImport("stompit/lib/connect", JSImport.Namespace)
  @js.native
  def apply(optionsOrPathOrPort: String, connectionListener: ConnectionListener): ^ = js.native
  @JSImport("stompit/lib/connect", JSImport.Namespace)
  @js.native
  def apply(optionsOrPathOrPort: Double): ^ = js.native
  @JSImport("stompit/lib/connect", JSImport.Namespace)
  @js.native
  def apply(optionsOrPathOrPort: Double, connectionListener: ConnectionListener): ^ = js.native
  @JSImport("stompit/lib/connect", JSImport.Namespace)
  @js.native
  def apply(optionsOrPathOrPort: ConnectOptions): ^ = js.native
  @JSImport("stompit/lib/connect", JSImport.Namespace)
  @js.native
  def apply(optionsOrPathOrPort: ConnectOptions, connectionListener: ConnectionListener): ^ = js.native
  @JSImport("stompit/lib/connect", JSImport.Namespace)
  @js.native
  def apply(port: Double, host: js.UndefOr[scala.Nothing], connectionListener: ConnectionListener): ^ = js.native
  @JSImport("stompit/lib/connect", JSImport.Namespace)
  @js.native
  def apply(port: Double, host: String): ^ = js.native
  @JSImport("stompit/lib/connect", JSImport.Namespace)
  @js.native
  def apply(port: Double, host: String, connectionListener: ConnectionListener): ^ = js.native
  
  @js.native
  trait BaseConnectOptions extends SocketOptions {
    
    // This connectionListener type comes from @types/node
    var connect: js.UndefOr[
        js.Function2[
          /* options */ ConnectOptions, 
          /* connectionListener */ js.UndefOr[js.Function0[Unit]], 
          Socket
        ]
      ] = js.native
    
    var connectHeaders: js.UndefOr[ConnectHeaders] = js.native
    
    var ssl: js.UndefOr[Boolean] = js.native
  }
  object BaseConnectOptions {
    
    @scala.inline
    def apply(): BaseConnectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseConnectOptions]
    }
    
    @scala.inline
    implicit class BaseConnectOptionsMutableBuilder[Self <: BaseConnectOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnect(
        value: (/* options */ ConnectOptions, /* connectionListener */ js.UndefOr[js.Function0[Unit]]) => Socket
      ): Self = StObject.set(x, "connect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setConnectHeaders(value: ConnectHeaders): Self = StObject.set(x, "connectHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectHeadersUndefined: Self = StObject.set(x, "connectHeaders", js.undefined)
      
      @scala.inline
      def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
      
      @scala.inline
      def setSsl(value: Boolean): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
    }
  }
  
  @js.native
  trait ConnectHeaders extends StObject {
    
    var `accept-version`: js.UndefOr[String] = js.native
    
    var `heart-beat`: js.UndefOr[String] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var login: js.UndefOr[String] = js.native
    
    var passcode: js.UndefOr[String] = js.native
  }
  object ConnectHeaders {
    
    @scala.inline
    def apply(): ConnectHeaders = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectHeaders]
    }
    
    @scala.inline
    implicit class ConnectHeadersMutableBuilder[Self <: ConnectHeaders] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setAccept-version`(value: String): Self = StObject.set(x, "accept-version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAccept-versionUndefined`: Self = StObject.set(x, "accept-version", js.undefined)
      
      @scala.inline
      def `setHeart-beat`(value: String): Self = StObject.set(x, "heart-beat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setHeart-beatUndefined`: Self = StObject.set(x, "heart-beat", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoginUndefined: Self = StObject.set(x, "login", js.undefined)
      
      @scala.inline
      def setPasscode(value: String): Self = StObject.set(x, "passcode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasscodeUndefined: Self = StObject.set(x, "passcode", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.stompit.connectMod.NetTcpConnectOptions
    - typings.stompit.connectMod.NetIpcConnectOptions
    - typings.stompit.connectMod.SslConnectOptions
  */
  trait ConnectOptions extends StObject
  object ConnectOptions {
    
    @scala.inline
    def NetIpcConnectOptions(path: String): typings.stompit.connectMod.NetIpcConnectOptions = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.stompit.connectMod.NetIpcConnectOptions]
    }
    
    @scala.inline
    def NetTcpConnectOptions(port: Double): typings.stompit.connectMod.NetTcpConnectOptions = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.stompit.connectMod.NetTcpConnectOptions]
    }
    
    @scala.inline
    def SslConnectOptions(ssl: `true`): typings.stompit.connectMod.SslConnectOptions = {
      val __obj = js.Dynamic.literal(ssl = ssl.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.stompit.connectMod.SslConnectOptions]
    }
  }
  
  type ConnectionListener = js.Function2[/* err */ Error | Null, /* client */ ^, Unit]
  
  @js.native
  trait NetIpcConnectOptions
    extends IpcNetConnectOpts
       with BaseConnectOptions
       with ConnectOptions {
    
    @JSName("ssl")
    var ssl_NetIpcConnectOptions: js.UndefOr[`false`] = js.native
  }
  object NetIpcConnectOptions {
    
    @scala.inline
    def apply(path: String): NetIpcConnectOptions = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetIpcConnectOptions]
    }
    
    @scala.inline
    implicit class NetIpcConnectOptionsMutableBuilder[Self <: NetIpcConnectOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSsl(value: `false`): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
    }
  }
  
  @js.native
  trait NetTcpConnectOptions
    extends TcpNetConnectOpts
       with BaseConnectOptions
       with ConnectOptions {
    
    @JSName("ssl")
    var ssl_NetTcpConnectOptions: js.UndefOr[`false`] = js.native
  }
  object NetTcpConnectOptions {
    
    @scala.inline
    def apply(port: Double): NetTcpConnectOptions = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetTcpConnectOptions]
    }
    
    @scala.inline
    implicit class NetTcpConnectOptionsMutableBuilder[Self <: NetTcpConnectOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSsl(value: `false`): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
    }
  }
  
  @js.native
  trait SslConnectOptions
    extends ConnectionOptions
       with BaseConnectOptions
       with ConnectOptions {
    
    @JSName("ssl")
    var ssl_SslConnectOptions: `true` = js.native
  }
  object SslConnectOptions {
    
    @scala.inline
    def apply(ssl: `true`): SslConnectOptions = {
      val __obj = js.Dynamic.literal(ssl = ssl.asInstanceOf[js.Any])
      __obj.asInstanceOf[SslConnectOptions]
    }
    
    @scala.inline
    implicit class SslConnectOptionsMutableBuilder[Self <: SslConnectOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSsl(value: `true`): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    }
  }
}
