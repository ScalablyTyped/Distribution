package typings.socketIo

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.IncomingHttpHeaders
import typings.node.httpMod.IncomingMessage
import typings.socketIo.distBroadcastOperatorMod.BroadcastOperator
import typings.socketIo.distClientMod.Client
import typings.socketIo.distNamespaceMod.Namespace
import typings.socketIo.distTypedEventsMod.EventParams
import typings.socketIo.distTypedEventsMod.EventsMap
import typings.socketIo.distTypedEventsMod.StrictEventEmitter
import typings.socketIo.socketIoStrings.message
import typings.socketIoAdapter.mod.Room
import typings.socketIoAdapter.mod.SocketId
import typings.socketIoParser.mod.Packet
import typings.std.Partial
import typings.std.ReadonlySet
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSocketMod {
  
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
    def _onclose(reason: DisconnectReason): js.UndefOr[this.type] = js.native
    
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
      * @example
      * io.on("connection", (socket) => {
      *   // the “foo” event will be broadcast to all connected clients, except this socket
      *   socket.broadcast.emit("foo", "bar");
      * });
      *
      * @return a new {@link BroadcastOperator} instance for chaining
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
      * @example
      * io.on("connection", (socket) => {
      *   socket.compress(false).emit("hello");
      * });
      *
      * @param {Boolean} compress - if `true`, compresses the sending data
      * @return {Socket} self
      */
    def compress(compress: Boolean): this.type = js.native
    
    /**
      * A reference to the underlying Client transport connection (Engine.IO Socket object).
      *
      * @example
      * io.on("connection", (socket) => {
      *   console.log(socket.conn.transport.name); // prints "polling" or "websocket"
      *
      *   socket.conn.once("upgrade", () => {
      *     console.log(socket.conn.transport.name); // prints "websocket"
      *   });
      * });
      */
    def conn: typings.engineIo.mod.Socket = js.native
    
    /**
      * Whether the socket is currently connected or not.
      *
      * @example
      * io.use((socket, next) => {
      *   console.log(socket.connected); // false
      *   next();
      * });
      *
      * io.on("connection", (socket) => {
      *   console.log(socket.connected); // true
      * });
      */
    var connected: Boolean = js.native
    
    /**
      * Additional information that can be attached to the Socket instance and which will be used in the
      * {@link Server.fetchSockets()} method.
      */
    var data: Partial[SocketData] = js.native
    
    /**
      * Disconnects this client.
      *
      * @example
      * io.on("connection", (socket) => {
      *   // disconnect this socket (the connection might be kept alive for other namespaces)
      *   socket.disconnect();
      *
      *   // disconnect this socket and close the underlying connection
      *   socket.disconnect(true);
      * })
      *
      * @param {Boolean} close - if `true`, closes the underlying connection
      * @return self
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
      * @example
      * io.on("connection", (socket) => {
      *   // the "foo" event will be broadcast to all connected clients, except the ones that are in the "room-101" room
      *   // and this socket
      *   socket.except("room-101").emit("foo", "bar");
      *
      *   // with an array of rooms
      *   socket.except(["room-101", "room-102"]).emit("foo", "bar");
      *
      *   // with multiple chained calls
      *   socket.except("room-101").except("room-102").emit("foo", "bar");
      * });
      *
      * @param room - a room, or an array of rooms
      * @return a new {@link BroadcastOperator} instance for chaining
      */
    def except(room: Room): BroadcastOperator[EmitEvents, SocketData] = js.native
    
    /* private */ var flags: Any = js.native
    
    /* private */ var fns: Any = js.native
    
    /**
      * The handshake details.
      */
    val handshake: Handshake = js.native
    
    /**
      * An unique identifier for the session.
      */
    val id: SocketId = js.native
    
    def in(room: js.Array[Room]): BroadcastOperator[EmitEvents, SocketData] = js.native
    /**
      * Targets a room when broadcasting. Similar to `to()`, but might feel clearer in some cases:
      *
      * @example
      * io.on("connection", (socket) => {
      *   // disconnect all clients in the "room-101" room, except this socket
      *   socket.in("room-101").disconnectSockets();
      * });
      *
      * @param room - a room, or an array of rooms
      * @return a new {@link BroadcastOperator} instance for chaining
      */
    def in(room: Room): BroadcastOperator[EmitEvents, SocketData] = js.native
    
    def join(rooms: js.Array[Room]): js.Promise[Unit] | Unit = js.native
    /**
      * Joins a room.
      *
      * @example
      * io.on("connection", (socket) => {
      *   // join a single room
      *   socket.join("room1");
      *
      *   // join multiple rooms
      *   socket.join(["room1", "room2"]);
      * });
      *
      * @param {String|Array} rooms - room or array of rooms
      * @return a Promise or nothing, depending on the adapter
      */
    def join(rooms: Room): js.Promise[Unit] | Unit = js.native
    
    /**
      * Leaves a room.
      *
      * @example
      * io.on("connection", (socket) => {
      *   // leave a single room
      *   socket.leave("room1");
      *
      *   // leave multiple rooms
      *   socket.leave("room1").leave("room2");
      * });
      *
      * @param {String} room
      * @return a Promise or nothing, depending on the adapter
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
      */
    def listenersAny(): js.Array[js.Function1[/* repeated */ Any, Unit]] = js.native
    
    /**
      * Returns an array of listeners that are listening for any event that is specified. This array can be manipulated,
      * e.g. to remove listeners.
      */
    def listenersAnyOutgoing(): js.Array[js.Function1[/* repeated */ Any, Unit]] = js.native
    
    /**
      * Sets a modifier for a subsequent event emission that the event data will only be broadcast to the current node.
      *
      * @example
      * io.on("connection", (socket) => {
      *   // the “foo” event will be broadcast to all connected clients on this node, except this socket
      *   socket.local.emit("foo", "bar");
      * });
      *
      * @return a new {@link BroadcastOperator} instance for chaining
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
      * @example
      * io.on("connection", (socket) => {
      *   const catchAllListener = (event, ...args) => {
      *     console.log(`got event ${event}`);
      *   }
      *
      *   socket.onAny(catchAllListener);
      *
      *   // remove a specific listener
      *   socket.offAny(catchAllListener);
      *
      *   // or remove all listeners
      *   socket.offAny();
      * });
      *
      * @param listener
      */
    def offAny(): this.type = js.native
    def offAny(listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /**
      * Removes the listener that will be fired when any event is sent.
      *
      * @example
      * io.on("connection", (socket) => {
      *   const catchAllListener = (event, ...args) => {
      *     console.log(`sent event ${event}`);
      *   }
      *
      *   socket.onAnyOutgoing(catchAllListener);
      *
      *   // remove a specific listener
      *   socket.offAnyOutgoing(catchAllListener);
      *
      *   // or remove all listeners
      *   socket.offAnyOutgoing();
      * });
      *
      * @param listener - the catch-all listener
      */
    def offAnyOutgoing(): this.type = js.native
    def offAnyOutgoing(listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /**
      * Adds a listener that will be fired when any event is received. The event name is passed as the first argument to
      * the callback.
      *
      * @example
      * io.on("connection", (socket) => {
      *   socket.onAny((event, ...args) => {
      *     console.log(`got event ${event}`);
      *   });
      * });
      *
      * @param listener
      */
    def onAny(listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /**
      * Adds a listener that will be fired when any event is sent. The event name is passed as the first argument to
      * the callback.
      *
      * Note: acknowledgements sent to the client are not included.
      *
      * @example
      * io.on("connection", (socket) => {
      *   socket.onAnyOutgoing((event, ...args) => {
      *     console.log(`sent event ${event}`);
      *   });
      * });
      *
      * @param listener
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
      */
    def prependAny(listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /**
      * Adds a listener that will be fired when any event is emitted. The event name is passed as the first argument to the
      * callback. The listener is added to the beginning of the listeners array.
      *
      * @example
      * io.on("connection", (socket) => {
      *   socket.prependAnyOutgoing((event, ...args) => {
      *     console.log(`sent event ${event}`);
      *   });
      * });
      *
      * @param listener
      */
    def prependAnyOutgoing(listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /**
      * @private
      */
    /* private */ var registerAckCallback: Any = js.native
    
    /**
      * A reference to the request that originated the underlying Engine.IO Socket.
      */
    def request: IncomingMessage = js.native
    
    /**
      * Returns the rooms the socket is currently in.
      *
      * @example
      * io.on("connection", (socket) => {
      *   console.log(socket.rooms); // Set { <socket.id> }
      *
      *   socket.join("room1");
      *
      *   console.log(socket.rooms); // Set { <socket.id>, "room1" }
      * });
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
      * This method mimics the WebSocket.send() method.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/WebSocket/send
      *
      * @example
      * io.on("connection", (socket) => {
      *   socket.send("hello");
      *
      *   // this is equivalent to
      *   socket.emit("message", "hello");
      * });
      *
      * @return self
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
      * @example
      * io.on("connection", (socket) => {
      *   socket.timeout(5000).emit("my-event", (err) => {
      *     if (err) {
      *       // the client did not acknowledge the event in the given delay
      *     }
      *   });
      * });
      *
      * @returns self
      */
    def timeout(timeout: Double): this.type = js.native
    
    def to(room: js.Array[Room]): BroadcastOperator[EmitEvents, SocketData] = js.native
    /**
      * Targets a room when broadcasting.
      *
      * @example
      * io.on("connection", (socket) => {
      *   // the “foo” event will be broadcast to all connected clients in the “room-101” room, except this socket
      *   socket.to("room-101").emit("foo", "bar");
      *
      *   // the code above is equivalent to:
      *   io.to("room-101").except(socket.id).emit("foo", "bar");
      *
      *   // with an array of rooms (a client will be notified at most once)
      *   socket.to(["room-101", "room-102"]).emit("foo", "bar");
      *
      *   // with multiple chained calls
      *   socket.to("room-101").to("room-102").emit("foo", "bar");
      * });
      *
      * @param room - a room, or an array of rooms
      * @return a new {@link BroadcastOperator} instance for chaining
      */
    def to(room: Room): BroadcastOperator[EmitEvents, SocketData] = js.native
    
    /**
      * Sets up socket middleware.
      *
      * @example
      * io.on("connection", (socket) => {
      *   socket.use(([event, ...args], next) => {
      *     if (isUnauthorized(event)) {
      *       return next(new Error("unauthorized event"));
      *     }
      *     // do not forget to call next
      *     next();
      *   });
      *
      *   socket.on("error", (err) => {
      *     if (err && err.message === "unauthorized event") {
      *       socket.disconnect();
      *     }
      *   });
      * });
      *
      * @param {Function} fn - middleware function (event, next)
      * @return {Socket} self
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
      * @example
      * io.on("connection", (socket) => {
      *   socket.volatile.emit("hello"); // the client may or may not receive it
      * });
      *
      * @return {Socket} self
      */
    def volatile: this.type = js.native
    
    /**
      * Sends a `message` event. Alias of {@link send}.
      *
      * @return self
      */
    @JSName("write")
    def write_message(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventParams<EmitEvents, 'message'> is not an array type */ args: EventParams[EmitEvents, message]
    ): this.type = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.socketIo.socketIoStrings.`transport error`
    - typings.socketIo.socketIoStrings.`transport close`
    - typings.socketIo.socketIoStrings.`forced close`
    - typings.socketIo.socketIoStrings.`ping timeout`
    - typings.socketIo.socketIoStrings.`parse error`
    - typings.socketIo.socketIoStrings.`server shutting down`
    - typings.socketIo.socketIoStrings.`forced server close`
    - typings.socketIo.socketIoStrings.`client namespace disconnect`
    - typings.socketIo.socketIoStrings.`server namespace disconnect`
  */
  trait DisconnectReason extends StObject
  object DisconnectReason {
    
    inline def `client namespace disconnect`: typings.socketIo.socketIoStrings.`client namespace disconnect` = ("client namespace disconnect").asInstanceOf[typings.socketIo.socketIoStrings.`client namespace disconnect`]
    
    inline def `forced close`: typings.socketIo.socketIoStrings.`forced close` = ("forced close").asInstanceOf[typings.socketIo.socketIoStrings.`forced close`]
    
    inline def `forced server close`: typings.socketIo.socketIoStrings.`forced server close` = ("forced server close").asInstanceOf[typings.socketIo.socketIoStrings.`forced server close`]
    
    inline def `parse error`: typings.socketIo.socketIoStrings.`parse error` = ("parse error").asInstanceOf[typings.socketIo.socketIoStrings.`parse error`]
    
    inline def `ping timeout`: typings.socketIo.socketIoStrings.`ping timeout` = ("ping timeout").asInstanceOf[typings.socketIo.socketIoStrings.`ping timeout`]
    
    inline def `server namespace disconnect`: typings.socketIo.socketIoStrings.`server namespace disconnect` = ("server namespace disconnect").asInstanceOf[typings.socketIo.socketIoStrings.`server namespace disconnect`]
    
    inline def `server shutting down`: typings.socketIo.socketIoStrings.`server shutting down` = ("server shutting down").asInstanceOf[typings.socketIo.socketIoStrings.`server shutting down`]
    
    inline def `transport close`: typings.socketIo.socketIoStrings.`transport close` = ("transport close").asInstanceOf[typings.socketIo.socketIoStrings.`transport close`]
    
    inline def `transport error`: typings.socketIo.socketIoStrings.`transport error` = ("transport error").asInstanceOf[typings.socketIo.socketIoStrings.`transport error`]
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Handshake] (val x: Self) extends AnyVal {
      
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
    
    def disconnect(reason: DisconnectReason): Unit
    
    def disconnecting(reason: DisconnectReason): Unit
    
    def error(err: js.Error): Unit
  }
  object SocketReservedEventsMap {
    
    inline def apply(
      disconnect: DisconnectReason => Unit,
      disconnecting: DisconnectReason => Unit,
      error: js.Error => Unit
    ): SocketReservedEventsMap = {
      val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction1(disconnect), disconnecting = js.Any.fromFunction1(disconnecting), error = js.Any.fromFunction1(error))
      __obj.asInstanceOf[SocketReservedEventsMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SocketReservedEventsMap] (val x: Self) extends AnyVal {
      
      inline def setDisconnect(value: DisconnectReason => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction1(value))
      
      inline def setDisconnecting(value: DisconnectReason => Unit): Self = StObject.set(x, "disconnecting", js.Any.fromFunction1(value))
      
      inline def setError(value: js.Error => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    }
  }
}
