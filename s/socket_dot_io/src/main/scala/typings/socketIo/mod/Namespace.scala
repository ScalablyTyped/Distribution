package typings.socketIo.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.socketIo.socketIoStrings.connect
import typings.socketIo.socketIoStrings.connection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * A dictionary of all the Sockets connected to this Namespace, where
    * the Socket ID is the key
    */
  var connected: StringDictionary[Socket] = js.native
  /**
    * Sets the 'json' flag when emitting an event
    */
  var json: Namespace = js.native
  /**
    * The name of the NameSpace
    */
  var name: String = js.native
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
    * @see to( room )
    */
  def in(room: String): Namespace = js.native
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

