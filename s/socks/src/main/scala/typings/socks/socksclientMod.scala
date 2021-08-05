package typings.socks

import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Duplex
import typings.socks.constantsMod.SocksClientBoundEvent
import typings.socks.constantsMod.SocksClientChainOptions
import typings.socks.constantsMod.SocksClientEstablishedEvent
import typings.socks.constantsMod.SocksClientOptions
import typings.socks.constantsMod.SocksUDPFrameDetails
import typings.socks.socksStrings.bound
import typings.socks.socksStrings.error
import typings.socks.socksStrings.established
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object socksclientMod {
  
  @JSImport("socks/typings/client/socksclient", "SocksClient")
  @js.native
  class SocksClient protected () extends EventEmitter {
    def this(options: SocksClientOptions) = this()
    
    /**
      * Closes and destroys the underlying Socket. Emits an error event.
      * @param err { String } An error string to include in error event.
      */
    /* private */ var closeSocket: js.Any = js.native
    
    /**
      * Starts the connection establishment to the proxy and destination.
      * @param existingSocket Connected socket to use instead of creating a new one (internal use).
      */
    def connect(): Unit = js.native
    def connect(existingSocket: Duplex): Unit = js.native
    
    @JSName("emit")
    def emit_bound(event: bound, info: SocksClientBoundEvent): Boolean = js.native
    @JSName("emit")
    def emit_error(event: error, err: typings.socks.utilMod.SocksClientError): Boolean = js.native
    @JSName("emit")
    def emit_established(event: established, info: SocksClientEstablishedEvent): Boolean = js.native
    
    /* private */ var getSocketOptions: js.Any = js.native
    
    /**
      * Handles Socks v5 auth handshake response.
      * @param data
      */
    /* private */ var handleInitialSocks5AuthenticationHandshakeResponse: js.Any = js.native
    
    /**
      * Handles initial Socks v5 handshake response.
      * @param data
      */
    /* private */ var handleInitialSocks5HandshakeResponse: js.Any = js.native
    
    /**
      * Handles Socks v4 handshake response.
      * @param data
      */
    /* private */ var handleSocks4FinalHandshakeResponse: js.Any = js.native
    
    /**
      * Handles Socks v4 incoming connection request (BIND)
      * @param data
      */
    /* private */ var handleSocks4IncomingConnectionResponse: js.Any = js.native
    
    /**
      * Handles Socks v5 final handshake response.
      * @param data
      */
    /* private */ var handleSocks5FinalHandshakeResponse: js.Any = js.native
    
    /**
      * Handles Socks v5 incoming connection request (BIND).
      */
    /* private */ var handleSocks5IncomingConnectionResponse: js.Any = js.native
    
    /* private */ var nextRequiredPacketBufferSize: js.Any = js.native
    
    /* private */ var onClose: js.Any = js.native
    
    /**
      * Handles Socket close event.
      * @param had_error
      */
    /* private */ var onCloseHandler: js.Any = js.native
    
    /* private */ var onConnect: js.Any = js.native
    
    /**
      * Handles Socket connect event.
      */
    /* private */ var onConnectHandler: js.Any = js.native
    
    /* private */ var onDataReceived: js.Any = js.native
    
    /**
      * Handles Socket data event.
      * @param data
      */
    /* private */ var onDataReceivedHandler: js.Any = js.native
    
    /* private */ var onError: js.Any = js.native
    
    /**
      * Handles Socket error event.
      * @param err
      */
    /* private */ var onErrorHandler: js.Any = js.native
    
    /**
      * Handles internal Socks timeout callback.
      * Note: If the Socks client is not BoundWaitingForConnection or Established, the connection will be closed.
      */
    /* private */ var onEstablishedTimeout: js.Any = js.native
    
    @JSName("on")
    def on_bound(event: bound, listener: js.Function1[/* info */ SocksClientBoundEvent, Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ typings.socks.utilMod.SocksClientError, Unit]): this.type = js.native
    @JSName("on")
    def on_established(event: established, listener: js.Function1[/* info */ SocksClientEstablishedEvent, Unit]): this.type = js.native
    
    @JSName("once")
    def once_bound(event: bound, listener: js.Function1[/* info */ SocksClientBoundEvent, Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ typings.socks.utilMod.SocksClientError, Unit]): this.type = js.native
    @JSName("once")
    def once_established(event: established, listener: js.Function1[/* info */ SocksClientEstablishedEvent, Unit]): this.type = js.native
    
    /* private */ var options: js.Any = js.native
    
    /**
      * Handles processing of the data we have received.
      */
    /* private */ var processData: js.Any = js.native
    
    /* private */ var receiveBuffer: js.Any = js.native
    
    /**
      * Removes internal event listeners on the underlying Socket.
      */
    /* private */ var removeInternalSocketHandlers: js.Any = js.native
    
    /**
      * Sends initial Socks v4 handshake request.
      */
    /* private */ var sendSocks4InitialHandshake: js.Any = js.native
    
    /**
      * Sends Socks v5 final handshake request.
      */
    /* private */ var sendSocks5CommandRequest: js.Any = js.native
    
    /**
      * Sends initial Socks v5 handshake request.
      */
    /* private */ var sendSocks5InitialHandshake: js.Any = js.native
    
    /**
      * Sends Socks v5 user & password auth handshake.
      *
      * Note: No auth and user/pass are currently supported.
      */
    /* private */ var sendSocks5UserPassAuthentication: js.Any = js.native
    
    /**
      * Internal state setter. If the SocksClient is in an error state, it cannot be changed to a non error state.
      */
    /* private */ var setState: js.Any = js.native
    
    /* private */ var socket: js.Any = js.native
    
    def socksClientOptions: SocksClientOptions = js.native
    
    /* private */ var state: js.Any = js.native
  }
  object SocksClient {
    
    @JSImport("socks/typings/client/socksclient", "SocksClient")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new SOCKS connection.
      *
      * Note: Supports callbacks and promises. Only supports the connect command.
      * @param options { SocksClientOptions } Options.
      * @param callback { Function } An optional callback function.
      * @returns { Promise }
      */
    /* static member */
    inline def createConnection(options: SocksClientOptions): js.Promise[SocksClientEstablishedEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SocksClientEstablishedEvent]]
    inline def createConnection(options: SocksClientOptions, callback: js.Function): js.Promise[SocksClientEstablishedEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SocksClientEstablishedEvent]]
    
    /**
      * Creates a new SOCKS connection chain to a destination host through 2 or more SOCKS proxies.
      *
      * Note: Supports callbacks and promises. Only supports the connect method.
      * Note: Implemented via createConnection() factory function.
      * @param options { SocksClientChainOptions } Options
      * @param callback { Function } An optional callback function.
      * @returns { Promise }
      */
    /* static member */
    inline def createConnectionChain(options: SocksClientChainOptions): js.Promise[SocksClientEstablishedEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnectionChain")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SocksClientEstablishedEvent]]
    inline def createConnectionChain(options: SocksClientChainOptions, callback: js.Function): js.Promise[SocksClientEstablishedEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnectionChain")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SocksClientEstablishedEvent]]
    
    /**
      * Creates a SOCKS UDP Frame.
      * @param options
      */
    /* static member */
    inline def createUDPFrame(options: SocksUDPFrameDetails): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("createUDPFrame")(options.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    /**
      * Parses a SOCKS UDP frame.
      * @param data
      */
    /* static member */
    inline def parseUDPFrame(data: Buffer): SocksUDPFrameDetails = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUDPFrame")(data.asInstanceOf[js.Any]).asInstanceOf[SocksUDPFrameDetails]
  }
  
  /**
    * Error wrapper for SocksClient
    */
  @JSImport("socks/typings/client/socksclient", "SocksClientError")
  @js.native
  class SocksClientError protected ()
    extends typings.socks.utilMod.SocksClientError {
    def this(message: String, options: SocksClientChainOptions) = this()
    def this(message: String, options: SocksClientOptions) = this()
  }
}
