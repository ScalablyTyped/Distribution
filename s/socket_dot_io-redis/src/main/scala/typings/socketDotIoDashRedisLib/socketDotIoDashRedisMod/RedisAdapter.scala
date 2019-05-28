package typings
package socketDotIoDashRedisLib.socketDotIoDashRedisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedisAdapter
  extends socketDotIoLib.socketDotIoMod.Adapter {
  /**
  		 * Broadcasts a packet
  		 * @param packet The packet to broadcast
  		 * @param opts Any options to send along:
  		 *    - rooms: An optional list of rooms to broadcast to. If empty, the packet is broadcast to all sockets
  		 *    - except: A list of Socket IDs to exclude
  		 *    - flags: Any flags that we want to send along ('json', 'volatile', 'broadcast')
  		 * @param remote The optional flag, whether the packet came from another node
  		 */
  @JSName("broadcast")
  var broadcast_Original: socketDotIoDashRedisLib.Fn_Opts = js.native
  /**
  		 * Removes a socket from all the rooms that it's joined
  		 * @param id The ID of the socket that we're removing
  		 * @param callback An optional callback to call when the socket has been
  		 */
  @JSName("delAll")
  var delAll_Original: socketDotIoDashRedisLib.Fn_Callback = js.native
  /**
  		 * The prefix of pub/sub events
  		 */
  var prefix: java.lang.String = js.native
  /**
  		 * Optional, the redis client to publish events on
  		 */
  var pubClient: js.UndefOr[js.Any] = js.native
  /**
  		 * Optional, the redis client to subscribe to events on
  		 */
  var subClient: js.UndefOr[js.Any] = js.native
  /**
  		 * This servers key
  		 */
  var uid: java.lang.String = js.native
  /**
  		 * allRooms returns the list of all rooms.
  		 * @param {(err: any, rooms: string[]) => void} callback
  		 */
  def allRooms(callback: js.Function2[/* err */ js.Any, /* rooms */ js.Array[java.lang.String], scala.Unit]): scala.Unit = js.native
  /**
  		 * Broadcasts a packet
  		 * @param packet The packet to broadcast
  		 * @param opts Any options to send along:
  		 *    - rooms: An optional list of rooms to broadcast to. If empty, the packet is broadcast to all sockets
  		 *    - except: A list of Socket IDs to exclude
  		 *    - flags: Any flags that we want to send along ('json', 'volatile', 'broadcast')
  		 * @param remote The optional flag, whether the packet came from another node
  		 */
  def broadcast(packet: js.Any, opts: socketDotIoDashRedisLib.Anon_Except): scala.Unit = js.native
  def broadcast(packet: js.Any, opts: socketDotIoDashRedisLib.Anon_Except, remote: scala.Boolean): scala.Unit = js.native
  /**
  		 * clientRooms returns the list of rooms the client with the given ID has joined
  		 * (even on another node).
  		 * @param {string} id
  		 * @param {(err: any, rooms: string[]) => void} callback
  		 */
  def clientRooms(
    id: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* rooms */ js.Array[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  /**
  		 * clients returns the list of client IDs connected to rooms across all nodes.
  		 * @param {(err?: any, clients: string[]) => void} callback
  		 */
  def clients(callback: js.Function2[/* err */ js.Any, /* clients */ js.Array[java.lang.String], scala.Unit]): scala.Unit = js.native
  /**
  		 * clients returns the list of client IDs connected to rooms across all nodes.
  		 * @param {string[]} rooms
  		 * @param {(err?: any, clients: string[]) => void} callback
  		 */
  def clients(
    rooms: js.Array[java.lang.String],
    callback: js.Function2[/* err */ js.Any, /* clients */ js.Array[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  /**
  		 * customRequest sends a request to every nodes, that will respond through the
  		 * customHook method.
  		 * @param {any} data
  		 * @param {(err: any, replies: any[]) => void} callback
  		 */
  def customRequest(data: js.Any, callback: js.Function2[/* err */ js.Any, /* replies */ js.Array[_], scala.Unit]): scala.Unit = js.native
  def delAll(id: java.lang.String, callback: js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]): scala.Unit = js.native
  /**
  		 * remoteDisconnect makes the socket with the given id to get disconnected.
  		 * If close is set to true, it also closes the underlying socket.
  		 * The callback will be called once the socket was disconnected, or with an
  		 * err argument if the socket was not found.
  		 * @param {string} id the socket Id.
  		 * @param {boolean} close close the underlying socket
  		 * @param {(err: any) => void} callback
  		 */
  def remoteDisconnect(id: java.lang.String, close: scala.Boolean, callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
  		 * remoteJoin rakes the socket with the given id join the room.
  		 * The callback will be called once the socket has joined the room, or with an
  		 * err argument if the socket was not found.
  		 * @param {string} id the socket Id.
  		 * @param {string} room the room Id.
  		 * @param {(err: any) => void} callback
  		 */
  def remoteJoin(id: java.lang.String, room: java.lang.String, callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
  		 * remoteLeave makes the socket with the given id leave the room.
  		 * The callback will be called once the socket has left the room, or with an
  		 * err argument if the socket was not found.
  		 * @param {string} id the socket Id.
  		 * @param {string} room the room Id.
  		 * @param {(err: any) => void} callback
  		 */
  def remoteLeave(id: java.lang.String, room: java.lang.String, callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
}

