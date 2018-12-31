package typings
package smartDashFoxDashServerLib.SFS2XNs.EntitiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Entities.SFSRoom")
@js.native
class SFSRoom protected () extends js.Object {
  /**
    * Creates a new SFSRoom instance.
    * @param {number} id      The Room id.
    * @param {string} name    The Room name.
    * @param {string} [groupId="default"] The id of the Group to which the Room belongs.
    */
  def this(id: scala.Double, name: java.lang.String) = this()
  def this(id: scala.Double, name: java.lang.String, groupId: java.lang.String) = this()
  /** @type {string} Returns the Room Group name. */
  var groupId: java.lang.String = js.native
  /** @type {number} Indicates the id of this Room. */
  var id: scala.Double = js.native
  /** @type {boolean} Indicates whether this is a Game Room or not. */
  var isGame: scala.Boolean = js.native
  /** @type {boolean} Indicates whether this Room is hidden or not. */
  var isHidden: scala.Boolean = js.native
  /** @type {boolean} Indicates whether the client joined this Room or not. */
  var isJoined: scala.Boolean = js.native
  /** @type {boolean} Indicates whether this Room requires a password to be joined or not. */
  var isPasswordProtected: scala.Boolean = js.native
  /** @type {number} Returns the maximum number of spectators allowed in this Room (Game Rooms only). */
  var maxSpectators: scala.Double = js.native
  /** @type {number} Returns the maximum number of users allowed in this Room. */
  var maxUsers: scala.Double = js.native
  /** @type {string} Indicates the name of this Room. */
  var name: java.lang.String = js.native
  /** @type {Object} Defines a generic utility object that can be used to store custom Room data. */
  var properties: js.Object = js.native
  /**
    * Indicates whether the specified user is currently inside this Room or not.
    * @param  {SFSUser} user The SFSUser object representing the user whose presence in this Room must be checked.
    * @return {boolean}      Returns: true if the user is inside this Room; false otherwise.
    */
  def containsUser(user: SFSUser): scala.Boolean = js.native
  /**
    * Indicates whether this Room has the specified Room Variable set or not.
    * @param  {string}  varName The name of the Room Variable whose existance in this Room must be checked.
    * @return {boolean}         Returns: true if a Room Variable with the passed name exists in this Room.
    */
  def containsVariable(varName: java.lang.String): scala.Boolean = js.native
  /**
    * Returns the maximum amount of users, including spectators, that can be contained in this Room.
    * @return {number} Returns: Maximum number of users that can enter the Room.
    */
  def getCapacity(): scala.Double = js.native
  /**
    * Retrieves the list of SFSUser objects representing the players currently inside this Room (Game Rooms only).
    * @return {SFSUser[]} Returns: The list of SFSUser objects representing the users who joined the Room as players.
    */
  def getPlayerList(): js.Array[SFSUser] = js.native
  /**
    * Retrieves a reference to the Room Manager which manages this Room.
    * @return {Managers.RoomManager} Returns: The Room Manager to which this Room is associated.
    */
  def getRoomManager(): smartDashFoxDashServerLib.SFS2XNs.ManagersNs.RoomManager = js.native
  /**
    * Returns the current number of spectators in this Room (Game Rooms only).
    * @return {number} Returns: Current number of spectators in the Room.
    */
  def getSpectatorCount(): scala.Double = js.native
  /**
    * Retrieves the list of SFSUser objects representing the spectators currently inside this Room (Game Rooms only).
    * @return {SFSUser[]} Returns: The list of SFSUser objects representing the users who joined the Room as spectators.
    */
  def getSpectatorList(): js.Array[SFSUser] = js.native
  /**
    * Retrieves a SFSUser object from its id property.
    * @param  {number}  id The id of the user to be found.
    * @return {SFSUser}    Returns: An object representing the user, or null if no user with the passed id exists in this Room.
    */
  def getUserById(id: scala.Double): SFSUser = js.native
  /**
    * Retrieves a SFSUser object from its name property.
    * @param  {string}  name The name of the user to be found.
    * @return {SFSUser}      Returns: An object representing the user, or null if no user with the passed name exists in this Room.
    */
  def getUserByName(name: java.lang.String): SFSUser = js.native
  /**
    * Returns the current number of users in this Room. In case of Game Rooms, this is the number of players.
    * @return {number} Returns: Current number of users in the Room.
    */
  def getUserCount(): scala.Double = js.native
  /**
    * Returns the current number of users in this Room. In case of Game Rooms, this is the number of players.
    * @return {SFSUser[]} Returns: Current number of users in the Room.
    */
  def getUserList(): js.Array[SFSUser] = js.native
  /**
    * Retrieves a Room Variable from its name.
    * @param  {string}                    varName The name of the Room Variable to be retrieved.
    * @return {Variables.SFSRoomVariable}         Returns: The object representing the Room Variable, or null if no Room Variable with the passed name exists in this Room.
    */
  def getVariable(varName: java.lang.String): smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.VariablesNs.SFSRoomVariable = js.native
  /**
    * Retrieves all the Room Variables of this Room.
    * @return {Variables.SFSRoomVariable[]} Returns: The list of SFSRoomVariable objects associated with this Room.
    */
  def getVariables(): js.Array[smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.VariablesNs.SFSRoomVariable] = js.native
}

