package typings.socketIo.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.socketIo.anon.Except
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface used when dealing with rooms etc
  */
@js.native
trait Adapter extends EventEmitter {
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
}

