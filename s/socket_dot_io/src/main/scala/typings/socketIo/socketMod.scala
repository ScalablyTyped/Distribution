package typings.socketIo

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.IncomingHttpHeaders
import typings.node.httpMod.IncomingMessage
import typings.socketIo.broadcastOperatorMod.BroadcastOperator
import typings.socketIo.clientMod.Client
import typings.socketIo.namespaceMod.Namespace
import typings.socketIo.socketIoStrings.message
import typings.socketIo.typedEventsMod.EventParams
import typings.socketIo.typedEventsMod.EventsMap
import typings.socketIo.typedEventsMod.StrictEventEmitter
import typings.socketIoAdapter.mod.Room
import typings.socketIoAdapter.mod.SocketId
import typings.socketIoParser.mod.Packet
import typings.std.Partial
import typings.std.ReadonlySet
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object socketMod {
  
  @JSImport("socket.io/dist/socket", "RESERVED_EVENTS")
  @js.native
  val RESERVED_EVENTS: ReadonlySet[String | js.Symbol] = js.native
  
  @JSImport("socket.io/dist/socket", "Socket")
  @js.native
  open class Socket[ListenEvents /* <: EventsMap */, EmitEvents /* <: EventsMap */, ServerSideEvents /* <: EventsMap */, SocketData] protected () extends StrictEventEmitter[ListenEvents, EmitEvents, SocketReservedEventsMap] {
    /**
      * Interface to a `Client` for a given `Namespace`.
      *
      * @param {Namespace} nsp
      * @param {Client} client
      * @param {Object} auth
      * @package
      */
    def this(
      nsp: Namespace[ListenEvents, EmitEvents, ServerSideEvents, Any],
      client: Client[ListenEvents, EmitEvents, ServerSideEvents, Any],
      auth: js.Object
    ) = this()
    
    /* private */ var _anyListeners: Any = js.native
    
    /* private */ var _anyOutgoingListeners: Any = js.native
    
    /**
      * Makes the socket leave all the rooms it was part of and prevents it from joining any other room
      *
      * @private
      */
    def _cleanup(): Unit = js.native
    
    /**
      * Produces an `error` packet.
      *
      * @param {Object} err - error object
      *
      * @private
      */
    def _error(err: Any): Unit = js.native
    
    /**
      * Called upon closing. Called by `Client`.
      *
      * @param {String} reason
      * @throw {Error} optional error object
      *
      * @private
      */
    def _onclose(reason: String): js.UndefOr[this.type] = js.native
    
    /**
      * Called by `Namespace` upon successful
      * middleware execution (ie: authorization).
      * Socket is added to namespace array before
      * call to join, so adapters can access it.
      *
      * @private
      */
    def _onconnect(): Unit = js.native
    
    /**
      * Handles a client error.
      *
      * @private
      */
    def _onerror(err: js.Error): Unit = js.native
    
    /**
      * Called with each packet. Called by `Client`.
      *
      * @param {Object} packet
      * @private
      */
    def _onpacket(packet: Packet): Unit = js.native
    
    /**
      * Produces an ack callback to emit with an event.
      *
      * @param {Number} id - packet id
      * @private
      */
    /* private */ var ack: Any = js.native
    
    /* private */ var acks: Any = js.native
    
    /* private */ val adapter: Any = js.native
    
    /**
      * Sets a modifier for a subsequent event emission that the event data will only be broadcast to every sockets but the
      * sender.
      *
      * @return {Socket} self
      * @public
      */
    def broadcast: BroadcastOperator[EmitEvents, SocketData] = js.native
    
    /**
      * Builds the `handshake` BC object
      *
      * @private
      */
    /* private */ var buildHandshake: Any = js.native
    
    val client: Client[ListenEvents, EmitEvents, ServerSideEvents, Any] = js.native
    
    /**
      * Sets the compress flag.
      *
      * @param {Boolean} compress - if `true`, compresses the sending data
      * @return {Socket} self
      * @public
      */
    def compress(compress: Boolean): this.type = js.native
    
    /**
      * A reference to the underlying Client transport connection (Engine.IO Socket object).
      *
      * @public
      */
    def conn: typings.engineIo.mod.Socket = js.native
    
    var connected: Boolean = js.native
    
    /**
      * Additional information that can be attached to the Socket instance and which will be used in the fetchSockets method
      */
    var data: Partial[SocketData] = js.native
    
    /**
      * Disconnects this client.
      *
      * @param {Boolean} close - if `true`, closes the underlying connection
      * @return {Socket} self
      *
      * @public
      */
    def disconnect(): this.type = js.native
    def disconnect(close: Boolean): this.type = js.native
    
    /**
      * Whether the socket is currently disconnected
      */
    def disconnected: Boolean = js.native
    
    /**
      * Dispatch incoming event to socket listeners.
      *
      * @param {Array} event - event that will get emitted
      * @private
      */
    /* private */ var dispatch: Any = js.native
    
    def except(room: js.Array[Room]): BroadcastOperator[EmitEvents, SocketData] = js.native
    /**
      * Excludes a room when broadcasting.
      *
      * @param room
      * @return self
      * @public
      */
    def except(room: Room): BroadcastOperator[EmitEvents, SocketData] = js.native
    
    /* private */ var flags: Any = js.native
    
    /* private */ var fns: Any = js.native
    
    val handshake: Handshake = js.native
    
    val id: SocketId = js.native
    
    def in(room: js.Array[Room]): BroadcastOperator[EmitEvents, SocketData] = js.native
    /**
      * Targets a room when broadcasting.
      *
      * @param room
      * @return self
      * @public
      */
    def in(room: Room): BroadcastOperator[EmitEvents, SocketData] = js.native
    
    def join(rooms: js.Array[Room]): js.Promise[Unit] | Unit = js.native
    /**
      * Joins a room.
      *
      * @param {String|Array} rooms - room or array of rooms
      * @return a Promise or nothing, depending on the adapter
      * @public
      */
    def join(rooms: Room): js.Promise[Unit] | Unit = js.native
    
    /**
      * Leaves a room.
      *
      * @param {String} room
      * @return a Promise or nothing, depending on the adapter
      * @public
      */
    def leave(room: String): js.Promise[Unit] | Unit = js.native
    
    /**
      * Leave all rooms.
      *
      * @private
      */
    /* private */ var leaveAll: Any = js.native
    
    /**
      * Returns an array of listeners that are listening for any event that is specified. This array can be manipulated,
      * e.g. to remove listeners.
      *
      * @public
      */
    def listenersAny(): js.Array[js.Function1[/* repeated */ Any, Unit]] = js.native
    
    /**
      * Returns an array of listeners that are listening for any event that is specified. This array can be manipulated,
      * e.g. to remove listeners.
      *
      * @public
      */
    def listenersAnyOutgoing(): js.Array[js.Function1[/* repeated */ Any, Unit]] = js.native
    
    /**
      * Sets a modifier for a subsequent event emission that the event data will only be broadcast to the current node.
      *
      * @return {Socket} self
      * @public
      */
    def local: BroadcastOperator[EmitEvents, SocketData] = js.native
    
    /* private */ var newBroadcastOperator: Any = js.native
    
    /**
      * Notify the listeners for each packet sent (emit or broadcast)
      *
      * @param packet
      *
      * @private
      */
    /* private */ var notifyOutgoingListeners: Any = js.native
    
    val nsp: Namespace[ListenEvents, EmitEvents, ServerSideEvents, Any] = js.native
    
    /**
      * Removes the listener that will be fired when any event is received.
      *
      * @param listener
      * @public
      */
    def offAny(): this.type = js.native
    def offAny(listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /**
      * Removes the listener that will be fired when any event is emitted.
      *
      * @param listener
      *
      * <pre><code>
      *
      * const handler = (event, ...args) => {
      *   console.log(event);
      * }
      *
      * socket.onAnyOutgoing(handler);
      *
      * // then later
      * socket.offAnyOutgoing(handler);
      *
      * </pre></code>
      *
      * @public
      */
    def offAnyOutgoing(): this.type = js.native
    def offAnyOutgoing(listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /**
      * Adds a listener that will be fired when any event is received. The event name is passed as the first argument to
      * the callback.
      *
      * @param listener
      * @public
      */
    def onAny(listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /**
      * Adds a listener that will be fired when any event is emitted. The event name is passed as the first argument to the
      * callback.
      *
      * @param listener
      *
      * <pre><code>
      *
      * socket.onAnyOutgoing((event, ...args) => {
      *   console.log(event);
      * });
      *
      * </pre></code>
      *
      * @public
      */
    def onAnyOutgoing(listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /**
      * Called upon ack packet.
      *
      * @private
      */
    /* private */ var onack: Any = js.native
    
    /**
      * Called upon client disconnect packet.
      *
      * @private
      */
    /* private */ var ondisconnect: Any = js.native
    
    /**
      * Called upon event packet.
      *
      * @param {Packet} packet - packet object
      * @private
      */
    /* private */ var onevent: Any = js.native
    
    /**
      * Writes a packet.
      *
      * @param {Object} packet - packet object
      * @param {Object} opts - options
      * @private
      */
    /* private */ var packet: Any = js.native
    
    /**
      * Adds a listener that will be fired when any event is received. The event name is passed as the first argument to
      * the callback. The listener is added to the beginning of the listeners array.
      *
      * @param listener
      * @public
      */
    def prependAny(listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /**
      * Adds a listener that will be fired when any event is emitted. The event name is passed as the first argument to the
      * callback. The listener is added to the beginning of the listeners array.
      *
      * @param listener
      *
      * <pre><code>
      *
      * socket.prependAnyOutgoing((event, ...args) => {
      *   console.log(event);
      * });
      *
      * </pre></code>
      *
      * @public
      */
    def prependAnyOutgoing(listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /**
      * @private
      */
    /* private */ var registerAckCallback: Any = js.native
    
    /**
      * A reference to the request that originated the underlying Engine.IO Socket.
      *
      * @public
      */
    def request: IncomingMessage = js.native
    
    /**
      * @public
      */
    def rooms: Set[Room] = js.native
    
    /**
      * Executes the middleware for an incoming event.
      *
      * @param {Array} event - event that will get emitted
      * @param {Function} fn - last fn call in the middleware
      * @private
      */
    /* private */ var run: Any = js.native
    
    /**
      * Sends a `message` event.
      *
      * @return self
      * @public
      */
    @JSName("send")
    def send_message(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventParams<EmitEvents, 'message'> is not an array type */ args: EventParams[EmitEvents, message]
    ): this.type = js.native
    
    /* private */ val server: Any = js.native
    
    /**
      * Sets a modifier for a subsequent event emission that the callback will be called with an error when the
      * given number of milliseconds have elapsed without an acknowledgement from the client:
      *
      * ```
      * socket.timeout(5000).emit("my-event", (err) => {
      *   if (err) {
      *     // the client did not acknowledge the event in the given delay
      *   }
      * });
      * ```
      *
      * @returns self
      * @public
      */
    def timeout(timeout: Double): this.type = js.native
    
    def to(room: js.Array[Room]): BroadcastOperator[EmitEvents, SocketData] = js.native
    /**
      * Targets a room when broadcasting.
      *
      * @param room
      * @return self
      * @public
      */
    def to(room: Room): BroadcastOperator[EmitEvents, SocketData] = js.native
    
    /**
      * Sets up socket middleware.
      *
      * @param {Function} fn - middleware function (event, next)
      * @return {Socket} self
      * @public
      */
    def use(
      fn: js.Function2[
          /* event */ Event, 
          /* next */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    
    /**
      * Sets a modifier for a subsequent event emission that the event data may be lost if the client is not ready to
      * receive messages (because of network slowness or other issues, or because they’re connected through long polling
      * and is in the middle of a request-response cycle).
      *
      * @return {Socket} self
      * @public
      */
    def volatile: this.type = js.native
    
    /**
      * Sends a `message` event.
      *
      * @return self
      * @public
      */
    @JSName("write")
    def write_message(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventParams<EmitEvents, 'message'> is not an array type */ args: EventParams[EmitEvents, message]
    ): this.type = js.native
  }
  
  type Event = Array[String | Any]
  
  @js.native
  trait EventEmitterReservedEventsMap extends StObject {
    
    def newListener(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
    def newListener(eventName: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
    
    def removeListener(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
    def removeListener(eventName: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
  }
  
  trait Handshake extends StObject {
    
    /**
      * The ip of the client
      */
    var address: String
    
    /**
      * The auth object
      */
    var auth: StringDictionary[Any]
    
    /**
      * The headers sent as part of the handshake
      */
    var headers: IncomingHttpHeaders
    
    /**
      * The date of creation (as unix timestamp)
      */
    var issued: Double
    
    /**
      * The query object
      */
    var query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
    
    /**
      * Whether the connection is secure
      */
    var secure: Boolean
    
    /**
      * The date of creation (as string)
      */
    var time: String
    
    /**
      * The request URL string
      */
    var url: String
    
    /**
      * Whether the connection is cross-domain
      */
    var xdomain: Boolean
  }
  object Handshake {
    
    inline def apply(
      address: String,
      auth: StringDictionary[Any],
      headers: IncomingHttpHeaders,
      issued: Double,
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any,
      secure: Boolean,
      time: String,
      url: String,
      xdomain: Boolean
    ): Handshake = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], auth = auth.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], issued = issued.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], xdomain = xdomain.asInstanceOf[js.Any])
      __obj.asInstanceOf[Handshake]
    }
    
    extension [Self <: Handshake](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAuth(value: StringDictionary[Any]): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setIssued(value: Double): Self = StObject.set(x, "issued", value.asInstanceOf[js.Any])
      
      inline def setQuery(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
      ): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setXdomain(value: Boolean): Self = StObject.set(x, "xdomain", value.asInstanceOf[js.Any])
    }
  }
  
  trait SocketReservedEventsMap extends StObject {
    
    def disconnect(reason: String): Unit
    
    def disconnecting(reason: String): Unit
    
    def error(err: js.Error): Unit
  }
  object SocketReservedEventsMap {
    
    inline def apply(disconnect: String => Unit, disconnecting: String => Unit, error: js.Error => Unit): SocketReservedEventsMap = {
      val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction1(disconnect), disconnecting = js.Any.fromFunction1(disconnecting), error = js.Any.fromFunction1(error))
      __obj.asInstanceOf[SocketReservedEventsMap]
    }
    
    extension [Self <: SocketReservedEventsMap](x: Self) {
      
      inline def setDisconnect(value: String => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction1(value))
      
      inline def setDisconnecting(value: String => Unit): Self = StObject.set(x, "disconnecting", js.Any.fromFunction1(value))
      
      inline def setError(value: js.Error => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    }
  }
}
