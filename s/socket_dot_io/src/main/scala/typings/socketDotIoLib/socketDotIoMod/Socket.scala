package typings
package socketDotIoLib.socketDotIoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The socket, which handles our connection for a namespace. NOTE: while
	 * we technically extend NodeJS.EventEmitter, we're not putting it here
	 * as we have a problem with the emit() event (as it's overridden with a
	 * different return)
	 */
@js.native
trait Socket
  extends nodeLib.NodeJSNs.EventEmitter {
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
  		 * The underlying Engine.io Socket instance
  		 */
  var conn: EngineSocket = js.native
  /**
  		 * Is the Socket currently connected?
  		 */
  var connected: scala.Boolean = js.native
  /**
  		 * Is the Socket currently disconnected?
  		 */
  var disconnected: scala.Boolean = js.native
  /**
  		 * The object used when negociating the handshake
  		 */
  var handshake: Handshake = js.native
  /**
  		 * The unique ID for this Socket. Regenerated at every connection. This is
  		 * also the name of the room that the Socket automatically joins on connection
  		 */
  var id: java.lang.String = js.native
  /**
  		 * Sets the 'json' flag when emitting an event
  		 */
  var json: Socket = js.native
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
  var rooms: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  /**
  		 * The Server that our namespace is in
  		 */
  var server: Server = js.native
  /**
  		 * Sets the 'volatile' flag when emitting an event. Volatile messages are
  		 * messages that can be dropped because of network issues and the like. Use
  		 * for high-volume/real-time messages where you don't need to receive *all*
  		 * of them
  		 */
  var volatile: Socket = js.native
  /**
  		 * Sets the compress flag
  		 * @param compress If `true`, compresses the sending data
  		 * @return This Socket
  		 */
  def compress(compress: scala.Boolean): Socket = js.native
  /**
  		 * Disconnects this Socket
  		 * @param close If true, also closes the underlying connection
  		 * @return This Socket
  		 */
  def disconnect(): Socket = js.native
  def disconnect(close: scala.Boolean): Socket = js.native
  /**
  		 * @see to( room )
  		 */
  def in(room: java.lang.String): Socket = js.native
  /**
  		 * Joins a room. You can join multiple rooms, and by default, on connection,
  		 * you join a room with the same name as your ID
  		 * @param name The name of the room that we want to join
  		 * @param fn An optional callback to call when we've joined the room. It should
  		 * take an optional parameter, err, of a possible error
  		 * @return This Socket
  		 */
  def join(name: java.lang.String): Socket = js.native
  def join(name: java.lang.String, fn: js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]): Socket = js.native
  def join(name: js.Array[java.lang.String]): Socket = js.native
  def join(name: js.Array[java.lang.String], fn: js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]): Socket = js.native
  /**
  		 * Leaves a room
  		 * @param name The name of the room to leave
  		 * @param fn An optional callback to call when we've left the room. It should
  		 * take on optional parameter, err, of a possible error
  		 */
  def leave(name: java.lang.String): Socket = js.native
  def leave(name: java.lang.String, fn: js.Function): Socket = js.native
  /**
  		 * Leaves all the rooms that we've joined
  		 */
  def leaveAll(): scala.Unit = js.native
  /**
  		 * Sends a 'message' event
  		 * @see emit( event, ...args )
  		 */
  def send(args: js.Any*): Socket = js.native
  /**
  		 * Targets a room when broadcasting
  		 * @param room The name of the room that we're targeting
  		 * @return This Socket
  		 */
  def to(room: java.lang.String): Socket = js.native
  /**
  		 * Registers a middleware, which is a function that gets executed for every incoming Packet and receives as parameter the packet and a function to optionally defer execution to the next registered middleware.
  		 *
  		 * Errors passed to middleware callbacks are sent as special error packets to clients.
  		 */
  def use(
    fn: js.Function2[
      /* packet */ Packet, 
      /* next */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ]
  ): Socket = js.native
  /**
  		 * @see send( ...args )
  		 */
  def write(args: js.Any*): Socket = js.native
}

