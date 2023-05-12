package typings.socketIo

import typings.socketIo.distBroadcastOperatorMod.BroadcastOperator
import typings.socketIo.distBroadcastOperatorMod.RemoteSocket
import typings.socketIo.distClientMod.Client
import typings.socketIo.distSocketMod.Socket
import typings.socketIo.distTypedEventsMod.AllButLast
import typings.socketIo.distTypedEventsMod.DecorateAcknowledgementsWithTimeoutAndMultipleResponses
import typings.socketIo.distTypedEventsMod.EventNames
import typings.socketIo.distTypedEventsMod.EventParams
import typings.socketIo.distTypedEventsMod.EventsMap
import typings.socketIo.distTypedEventsMod.FirstArg
import typings.socketIo.distTypedEventsMod.Last
import typings.socketIo.distTypedEventsMod.SecondArg
import typings.socketIo.distTypedEventsMod.StrictEventEmitter
import typings.socketIo.mod.Server
import typings.socketIo.socketIoStrings.message
import typings.socketIoAdapter.mod.Adapter
import typings.socketIoAdapter.mod.Room
import typings.socketIoAdapter.mod.SocketId
import typings.std.Error
import typings.std.Map
import typings.std.ReadonlySet
import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNamespaceMod {
  
  @JSImport("socket.io/dist/namespace", "Namespace")
  @js.native
  open class Namespace[ListenEvents /* <: EventsMap */, EmitEvents /* <: EventsMap */, ServerSideEvents /* <: EventsMap */, SocketData] protected () extends StrictEventEmitter[
          ServerSideEvents, 
          EmitEvents, 
          NamespaceReservedEventsMap[ListenEvents, EmitEvents, ServerSideEvents, SocketData]
        ] {
    /**
      * Namespace constructor.
      *
      * @param server instance
      * @param name
      */
    def this(server: Server[ListenEvents, EmitEvents, ServerSideEvents, SocketData], name: String) = this()
    
    /**
      * Adds a new client.
      *
      * @return {Socket}
      * @private
      */
    def _add(
      client: Client[ListenEvents, EmitEvents, ServerSideEvents, Any],
      auth: Record[String, Any],
      fn: js.Function1[/* socket */ Socket[ListenEvents, EmitEvents, ServerSideEvents, SocketData], Unit]
    ): Any = js.native
    
    /* private */ var _createSocket: Any = js.native
    
    /* private */ var _doConnect: Any = js.native
    
    /** @private */
    var _fns: js.Array[
        js.Function2[
          /* socket */ Socket[ListenEvents, EmitEvents, ServerSideEvents, SocketData], 
          /* next */ js.Function1[/* err */ js.UndefOr[ExtendedError], Unit], 
          Unit
        ]
      ] = js.native
    
    /** @private */
    var _ids: Double = js.native
    
    /**
      * Initializes the `Adapter` for this nsp.
      * Run upon changing adapter by `Server#adapter`
      * in addition to the constructor.
      *
      * @private
      */
    def _initAdapter(): Unit = js.native
    
    /**
      * Called when a packet is received from another Socket.IO server
      *
      * @param args - an array of arguments, which may include an acknowledgement callback at the end
      *
      * @private
      */
    def _onServerSideEmit(args: Array[String | Any]): Unit = js.native
    
    /**
      * Removes a client. Called by each `Socket`.
      *
      * @private
      */
    def _remove(socket: Socket[ListenEvents, EmitEvents, ServerSideEvents, SocketData]): Unit = js.native
    
    var adapter: Adapter = js.native
    
    /**
      * Gets a list of clients.
      *
      * @deprecated this method will be removed in the next major release, please use {@link Namespace#serverSideEmit} or
      * {@link Namespace#fetchSockets} instead.
      */
    def allSockets(): js.Promise[Set[SocketId]] = js.native
    
    /**
      * Sets the compress flag.
      *
      * @example
      * const myNamespace = io.of("/my-namespace");
      *
      * myNamespace.compress(false).emit("hello");
      *
      * @param compress - if `true`, compresses the sending data
      * @return self
      */
    def compress(compress: Boolean): BroadcastOperator[EmitEvents, SocketData] = js.native
    
    /**
      * Makes the matching socket instances disconnect.
      *
      * Note: this method also works within a cluster of multiple Socket.IO servers, with a compatible {@link Adapter}.
      *
      * @example
      * const myNamespace = io.of("/my-namespace");
      *
      * // make all socket instances disconnect (the connections might be kept alive for other namespaces)
      * myNamespace.disconnectSockets();
      *
      * // make all socket instances in the "room1" room disconnect and close the underlying connections
      * myNamespace.in("room1").disconnectSockets(true);
      *
      * @param close - whether to close the underlying connection
      */
    def disconnectSockets(): Unit = js.native
    def disconnectSockets(close: Boolean): Unit = js.native
    
    /**
      * Emits an event and waits for an acknowledgement from all clients.
      *
      * @example
      * const myNamespace = io.of("/my-namespace");
      *
      * try {
      *   const responses = await myNamespace.timeout(1000).emitWithAck("some-event");
      *   console.log(responses); // one response per client
      * } catch (e) {
      *   // some clients did not acknowledge the event in the given delay
      * }
      *
      * @return a Promise that will be fulfilled when all clients have acknowledged the event
      */
    def emitWithAck[Ev /* <: EventNames[EmitEvents] */](
      ev: Ev,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type AllButLast<EventParams<EmitEvents, Ev>> is not an array type */ args: AllButLast[EventParams[EmitEvents, Ev]]
    ): js.Promise[SecondArg[Last[EventParams[EmitEvents, Ev]]]] = js.native
    
    def except(room: js.Array[Room]): BroadcastOperator[EmitEvents, SocketData] = js.native
    /**
      * Excludes a room when emitting.
      *
      * @example
      * const myNamespace = io.of("/my-namespace");
      *
      * // the "foo" event will be broadcast to all connected clients, except the ones that are in the "room-101" room
      * myNamespace.except("room-101").emit("foo", "bar");
      *
      * // with an array of rooms
      * myNamespace.except(["room-101", "room-102"]).emit("foo", "bar");
      *
      * // with multiple chained calls
      * myNamespace.except("room-101").except("room-102").emit("foo", "bar");
      *
      * @param room - a room, or an array of rooms
      * @return a new {@link BroadcastOperator} instance for chaining
      */
    def except(room: Room): BroadcastOperator[EmitEvents, SocketData] = js.native
    
    /**
      * Returns the matching socket instances.
      *
      * Note: this method also works within a cluster of multiple Socket.IO servers, with a compatible {@link Adapter}.
      *
      * @example
      * const myNamespace = io.of("/my-namespace");
      *
      * // return all Socket instances
      * const sockets = await myNamespace.fetchSockets();
      *
      * // return all Socket instances in the "room1" room
      * const sockets = await myNamespace.in("room1").fetchSockets();
      *
      * for (const socket of sockets) {
      *   console.log(socket.id);
      *   console.log(socket.handshake);
      *   console.log(socket.rooms);
      *   console.log(socket.data);
      *
      *   socket.emit("hello");
      *   socket.join("room1");
      *   socket.leave("room2");
      *   socket.disconnect();
      * }
      */
    def fetchSockets(): js.Promise[js.Array[RemoteSocket[EmitEvents, SocketData]]] = js.native
    
    def in(room: js.Array[Room]): BroadcastOperator[EmitEvents, SocketData] = js.native
    /**
      * Targets a room when emitting. Similar to `to()`, but might feel clearer in some cases:
      *
      * @example
      * const myNamespace = io.of("/my-namespace");
      *
      * // disconnect all clients in the "room-101" room
      * myNamespace.in("room-101").disconnectSockets();
      *
      * @param room - a room, or an array of rooms
      * @return a new {@link BroadcastOperator} instance for chaining
      */
    def in(room: Room): BroadcastOperator[EmitEvents, SocketData] = js.native
    
    /**
      * Sets a modifier for a subsequent event emission that the event data will only be broadcast to the current node.
      *
      * @example
      * const myNamespace = io.of("/my-namespace");
      *
      * // the “foo” event will be broadcast to all connected clients on this node
      * myNamespace.local.emit("foo", "bar");
      *
      * @return a new {@link BroadcastOperator} instance for chaining
      */
    def local: BroadcastOperator[EmitEvents, SocketData] = js.native
    
    val name: String = js.native
    
    /**
      * Executes the middleware for an incoming client.
      *
      * @param socket - the socket that will get added
      * @param fn - last fn call in the middleware
      * @private
      */
    /* private */ var run: Any = js.native
    
    /**
      * Sends a `message` event to all clients.
      *
      * This method mimics the WebSocket.send() method.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/WebSocket/send
      *
      * @example
      * const myNamespace = io.of("/my-namespace");
      *
      * myNamespace.send("hello");
      *
      * // this is equivalent to
      * myNamespace.emit("message", "hello");
      *
      * @return self
      */
    @JSName("send")
    def send_message(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventParams<EmitEvents, 'message'> is not an array type */ args: EventParams[EmitEvents, message]
    ): this.type = js.native
    
    /** @private */
    val server: Server[ListenEvents, EmitEvents, ServerSideEvents, SocketData] = js.native
    
    /**
      * Sends a message to the other Socket.IO servers of the cluster.
      *
      * @example
      * const myNamespace = io.of("/my-namespace");
      *
      * myNamespace.serverSideEmit("hello", "world");
      *
      * myNamespace.on("hello", (arg1) => {
      *   console.log(arg1); // prints "world"
      * });
      *
      * // acknowledgements (without binary content) are supported too:
      * myNamespace.serverSideEmit("ping", (err, responses) => {
      *  if (err) {
      *     // some servers did not acknowledge the event in the given delay
      *   } else {
      *     console.log(responses); // one response per server (except the current one)
      *   }
      * });
      *
      * myNamespace.on("ping", (cb) => {
      *   cb("pong");
      * });
      *
      * @param ev - the event name
      * @param args - an array of arguments, which may include an acknowledgement callback at the end
      */
    def serverSideEmit[Ev /* <: EventNames[ServerSideEvents] */](
      ev: Ev,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventParams<DecorateAcknowledgementsWithTimeoutAndMultipleResponses<ServerSideEvents>, Ev> is not an array type */ args: EventParams[DecorateAcknowledgementsWithTimeoutAndMultipleResponses[ServerSideEvents], Ev]
    ): Boolean = js.native
    
    /**
      * Sends a message and expect an acknowledgement from the other Socket.IO servers of the cluster.
      *
      * @example
      * const myNamespace = io.of("/my-namespace");
      *
      * try {
      *   const responses = await myNamespace.serverSideEmitWithAck("ping");
      *   console.log(responses); // one response per server (except the current one)
      * } catch (e) {
      *   // some servers did not acknowledge the event in the given delay
      * }
      *
      * @param ev - the event name
      * @param args - an array of arguments
      *
      * @return a Promise that will be fulfilled when all servers have acknowledged the event
      */
    def serverSideEmitWithAck[Ev /* <: EventNames[ServerSideEvents] */](
      ev: Ev,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type AllButLast<EventParams<ServerSideEvents, Ev>> is not an array type */ args: AllButLast[EventParams[ServerSideEvents, Ev]]
    ): js.Promise[js.Array[FirstArg[Last[EventParams[ServerSideEvents, Ev]]]]] = js.native
    
    val sockets: Map[SocketId, Socket[ListenEvents, EmitEvents, ServerSideEvents, SocketData]] = js.native
    
    def socketsJoin(room: js.Array[Room]): Unit = js.native
    /**
      * Makes the matching socket instances join the specified rooms.
      *
      * Note: this method also works within a cluster of multiple Socket.IO servers, with a compatible {@link Adapter}.
      *
      * @example
      * const myNamespace = io.of("/my-namespace");
      *
      * // make all socket instances join the "room1" room
      * myNamespace.socketsJoin("room1");
      *
      * // make all socket instances in the "room1" room join the "room2" and "room3" rooms
      * myNamespace.in("room1").socketsJoin(["room2", "room3"]);
      *
      * @param room - a room, or an array of rooms
      */
    def socketsJoin(room: Room): Unit = js.native
    
    def socketsLeave(room: js.Array[Room]): Unit = js.native
    /**
      * Makes the matching socket instances leave the specified rooms.
      *
      * Note: this method also works within a cluster of multiple Socket.IO servers, with a compatible {@link Adapter}.
      *
      * @example
      * const myNamespace = io.of("/my-namespace");
      *
      * // make all socket instances leave the "room1" room
      * myNamespace.socketsLeave("room1");
      *
      * // make all socket instances in the "room1" room leave the "room2" and "room3" rooms
      * myNamespace.in("room1").socketsLeave(["room2", "room3"]);
      *
      * @param room - a room, or an array of rooms
      */
    def socketsLeave(room: Room): Unit = js.native
    
    /**
      * Adds a timeout in milliseconds for the next operation.
      *
      * @example
      * const myNamespace = io.of("/my-namespace");
      *
      * myNamespace.timeout(1000).emit("some-event", (err, responses) => {
      *   if (err) {
      *     // some clients did not acknowledge the event in the given delay
      *   } else {
      *     console.log(responses); // one response per client
      *   }
      * });
      *
      * @param timeout
      */
    def timeout(timeout: Double): BroadcastOperator[DecorateAcknowledgementsWithTimeoutAndMultipleResponses[EmitEvents], SocketData] = js.native
    
    def to(room: js.Array[Room]): BroadcastOperator[EmitEvents, SocketData] = js.native
    /**
      * Targets a room when emitting.
      *
      * @example
      * const myNamespace = io.of("/my-namespace");
      *
      * // the “foo” event will be broadcast to all connected clients in the “room-101” room
      * myNamespace.to("room-101").emit("foo", "bar");
      *
      * // with an array of rooms (a client will be notified at most once)
      * myNamespace.to(["room-101", "room-102"]).emit("foo", "bar");
      *
      * // with multiple chained calls
      * myNamespace.to("room-101").to("room-102").emit("foo", "bar");
      *
      * @param room - a room, or an array of rooms
      * @return a new {@link BroadcastOperator} instance for chaining
      */
    def to(room: Room): BroadcastOperator[EmitEvents, SocketData] = js.native
    
    /**
      * Registers a middleware, which is a function that gets executed for every incoming {@link Socket}.
      *
      * @example
      * const myNamespace = io.of("/my-namespace");
      *
      * myNamespace.use((socket, next) => {
      *   // ...
      *   next();
      * });
      *
      * @param fn - the middleware function
      */
    def use(
      fn: js.Function2[
          /* socket */ Socket[ListenEvents, EmitEvents, ServerSideEvents, SocketData], 
          /* next */ js.Function1[/* err */ js.UndefOr[ExtendedError], Unit], 
          Unit
        ]
    ): this.type = js.native
    
    /**
      * Sets a modifier for a subsequent event emission that the event data may be lost if the client is not ready to
      * receive messages (because of network slowness or other issues, or because they’re connected through long polling
      * and is in the middle of a request-response cycle).
      *
      * @example
      * const myNamespace = io.of("/my-namespace");
      *
      * myNamespace.volatile.emit("hello"); // the clients may or may not receive it
      *
      * @return self
      */
    def volatile: BroadcastOperator[EmitEvents, SocketData] = js.native
    
    /**
      * Sends a `message` event to all clients. Sends a `message` event. Alias of {@link send}.
      *
      * @return self
      */
    @JSName("write")
    def write_message(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventParams<EmitEvents, 'message'> is not an array type */ args: EventParams[EmitEvents, message]
    ): this.type = js.native
  }
  
  @JSImport("socket.io/dist/namespace", "RESERVED_EVENTS")
  @js.native
  val RESERVED_EVENTS: ReadonlySet[String | js.Symbol] = js.native
  
  trait ExtendedError
    extends StObject
       with Error {
    
    var data: js.UndefOr[Any] = js.undefined
  }
  object ExtendedError {
    
    inline def apply(message: String, name: String): ExtendedError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendedError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExtendedError] (val x: Self) extends AnyVal {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    }
  }
  
  trait NamespaceReservedEventsMap[ListenEvents /* <: EventsMap */, EmitEvents /* <: EventsMap */, ServerSideEvents /* <: EventsMap */, SocketData] extends StObject {
    
    def connect(socket: Socket[ListenEvents, EmitEvents, ServerSideEvents, SocketData]): Unit
    
    def connection(socket: Socket[ListenEvents, EmitEvents, ServerSideEvents, SocketData]): Unit
  }
  object NamespaceReservedEventsMap {
    
    inline def apply[ListenEvents /* <: EventsMap */, EmitEvents /* <: EventsMap */, ServerSideEvents /* <: EventsMap */, SocketData](
      connect: Socket[ListenEvents, EmitEvents, ServerSideEvents, SocketData] => Unit,
      connection: Socket[ListenEvents, EmitEvents, ServerSideEvents, SocketData] => Unit
    ): NamespaceReservedEventsMap[ListenEvents, EmitEvents, ServerSideEvents, SocketData] = {
      val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), connection = js.Any.fromFunction1(connection))
      __obj.asInstanceOf[NamespaceReservedEventsMap[ListenEvents, EmitEvents, ServerSideEvents, SocketData]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NamespaceReservedEventsMap[?, ?, ?, ?], ListenEvents /* <: EventsMap */, EmitEvents /* <: EventsMap */, ServerSideEvents /* <: EventsMap */, SocketData] (val x: Self & (NamespaceReservedEventsMap[ListenEvents, EmitEvents, ServerSideEvents, SocketData])) extends AnyVal {
      
      inline def setConnect(value: Socket[ListenEvents, EmitEvents, ServerSideEvents, SocketData] => Unit): Self = StObject.set(x, "connect", js.Any.fromFunction1(value))
      
      inline def setConnection(value: Socket[ListenEvents, EmitEvents, ServerSideEvents, SocketData] => Unit): Self = StObject.set(x, "connection", js.Any.fromFunction1(value))
    }
  }
  
  trait ServerReservedEventsMap[ListenEvents /* <: EventsMap */, EmitEvents /* <: EventsMap */, ServerSideEvents /* <: EventsMap */, SocketData]
    extends StObject
       with NamespaceReservedEventsMap[ListenEvents, EmitEvents, ServerSideEvents, SocketData] {
    
    def new_namespace(namespace: Namespace[ListenEvents, EmitEvents, ServerSideEvents, SocketData]): Unit
  }
  object ServerReservedEventsMap {
    
    inline def apply[ListenEvents /* <: EventsMap */, EmitEvents /* <: EventsMap */, ServerSideEvents /* <: EventsMap */, SocketData](
      connect: Socket[ListenEvents, EmitEvents, ServerSideEvents, SocketData] => Unit,
      connection: Socket[ListenEvents, EmitEvents, ServerSideEvents, SocketData] => Unit,
      new_namespace: Namespace[ListenEvents, EmitEvents, ServerSideEvents, SocketData] => Unit
    ): ServerReservedEventsMap[ListenEvents, EmitEvents, ServerSideEvents, SocketData] = {
      val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), connection = js.Any.fromFunction1(connection), new_namespace = js.Any.fromFunction1(new_namespace))
      __obj.asInstanceOf[ServerReservedEventsMap[ListenEvents, EmitEvents, ServerSideEvents, SocketData]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServerReservedEventsMap[?, ?, ?, ?], ListenEvents /* <: EventsMap */, EmitEvents /* <: EventsMap */, ServerSideEvents /* <: EventsMap */, SocketData] (val x: Self & (ServerReservedEventsMap[ListenEvents, EmitEvents, ServerSideEvents, SocketData])) extends AnyVal {
      
      inline def setNew_namespace(value: Namespace[ListenEvents, EmitEvents, ServerSideEvents, SocketData] => Unit): Self = StObject.set(x, "new_namespace", js.Any.fromFunction1(value))
    }
  }
}
