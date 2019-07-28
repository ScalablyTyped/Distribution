package typings.sipDotJs.libWebTransportMod

import typings.sipDotJs.Anon_Msg
import typings.sipDotJs.libCoreMod.Logger
import typings.sipDotJs.libCoreMod.OutgoingRequestMessage
import typings.sipDotJs.libEnumsMod.TypeStrings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Web/Transport", "Transport")
@js.native
class Transport protected ()
  extends typings.sipDotJs.libCoreMod.Transport {
  def this(logger: Logger) = this()
  def this(logger: Logger, options: js.Any) = this()
  var boundOnClose: js.Any = js.native
  var boundOnError: js.Any = js.native
  var boundOnMessage: js.Any = js.native
  var boundOnOpen: js.Any = js.native
  var clearKeepAliveTimeout: js.Any = js.native
  var configuration: js.Any = js.native
  var connectDeferredReject: js.Any = js.native
  var connectDeferredResolve: js.Any = js.native
  var connectionPromise: js.Any = js.native
  var connectionTimeout: js.Any = js.native
  var disconnectDeferredResolve: js.Any = js.native
  var disconnectionPromise: js.Any = js.native
  /**
    * Removes event listeners and clears the instance ws
    */
  var disposeWs: js.Any = js.native
  /**
    * Configuration checker.
    * @return {Boolean}
    */
  var getConfigurationCheck: js.Any = js.native
  /**
    * Retrieve the next server to which connect.
    * @param {Boolean} force allows bypass of server error status checking
    * @returns {Object} WsServer
    */
  var getNextWsServer: js.Any = js.native
  var keepAliveDebounceTimeout: js.Any = js.native
  var keepAliveInterval: js.Any = js.native
  /**
    * Configuration load.
    * returns {Configuration}
    */
  var loadConfig: js.Any = js.native
  /**
    * Checks all configuration servers, returns true if all of them have isError: true and false otherwise
    * @returns {Boolean}
    */
  var noAvailableServers: js.Any = js.native
  /**
    * @event
    * @param {event} e
    */
  var onClose: js.Any = js.native
  /**
    * @event
    * @param {string} e
    */
  var onError: js.Any = js.native
  /**
    * @event
    * @param {event} e
    */
  var onOpen: js.Any = js.native
  /**
    * @event
    * @private
    */
  var onWebsocketError: js.Any = js.native
  /**
    * Reconnection attempt logic.
    */
  var reconnect: js.Any = js.native
  var reconnectTimer: js.Any = js.native
  var reconnectionAttempts: js.Any = js.native
  /**
    * Resets the error state of all servers in the configuration
    */
  var resetServerErrorStatus: js.Any = js.native
  /**
    * Send a keep-alive (a double-CRLF sequence).
    * @returns {Boolean}
    */
  var sendKeepAlive: js.Any = js.native
  @JSName("server")
  var server_Transport: WsServer = js.native
  /**
    * Start sending keep-alives.
    */
  var startSendingKeepAlives: js.Any = js.native
  var status: js.Any = js.native
  /**
    * Checks given status against instance current status. Returns true if they match
    * @param {Number} status
    * @param {Boolean} [force]
    * @returns {Boolean}
    */
  var statusAssert: js.Any = js.native
  /**
    * Transitions the status. Checks for legal transition via assertion beforehand
    * @param {Number} status
    * @param {Boolean} [force]
    * @returns {Boolean}
    */
  var statusTransition: js.Any = js.native
  /**
    * Stop sending keep-alives.
    */
  var stopSendingKeepAlives: js.Any = js.native
  var `type`: TypeStrings = js.native
  var ws: js.Any = js.native
  /**
    * Connect socket.
    */
  /* protected */ def connectPromise(): js.Promise[_] = js.native
  /**
    * Disconnect socket.
    */
  /* protected */ def disconnectPromise(): js.Promise[_] = js.native
  /**
    * Send a message.
    * @param {SIP.OutgoingRequest|String} msg
    * @param {Object} [options]
    * @returns {Promise}
    */
  /* protected */ def sendPromise(msg: OutgoingRequestMessage): js.Promise[Anon_Msg] = js.native
  /* protected */ def sendPromise(msg: OutgoingRequestMessage, options: js.Any): js.Promise[Anon_Msg] = js.native
}

/* static members */
@JSImport("sip.js/lib/Web/Transport", "Transport")
@js.native
object Transport extends js.Object {
  val C: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TransportStatus */ js.Any = js.native
}

