package typings
package smartDashFoxDashServerLib.SFS2XNs.ManagersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Managers.RoomManager")
@js.native
class RoomManager protected () extends js.Object {
  /**
               * Creates a new RoomManager instance.
               * @param {SmartFox} sfs An instance of the SmartFoxServer 2X client API main SmartFox class.
               */
  def this(sfs: smartDashFoxDashServerLib.SFS2XNs.SmartFox) = this()
  /**
               * Indicates whether the specified Group has been subscribed by the client or not.
               * @param  {string}  groupId The name of the Group.
               * @return {boolean}         Returns: true if the client subscribed the passed Group.
               */
  def containsGroup(groupId: java.lang.String): scala.Boolean = js.native
  /**
               * Indicates whether the Rooms list contains a Room belonging to the specified Group or not.
               * @param  {any}     idOrName The id or name of the SFSRoom object whose presence in the Rooms list is to be tested.
               * @return {boolean}          Returns: true if the passed Room exists in the Rooms list.
               */
  def containsRoom(idOrName: js.Any): scala.Boolean = js.native
  /**
               * Indicates whether the Rooms list contains a Room belonging to the specified Group or not.
               * @param  {any}     idOrName The id or name of the SFSRoom object whose presence in the Rooms list is to be tested.
               * @param  {string}  groupId  The name of the Group to which the specified Room must belong.
               * @return {boolean}          Returns: true if the Rooms list contains the passed Room and it belongs to the specified Group.
               */
  def containsRoomInGroup(idOrName: js.Any, groupId: java.lang.String): scala.Boolean = js.native
  /**
               * Returns a list of Rooms currently joined by the client.
               * @return {Entities.SFSRoom[]} Returns: The list of SFSRoom objects representing the Rooms currently joined by the client.
               */
  def getJoinedRooms(): js.Array[smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSRoom] = js.native
  /**
               * Retrieves a SFSRoom object from its id.
               * @param  {number}           id The id of the Room.
               * @return {Entities.SFSRoom}    Returns: The object representing the requested Room; null if no SFSRoom object with the passed id exists in the Rooms list.
               */
  def getRoomById(id: scala.Double): smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSRoom = js.native
  /**
               * Retrieves a SFSRoom object from its name.
               * @param  {string}           name The name of the Room.
               * @return {Entities.SFSRoom}      Returns: The object representing the requested Room; null if no SFSRoom object with the passed name exists in the Rooms list.
               */
  def getRoomByName(name: java.lang.String): smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSRoom = js.native
  /**
               * Returns the current number of Rooms in the Rooms list.
               * @return {number} Returns: A list of Group names.
               */
  def getRoomCount(): scala.Double = js.native
  /**
               * Returns the names of Groups currently subscribed by the client.
               * @return {string[]} Returns: A list of Group names.
               */
  def getRoomGroups(): js.Array[java.lang.String] = js.native
  /**
               * Returns a list of Rooms currently "known" by the client. The list contains all the Rooms that are currently joined and all the Rooms belonging to the Room Groups that have been subscribed.
               * @return {Entities.SFSRoom[]} Returns: The list of the available SFSRoom objects.
               */
  def getRoomList(): js.Array[smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSRoom] = js.native
  /**
               * Retrieves the list of Rooms which are part of the specified Room Group.
               * @param  {string}             groupId The name of the Group.
               * @return {Entities.SFSRoom[]}         Returns: The list of SFSRoom objects belonging to the passed Group.
               */
  def getRoomListFromGroup(groupId: java.lang.String): js.Array[smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSRoom] = js.native
  /**
               * Retrieves a list of Rooms joined by the specified user. The list contains only those Rooms "known" by the Room Manager; the user might have joined others the client is not aware of.
               * @param  {Entities.SFSUser}   user A SFSUser object representing the user to look for in the current Rooms list.
               * @return {Entities.SFSRoom[]}      Returns: The list of Rooms joined by the passed user.
               */
  def getUserRooms(user: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSUser): js.Array[smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSRoom] = js.native
}

