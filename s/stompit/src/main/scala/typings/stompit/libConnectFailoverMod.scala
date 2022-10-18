package typings.stompit

import typings.node.eventsMod.EventEmitter
import typings.std.Error
import typings.stompit.anon.Abort
import typings.stompit.libConnectFailoverGetAddressInfoMod.AddressInfo
import typings.stompit.libConnectMod.ConnectOptions
import typings.stompit.libConnectMod.ConnectionListener
import typings.stompit.stompitStrings.connect
import typings.stompit.stompitStrings.connecting
import typings.stompit.stompitStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConnectFailoverMod {
  
  @JSImport("stompit/lib/ConnectFailover", JSImport.Namespace)
  @js.native
  open class ^ () extends ConnectFailover {
    def this(servers: String) = this()
    def this(servers: js.Array[ConnectOptions]) = this()
    def this(servers: String, options: ConnectFailoverOptions) = this()
    def this(servers: js.Array[ConnectOptions], options: ConnectFailoverOptions) = this()
    def this(servers: Unit, options: ConnectFailoverOptions) = this()
  }
  
  trait ConnectError
    extends StObject
       with Error {
    
    var connectArgs: ConnectOptions
  }
  object ConnectError {
    
    inline def apply(connectArgs: ConnectOptions, message: String, name: String): ConnectError = {
      val __obj = js.Dynamic.literal(connectArgs = connectArgs.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectError]
    }
    
    extension [Self <: ConnectError](x: Self) {
      
      inline def setConnectArgs(value: ConnectOptions): Self = StObject.set(x, "connectArgs", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ConnectFailover extends EventEmitter {
    
    def addServer(config: String): Unit = js.native
    def addServer(config: ConnectOptions): Unit = js.native
    
    def connect(
      callback: js.Function4[
          /* error */ js.Error | Null, 
          /* client */ typings.stompit.libClientMod.^, 
          /* reconnect */ js.Function0[Unit], 
          /* server */ Server, 
          Unit
        ]
    ): Abort = js.native
    
    def getReconnectDelay(reconnects: Double): Double = js.native
    
    def on(event: connect | connecting, listener: js.Function1[/* server */ ConnectState, Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function2[/* err */ ConnectError, /* server */ ConnectState, Unit]): this.type = js.native
  }
  
  trait ConnectFailoverOptions extends StObject {
    
    // Override the connect function
    var connectFunction: js.UndefOr[
        js.Function2[
          /* options */ ConnectOptions, 
          /* connectionListener */ js.UndefOr[ConnectionListener], 
          typings.stompit.libClientMod.^
        ]
      ] = js.undefined
    
    // Milliseconds delay of the first reconnect
    var initialReconnectDelay: js.UndefOr[Double] = js.undefined
    
    // Maximum milliseconds delay of any reconnect
    var maxReconnectDelay: js.UndefOr[Double] = js.undefined
    
    // Maximum number of reconnects
    var maxReconnects: js.UndefOr[Double] = js.undefined
    
    // Randomly choose a server to use for reconnect
    var randomize: js.UndefOr[Boolean] = js.undefined
    
    // The exponent used in the exponential backoff attempts
    var reconnectDelayExponent: js.UndefOr[Double] = js.undefined
    
    // Exponential increase of the reconnect delay
    var useExponentialBackOff: js.UndefOr[Boolean] = js.undefined
  }
  object ConnectFailoverOptions {
    
    inline def apply(): ConnectFailoverOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectFailoverOptions]
    }
    
    extension [Self <: ConnectFailoverOptions](x: Self) {
      
      inline def setConnectFunction(
        value: (/* options */ ConnectOptions, /* connectionListener */ js.UndefOr[ConnectionListener]) => typings.stompit.libClientMod.^
      ): Self = StObject.set(x, "connectFunction", js.Any.fromFunction2(value))
      
      inline def setConnectFunctionUndefined: Self = StObject.set(x, "connectFunction", js.undefined)
      
      inline def setInitialReconnectDelay(value: Double): Self = StObject.set(x, "initialReconnectDelay", value.asInstanceOf[js.Any])
      
      inline def setInitialReconnectDelayUndefined: Self = StObject.set(x, "initialReconnectDelay", js.undefined)
      
      inline def setMaxReconnectDelay(value: Double): Self = StObject.set(x, "maxReconnectDelay", value.asInstanceOf[js.Any])
      
      inline def setMaxReconnectDelayUndefined: Self = StObject.set(x, "maxReconnectDelay", js.undefined)
      
      inline def setMaxReconnects(value: Double): Self = StObject.set(x, "maxReconnects", value.asInstanceOf[js.Any])
      
      inline def setMaxReconnectsUndefined: Self = StObject.set(x, "maxReconnects", js.undefined)
      
      inline def setRandomize(value: Boolean): Self = StObject.set(x, "randomize", value.asInstanceOf[js.Any])
      
      inline def setRandomizeUndefined: Self = StObject.set(x, "randomize", js.undefined)
      
      inline def setReconnectDelayExponent(value: Double): Self = StObject.set(x, "reconnectDelayExponent", value.asInstanceOf[js.Any])
      
      inline def setReconnectDelayExponentUndefined: Self = StObject.set(x, "reconnectDelayExponent", js.undefined)
      
      inline def setUseExponentialBackOff(value: Boolean): Self = StObject.set(x, "useExponentialBackOff", value.asInstanceOf[js.Any])
      
      inline def setUseExponentialBackOffUndefined: Self = StObject.set(x, "useExponentialBackOff", js.undefined)
    }
  }
  
  @js.native
  trait ConnectState extends StObject {
    
    def blacklist(): Unit = js.native
    def blacklist(error: js.Error): Unit = js.native
    
    var failedConnects: Double = js.native
    
    def getBlacklistError(): js.Error = js.native
    
    def isBlacklisted(): Boolean = js.native
    
    var serverProperties: Server = js.native
  }
  
  trait Server extends StObject {
    
    var connectOptions: ConnectOptions
    
    var remoteAddress: AddressInfo
  }
  object Server {
    
    inline def apply(connectOptions: ConnectOptions, remoteAddress: AddressInfo): Server = {
      val __obj = js.Dynamic.literal(connectOptions = connectOptions.asInstanceOf[js.Any], remoteAddress = remoteAddress.asInstanceOf[js.Any])
      __obj.asInstanceOf[Server]
    }
    
    extension [Self <: Server](x: Self) {
      
      inline def setConnectOptions(value: ConnectOptions): Self = StObject.set(x, "connectOptions", value.asInstanceOf[js.Any])
      
      inline def setRemoteAddress(value: AddressInfo): Self = StObject.set(x, "remoteAddress", value.asInstanceOf[js.Any])
    }
  }
}
