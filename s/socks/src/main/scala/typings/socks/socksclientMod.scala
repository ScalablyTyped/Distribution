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
import typings.socks.utilMod.SocksClientError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("socks/typings/client/socksclient", JSImport.Namespace)
@js.native
object socksclientMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SocksClient * / any */ @js.native
  class SocksClient protected () extends EventEmitter {
    def this(options: SocksClientOptions) = this()
    /**
      * Closes and destroys the underlying Socket. Emits an error event.
      * @param err { String } An error string to include in error event.
      */
    var _closeSocket: js.Any = js.native
    var _nextRequiredPacketBufferSize: js.Any = js.native
    var _onClose: js.Any = js.native
    var _onConnect: js.Any = js.native
    var _onDataReceived: js.Any = js.native
    var _onError: js.Any = js.native
    var _options: js.Any = js.native
    var _receiveBuffer: js.Any = js.native
    var _socket: js.Any = js.native
    var _state: js.Any = js.native
    var getSocketOptions: js.Any = js.native
    /**
      * Handles Socks v5 auth handshake response.
      * @param data
      */
    var handleInitialSocks5AuthenticationHandshakeResponse: js.Any = js.native
    /**
      * Handles initial Socks v5 handshake response.
      * @param data
      */
    var handleInitialSocks5HandshakeResponse: js.Any = js.native
    /**
      * Handles Socks v4 handshake response.
      * @param data
      */
    var handleSocks4FinalHandshakeResponse: js.Any = js.native
    /**
      * Handles Socks v4 incoming connection request (BIND)
      * @param data
      */
    var handleSocks4IncomingConnectionResponse: js.Any = js.native
    /**
      * Handles Socks v5 final handshake response.
      * @param data
      */
    var handleSocks5FinalHandshakeResponse: js.Any = js.native
    /**
      * Handles Socks v5 incoming connection request (BIND).
      */
    var handleSocks5IncomingConnectionResponse: js.Any = js.native
    /**
      * Handles Socket close event.
      * @param had_error
      */
    var onClose: js.Any = js.native
    /**
      * Handles Socket connect event.
      */
    var onConnect: js.Any = js.native
    /**
      * Handles Socket data event.
      * @param data
      */
    var onDataReceived: js.Any = js.native
    /**
      * Handles Socket error event.
      * @param err
      */
    var onError: js.Any = js.native
    /**
      * Handles internal Socks timeout callback.
      * Note: If the Socks client is not BoundWaitingForConnection or Established, the connection will be closed.
      */
    var onEstablishedTimeout: js.Any = js.native
    /**
      * Handles processing of the data we have received.
      */
    var processData: js.Any = js.native
    /**
      * Removes internal event listeners on the underlying Socket.
      */
    var removeInternalSocketHandlers: js.Any = js.native
    /**
      * Sends initial Socks v4 handshake request.
      */
    var sendSocks4InitialHandshake: js.Any = js.native
    /**
      * Sends Socks v5 final handshake request.
      */
    var sendSocks5CommandRequest: js.Any = js.native
    /**
      * Sends initial Socks v5 handshake request.
      */
    var sendSocks5InitialHandshake: js.Any = js.native
    /**
      * Sends Socks v5 user & password auth handshake.
      *
      * Note: No auth and user/pass are currently supported.
      */
    var sendSocks5UserPassAuthentication: js.Any = js.native
    /**
      * Starts the connection establishment to the proxy and destination.
      * @param existing_socket Connected socket to use instead of creating a new one (internal use).
      */
    def connect(): Unit = js.native
    def connect(existing_socket: Duplex): Unit = js.native
    @JSName("emit")
    def emit_bound(event: bound, info: SocksClientBoundEvent): Boolean = js.native
    @JSName("emit")
    def emit_error(event: error, err: SocksClientError): Boolean = js.native
    @JSName("emit")
    def emit_established(event: established, info: SocksClientEstablishedEvent): Boolean = js.native
    @JSName("on")
    def on_bound(event: bound, listener: js.Function1[/* info */ SocksClientBoundEvent, Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ SocksClientError, Unit]): this.type = js.native
    @JSName("on")
    def on_established(event: established, listener: js.Function1[/* info */ SocksClientEstablishedEvent, Unit]): this.type = js.native
    @JSName("once")
    def once_bound(event: bound, listener: js.Function1[/* info */ SocksClientBoundEvent, Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ SocksClientError, Unit]): this.type = js.native
    @JSName("once")
    def once_established(event: established, listener: js.Function1[/* info */ SocksClientEstablishedEvent, Unit]): this.type = js.native
    def socksClientOptions: SocksClientOptions = js.native
    /**
      * Gets the SocksClient internal state.
      */
    /* private */ def state: js.Any = js.native
    /**
      * Internal state setter. If the SocksClient is in an error state, it cannot be changed to a non error state.
      */
    /* private */ def state(value: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object SocksClient extends js.Object {
    /**
      * Creates a new SOCKS connection.
      *
      * Note: Supports callbacks and promises. Only supports the connect command.
      * @param options { SocksClientOptions } Options.
      * @param callback { Function } An optional callback function.
      * @returns { Promise }
      */
    def createConnection(options: SocksClientOptions): js.Promise[SocksClientEstablishedEvent] = js.native
    def createConnection(options: SocksClientOptions, callback: js.Function): js.Promise[SocksClientEstablishedEvent] = js.native
    /**
      * Creates a new SOCKS connection chain to a destination host through 2 or more SOCKS proxies.
      *
      * Note: Supports callbacks and promises. Only supports the connect method.
      * Note: Implemented via createConnection() factory function.
      * @param options { SocksClientChainOptions } Options
      * @param callback { Function } An optional callback function.
      * @returns { Promise }
      */
    def createConnectionChain(options: SocksClientChainOptions): js.Promise[SocksClientEstablishedEvent] = js.native
    def createConnectionChain(options: SocksClientChainOptions, callback: js.Function): js.Promise[SocksClientEstablishedEvent] = js.native
    /**
      * Creates a SOCKS UDP Frame.
      * @param options
      */
    def createUDPFrame(options: SocksUDPFrameDetails): Buffer = js.native
    /**
      * Parses a SOCKS UDP frame.
      * @param data
      */
    def parseUDPFrame(data: Buffer): SocksUDPFrameDetails = js.native
  }
  
}

