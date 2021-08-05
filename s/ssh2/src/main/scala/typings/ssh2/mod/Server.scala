package typings.ssh2.mod

import typings.node.eventsMod.EventEmitter
import typings.node.netMod.ListenOptions
import typings.node.netMod.Socket
import typings.ssh2.anon.Address
import typings.ssh2.anon.Fd
import typings.ssh2.ssh2Strings.close
import typings.ssh2.ssh2Strings.connection
import typings.ssh2.ssh2Strings.error
import typings.ssh2.ssh2Strings.listening
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ssh2", "Server")
@js.native
class Server protected () extends EventEmitter {
  // Server methods
  /**
    * Creates and returns a new Server instance.
    *
    * @param config Server configuration properties.
    * @param connectionListener if supplied, is added as a connection listener.
    */
  def this(config: ServerConfig) = this()
  def this(
    config: ServerConfig,
    connectionListener: js.Function2[/* client */ Connection, /* info */ ClientInfo, Unit]
  ) = this()
  
  /**
    * Returns the bound address, the address family name, and port of the server as reported
    * by the operating system.
    */
  def address(): Address = js.native
  
  /**
    * Stops the server from accepting new connections and keeps existing connections. This
    * function is asynchronous, the server is finally closed when all connections are ended
    * and the server emits a 'close' event.
    *
    * @param callback Optional callback that will be called once the `close` event occurs.
    *      Unlike that event, it will be called with an `Error` as its only argument if the
    *      server was not open when it was closed.
    */
  def close(): this.type = js.native
  def close(callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): this.type = js.native
  
  /**
    * Asynchronously get the number of concurrent connections on the server.
    */
  def getConnections(callback: js.Function2[/* err */ js.UndefOr[Error], /* count */ Double, Unit]): Unit = js.native
  
  /**
    * Begin accepting connections on a random port.
    *
    * This function is asynchronous. When the server has been bound, `listening` event will be emitted.
    *
    * @param callback An optional callback to add to the `listening` event of the server.
    */
  def listen(): this.type = js.native
  def listen(callback: js.Function0[Unit]): this.type = js.native
  /**
    * This will cause the server to accept connections on the specified handle, but it is
    * presumed that the file descriptor or handle has already been bound to a port or domain
    * socket.
    *
    * This function is asynchronous. When the server has been bound, `listening` event will be emitted.
    *
    * @param handle Either a server or socket (anything with an underlying `_handle` member), or an `{fd: number}` object.
    * @param backlog The maximum length of the queue of pending connections.
    * @param callback An optional callback to add to the `listening` event of the server.
    */
  def listen(handle: typings.node.netMod.Server): this.type = js.native
  def listen(handle: typings.node.netMod.Server, backlog: Double): this.type = js.native
  def listen(handle: typings.node.netMod.Server, backlog: Double, callback: js.Function0[Unit]): this.type = js.native
  def listen(handle: typings.node.netMod.Server, backlog: Unit, callback: js.Function0[Unit]): this.type = js.native
  def listen(handle: typings.node.netMod.Server, callback: js.Function0[Unit]): this.type = js.native
  def listen(handle: Socket): this.type = js.native
  def listen(handle: Socket, backlog: Double): this.type = js.native
  def listen(handle: Socket, backlog: Double, callback: js.Function0[Unit]): this.type = js.native
  def listen(handle: Socket, backlog: Unit, callback: js.Function0[Unit]): this.type = js.native
  def listen(handle: Socket, callback: js.Function0[Unit]): this.type = js.native
  def listen(handle: Fd): this.type = js.native
  def listen(handle: Fd, backlog: Double): this.type = js.native
  def listen(handle: Fd, backlog: Double, callback: js.Function0[Unit]): this.type = js.native
  def listen(handle: Fd, backlog: Unit, callback: js.Function0[Unit]): this.type = js.native
  def listen(handle: Fd, callback: js.Function0[Unit]): this.type = js.native
  /**
    * This will cause the server to accept connections using the specified options.
    *
    * This function is asynchronous. When the server has been bound, `listening` event will be emitted.
    *
    * @param options Connection options.
    * @param callback An optional callback to add to the `listening` event of the server.
    */
  def listen(options: ListenOptions): this.type = js.native
  def listen(options: ListenOptions, callback: js.Function0[Unit]): this.type = js.native
  /**
    * Start a local socket server listening for connections on the given `path`.
    *
    * This function is asynchronous. When the server has been bound, `listening` event will be emitted.
    *
    * @param path A UNIX domain socket path.
    * @param backlog The maximum length of the queue of pending connections.
    * @param callback An optional callback to add to the `listening` event of the server.
    */
  def listen(path: String): this.type = js.native
  def listen(path: String, backlog: Double): this.type = js.native
  def listen(path: String, backlog: Double, callback: js.Function0[Unit]): this.type = js.native
  def listen(path: String, backlog: Unit, callback: js.Function0[Unit]): this.type = js.native
  def listen(path: String, callback: js.Function0[Unit]): this.type = js.native
  /**
    * Begin accepting connections on the specified port and hostname.
    *
    * This function is asynchronous. When the server has been bound, `listening` event will be emitted.
    *
    * @param port The port on which to start listening. If this value is `undefined` or `0`,
    *          the operating system will define a random port which can be retrieved later
    *          using `server.address().port`.
    * @param hostname The hostname to bind. If `hostname` is omitted, the server will accept
    *          conections on any IPv6 address (`::`) when IPv6 is availble, or any IPv4
    *          address (`0.0.0.0`) otherwise.
    * @param backlog The maximum length of the queue of pending connections.
    * @param callback An optional callback to add to the `listening` event of the server.
    */
  def listen(port: Double): this.type = js.native
  def listen(port: Double, backlog: Double): this.type = js.native
  def listen(port: Double, backlog: Double, callback: js.Function0[Unit]): this.type = js.native
  def listen(port: Double, callback: js.Function0[Unit]): this.type = js.native
  def listen(port: Double, hostname: String): this.type = js.native
  def listen(port: Double, hostname: String, backlog: Double): this.type = js.native
  def listen(port: Double, hostname: String, backlog: Double, callback: js.Function0[Unit]): this.type = js.native
  def listen(port: Double, hostname: String, backlog: Unit, callback: js.Function0[Unit]): this.type = js.native
  def listen(port: Double, hostname: String, callback: js.Function0[Unit]): this.type = js.native
  def listen(port: Double, hostname: Unit, backlog: Double): this.type = js.native
  def listen(port: Double, hostname: Unit, backlog: Double, callback: js.Function0[Unit]): this.type = js.native
  def listen(port: Double, hostname: Unit, backlog: Unit, callback: js.Function0[Unit]): this.type = js.native
  def listen(port: Double, hostname: Unit, callback: js.Function0[Unit]): this.type = js.native
  
  def on(event: String, listener: js.Function): this.type = js.native
  def on(event: js.Symbol, listener: js.Function): this.type = js.native
  /**
    * Emitted when the server closes. Note that if connections exist, this event is not emitted until all connections are ended.
    */
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  // Server events
  /**
    * Emitted when a new client has connected.
    */
  @JSName("on")
  def on_connection(event: connection, listener: js.Function2[/* client */ Connection, /* info */ ClientInfo, Unit]): this.type = js.native
  /**
    * Emitted when an error occurs.
    */
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  /**
    * Emitted when the server has been bound after calling `server.listen()`.
    */
  @JSName("on")
  def on_listening(event: listening, listener: js.Function0[Unit]): this.type = js.native
  
  /**
    * Opposite of `unref`, calling `ref` on a previously unrefd server will not let the
    * program exit if it's the only server left (the default behavior). If the server is
    * refd calling `ref` again will have no effect.
    */
  def ref(): Unit = js.native
  
  /**
    * Calling `unref` on a server will allow the program to exit if this is the only active
    * server in the event system. If the server is already unrefd calling `unref` again
    * will have no effect.
    */
  def unref(): Unit = js.native
}
/* static members */
object Server {
  
  @JSImport("ssh2", "Server")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ssh2", "Server.KEEPALIVE_CLIENT_COUNT_MAX")
  @js.native
  def KEEPALIVE_CLIENT_COUNT_MAX: Double = js.native
  inline def KEEPALIVE_CLIENT_COUNT_MAX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KEEPALIVE_CLIENT_COUNT_MAX")(x.asInstanceOf[js.Any])
  
  @JSImport("ssh2", "Server.KEEPALIVE_CLIENT_INTERVAL")
  @js.native
  def KEEPALIVE_CLIENT_INTERVAL: Double = js.native
  inline def KEEPALIVE_CLIENT_INTERVAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KEEPALIVE_CLIENT_INTERVAL")(x.asInstanceOf[js.Any])
  
  @JSImport("ssh2", "Server.KEEPALIVE_INTERVAL")
  @js.native
  def KEEPALIVE_INTERVAL: Double = js.native
  inline def KEEPALIVE_INTERVAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KEEPALIVE_INTERVAL")(x.asInstanceOf[js.Any])
  
  /**
    * Creates and returns a new Server instance.
    *
    * @param config Server configuration properties.
    * @param connectionListener if supplied, is added as a connection listener.
    */
  inline def createServer(config: ServerConfig): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(config.asInstanceOf[js.Any]).asInstanceOf[Server]
  inline def createServer(
    config: ServerConfig,
    connectionListener: js.Function2[/* client */ Connection, /* info */ ClientInfo, Unit]
  ): Server = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(config.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[Server]
}
