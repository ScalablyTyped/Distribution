package typings.smartFoxServer.SFS2X.Managers

import typings.smartFoxServer.SFS2X.Entities.SFSRoom
import typings.smartFoxServer.SFS2X.Entities.SFSUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomManager extends js.Object {
  /**
    * Indicates whether the specified Group has been subscribed by the client or not.
    * @param  {string}  groupId The name of the Group.
    * @return {boolean}         Returns: true if the client subscribed the passed Group.
    */
  def containsGroup(groupId: String): Boolean
  /**
    * Indicates whether the Rooms list contains a Room belonging to the specified Group or not.
    * @param  {any}     idOrName The id or name of the SFSRoom object whose presence in the Rooms list is to be tested.
    * @return {boolean}          Returns: true if the passed Room exists in the Rooms list.
    */
  def containsRoom(idOrName: js.Any): Boolean
  /**
    * Indicates whether the Rooms list contains a Room belonging to the specified Group or not.
    * @param  {any}     idOrName The id or name of the SFSRoom object whose presence in the Rooms list is to be tested.
    * @param  {string}  groupId  The name of the Group to which the specified Room must belong.
    * @return {boolean}          Returns: true if the Rooms list contains the passed Room and it belongs to the specified Group.
    */
  def containsRoomInGroup(idOrName: js.Any, groupId: String): Boolean
  /**
    * Returns a list of Rooms currently joined by the client.
    * @return {Entities.SFSRoom[]} Returns: The list of SFSRoom objects representing the Rooms currently joined by the client.
    */
  def getJoinedRooms(): js.Array[SFSRoom]
  /**
    * Retrieves a SFSRoom object from its id.
    * @param  {number}           id The id of the Room.
    * @return {Entities.SFSRoom}    Returns: The object representing the requested Room; null if no SFSRoom object with the passed id exists in the Rooms list.
    */
  def getRoomById(id: Double): SFSRoom
  /**
    * Retrieves a SFSRoom object from its name.
    * @param  {string}           name The name of the Room.
    * @return {Entities.SFSRoom}      Returns: The object representing the requested Room; null if no SFSRoom object with the passed name exists in the Rooms list.
    */
  def getRoomByName(name: String): SFSRoom
  /**
    * Returns the current number of Rooms in the Rooms list.
    * @return {number} Returns: A list of Group names.
    */
  def getRoomCount(): Double
  /**
    * Returns the names of Groups currently subscribed by the client.
    * @return {string[]} Returns: A list of Group names.
    */
  def getRoomGroups(): js.Array[String]
  /**
    * Returns a list of Rooms currently "known" by the client. The list contains all the Rooms that are currently joined and all the Rooms belonging to the Room Groups that have been subscribed.
    * @return {Entities.SFSRoom[]} Returns: The list of the available SFSRoom objects.
    */
  def getRoomList(): js.Array[SFSRoom]
  /**
    * Retrieves the list of Rooms which are part of the specified Room Group.
    * @param  {string}             groupId The name of the Group.
    * @return {Entities.SFSRoom[]}         Returns: The list of SFSRoom objects belonging to the passed Group.
    */
  def getRoomListFromGroup(groupId: String): js.Array[SFSRoom]
  /**
    * Retrieves a list of Rooms joined by the specified user. The list contains only those Rooms "known" by the Room Manager; the user might have joined others the client is not aware of.
    * @param  {Entities.SFSUser}   user A SFSUser object representing the user to look for in the current Rooms list.
    * @return {Entities.SFSRoom[]}      Returns: The list of Rooms joined by the passed user.
    */
  def getUserRooms(user: SFSUser): js.Array[SFSRoom]
}

object RoomManager {
  @scala.inline
  def apply(
    containsGroup: String => Boolean,
    containsRoom: js.Any => Boolean,
    containsRoomInGroup: (js.Any, String) => Boolean,
    getJoinedRooms: () => js.Array[SFSRoom],
    getRoomById: Double => SFSRoom,
    getRoomByName: String => SFSRoom,
    getRoomCount: () => Double,
    getRoomGroups: () => js.Array[String],
    getRoomList: () => js.Array[SFSRoom],
    getRoomListFromGroup: String => js.Array[SFSRoom],
    getUserRooms: SFSUser => js.Array[SFSRoom]
  ): RoomManager = {
    val __obj = js.Dynamic.literal(containsGroup = js.Any.fromFunction1(containsGroup), containsRoom = js.Any.fromFunction1(containsRoom), containsRoomInGroup = js.Any.fromFunction2(containsRoomInGroup), getJoinedRooms = js.Any.fromFunction0(getJoinedRooms), getRoomById = js.Any.fromFunction1(getRoomById), getRoomByName = js.Any.fromFunction1(getRoomByName), getRoomCount = js.Any.fromFunction0(getRoomCount), getRoomGroups = js.Any.fromFunction0(getRoomGroups), getRoomList = js.Any.fromFunction0(getRoomList), getRoomListFromGroup = js.Any.fromFunction1(getRoomListFromGroup), getUserRooms = js.Any.fromFunction1(getUserRooms))
    __obj.asInstanceOf[RoomManager]
  }
}

