package typings.socketIo

import typings.socketIo.broadcastOperatorMod.BroadcastOperator
import typings.socketIo.broadcastOperatorMod.RemoteSocket
import typings.socketIo.clientMod.Client
import typings.socketIo.mod.Server
import typings.socketIo.socketIoStrings.message
import typings.socketIo.socketMod.Socket
import typings.socketIo.typedEventsMod.EventNames
import typings.socketIo.typedEventsMod.EventParams
import typings.socketIo.typedEventsMod.EventsMap
import typings.socketIo.typedEventsMod.StrictEventEmitter
import typings.socketIoAdapter.mod.Adapter
import typings.socketIoAdapter.mod.Room
import typings.socketIoAdapter.mod.SocketId
import typings.std.Error
import typings.std.Map
import typings.std.ReadonlySet
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespaceMod {
  
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
    def _add(client: Client[ListenEvents, EmitEvents, ServerSideEvents, Any], query: Any): Socket[ListenEvents, EmitEvents, ServerSideEvents, SocketData] = js.native
    def _add(
      client: Client[ListenEvents, EmitEvents, ServerSideEvents, Any],
      query: Any,
      fn: js.Function0[Unit]
    ): Socket[ListenEvents, EmitEvents, ServerSideEvents, SocketData] = js.native
    
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
      * @return self
      * @public
      */
    def allSockets(): js.Promise[Set[SocketId]] = js.native
    
    /**
      * Sets the compress flag.
      *
      * @param compress - if `true`, compresses the sending data
      * @return self
      * @public
      */
    def compress(compress: Boolean): BroadcastOperator[EmitEvents, SocketData] = js.native
    
    /**
      * Makes the matching socket instances disconnect
      *
      * @param close - whether to close the underlying connection
      * @public
      */
    def disconnectSockets(): Unit = js.native
    def disconnectSockets(close: Boolean): Unit = js.native
    
    def except(room: js.Array[Room]): BroadcastOperator[EmitEvents, SocketData] = js.native
    /**
      * Excludes a room when emitting.
      *
      * @param room
      * @return self
      * @public
      */
    def except(room: Room): BroadcastOperator[EmitEvents, SocketData] = js.native
    
    /**
      * Returns the matching socket instances
      *
      * @public
      */
    def fetchSockets(): js.Promise[js.Array[RemoteSocket[EmitEvents, SocketData]]] = js.native
    
    def in(room: js.Array[Room]): BroadcastOperator[EmitEvents, SocketData] = js.native
    /**
      * Targets a room when emitting.
      *
      * @param room
      * @return self
      * @public
      */
    def in(room: Room): BroadcastOperator[EmitEvents, SocketData] = js.native
    
    /**
      * Sets a modifier for a subsequent event emission that the event data will only be broadcast to the current node.
      *
      * @return self
      * @public
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
      * @return self
      * @public
      */
    @JSName("send")
    def send_message(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventParams<EmitEvents, 'message'> is not an array type */ args: EventParams[EmitEvents, message]
    ): this.type = js.native
    
    /** @private */
    val server: Server[ListenEvents, EmitEvents, ServerSideEvents, SocketData] = js.native
    
    /**
      * Emit a packet to other Socket.IO servers
      *
      * @param ev - the event name
      * @param args - an array of arguments, which may include an acknowledgement callback at the end
      * @public
      */
    def serverSideEmit[Ev /* <: EventNames[ServerSideEvents] */](
      ev: Ev,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventParams<ServerSideEvents, Ev> is not an array type */ args: EventParams[ServerSideEvents, Ev]
    ): Boolean = js.native
    
    val sockets: Map[SocketId, Socket[ListenEvents, EmitEvents, ServerSideEvents, SocketData]] = js.native
    
    def socketsJoin(room: js.Array[Room]): Unit = js.native
    /**
      * Makes the matching socket instances join the specified rooms
      *
      * @param room
      * @public
      */
    def socketsJoin(room: Room): Unit = js.native
    
    def socketsLeave(room: js.Array[Room]): Unit = js.native
    /**
      * Makes the matching socket instances leave the specified rooms
      *
      * @param room
      * @public
      */
    def socketsLeave(room: Room): Unit = js.native
    
    /**
      * Adds a timeout in milliseconds for the next operation
      *
      * <pre><code>
      *
      * io.timeout(1000).emit("some-event", (err, responses) => {
      *   // ...
      * });
      *
      * </pre></code>
      *
      * @param timeout
      */
    def timeout(timeout: Double): BroadcastOperator[EventsMap, Any] = js.native
    
    def to(room: js.Array[Room]): BroadcastOperator[EmitEvents, SocketData] = js.native
    /**
      * Targets a room when emitting.
      *
      * @param room
      * @return self
      * @public
      */
    def to(room: Room): BroadcastOperator[EmitEvents, SocketData] = js.native
    
    /**
      * Sets up namespace middleware.
      *
      * @return self
      * @public
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
      * @return self
      * @public
      */
    def volatile: BroadcastOperator[EmitEvents, SocketData] = js.native
    
    /**
      * Sends a `message` event to all clients.
      *
      * @return self
      * @public
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
    
    extension [Self <: ExtendedError](x: Self) {
      
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
    
    extension [Self <: NamespaceReservedEventsMap[?, ?, ?, ?], ListenEvents /* <: EventsMap */, EmitEvents /* <: EventsMap */, ServerSideEvents /* <: EventsMap */, SocketData](x: Self & (NamespaceReservedEventsMap[ListenEvents, EmitEvents, ServerSideEvents, SocketData])) {
      
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
    
    extension [Self <: ServerReservedEventsMap[?, ?, ?, ?], ListenEvents /* <: EventsMap */, EmitEvents /* <: EventsMap */, ServerSideEvents /* <: EventsMap */, SocketData](x: Self & (ServerReservedEventsMap[ListenEvents, EmitEvents, ServerSideEvents, SocketData])) {
      
      inline def setNew_namespace(value: Namespace[ListenEvents, EmitEvents, ServerSideEvents, SocketData] => Unit): Self = StObject.set(x, "new_namespace", js.Any.fromFunction1(value))
    }
  }
}
