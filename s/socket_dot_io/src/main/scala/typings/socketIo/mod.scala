package typings.socketIo

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.engineIo.mod.ServerAttachOptions
import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.socketIo.anon.Except
import typings.socketIo.anon.GenerateId
import typings.socketIo.socketIoStrings.connect
import typings.socketIo.socketIoStrings.connection
import typings.std.Array
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("socket.io", JSImport.Namespace)
  @js.native
  /**
    * Default Server constructor
    */
  class ^ () extends Server {
    /**
      * Creates a new Server
      * @param A parameters object
      */
    def this(opts: ServerOptions) = this()
    /**
      * Creates a new Server
      * @param port A port to bind to, as a number, or a string
      * @param An optional parameters object
      */
    def this(port: String) = this()
    def this(port: Double) = this()
    /**
      * Creates a new Server
      * @param srv The HTTP server that we're going to bind to
      * @param opts An optional parameters object
      */
    def this(srv: typings.node.httpMod.Server) = this()
    def this(srv: typings.node.httpsMod.Server) = this()
    def this(port: String, opts: ServerOptions) = this()
    def this(port: Double, opts: ServerOptions) = this()
    def this(srv: typings.node.httpMod.Server, opts: ServerOptions) = this()
    def this(srv: typings.node.httpsMod.Server, opts: ServerOptions) = this()
  }
  @JSImport("socket.io", JSImport.Namespace)
  @js.native
  val ^ : SocketIOStatic = js.native
  
  /**
    * Backwards compatibility
    * @see io().listen()
    */
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("socket.io", "listen")
  @js.native
  /**
    * Default Server constructor
    */
  class listen () extends Server {
    /**
      * Creates a new Server
      * @param A parameters object
      */
    def this(opts: ServerOptions) = this()
    /**
      * Creates a new Server
      * @param port A port to bind to, as a number, or a string
      * @param An optional parameters object
      */
    def this(port: String) = this()
    def this(port: Double) = this()
    /**
      * Creates a new Server
      * @param srv The HTTP server that we're going to bind to
      * @param opts An optional parameters object
      */
    def this(srv: typings.node.httpMod.Server) = this()
    def this(srv: typings.node.httpsMod.Server) = this()
    def this(port: String, opts: ServerOptions) = this()
    def this(port: Double, opts: ServerOptions) = this()
    def this(srv: typings.node.httpMod.Server, opts: ServerOptions) = this()
    def this(srv: typings.node.httpsMod.Server, opts: ServerOptions) = this()
  }
  
  /**
    * The interface used when dealing with rooms etc
    */
  @js.native
  trait Adapter extends EventEmitter {
    
    /**
      * Adds a socket to a room. If the room doesn't exist, it's created
      * @param id The ID of the socket to add
      * @param room The name of the room to add the socket to
      * @param callback An optional callback to call when the socket has been
      * added. It should take an optional parameter, error, if there was a problem
      */
    def add(id: String, room: String): Unit = js.native
    def add(id: String, room: String, callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
    
    /**
      * Broadcasts a packet
      * @param packet The packet to broadcast
      * @param opts Any options to send along:
      *     - rooms: An optional list of rooms to broadcast to. If empty, the packet is broadcast to all sockets
      *     - except: A list of Socket IDs to exclude
      *     - flags: Any flags that we want to send along ('json', 'volatile', 'broadcast')
      */
    def broadcast(packet: js.Any, opts: Except): Unit = js.native
    
    /**
      * Removes a socket from a room. If there are no more sockets in the room,
      * the room is deleted
      * @param id The ID of the socket that we're removing
      * @param room The name of the room to remove the socket from
      * @param callback An optional callback to call when the socket has been
      * removed. It should take on optional parameter, error, if there was a problem
      */
    def del(id: String, room: String): Unit = js.native
    def del(id: String, room: String, callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
    
    /**
      * Removes a socket from all the rooms that it's joined
      * @param id The ID of the socket that we're removing
      */
    def delAll(id: String): Unit = js.native
    
    /**
      * The namespace that this adapter is for
      */
    var nsp: Namespace = js.native
    
    /**
      * A dictionary of all the rooms that we have in this namespace
      */
    var rooms: Rooms = js.native
    
    /**
      * A dictionary of all the socket ids that we're dealing with, and all
      * the rooms that the socket is currently in
      */
    var sids: StringDictionary[StringDictionary[Boolean]] = js.native
  }
  
  /**
    * The client behind each socket (can have multiple sockets)
    */
  @js.native
  trait Client extends StObject {
    
    /**
      * The underlying Engine.io Socket instance
      */
    var conn: EngineSocket = js.native
    
    /**
      * The ID for this client. Regenerated at every connection
      */
    var id: String = js.native
    
    /**
      * A dictionary of all the namespaces for this client, with the Socket that
      * deals with that namespace
      */
    var nsps: StringDictionary[Socket] = js.native
    
    /**
      * The http.IncomingMessage request sent with the connection. Useful
      * for recovering headers etc
      */
    var request: js.Any = js.native
    
    /**
      * The Server that this client belongs to
      */
    var server: Server = js.native
    
    /**
      * The dictionary of sockets currently connect via this client (i.e. to different
      * namespaces) where the Socket ID is the key
      */
    var sockets: StringDictionary[Socket] = js.native
  }
  object Client {
    
    @scala.inline
    def apply(
      conn: EngineSocket,
      id: String,
      nsps: StringDictionary[Socket],
      request: js.Any,
      server: Server,
      sockets: StringDictionary[Socket]
    ): Client = {
      val __obj = js.Dynamic.literal(conn = conn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], nsps = nsps.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], sockets = sockets.asInstanceOf[js.Any])
      __obj.asInstanceOf[Client]
    }
    
    @scala.inline
    implicit class ClientMutableBuilder[Self <: Client] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConn(value: EngineSocket): Self = StObject.set(x, "conn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNsps(value: StringDictionary[Socket]): Self = StObject.set(x, "nsps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: js.Any): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServer(value: Server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSockets(value: StringDictionary[Socket]): Self = StObject.set(x, "sockets", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A reference to the underlying engine.io Socket connection.
    */
  @js.native
  trait EngineSocket extends EventEmitter {
    
    /**
      * The ID for this socket - matches Client.id
      */
    var id: String = js.native
    
    /**
      * The ready state for the client. Either 'opening', 'open', 'closing', or 'closed'
      */
    var readyState: String = js.native
    
    /**
      * The remote IP for this connection
      */
    var remoteAddress: String = js.native
    
    /**
      * (http.IncomingMessage): request that originated the Socket
      */
    var request: js.Any = js.native
    
    /**
      * The Engine.io Server for this socket
      */
    var server: js.Any = js.native
    
    /**
      * (Transport): transport reference
      */
    var transport: js.Any = js.native
    
    /**
      * whether the transport has been upgraded
      */
    var upgraded: Boolean = js.native
  }
  
  @js.native
  trait Handshake extends StObject {
    
    /**
      * The remote address of the connection request
      */
    var address: String = js.native
    
    /**
      * The headers passed along with the request. e.g. 'host',
      * 'connection', 'accept', 'referer', 'cookie'
      */
    var headers: js.Any = js.native
    
    /**
      * The timestamp for when this was issued
      */
    var issued: Double = js.native
    
    /**
      * Any query string parameters in the request url
      */
    var query: js.Any = js.native
    
    /**
      * Is this a secure request?
      */
    var secure: Boolean = js.native
    
    /**
      * The current time, as a string
      */
    var time: String = js.native
    
    /**
      * The request url
      */
    var url: String = js.native
    
    /**
      * Is this a cross-domain request?
      */
    var xdomain: Boolean = js.native
  }
  object Handshake {
    
    @scala.inline
    def apply(
      address: String,
      headers: js.Any,
      issued: Double,
      query: js.Any,
      secure: Boolean,
      time: String,
      url: String,
      xdomain: Boolean
    ): Handshake = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], issued = issued.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], xdomain = xdomain.asInstanceOf[js.Any])
      __obj.asInstanceOf[Handshake]
    }
    
    @scala.inline
    implicit class HandshakeMutableBuilder[Self <: Handshake] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssued(value: Double): Self = StObject.set(x, "issued", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: js.Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXdomain(value: Boolean): Self = StObject.set(x, "xdomain", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The Namespace, sandboxed environments for sockets, each connection
    * to a Namespace requires a new Socket
    */
  @js.native
  trait Namespace extends EventEmitter {
    
    /**
      * The Adapter that we're using to handle dealing with rooms etc
      */
    var adapter: Adapter = js.native
    
    /**
      * Gets a list of clients.
      * @return This Namespace
      */
    def clients(fn: js.Function): Namespace = js.native
    
    /**
      * Sets the compress flag.
      * @param compress If `true`, compresses the sending data
      * @return This Namespace
      */
    def compress(compress: Boolean): Namespace = js.native
    
    /**
      * A dictionary of all the Sockets connected to this Namespace, where
      * the Socket ID is the key
      */
    var connected: StringDictionary[Socket] = js.native
    
    /**
      * @see to( room )
      */
    def in(room: String): Namespace = js.native
    
    /**
      * Sets the 'json' flag when emitting an event
      */
    var json: Namespace = js.native
    
    /**
      * The name of the NameSpace
      */
    var name: String = js.native
    
    /**
      * Base 'on' method to add a listener for an event
      * @param event The event that we want to add a listener for
      * @param listener The callback to call when we get the event. The parameters
      * for the callback depend on the event
      * @ This Namespace
      */
    def on(event: String, listener: js.Function): this.type = js.native
    /**
      * @see on( 'connection', listener )
      */
    @JSName("on")
    def on_connect(event: connect, listener: js.Function1[/* socket */ Socket, Unit]): this.type = js.native
    /**
      * The event fired when we get a new connection
      * @param event The event being fired: 'connection'
      * @param listener A listener that should take one parameter of type Socket
      * @return This Namespace
      */
    @JSName("on")
    def on_connection(event: connection, listener: js.Function1[/* socket */ Socket, Unit]): this.type = js.native
    
    /**
      * Sends a 'message' event
      * @see emit( event, ...args )
      * @return This Namespace
      */
    def send(args: js.Any*): Namespace = js.native
    
    /**
      * The controller Server for this Namespace
      */
    var server: Server = js.native
    
    /**
      * A dictionary of all the Sockets connected to this Namespace, where
      * the Socket ID is the key
      */
    var sockets: StringDictionary[Socket] = js.native
    
    /**
      * Targets a room when emitting
      * @param room The name of the room that we're targeting
      * @return This Namespace
      */
    def to(room: String): Namespace = js.native
    
    /**
      * Registers a middleware function, which is a function that gets executed
      * for every incoming Socket
      * @param fn The function to call when we get a new incoming socket. It should
      * take one parameter of type Socket, and one callback function to call to
      * execute the next middleware function. The callback can take one optional
      * parameter, err, if there was an error. Errors passed to middleware callbacks
      * are sent as special 'error' packets to clients
      * @return This Namespace
      */
    def use(
      fn: js.Function2[/* socket */ Socket, /* fn */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], Unit]
    ): Namespace = js.native
    
    /**
      * @see send( ...args )
      */
    def write(args: js.Any*): Namespace = js.native
  }
  
  @js.native
  trait Packet
    extends Array[js.Any]
  
  /**
    * The interface describing a room
    */
  @js.native
  trait Room extends StObject {
    
    var length: Double = js.native
    
    var sockets: StringDictionary[Boolean] = js.native
  }
  object Room {
    
    @scala.inline
    def apply(length: Double, sockets: StringDictionary[Boolean]): Room = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], sockets = sockets.asInstanceOf[js.Any])
      __obj.asInstanceOf[Room]
    }
    
    @scala.inline
    implicit class RoomMutableBuilder[Self <: Room] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSockets(value: StringDictionary[Boolean]): Self = StObject.set(x, "sockets", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The interface describing a dictionary of rooms
    * Where room is the name of the room
    */
  type Rooms = StringDictionary[Room]
  
  @js.native
  trait Server extends StObject {
    
    /**
      * Gets the adapter that we're going to use for handling rooms
      * @default typeof Adapter
      */
    def adapter(): js.Any = js.native
    /**
      * Sets the adapter (class) that we're going to use for handling rooms
      * @param v The class for the adapter to create
      * @default typeof Adapter
      * @return This Server
      */
    def adapter(v: js.Any): Server = js.native
    
    // Socket inherits the following methods from NodeJS.EventEmitter
    // https://github.com/socketio/socket.io/blob/2.1.1/lib/socket.js#L81
    /**
      * Alias for `on`
      * @param event The event that we want to add a listener for
      * @param listener The callback to call when we get the event. The parameters
      * for the callback depend on the event
      * @return The default '/' Namespace
      *
      * _Inherited from EventEmitter - https://nodejs.org/api/events.html_
      */
    def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): Namespace = js.native
    
    /**
      * Attaches socket.io to a port
      * @param port The port that we want to attach to
      * @param opts An optional parameters object
      * @return This Server
      */
    def attach(port: Double): Server = js.native
    def attach(port: Double, opts: ServerOptions): Server = js.native
    /**
      * Attaches socket.io to a server
      * @param srv The http.Server that we want to attach to
      * @param opts An optional parameters object
      * @return This Server
      */
    def attach(srv: typings.node.httpMod.Server): Server = js.native
    def attach(srv: typings.node.httpMod.Server, opts: ServerOptions): Server = js.native
    def attach(srv: typings.node.httpsMod.Server): Server = js.native
    def attach(srv: typings.node.httpsMod.Server, opts: ServerOptions): Server = js.native
    
    /**
      * Binds socket.io to an engine.io instance
      * @param src The Engine.io (or compatible) server to bind to
      * @return This Server
      */
    def bind(srv: js.Any): Server = js.native
    
    /**
      * Server request verification function, that checks for allowed origins
      * @param req The http.IncomingMessage request
      * @param fn The callback to be called. It should take one parameter, err,
      * which will be null if there was no problem, and one parameter, success,
      * of type boolean
      */
    def checkRequest(req: js.Any, fn: js.Function2[/* err */ js.Any, /* success */ Boolean, Unit]): Unit = js.native
    
    /**
      * Gets a list of clients
      * @return The default '/' Namespace
      */
    def clients(args: js.Any*): Namespace = js.native
    
    /**
      * Closes the server connection
      */
    def close(): Unit = js.native
    def close(fn: js.Function0[Unit]): Unit = js.native
    
    /**
      * Sets the compress flag
      * @return The default '/' Namespace
      */
    def compress(args: js.Any*): Namespace = js.native
    
    /**
      * Emits an event to the default Namespace
      * @param event The event that we want to emit
      * @param args Any number of optional arguments to pass with the event. If the
      * last argument is a function, it will be called as an ack. The ack should
      * take whatever data was sent with the packet
      * @return The default '/' Namespace
      */
    def emit(event: String, args: js.Any*): Namespace = js.native
    
    var engine: GenerateId = js.native
    
    /**
      * Gets an array of events for which listeners have been registered
      * @param event The event that we want to add a listener for
      * @return An array listing the events for which the emitter has registered listeners
      *
      * _Inherited from EventEmitter - https://nodejs.org/api/events.html_
      */
    def eventNames(): js.Array[String] = js.native
    
    /**
      * Gets the max amount of event listeners
      * @return The max amount of allowed event listeners.
      *
      * _Inherited from EventEmitter - https://nodejs.org/api/events.html_
      */
    def getMaxListeners(): Double = js.native
    
    /**
      * @see to( room )
      */
    def in(room: String): Namespace = js.native
    
    /**
      * Sets the 'json' flag when emitting an event
      */
    var json: Server = js.native
    
    /**
      * @see attach( port, opts )
      */
    def listen(port: Double): Server = js.native
    def listen(port: Double, opts: ServerOptions): Server = js.native
    /**
      * @see attach( srv, opts )
      */
    def listen(srv: typings.node.httpMod.Server): Server = js.native
    def listen(srv: typings.node.httpMod.Server, opts: ServerOptions): Server = js.native
    def listen(srv: typings.node.httpsMod.Server): Server = js.native
    def listen(srv: typings.node.httpsMod.Server, opts: ServerOptions): Server = js.native
    
    /**
      * Gets the number of listeners listening to the event.
      * @param event The event to retrieve the total listener count for
      * @return The total number of listeners listening to the event
      *
      * _Inherited from EventEmitter - https://nodejs.org/api/events.html_
      */
    def listenerCount(`type`: String): Double = js.native
    
    /**
      * Gets a copy of all listeners for an event.
      * @param event The event to retrieve all listeners for
      * @return A copy of the array of listeners for the event
      *
      * _Inherited from EventEmitter - https://nodejs.org/api/events.html_
      */
    def listeners(event: String): js.Array[js.Function] = js.native
    
    /**
      * Sets a modifier for a subsequent event emission that the event data will only be broadcast to the current node
      */
    var local: Server = js.native
    
    /**
      * A dictionary of all the namespaces currently on this Server
      */
    var nsps: StringDictionary[Namespace] = js.native
    
    /**
      * Looks up/creates a Namespace
      * @param nsp The name of the NameSpace to look up/create. Should start
      * with a '/'
      * @return The Namespace
      */
    def of(nsp: String): Namespace = js.native
    def of(nsp: js.Function): Namespace = js.native
    def of(nsp: RegExp): Namespace = js.native
    
    /**
      * Alias for `removeListener`
      * @param event The event that we want to add a listener for
      * @param listener The callback to remove from the event event. Must be
      * the exact function reference that was added
      * @return The default '/' Namespace
      *
      * _Inherited from EventEmitter - https://nodejs.org/api/events.html_
      */
    def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): Namespace = js.native
    
    /**
      * Base 'on' method to add a listener for an event
      * @param event The event that we want to add a listener for
      * @param listener The callback to call when we get the event. The parameters
      * for the callback depend on the event
      * @return The default '/' Namespace
      */
    def on(event: String, listener: js.Function): Namespace = js.native
    /**
      * @see on( 'connection', listener )
      */
    @JSName("on")
    def on_connect(event: connect, listener: js.Function1[/* socket */ Socket, Unit]): Namespace = js.native
    /**
      * The event fired when we get a new connection
      * @param event The event being fired: 'connection'
      * @param listener A listener that should take one parameter of type Socket
      * @return The default '/' Namespace
      */
    @JSName("on")
    def on_connection(event: connection, listener: js.Function1[/* socket */ Socket, Unit]): Namespace = js.native
    
    /**
      * Adds a one-time listener for an event
      * @param event The event that we want to add a listener for
      * @param listener The callback to call when we get the event. The parameters
      * for the callback depend on the event
      * @return The default '/' Namespace
      *
      * _Inherited from EventEmitter - https://nodejs.org/api/events.html_
      */
    def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): Namespace = js.native
    
    /**
      * Called with each incoming connection
      * @param socket The Engine.io Socket
      * @return This Server
      */
    def onconnection(socket: js.Any): Server = js.native
    
    /**
      * Gets the allowed origins for requests
      * @default "*:*"
      */
    def origins(): String | js.Array[String] = js.native
    /**
      * Provides a function taking two arguments origin:String
      * and callback(error, success), where success is a boolean
      * value indicating whether origin is allowed or not. If
      * success is set to false, error must be provided as a string
      * value that will be appended to the server response, e.g. “Origin not allowed”.
      * @param fn The function that will be called to check the origin
      * return This Server
      */
    def origins(
      fn: js.Function2[
          /* origin */ String, 
          /* callback */ js.Function2[/* error */ String | Null, /* success */ Boolean, Unit], 
          Unit
        ]
    ): Server = js.native
    /**
      * Sets the allowed origins for requests
      * @param v The allowed origins, in host:port form
      * @default "*:*"
      * return This Server
      */
    def origins(v: String): Server = js.native
    def origins(v: js.Array[String]): Server = js.native
    
    /**
      * Gets the client serving path
      * @default '/socket.io'
      */
    def path(): String = js.native
    /**
      * Sets the client serving path
      * @param v The path to serve the client file on
      * @default '/socket.io'
      * @return This Server
      */
    def path(v: String): Server = js.native
    
    /**
      * Adds the listener function to the _beginning_ of the listeners array for the event
      * @param event The event that we want to add a listener for
      * @param listener The callback to call when we get the event. The parameters
      * for the callback depend on the event
      * @return The default '/' Namespace
      *
      * _Inherited from EventEmitter - https://nodejs.org/api/events.html_
      */
    def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): Namespace = js.native
    
    /**
      * Adds a one-time listener function to the _beginning_ of the listeners array for the event
      * @param event The event that we want to add a listener for
      * @param listener The callback to call when we get the event. The parameters
      * for the callback depend on the event
      * @return The default '/' Namespace
      *
      * _Inherited from EventEmitter - https://nodejs.org/api/events.html_
      */
    def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): Namespace = js.native
    
    /**
      * Get a copy of all listeners for an event, including one-time events.
      * @param event The event to retrieve all listeners for
      * @return A copy of the array of listeners for the event,
      * including any wrappers (such as those created by .once()).
      *
      * _Inherited from EventEmitter - https://nodejs.org/api/events.html_
      */
    def rawListeners(event: String): js.Array[js.Function] = js.native
    
    /**
      * Removes all listeners, or those of the specified event
      * @param event The event to remove all listeners for, if omitted
      * all events will be removed
      * @return The default '/' Namespace
      *
      * _Inherited from EventEmitter - https://nodejs.org/api/events.html_
      */
    def removeAllListeners(): Namespace = js.native
    def removeAllListeners(event: String): Namespace = js.native
    
    /**
      * Removes a specific listener for an event
      * @param event The event that we want to add a listener for
      * @param listener The callback to remove from the event event. Must be
      * the exact function reference that was added
      * @return The default '/' Namespace
      *
      * _Inherited from EventEmitter - https://nodejs.org/api/events.html_
      */
    def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): Namespace = js.native
    
    /**
      * Sends a 'message' event
      * @see emit( event, ...args )
      * @return The default '/' Namespace
      */
    def send(args: js.Any*): Namespace = js.native
    
    /**
      * Gets whether we're serving the client.js file or not
      * @default true
      */
    def serveClient(): Boolean = js.native
    /**
      * Sets whether we're serving the client.js file or not
      * @param v True if we want to serve the file, false otherwise
      * @default true
      * @return This Server
      */
    def serveClient(v: Boolean): Server = js.native
    
    /**
      * Sets the max amount of event listeners
      * @param n The max amount of allowed event listeners.
      * @return The default '/' Namespace
      *
      * _Inherited from EventEmitter - https://nodejs.org/api/events.html_
      */
    def setMaxListeners(n: Double): Namespace = js.native
    
    /**
      * The default '/' Namespace
      */
    var sockets: Namespace = js.native
    
    /**
      * Targets a room when emitting to the default '/' Namespace
      * @param room The name of the room that we're targeting
      * @return The default '/' Namespace
      */
    def to(room: String): Namespace = js.native
    
    /**
      * Registers a middleware function, which is a function that gets executed
      * for every incoming Socket, on the default '/' Namespace
      * @param fn The function to call when we get a new incoming socket. It should
      * take one parameter of type Socket, and one callback function to call to
      * execute the next middleware function. The callback can take one optional
      * parameter, err, if there was an error. Errors passed to middleware callbacks
      * are sent as special 'error' packets to clients
      * @return The default '/' Namespace
      */
    def use(
      fn: js.Function2[/* socket */ Socket, /* fn */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], Unit]
    ): Namespace = js.native
    
    /**
      * Sets a modifier for a subsequent event emission that the event data may be lost if the clients are not ready to receive messages
      */
    var volatile: Server = js.native
    
    /**
      * @see send( ...args )
      */
    def write(args: js.Any*): Namespace = js.native
  }
  
  /**
    * Options to pass to our server when creating it
    */
  @js.native
  trait ServerOptions extends ServerAttachOptions {
    
    /**
      * The adapter to use for handling rooms. NOTE: this should be a class,
      * not an object
      * @default typeof Adapter
      */
    var adapter: js.UndefOr[Adapter] = js.native
    
    /**
      * Accepted origins
      * @default '*:*'
      */
    var origins: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * Should we serve the client file?
      * @default true
      */
    var serveClient: js.UndefOr[Boolean] = js.native
  }
  object ServerOptions {
    
    @scala.inline
    def apply(): ServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerOptions]
    }
    
    @scala.inline
    implicit class ServerOptionsMutableBuilder[Self <: ServerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdapter(value: Adapter): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdapterUndefined: Self = StObject.set(x, "adapter", js.undefined)
      
      @scala.inline
      def setOrigins(value: String | js.Array[String]): Self = StObject.set(x, "origins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginsUndefined: Self = StObject.set(x, "origins", js.undefined)
      
      @scala.inline
      def setOriginsVarargs(value: String*): Self = StObject.set(x, "origins", js.Array(value :_*))
      
      @scala.inline
      def setServeClient(value: Boolean): Self = StObject.set(x, "serveClient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServeClientUndefined: Self = StObject.set(x, "serveClient", js.undefined)
    }
  }
  
  /**
    * The socket, which handles our connection for a namespace. NOTE: while
    * we technically extend NodeJS.EventEmitter, we're not putting it here
    * as we have a problem with the emit() event (as it's overridden with a
    * different return)
    */
  @js.native
  trait Socket extends EventEmitter {
    
    /**
      * The Adapter that we use to handle our rooms
      */
    var adapter: Adapter = js.native
    
    /**
      * Sets the 'broadcast' flag when emitting an event. Broadcasting an event
      * will send it to all the other sockets in the namespace except for yourself
      */
    var broadcast: Socket = js.native
    
    /**
      * The Client associated with this Socket
      */
    var client: Client = js.native
    
    /**
      * Sets the compress flag
      * @param compress If `true`, compresses the sending data
      * @return This Socket
      */
    def compress(compress: Boolean): Socket = js.native
    
    /**
      * The underlying Engine.io Socket instance
      */
    var conn: EngineSocket = js.native
    
    /**
      * Is the Socket currently connected?
      */
    var connected: Boolean = js.native
    
    /**
      * Disconnects this Socket
      * @param close If true, also closes the underlying connection
      * @return This Socket
      */
    def disconnect(): Socket = js.native
    def disconnect(close: Boolean): Socket = js.native
    
    /**
      * Is the Socket currently disconnected?
      */
    var disconnected: Boolean = js.native
    
    /**
      * Emits the error
      * @param err Error message=
      */
    def error(err: js.Any): Unit = js.native
    
    /**
      * The object used when negociating the handshake
      */
    var handshake: Handshake = js.native
    
    /**
      * The unique ID for this Socket. Regenerated at every connection. This is
      * also the name of the room that the Socket automatically joins on connection
      */
    var id: String = js.native
    
    /**
      * @see to( room )
      */
    def in(room: String): Socket = js.native
    
    /**
      * Joins a room. You can join multiple rooms, and by default, on connection,
      * you join a room with the same name as your ID
      * @param name The name of the room that we want to join
      * @param fn An optional callback to call when we've joined the room. It should
      * take an optional parameter, err, of a possible error
      * @return This Socket
      */
    def join(name: String): Socket = js.native
    def join(name: String, fn: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Socket = js.native
    def join(name: js.Array[String]): Socket = js.native
    def join(name: js.Array[String], fn: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Socket = js.native
    
    /**
      * Sets the 'json' flag when emitting an event
      */
    var json: Socket = js.native
    
    /**
      * Leaves a room
      * @param name The name of the room to leave
      * @param fn An optional callback to call when we've left the room. It should
      * take on optional parameter, err, of a possible error
      */
    def leave(name: String): Socket = js.native
    def leave(name: String, fn: js.Function): Socket = js.native
    
    /**
      * Leaves all the rooms that we've joined
      */
    def leaveAll(): Unit = js.native
    
    /**
      * The namespace that this socket is for
      */
    var nsp: Namespace = js.native
    
    /**
      * The http.IncomingMessage request sent with the connection. Useful
      * for recovering headers etc
      */
    var request: js.Any = js.native
    
    /**
      * The list of rooms that this Socket is currently in, where
      * the ID the the room ID
      */
    var rooms: StringDictionary[String] = js.native
    
    /**
      * Sends a 'message' event
      * @see emit( event, ...args )
      */
    def send(args: js.Any*): Socket = js.native
    
    /**
      * The Server that our namespace is in
      */
    var server: Server = js.native
    
    /**
      * Targets a room when broadcasting
      * @param room The name of the room that we're targeting
      * @return This Socket
      */
    def to(room: String): Socket = js.native
    
    /**
      * Registers a middleware, which is a function that gets executed for every incoming Packet and receives as parameter the packet and a function to optionally defer execution to the next registered middleware.
      *
      * Errors passed to middleware callbacks are sent as special error packets to clients.
      */
    def use(
      fn: js.Function2[
          /* packet */ Packet, 
          /* next */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
          Unit
        ]
    ): Socket = js.native
    
    /**
      * Sets the 'volatile' flag when emitting an event. Volatile messages are
      * messages that can be dropped because of network issues and the like. Use
      * for high-volume/real-time messages where you don't need to receive *all*
      * of them
      */
    var volatile: Socket = js.native
    
    /**
      * @see send( ...args )
      */
    def write(args: js.Any*): Socket = js.native
  }
  
  @js.native
  trait SocketIOStatic
    extends /**
    * Creates a new Server
    * @param A parameters object
    */
  /**
    * Creates a new Server
    * @param port A port to bind to, as a number, or a string
    * @param An optional parameters object
    */
  /**
    * Creates a new Server
    * @param srv The HTTP server that we're going to bind to
    * @param opts An optional parameters object
    */
  Instantiable1[
          (/* port */ Double) | (/* srv */ typings.node.httpMod.Server) | (/* srv */ typings.node.httpsMod.Server) | (/* opts */ ServerOptions) | (/* port */ String), 
          Server
        ]
       with /**
    * Default Server constructor
    */
  Instantiable0[Server]
       with Instantiable2[
          (/* port */ Double) | (/* srv */ typings.node.httpMod.Server) | (/* srv */ typings.node.httpsMod.Server) | (/* port */ String), 
          /* opts */ ServerOptions, 
          Server
        ] {
    
    /**
      * Default Server constructor
      */
    def apply(): Server = js.native
    /**
      * Creates a new Server
      * @param A parameters object
      */
    def apply(opts: ServerOptions): Server = js.native
    /**
      * Creates a new Server
      * @param port A port to bind to, as a number, or a string
      * @param An optional parameters object
      */
    def apply(port: String): Server = js.native
    def apply(port: String, opts: ServerOptions): Server = js.native
    def apply(port: Double): Server = js.native
    def apply(port: Double, opts: ServerOptions): Server = js.native
    /**
      * Creates a new Server
      * @param srv The HTTP server that we're going to bind to
      * @param opts An optional parameters object
      */
    def apply(srv: typings.node.httpMod.Server): Server = js.native
    def apply(srv: typings.node.httpMod.Server, opts: ServerOptions): Server = js.native
    def apply(srv: typings.node.httpsMod.Server): Server = js.native
    def apply(srv: typings.node.httpsMod.Server, opts: ServerOptions): Server = js.native
    
    /**
      * Default Server constructor
      */
    /**
      * Backwards compatibility
      * @see io().listen()
      */
    def listen(): Server = js.native
    /**
      * Creates a new Server
      * @param A parameters object
      */
    /**
      * Backwards compatibility
      * @see io().listen()
      */
    def listen(opts: ServerOptions): Server = js.native
    /**
      * Creates a new Server
      * @param port A port to bind to, as a number, or a string
      * @param An optional parameters object
      */
    /**
      * Backwards compatibility
      * @see io().listen()
      */
    def listen(port: String): Server = js.native
    def listen(port: String, opts: ServerOptions): Server = js.native
    def listen(port: Double): Server = js.native
    def listen(port: Double, opts: ServerOptions): Server = js.native
    /**
      * Creates a new Server
      * @param srv The HTTP server that we're going to bind to
      * @param opts An optional parameters object
      */
    /**
      * Backwards compatibility
      * @see io().listen()
      */
    def listen(srv: typings.node.httpMod.Server): Server = js.native
    def listen(srv: typings.node.httpMod.Server, opts: ServerOptions): Server = js.native
    def listen(srv: typings.node.httpsMod.Server): Server = js.native
    def listen(srv: typings.node.httpsMod.Server, opts: ServerOptions): Server = js.native
    /**
      * Backwards compatibility
      * @see io().listen()
      */
    @JSName("listen")
    var listen_Original: SocketIOStatic = js.native
  }
  
  type _To = SocketIOStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: SocketIOStatic = ^
}
