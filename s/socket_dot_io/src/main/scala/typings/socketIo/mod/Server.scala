package typings.socketIo.mod

import org.scalablytyped.runtime.StringDictionary
import typings.socketIo.anon.Ws
import typings.socketIo.socketIoStrings.connect
import typings.socketIo.socketIoStrings.connection
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server extends js.Object {
  var engine: Ws = js.native
  /**
    * Sets the 'json' flag when emitting an event
    */
  var json: Server = js.native
  /**
    * Sets a modifier for a subsequent event emission that the event data will only be broadcast to the current node
    */
  var local: Server = js.native
  /**
    * A dictionary of all the namespaces currently on this Server
    */
  var nsps: StringDictionary[Namespace] = js.native
  /**
    * The default '/' Namespace
    */
  var sockets: Namespace = js.native
  /**
    * Sets a modifier for a subsequent event emission that the event data may be lost if the clients are not ready to receive messages
    */
  var volatile: Server = js.native
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
    * @see send( ...args )
    */
  def write(args: js.Any*): Namespace = js.native
}

