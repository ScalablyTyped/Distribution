package typings.smartFoxServer.SFS2X.Entities

import typings.smartFoxServer.SFS2X.Entities.Variables.SFSRoomVariable
import typings.smartFoxServer.SFS2X.Managers.RoomManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SFSRoom extends js.Object {
  /** @type {string} Returns the Room Group name. */
  var groupId: String
  /** @type {number} Indicates the id of this Room. */
  var id: Double
  /** @type {boolean} Indicates whether this is a Game Room or not. */
  var isGame: Boolean
  /** @type {boolean} Indicates whether this Room is hidden or not. */
  var isHidden: Boolean
  /** @type {boolean} Indicates whether the client joined this Room or not. */
  var isJoined: Boolean
  /** @type {boolean} Indicates whether this Room requires a password to be joined or not. */
  var isPasswordProtected: Boolean
  /** @type {number} Returns the maximum number of spectators allowed in this Room (Game Rooms only). */
  var maxSpectators: Double
  /** @type {number} Returns the maximum number of users allowed in this Room. */
  var maxUsers: Double
  /** @type {string} Indicates the name of this Room. */
  var name: String
  /** @type {Object} Defines a generic utility object that can be used to store custom Room data. */
  var properties: js.Object
  /**
    * Indicates whether the specified user is currently inside this Room or not.
    * @param  {SFSUser} user The SFSUser object representing the user whose presence in this Room must be checked.
    * @return {boolean}      Returns: true if the user is inside this Room; false otherwise.
    */
  def containsUser(user: SFSUser): Boolean
  /**
    * Indicates whether this Room has the specified Room Variable set or not.
    * @param  {string}  varName The name of the Room Variable whose existance in this Room must be checked.
    * @return {boolean}         Returns: true if a Room Variable with the passed name exists in this Room.
    */
  def containsVariable(varName: String): Boolean
  /**
    * Returns the maximum amount of users, including spectators, that can be contained in this Room.
    * @return {number} Returns: Maximum number of users that can enter the Room.
    */
  def getCapacity(): Double
  /**
    * Retrieves the list of SFSUser objects representing the players currently inside this Room (Game Rooms only).
    * @return {SFSUser[]} Returns: The list of SFSUser objects representing the users who joined the Room as players.
    */
  def getPlayerList(): js.Array[SFSUser]
  /**
    * Retrieves a reference to the Room Manager which manages this Room.
    * @return {Managers.RoomManager} Returns: The Room Manager to which this Room is associated.
    */
  def getRoomManager(): RoomManager
  /**
    * Returns the current number of spectators in this Room (Game Rooms only).
    * @return {number} Returns: Current number of spectators in the Room.
    */
  def getSpectatorCount(): Double
  /**
    * Retrieves the list of SFSUser objects representing the spectators currently inside this Room (Game Rooms only).
    * @return {SFSUser[]} Returns: The list of SFSUser objects representing the users who joined the Room as spectators.
    */
  def getSpectatorList(): js.Array[SFSUser]
  /**
    * Retrieves a SFSUser object from its id property.
    * @param  {number}  id The id of the user to be found.
    * @return {SFSUser}    Returns: An object representing the user, or null if no user with the passed id exists in this Room.
    */
  def getUserById(id: Double): SFSUser
  /**
    * Retrieves a SFSUser object from its name property.
    * @param  {string}  name The name of the user to be found.
    * @return {SFSUser}      Returns: An object representing the user, or null if no user with the passed name exists in this Room.
    */
  def getUserByName(name: String): SFSUser
  /**
    * Returns the current number of users in this Room. In case of Game Rooms, this is the number of players.
    * @return {number} Returns: Current number of users in the Room.
    */
  def getUserCount(): Double
  /**
    * Returns the current number of users in this Room. In case of Game Rooms, this is the number of players.
    * @return {SFSUser[]} Returns: Current number of users in the Room.
    */
  def getUserList(): js.Array[SFSUser]
  /**
    * Retrieves a Room Variable from its name.
    * @param  {string}                    varName The name of the Room Variable to be retrieved.
    * @return {Variables.SFSRoomVariable}         Returns: The object representing the Room Variable, or null if no Room Variable with the passed name exists in this Room.
    */
  def getVariable(varName: String): SFSRoomVariable
  /**
    * Retrieves all the Room Variables of this Room.
    * @return {Variables.SFSRoomVariable[]} Returns: The list of SFSRoomVariable objects associated with this Room.
    */
  def getVariables(): js.Array[SFSRoomVariable]
}

object SFSRoom {
  @scala.inline
  def apply(
    containsUser: SFSUser => Boolean,
    containsVariable: String => Boolean,
    getCapacity: () => Double,
    getPlayerList: () => js.Array[SFSUser],
    getRoomManager: () => RoomManager,
    getSpectatorCount: () => Double,
    getSpectatorList: () => js.Array[SFSUser],
    getUserById: Double => SFSUser,
    getUserByName: String => SFSUser,
    getUserCount: () => Double,
    getUserList: () => js.Array[SFSUser],
    getVariable: String => SFSRoomVariable,
    getVariables: () => js.Array[SFSRoomVariable],
    groupId: String,
    id: Double,
    isGame: Boolean,
    isHidden: Boolean,
    isJoined: Boolean,
    isPasswordProtected: Boolean,
    maxSpectators: Double,
    maxUsers: Double,
    name: String,
    properties: js.Object
  ): SFSRoom = {
    val __obj = js.Dynamic.literal(containsUser = js.Any.fromFunction1(containsUser), containsVariable = js.Any.fromFunction1(containsVariable), getCapacity = js.Any.fromFunction0(getCapacity), getPlayerList = js.Any.fromFunction0(getPlayerList), getRoomManager = js.Any.fromFunction0(getRoomManager), getSpectatorCount = js.Any.fromFunction0(getSpectatorCount), getSpectatorList = js.Any.fromFunction0(getSpectatorList), getUserById = js.Any.fromFunction1(getUserById), getUserByName = js.Any.fromFunction1(getUserByName), getUserCount = js.Any.fromFunction0(getUserCount), getUserList = js.Any.fromFunction0(getUserList), getVariable = js.Any.fromFunction1(getVariable), getVariables = js.Any.fromFunction0(getVariables), groupId = groupId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isGame = isGame.asInstanceOf[js.Any], isHidden = isHidden.asInstanceOf[js.Any], isJoined = isJoined.asInstanceOf[js.Any], isPasswordProtected = isPasswordProtected.asInstanceOf[js.Any], maxSpectators = maxSpectators.asInstanceOf[js.Any], maxUsers = maxUsers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFSRoom]
  }
}

