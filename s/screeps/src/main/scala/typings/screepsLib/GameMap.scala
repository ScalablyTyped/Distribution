package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A global object representing world map. Use it to navigate between rooms. The object is accessible via Game.map property.
  */
@js.native
trait GameMap extends js.Object {
  /**
    * List all exits available from the room with the given name.
    * @param roomName The room name.
    * @returns The exits information or null if the room not found.
    */
  def describeExits(roomName: java.lang.String): ExitsInformation = js.native
  /**
    * Find the exit direction from the given room en route to another room.
    * @param fromRoom Start room name or room object.
    * @param toRoom Finish room name or room object.
    * @param opts (optional) An object with the pathfinding options.
    * @returns The room direction constant, one of the following:
    * FIND_EXIT_TOP, FIND_EXIT_RIGHT, FIND_EXIT_BOTTOM, FIND_EXIT_LEFT
    * Or one of the following Result codes:
    * ERR_NO_PATH, ERR_INVALID_ARGS
    */
  def findExit(fromRoom: java.lang.String, toRoom: java.lang.String): ExitConstant | ERR_NO_PATH | ERR_INVALID_ARGS = js.native
  def findExit(fromRoom: java.lang.String, toRoom: java.lang.String, opts: RouteOptions): ExitConstant | ERR_NO_PATH | ERR_INVALID_ARGS = js.native
  def findExit(fromRoom: java.lang.String, toRoom: Room): ExitConstant | ERR_NO_PATH | ERR_INVALID_ARGS = js.native
  def findExit(fromRoom: java.lang.String, toRoom: Room, opts: RouteOptions): ExitConstant | ERR_NO_PATH | ERR_INVALID_ARGS = js.native
  def findExit(fromRoom: Room, toRoom: java.lang.String): ExitConstant | ERR_NO_PATH | ERR_INVALID_ARGS = js.native
  def findExit(fromRoom: Room, toRoom: java.lang.String, opts: RouteOptions): ExitConstant | ERR_NO_PATH | ERR_INVALID_ARGS = js.native
  def findExit(fromRoom: Room, toRoom: Room): ExitConstant | ERR_NO_PATH | ERR_INVALID_ARGS = js.native
  def findExit(fromRoom: Room, toRoom: Room, opts: RouteOptions): ExitConstant | ERR_NO_PATH | ERR_INVALID_ARGS = js.native
  /**
    * Find route from the given room to another room.
    * @param fromRoom Start room name or room object.
    * @param toRoom Finish room name or room object.
    * @param opts (optional) An object with the pathfinding options.
    * @returns the route array or ERR_NO_PATH code
    */
  def findRoute(fromRoom: java.lang.String, toRoom: java.lang.String): js.Array[Anon_Room] | ERR_NO_PATH = js.native
  def findRoute(fromRoom: java.lang.String, toRoom: java.lang.String, opts: RouteOptions): js.Array[Anon_Room] | ERR_NO_PATH = js.native
  def findRoute(fromRoom: java.lang.String, toRoom: Room): js.Array[Anon_Room] | ERR_NO_PATH = js.native
  def findRoute(fromRoom: java.lang.String, toRoom: Room, opts: RouteOptions): js.Array[Anon_Room] | ERR_NO_PATH = js.native
  def findRoute(fromRoom: Room, toRoom: java.lang.String): js.Array[Anon_Room] | ERR_NO_PATH = js.native
  def findRoute(fromRoom: Room, toRoom: java.lang.String, opts: RouteOptions): js.Array[Anon_Room] | ERR_NO_PATH = js.native
  def findRoute(fromRoom: Room, toRoom: Room): js.Array[Anon_Room] | ERR_NO_PATH = js.native
  def findRoute(fromRoom: Room, toRoom: Room, opts: RouteOptions): js.Array[Anon_Room] | ERR_NO_PATH = js.native
  /**
    * Get the linear distance (in rooms) between two rooms. You can use this function to estimate the energy cost of
    * sending resources through terminals, or using observers and nukes.
    * @param roomName1 The name of the first room.
    * @param roomName2 The name of the second room.
    * @param continuous Whether to treat the world map continuous on borders. Set to true if you
    *                   want to calculate the trade or terminal send cost. Default is false.
    */
  def getRoomLinearDistance(roomName1: java.lang.String, roomName2: java.lang.String): scala.Double = js.native
  def getRoomLinearDistance(roomName1: java.lang.String, roomName2: java.lang.String, continuous: scala.Boolean): scala.Double = js.native
  /**
    * Get room terrain for the specified room. This method works for any room in the world even if you have no access to it.
    * @param roomName String name of the room.
    */
  def getRoomTerrain(roomName: java.lang.String): RoomTerrain = js.native
  /**
    * Get terrain type at the specified room position. This method works for any room in the world even if you have no access to it.
    * @param pos The position object.
    */
  def getTerrainAt(pos: RoomPosition): Terrain = js.native
  /**
    * Get terrain type at the specified room position. This method works for any room in the world even if you have no access to it.
    * @param x X position in the room.
    * @param y Y position in the room.
    * @param roomName The room name.
    */
  def getTerrainAt(x: scala.Double, y: scala.Double, roomName: java.lang.String): Terrain = js.native
  /**
    * Returns the world size as a number of rooms between world corners. For example, for a world with rooms from W50N50 to E50S50 this method will return 102.
    */
  def getWorldSize(): scala.Double = js.native
  /**
    * Check if the room is available to move into.
    * @param roomName The room name.
    * @returns A boolean value.
    */
  def isRoomAvailable(roomName: java.lang.String): scala.Boolean = js.native
}

