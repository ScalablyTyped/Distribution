package typings.smartFoxServer.SFS2X.Entities

import typings.smartFoxServer.SFS2X.Entities.Variables.SFSRoomVariable
import typings.smartFoxServer.SFS2X.Managers.RoomManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SFSRoom extends StObject {
  
  /**
    * Indicates whether the specified user is currently inside this Room or not.
    * @param  {SFSUser} user The SFSUser object representing the user whose presence in this Room must be checked.
    * @return {boolean}      Returns: true if the user is inside this Room; false otherwise.
    */
  def containsUser(user: SFSUser): Boolean = js.native
  
  /**
    * Indicates whether this Room has the specified Room Variable set or not.
    * @param  {string}  varName The name of the Room Variable whose existance in this Room must be checked.
    * @return {boolean}         Returns: true if a Room Variable with the passed name exists in this Room.
    */
  def containsVariable(varName: String): Boolean = js.native
  
  /**
    * Returns the maximum amount of users, including spectators, that can be contained in this Room.
    * @return {number} Returns: Maximum number of users that can enter the Room.
    */
  def getCapacity(): Double = js.native
  
  /**
    * Retrieves the list of SFSUser objects representing the players currently inside this Room (Game Rooms only).
    * @return {SFSUser[]} Returns: The list of SFSUser objects representing the users who joined the Room as players.
    */
  def getPlayerList(): js.Array[SFSUser] = js.native
  
  /**
    * Retrieves a reference to the Room Manager which manages this Room.
    * @return {Managers.RoomManager} Returns: The Room Manager to which this Room is associated.
    */
  def getRoomManager(): RoomManager = js.native
  
  /**
    * Returns the current number of spectators in this Room (Game Rooms only).
    * @return {number} Returns: Current number of spectators in the Room.
    */
  def getSpectatorCount(): Double = js.native
  
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
  def getUserById(id: Double): SFSUser = js.native
  
  /**
    * Retrieves a SFSUser object from its name property.
    * @param  {string}  name The name of the user to be found.
    * @return {SFSUser}      Returns: An object representing the user, or null if no user with the passed name exists in this Room.
    */
  def getUserByName(name: String): SFSUser = js.native
  
  /**
    * Returns the current number of users in this Room. In case of Game Rooms, this is the number of players.
    * @return {number} Returns: Current number of users in the Room.
    */
  def getUserCount(): Double = js.native
  
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
  def getVariable(varName: String): SFSRoomVariable = js.native
  
  /**
    * Retrieves all the Room Variables of this Room.
    * @return {Variables.SFSRoomVariable[]} Returns: The list of SFSRoomVariable objects associated with this Room.
    */
  def getVariables(): js.Array[SFSRoomVariable] = js.native
  
  /** @type {string} Returns the Room Group name. */
  var groupId: String = js.native
  
  /** @type {number} Indicates the id of this Room. */
  var id: Double = js.native
  
  /** @type {boolean} Indicates whether this is a Game Room or not. */
  var isGame: Boolean = js.native
  
  /** @type {boolean} Indicates whether this Room is hidden or not. */
  var isHidden: Boolean = js.native
  
  /** @type {boolean} Indicates whether the client joined this Room or not. */
  var isJoined: Boolean = js.native
  
  /** @type {boolean} Indicates whether this Room requires a password to be joined or not. */
  var isPasswordProtected: Boolean = js.native
  
  /** @type {number} Returns the maximum number of spectators allowed in this Room (Game Rooms only). */
  var maxSpectators: Double = js.native
  
  /** @type {number} Returns the maximum number of users allowed in this Room. */
  var maxUsers: Double = js.native
  
  /** @type {string} Indicates the name of this Room. */
  var name: String = js.native
  
  /** @type {Object} Defines a generic utility object that can be used to store custom Room data. */
  var properties: js.Object = js.native
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
  
  @scala.inline
  implicit class SFSRoomMutableBuilder[Self <: SFSRoom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainsUser(value: SFSUser => Boolean): Self = StObject.set(x, "containsUser", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContainsVariable(value: String => Boolean): Self = StObject.set(x, "containsVariable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCapacity(value: () => Double): Self = StObject.set(x, "getCapacity", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPlayerList(value: () => js.Array[SFSUser]): Self = StObject.set(x, "getPlayerList", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRoomManager(value: () => RoomManager): Self = StObject.set(x, "getRoomManager", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSpectatorCount(value: () => Double): Self = StObject.set(x, "getSpectatorCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSpectatorList(value: () => js.Array[SFSUser]): Self = StObject.set(x, "getSpectatorList", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUserById(value: Double => SFSUser): Self = StObject.set(x, "getUserById", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetUserByName(value: String => SFSUser): Self = StObject.set(x, "getUserByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetUserCount(value: () => Double): Self = StObject.set(x, "getUserCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUserList(value: () => js.Array[SFSUser]): Self = StObject.set(x, "getUserList", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVariable(value: String => SFSRoomVariable): Self = StObject.set(x, "getVariable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetVariables(value: () => js.Array[SFSRoomVariable]): Self = StObject.set(x, "getVariables", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsGame(value: Boolean): Self = StObject.set(x, "isGame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsJoined(value: Boolean): Self = StObject.set(x, "isJoined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPasswordProtected(value: Boolean): Self = StObject.set(x, "isPasswordProtected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSpectators(value: Double): Self = StObject.set(x, "maxSpectators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUsers(value: Double): Self = StObject.set(x, "maxUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: js.Object): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
