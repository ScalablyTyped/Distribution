package typings.stompit

import typings.node.eventsMod.EventEmitter
import typings.std.Error
import typings.stompit.anon.Abort
import typings.stompit.connectMod.ConnectOptions
import typings.stompit.connectMod.ConnectionListener
import typings.stompit.getAddressInfoMod.AddressInfo
import typings.stompit.stompitStrings.connect
import typings.stompit.stompitStrings.connecting
import typings.stompit.stompitStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectFailoverMod {
  
  @JSImport("stompit/lib/ConnectFailover", JSImport.Namespace)
  @js.native
  class ^ () extends ConnectFailover {
    def this(servers: String) = this()
    def this(servers: js.Array[ConnectOptions]) = this()
    def this(servers: js.UndefOr[scala.Nothing], options: ConnectFailoverOptions) = this()
    def this(servers: String, options: ConnectFailoverOptions) = this()
    def this(servers: js.Array[ConnectOptions], options: ConnectFailoverOptions) = this()
  }
  
  @js.native
  trait ConnectError extends Error {
    
    var connectArgs: ConnectOptions = js.native
  }
  object ConnectError {
    
    @scala.inline
    def apply(connectArgs: ConnectOptions, message: String, name: String): ConnectError = {
      val __obj = js.Dynamic.literal(connectArgs = connectArgs.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectError]
    }
    
    @scala.inline
    implicit class ConnectErrorMutableBuilder[Self <: ConnectError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnectArgs(value: ConnectOptions): Self = StObject.set(x, "connectArgs", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ConnectFailover extends EventEmitter {
    
    def addServer(config: String): Unit = js.native
    def addServer(config: ConnectOptions): Unit = js.native
    
    def connect(
      callback: js.Function4[
          /* error */ Error | Null, 
          /* client */ typings.stompit.clientMod.^, 
          /* reconnect */ js.Function0[Unit], 
          /* server */ Server, 
          Unit
        ]
    ): Abort = js.native
    
    def getReconnectDelay(reconnects: Double): Double = js.native
    
    @JSName("on")
    def on_connect(event: connect, listener: js.Function1[/* server */ ConnectState, Unit]): this.type = js.native
    @JSName("on")
    def on_connecting(event: connecting, listener: js.Function1[/* server */ ConnectState, Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function2[/* err */ ConnectError, /* server */ ConnectState, Unit]): this.type = js.native
  }
  
  @js.native
  trait ConnectFailoverOptions extends StObject {
    
    // Override the connect function
    var connectFunction: js.UndefOr[
        js.Function2[
          /* options */ ConnectOptions, 
          /* connectionListener */ js.UndefOr[ConnectionListener], 
          typings.stompit.clientMod.^
        ]
      ] = js.native
    
    // Milliseconds delay of the first reconnect
    var initialReconnectDelay: js.UndefOr[Double] = js.native
    
    // Maximum milliseconds delay of any reconnect
    var maxReconnectDelay: js.UndefOr[Double] = js.native
    
    // Maximum number of reconnects
    var maxReconnects: js.UndefOr[Double] = js.native
    
    // Randomly choose a server to use for reconnect
    var randomize: js.UndefOr[Boolean] = js.native
    
    // The exponent used in the exponential backoff attempts
    var reconnectDelayExponent: js.UndefOr[Double] = js.native
    
    // Exponential increase of the reconnect delay
    var useExponentialBackOff: js.UndefOr[Boolean] = js.native
  }
  object ConnectFailoverOptions {
    
    @scala.inline
    def apply(): ConnectFailoverOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectFailoverOptions]
    }
    
    @scala.inline
    implicit class ConnectFailoverOptionsMutableBuilder[Self <: ConnectFailoverOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnectFunction(
        value: (/* options */ ConnectOptions, /* connectionListener */ js.UndefOr[ConnectionListener]) => typings.stompit.clientMod.^
      ): Self = StObject.set(x, "connectFunction", js.Any.fromFunction2(value))
      
      @scala.inline
      def setConnectFunctionUndefined: Self = StObject.set(x, "connectFunction", js.undefined)
      
      @scala.inline
      def setInitialReconnectDelay(value: Double): Self = StObject.set(x, "initialReconnectDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialReconnectDelayUndefined: Self = StObject.set(x, "initialReconnectDelay", js.undefined)
      
      @scala.inline
      def setMaxReconnectDelay(value: Double): Self = StObject.set(x, "maxReconnectDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxReconnectDelayUndefined: Self = StObject.set(x, "maxReconnectDelay", js.undefined)
      
      @scala.inline
      def setMaxReconnects(value: Double): Self = StObject.set(x, "maxReconnects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxReconnectsUndefined: Self = StObject.set(x, "maxReconnects", js.undefined)
      
      @scala.inline
      def setRandomize(value: Boolean): Self = StObject.set(x, "randomize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRandomizeUndefined: Self = StObject.set(x, "randomize", js.undefined)
      
      @scala.inline
      def setReconnectDelayExponent(value: Double): Self = StObject.set(x, "reconnectDelayExponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReconnectDelayExponentUndefined: Self = StObject.set(x, "reconnectDelayExponent", js.undefined)
      
      @scala.inline
      def setUseExponentialBackOff(value: Boolean): Self = StObject.set(x, "useExponentialBackOff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseExponentialBackOffUndefined: Self = StObject.set(x, "useExponentialBackOff", js.undefined)
    }
  }
  
  // Internal class, which is not exported
  @js.native
  trait ConnectState extends StObject {
    
    var failedConnects: Double = js.native
    
    var serverProperties: Server = js.native
  }
  object ConnectState {
    
    @scala.inline
    def apply(failedConnects: Double, serverProperties: Server): ConnectState = {
      val __obj = js.Dynamic.literal(failedConnects = failedConnects.asInstanceOf[js.Any], serverProperties = serverProperties.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectState]
    }
    
    @scala.inline
    implicit class ConnectStateMutableBuilder[Self <: ConnectState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFailedConnects(value: Double): Self = StObject.set(x, "failedConnects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerProperties(value: Server): Self = StObject.set(x, "serverProperties", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Server extends StObject {
    
    def blacklist(): Unit = js.native
    def blacklist(error: Error): Unit = js.native
    
    var connectOptions: ConnectOptions = js.native
    
    def getBlacklistError(): Error = js.native
    
    def isBlacklisted(): Boolean = js.native
    
    var remoteAddress: AddressInfo = js.native
  }
}
