package typings.socketIo

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.engineIo.buildServerMod.AttachOptions
import typings.node.http2Mod.Http2SecureServer
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.socketIo.anon.PartialServerOptions
import typings.socketIo.anon.Typeofparser
import typings.socketIo.distBroadcastOperatorMod.SocketDetails
import typings.socketIo.distClientMod.Client
import typings.socketIo.distNamespaceMod.ExtendedError
import typings.socketIo.distNamespaceMod.ServerReservedEventsMap
import typings.socketIo.distTypedEventsMod.DefaultEventsMap
import typings.socketIo.distTypedEventsMod.EventNames
import typings.socketIo.distTypedEventsMod.EventParams
import typings.socketIo.distTypedEventsMod.EventsMap
import typings.socketIo.distTypedEventsMod.StrictEventEmitter
import typings.socketIo.socketIoBooleans.`false`
import typings.socketIo.socketIoStrings.message
import typings.socketIoAdapter.mod.Adapter
import typings.socketIoAdapter.mod.BroadcastFlags
import typings.socketIoAdapter.mod.Room
import typings.socketIoAdapter.mod.SocketId
import typings.socketIoParser.mod.Encoder
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("socket.io", "BroadcastOperator")
  @js.native
  open class BroadcastOperator[EmitEvents /* <: EventsMap */, SocketData] protected ()
    extends typings.socketIo.distBroadcastOperatorMod.BroadcastOperator[EmitEvents, SocketData] {
    def this(adapter: Adapter) = this()
    def this(adapter: Adapter, rooms: Set[Room]) = this()
    def this(adapter: Adapter, rooms: Unit, exceptRooms: Set[Room]) = this()
    def this(adapter: Adapter, rooms: Set[Room], exceptRooms: Set[Room]) = this()
    def this(adapter: Adapter, rooms: Unit, exceptRooms: Unit, flags: BroadcastFlags) = this()
    def this(adapter: Adapter, rooms: Unit, exceptRooms: Set[Room], flags: BroadcastFlags) = this()
    def this(adapter: Adapter, rooms: Set[Room], exceptRooms: Unit, flags: BroadcastFlags) = this()
    def this(adapter: Adapter, rooms: Set[Room], exceptRooms: Set[Room], flags: BroadcastFlags) = this()
  }
  
  @JSImport("socket.io", "Namespace")
  @js.native
  open class Namespace[ListenEvents /* <: EventsMap */, EmitEvents /* <: EventsMap */, ServerSideEvents /* <: EventsMap */, SocketData] protected ()
    extends typings.socketIo.distNamespaceMod.Namespace[ListenEvents, EmitEvents, ServerSideEvents, SocketData] {
    /**
      * Namespace constructor.
      *
      * @param server instance
      * @param name
      */
    def this(server: Server[ListenEvents, EmitEvents, ServerSideEvents, SocketData], name: String) = this()
  }
  
  @JSImport("socket.io", "RemoteSocket")
  @js.native
  open class RemoteSocket[EmitEvents /* <: EventsMap */, SocketData] protected ()
    extends typings.socketIo.distBroadcastOperatorMod.RemoteSocket[EmitEvents, SocketData] {
    def this(adapter: Adapter, details: SocketDetails[SocketData]) = this()
  }
  
  @JSImport("socket.io", "Server")
  @js.native
  /**
    * Server constructor.
    *
    * @param srv http server, port, or options
    * @param [opts]
    */
  open class Server[ListenEvents /* <: EventsMap */, EmitEvents /* <: EventsMap */, ServerSideEvents /* <: EventsMap */, SocketData] () extends StrictEventEmitter[
          ServerSideEvents, 
          EmitEvents, 
          ServerReservedEventsMap[ListenEvents, EmitEvents, ServerSideEvents, SocketData]
        ] {
    def this(opts: PartialServerOptions) = this()
    def this(srv: Double) = this()
    def this(srv: Http2SecureServer) = this()
    def this(srv: typings.node.httpMod.Server[
            Instantiable1[/* socket */ typings.node.nodeColonnetMod.Socket, IncomingMessage], 
            Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
              ServerResponse[IncomingMessage]
            ]
          ]) = this()
    def this(srv: typings.node.httpsMod.Server[
            Instantiable1[
              /* socket */ typings.node.nodeColonnetMod.Socket, 
              typings.node.nodeColonhttpMod.IncomingMessage
            ], 
            Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
              typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
            ]
          ]) = this()
    def this(srv: Double, opts: PartialServerOptions) = this()
    def this(srv: Unit, opts: PartialServerOptions) = this()
    def this(srv: Http2SecureServer, opts: PartialServerOptions) = this()
    def this(
      srv: typings.node.httpMod.Server[
            Instantiable1[/* socket */ typings.node.nodeColonnetMod.Socket, IncomingMessage], 
            Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
              ServerResponse[IncomingMessage]
            ]
          ],
      opts: PartialServerOptions
    ) = this()
    def this(
      srv: typings.node.httpsMod.Server[
            Instantiable1[
              /* socket */ typings.node.nodeColonnetMod.Socket, 
              typings.node.nodeColonhttpMod.IncomingMessage
            ], 
            Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
              typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
            ]
          ],
      opts: PartialServerOptions
    ) = this()
    def this(srv: PartialServerOptions, opts: PartialServerOptions) = this()
    
    /* private */ var _adapter: Any = js.native
    
    /**
      * Executes the middleware for an incoming namespace not already created on the server.
      *
      * @param name - name of incoming namespace
      * @param auth - the auth parameters
      * @param fn - callback
      *
      * @private
      */
    @JSName("_checkNamespace")
    def _checkNamespace_false(
      name: String,
      auth: StringDictionary[Any],
      fn: js.Function1[
          /* nsp */ (typings.socketIo.distNamespaceMod.Namespace[ListenEvents, EmitEvents, ServerSideEvents, SocketData]) | `false`, 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * @private
      */
    var _connectTimeout: Double = js.native
    
    /**
      * @private
      */
    var _nsps: Map[
        String, 
        typings.socketIo.distNamespaceMod.Namespace[ListenEvents, EmitEvents, ServerSideEvents, SocketData]
      ] = js.native
    
    /** @private */
    val _parser: Typeofparser = js.native
    
    /* private */ var _path: Any = js.native
    
    /* private */ var _serveClient: Any = js.native
    
    /**
      * Sets the adapter for rooms.
      *
      * @param v pathname
      * @return self when setting or value when getting
      */
    def adapter(): js.UndefOr[AdapterConstructor] = js.native
    def adapter(v: AdapterConstructor): this.type = js.native
    
    /**
      * Gets a list of socket ids.
      *
      * @deprecated this method will be removed in the next major release, please use {@link Server#serverSideEmit} or
      * {@link Server#fetchSockets} instead.
      */
    def allSockets(): js.Promise[Set[SocketId]] = js.native
    
    def attach(srv: Double): this.type = js.native
    def attach(srv: Double, opts: PartialServerOptions): this.type = js.native
    def attach(srv: Http2SecureServer): this.type = js.native
    def attach(srv: Http2SecureServer, opts: PartialServerOptions): this.type = js.native
    /**
      * Attaches socket.io to a server or port.
      *
      * @param srv - server or port
      * @param opts - options passed to engine.io
      * @return self
      */
    def attach(
      srv: typings.node.httpMod.Server[
          Instantiable1[/* socket */ typings.node.nodeColonnetMod.Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ]
    ): this.type = js.native
    def attach(
      srv: typings.node.httpMod.Server[
          Instantiable1[/* socket */ typings.node.nodeColonnetMod.Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ],
      opts: PartialServerOptions
    ): this.type = js.native
    def attach(
      srv: typings.node.httpsMod.Server[
          Instantiable1[
            /* socket */ typings.node.nodeColonnetMod.Socket, 
            typings.node.nodeColonhttpMod.IncomingMessage
          ], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
          ]
        ]
    ): this.type = js.native
    def attach(
      srv: typings.node.httpsMod.Server[
          Instantiable1[
            /* socket */ typings.node.nodeColonnetMod.Socket, 
            typings.node.nodeColonhttpMod.IncomingMessage
          ], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
          ]
        ],
      opts: PartialServerOptions
    ): this.type = js.native
    
    def attachApp(app: Any): Unit = js.native
    def attachApp(app: Any, opts: PartialServerOptions): Unit = js.native
    
    /**
      * Attaches the static file serving.
      *
      * @param srv http server
      * @private
      */
    /* private */ var attachServe: Any = js.native
    
    /**
      * Binds socket.io to an engine.io instance.
      *
      * @param {engine.Server} engine engine.io (or compatible) server
      * @return self
      */
    def bind(engine: Any): this.type = js.native
    
    /* private */ var clientPathRegex: Any = js.native
    
    /**
      * Closes server connection
      *
      * @param [fn] optional, called as `fn([err])` on error OR all conns closed
      */
    def close(): Unit = js.native
    def close(fn: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    /**
      * Sets the compress flag.
      *
      * @example
      * io.compress(false).emit("hello");
      *
      * @param compress - if `true`, compresses the sending data
      * @return a new {@link BroadcastOperator} instance for chaining
      */
    def compress(compress: Boolean): typings.socketIo.distBroadcastOperatorMod.BroadcastOperator[EmitEvents, SocketData] = js.native
    
    def connectTimeout(): this.type | Double = js.native
    /**
      * Set the delay after which a client without namespace is closed
      * @param v
      */
    def connectTimeout(v: Double): this.type = js.native
    @JSName("connectTimeout")
    def connectTimeout_Double(): Double = js.native
    @JSName("connectTimeout")
    def connectTimeout_Union(v: Double): this.type | Double = js.native
    
    /**
      * Makes the matching socket instances disconnect.
      *
      * Note: this method also works within a cluster of multiple Socket.IO servers, with a compatible {@link Adapter}.
      *
      * @example
      * // make all socket instances disconnect (the connections might be kept alive for other namespaces)
      * io.disconnectSockets();
      *
      * // make all socket instances in the "room1" room disconnect and close the underlying connections
      * io.in("room1").disconnectSockets(true);
      *
      * @param close - whether to close the underlying connection
      */
    def disconnectSockets(): Unit = js.native
    def disconnectSockets(close: Boolean): Unit = js.native
    
    /* private */ var eio: Any = js.native
    
    /** @private */
    val encoder: Encoder = js.native
    
    /**
      * A reference to the underlying Engine.IO server.
      *
      * @example
      * const clientsCount = io.engine.clientsCount;
      *
      */
    var engine: Any = js.native
    
    def except(room: js.Array[Room]): typings.socketIo.distBroadcastOperatorMod.BroadcastOperator[EmitEvents, SocketData] = js.native
    /**
      * Excludes a room when emitting.
      *
      * @example
      * // the "foo" event will be broadcast to all connected clients, except the ones that are in the "room-101" room
      * io.except("room-101").emit("foo", "bar");
      *
      * // with an array of rooms
      * io.except(["room-101", "room-102"]).emit("foo", "bar");
      *
      * // with multiple chained calls
      * io.except("room-101").except("room-102").emit("foo", "bar");
      *
      * @param room - a room, or an array of rooms
      * @return a new {@link BroadcastOperator} instance for chaining
      */
    def except(room: Room): typings.socketIo.distBroadcastOperatorMod.BroadcastOperator[EmitEvents, SocketData] = js.native
    
    /**
      * Returns the matching socket instances.
      *
      * Note: this method also works within a cluster of multiple Socket.IO servers, with a compatible {@link Adapter}.
      *
      * @example
      * // return all Socket instances
      * const sockets = await io.fetchSockets();
      *
      * // return all Socket instances in the "room1" room
      * const sockets = await io.in("room1").fetchSockets();
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
    def fetchSockets(): js.Promise[
        js.Array[typings.socketIo.distBroadcastOperatorMod.RemoteSocket[EmitEvents, SocketData]]
      ] = js.native
    
    /* private */ var httpServer: Any = js.native
    
    def in(room: js.Array[Room]): typings.socketIo.distBroadcastOperatorMod.BroadcastOperator[EmitEvents, SocketData] = js.native
    /**
      * Targets a room when emitting. Similar to `to()`, but might feel clearer in some cases:
      *
      * @example
      * // disconnect all clients in the "room-101" room
      * io.in("room-101").disconnectSockets();
      *
      * @param room - a room, or an array of rooms
      * @return a new {@link BroadcastOperator} instance for chaining
      */
    def in(room: Room): typings.socketIo.distBroadcastOperatorMod.BroadcastOperator[EmitEvents, SocketData] = js.native
    
    /**
      * Initialize engine
      *
      * @param srv - the server to attach to
      * @param opts - options passed to engine.io
      * @private
      */
    /* private */ var initEngine: Any = js.native
    
    def listen(srv: Double): this.type = js.native
    def listen(srv: Double, opts: PartialServerOptions): this.type = js.native
    def listen(srv: Http2SecureServer): this.type = js.native
    def listen(srv: Http2SecureServer, opts: PartialServerOptions): this.type = js.native
    /**
      * Attaches socket.io to a server or port.
      *
      * @param srv - server or port
      * @param opts - options passed to engine.io
      * @return self
      */
    def listen(
      srv: typings.node.httpMod.Server[
          Instantiable1[/* socket */ typings.node.nodeColonnetMod.Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ]
    ): this.type = js.native
    def listen(
      srv: typings.node.httpMod.Server[
          Instantiable1[/* socket */ typings.node.nodeColonnetMod.Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ],
      opts: PartialServerOptions
    ): this.type = js.native
    def listen(
      srv: typings.node.httpsMod.Server[
          Instantiable1[
            /* socket */ typings.node.nodeColonnetMod.Socket, 
            typings.node.nodeColonhttpMod.IncomingMessage
          ], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
          ]
        ]
    ): this.type = js.native
    def listen(
      srv: typings.node.httpsMod.Server[
          Instantiable1[
            /* socket */ typings.node.nodeColonnetMod.Socket, 
            typings.node.nodeColonhttpMod.IncomingMessage
          ], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
          ]
        ],
      opts: PartialServerOptions
    ): this.type = js.native
    
    /**
      * Sets a modifier for a subsequent event emission that the event data will only be broadcast to the current node.
      *
      * @example
      * // the “foo” event will be broadcast to all connected clients on this node
      * io.local.emit("foo", "bar");
      *
      * @return a new {@link BroadcastOperator} instance for chaining
      */
    def local: typings.socketIo.distBroadcastOperatorMod.BroadcastOperator[EmitEvents, SocketData] = js.native
    
    /**
      * Looks up a namespace.
      *
      * @example
      * // with a simple string
      * const myNamespace = io.of("/my-namespace");
      *
      * // with a regex
      * const dynamicNsp = io.of(/^\/dynamic-\d+$/).on("connection", (socket) => {
      *   const namespace = socket.nsp; // newNamespace.name === "/dynamic-101"
      *
      *   // broadcast to all clients in the given sub-namespace
      *   namespace.emit("hello");
      * });
      *
      * @param name - nsp name
      * @param fn optional, nsp `connection` ev handler
      */
    def of(name: String): typings.socketIo.distNamespaceMod.Namespace[ListenEvents, EmitEvents, ServerSideEvents, SocketData] = js.native
    def of(
      name: String,
      fn: js.Function1[
          /* socket */ typings.socketIo.distSocketMod.Socket[ListenEvents, EmitEvents, ServerSideEvents, SocketData], 
          Unit
        ]
    ): typings.socketIo.distNamespaceMod.Namespace[ListenEvents, EmitEvents, ServerSideEvents, SocketData] = js.native
    def of(name: js.RegExp): typings.socketIo.distNamespaceMod.Namespace[ListenEvents, EmitEvents, ServerSideEvents, SocketData] = js.native
    def of(
      name: js.RegExp,
      fn: js.Function1[
          /* socket */ typings.socketIo.distSocketMod.Socket[ListenEvents, EmitEvents, ServerSideEvents, SocketData], 
          Unit
        ]
    ): typings.socketIo.distNamespaceMod.Namespace[ListenEvents, EmitEvents, ServerSideEvents, SocketData] = js.native
    def of(name: ParentNspNameMatchFn): typings.socketIo.distNamespaceMod.Namespace[ListenEvents, EmitEvents, ServerSideEvents, SocketData] = js.native
    def of(
      name: ParentNspNameMatchFn,
      fn: js.Function1[
          /* socket */ typings.socketIo.distSocketMod.Socket[ListenEvents, EmitEvents, ServerSideEvents, SocketData], 
          Unit
        ]
    ): typings.socketIo.distNamespaceMod.Namespace[ListenEvents, EmitEvents, ServerSideEvents, SocketData] = js.native
    
    /**
      * Called with each incoming transport connection.
      *
      * @param {engine.Socket} conn
      * @return self
      * @private
      */
    /* private */ var onconnection: Any = js.native
    
    /* private */ var opts: Any = js.native
    
    /* private */ var parentNsps: Any = js.native
    
    def path(): String = js.native
    /**
      * Sets the client serving path.
      *
      * @param {String} v pathname
      * @return {Server|String} self when setting or value when getting
      */
    def path(v: String): this.type = js.native
    @JSName("path")
    def path_Union(): this.type | String = js.native
    @JSName("path")
    def path_Union(v: String): this.type | String = js.native
    
    /**
      * Sends a `message` event to all clients.
      *
      * This method mimics the WebSocket.send() method.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/WebSocket/send
      *
      * @example
      * io.send("hello");
      *
      * // this is equivalent to
      * io.emit("message", "hello");
      *
      * @return self
      */
    @JSName("send")
    def send_message(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventParams<EmitEvents, 'message'> is not an array type */ args: EventParams[EmitEvents, message]
    ): this.type = js.native
    
    /**
      * Handles a request serving of client source and map
      *
      * @param req
      * @param res
      * @private
      */
    /* private */ var serve: Any = js.native
    
    def serveClient(): this.type | Boolean = js.native
    /**
      * Sets/gets whether client code is being served.
      *
      * @param v - whether to serve client code
      * @return self when setting or value when getting
      */
    def serveClient(v: Boolean): this.type = js.native
    @JSName("serveClient")
    def serveClient_Boolean(): Boolean = js.native
    @JSName("serveClient")
    def serveClient_Union(v: Boolean): this.type | Boolean = js.native
    
    /**
      * Sends a message to the other Socket.IO servers of the cluster.
      *
      * @example
      * io.serverSideEmit("hello", "world");
      *
      * io.on("hello", (arg1) => {
      *   console.log(arg1); // prints "world"
      * });
      *
      * // acknowledgements (without binary content) are supported too:
      * io.serverSideEmit("ping", (err, responses) => {
      *  if (err) {
      *     // some clients did not acknowledge the event in the given delay
      *   } else {
      *     console.log(responses); // one response per client
      *   }
      * });
      *
      * io.on("ping", (cb) => {
      *   cb("pong");
      * });
      *
      * @param ev - the event name
      * @param args - an array of arguments, which may include an acknowledgement callback at the end
      */
    def serverSideEmit[Ev /* <: EventNames[ServerSideEvents] */](
      ev: Ev,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventParams<ServerSideEvents, Ev> is not an array type */ args: EventParams[ServerSideEvents, Ev]
    ): Boolean = js.native
    
    val sockets: typings.socketIo.distNamespaceMod.Namespace[ListenEvents, EmitEvents, ServerSideEvents, SocketData] = js.native
    
    def socketsJoin(room: js.Array[Room]): Unit = js.native
    /**
      * Makes the matching socket instances join the specified rooms.
      *
      * Note: this method also works within a cluster of multiple Socket.IO servers, with a compatible {@link Adapter}.
      *
      * @example
      *
      * // make all socket instances join the "room1" room
      * io.socketsJoin("room1");
      *
      * // make all socket instances in the "room1" room join the "room2" and "room3" rooms
      * io.in("room1").socketsJoin(["room2", "room3"]);
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
      * // make all socket instances leave the "room1" room
      * io.socketsLeave("room1");
      *
      * // make all socket instances in the "room1" room leave the "room2" and "room3" rooms
      * io.in("room1").socketsLeave(["room2", "room3"]);
      *
      * @param room - a room, or an array of rooms
      */
    def socketsLeave(room: Room): Unit = js.native
    
    /**
      * Adds a timeout in milliseconds for the next operation.
      *
      * @example
      * io.timeout(1000).emit("some-event", (err, responses) => {
      *   if (err) {
      *     // some clients did not acknowledge the event in the given delay
      *   } else {
      *     console.log(responses); // one response per client
      *   }
      * });
      *
      * @param timeout
      */
    def timeout(timeout: Double): typings.socketIo.distBroadcastOperatorMod.BroadcastOperator[EmitEvents, SocketData] = js.native
    
    def to(room: js.Array[Room]): typings.socketIo.distBroadcastOperatorMod.BroadcastOperator[EmitEvents, SocketData] = js.native
    /**
      * Targets a room when emitting.
      *
      * @example
      * // the “foo” event will be broadcast to all connected clients in the “room-101” room
      * io.to("room-101").emit("foo", "bar");
      *
      * // with an array of rooms (a client will be notified at most once)
      * io.to(["room-101", "room-102"]).emit("foo", "bar");
      *
      * // with multiple chained calls
      * io.to("room-101").to("room-102").emit("foo", "bar");
      *
      * @param room - a room, or an array of rooms
      * @return a new {@link BroadcastOperator} instance for chaining
      */
    def to(room: Room): typings.socketIo.distBroadcastOperatorMod.BroadcastOperator[EmitEvents, SocketData] = js.native
    
    /**
      * Registers a middleware, which is a function that gets executed for every incoming {@link Socket}.
      *
      * @example
      * io.use((socket, next) => {
      *   // ...
      *   next();
      * });
      *
      * @param fn - the middleware function
      */
    def use(
      fn: js.Function2[
          /* socket */ typings.socketIo.distSocketMod.Socket[ListenEvents, EmitEvents, ServerSideEvents, SocketData], 
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
      * io.volatile.emit("hello"); // the clients may or may not receive it
      *
      * @return a new {@link BroadcastOperator} instance for chaining
      */
    def volatile: typings.socketIo.distBroadcastOperatorMod.BroadcastOperator[EmitEvents, SocketData] = js.native
    
    /**
      * Sends a `message` event to all clients. Alias of {@link send}.
      *
      * @return self
      */
    @JSName("write")
    def write_message(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventParams<EmitEvents, 'message'> is not an array type */ args: EventParams[EmitEvents, message]
    ): this.type = js.native
  }
  /* static members */
  object Server {
    
    @JSImport("socket.io", "Server")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @param filename
      * @param req
      * @param res
      * @private
      */
    @JSImport("socket.io", "Server.sendFile")
    @js.native
    def sendFile: Any = js.native
    inline def sendFile_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sendFile")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("socket.io", "Socket")
  @js.native
  open class Socket[ListenEvents /* <: EventsMap */, EmitEvents /* <: EventsMap */, ServerSideEvents /* <: EventsMap */, SocketData] protected ()
    extends typings.socketIo.distSocketMod.Socket[ListenEvents, EmitEvents, ServerSideEvents, SocketData] {
    /**
      * Interface to a `Client` for a given `Namespace`.
      *
      * @param {Namespace} nsp
      * @param {Client} client
      * @param {Object} auth
      * @package
      */
    def this(
      nsp: typings.socketIo.distNamespaceMod.Namespace[ListenEvents, EmitEvents, ServerSideEvents, Any],
      client: Client[ListenEvents, EmitEvents, ServerSideEvents, Any],
      auth: js.Object
    ) = this()
  }
  
  type AdapterConstructor = (Instantiable1[/* nsp */ Any, Adapter]) | (js.Function1[
    /* nsp */ typings.socketIo.distNamespaceMod.Namespace[DefaultEventsMap, DefaultEventsMap, DefaultEventsMap, Any], 
    Adapter
  ])
  
  type ParentNspNameMatchFn = js.Function3[
    /* name */ String, 
    /* auth */ StringDictionary[Any], 
    /* fn */ js.Function2[/* err */ js.Error | Null, /* success */ Boolean, Unit], 
    Unit
  ]
  
  trait ServerOptions
    extends StObject
       with typings.engineIo.buildServerMod.ServerOptions
       with AttachOptions {
    
    /**
      * the adapter to use
      * @default the in-memory adapter (https://github.com/socketio/socket.io-adapter)
      */
    var adapter: AdapterConstructor
    
    /**
      * how many ms before a client without namespace is closed
      * @default 45000
      */
    var connectTimeout: Double
    
    /**
      * the parser to use
      * @default the default parser (https://github.com/socketio/socket.io-parser)
      */
    var parser: Any
    
    /**
      * whether to serve the client files
      * @default true
      */
    var serveClient: Boolean
  }
  object ServerOptions {
    
    inline def apply(adapter: AdapterConstructor, connectTimeout: Double, parser: Any, serveClient: Boolean): ServerOptions = {
      val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], connectTimeout = connectTimeout.asInstanceOf[js.Any], parser = parser.asInstanceOf[js.Any], serveClient = serveClient.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerOptions]
    }
    
    extension [Self <: ServerOptions](x: Self) {
      
      inline def setAdapter(value: AdapterConstructor): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
      
      inline def setAdapterFunction1(
        value: /* nsp */ typings.socketIo.distNamespaceMod.Namespace[DefaultEventsMap, DefaultEventsMap, DefaultEventsMap, Any] => Adapter
      ): Self = StObject.set(x, "adapter", js.Any.fromFunction1(value))
      
      inline def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
      
      inline def setParser(value: Any): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      inline def setServeClient(value: Boolean): Self = StObject.set(x, "serveClient", value.asInstanceOf[js.Any])
    }
  }
}
