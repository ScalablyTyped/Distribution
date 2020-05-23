package typings.smartFoxServer.global.SFS2X.Entities

import typings.smartFoxServer.SFS2X.Entities.Data.Vec3D
import typings.smartFoxServer.SFS2X.Entities.Variables.SFSRoomVariable
import typings.smartFoxServer.SFS2X.Managers.RoomManager
import typings.smartFoxServer.SFS2X.Requests.MMO.MapLimits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Entities.MMORoom")
@js.native
class MMORoom protected ()
  extends typings.smartFoxServer.SFS2X.Entities.MMORoom {
  /**
    * Creates a new MMORoom instance.
    * @param {number} id      The MMORoom id.
    * @param {string} name    The MMORoom name.
    * @param {string} groupId The id of the Group to which the MMORoom belongs.
    */
  def this(id: Double, name: String) = this()
  def this(id: Double, name: String, groupId: String) = this()
  /** @type {Data.Vec3D} Returns the default Area of Interest (AoI) of this MMORoom. */
  /* CompleteClass */
  override var defaultAOI: Vec3D = js.native
  /** @type {string} Returns the Room Group name. */
  /* CompleteClass */
  override var groupId: String = js.native
  /** @type {Requests.MMO.MapLimits} Returns the higher coordinates limit of the virtual environment represented by the MMORoom along the X,Y,Z axes. If null is returned, no limits were set at Room creation time. */
  /* CompleteClass */
  override var higherMapLimit: MapLimits = js.native
  /** @type {number} Indicates the id of this Room. */
  /* CompleteClass */
  override var id: Double = js.native
  /** @type {boolean} Indicates whether this is a Game Room or not. */
  /* CompleteClass */
  override var isGame: Boolean = js.native
  /** @type {boolean} Indicates whether this Room is hidden or not. */
  /* CompleteClass */
  override var isHidden: Boolean = js.native
  /** @type {boolean} Indicates whether the client joined this Room or not. */
  /* CompleteClass */
  override var isJoined: Boolean = js.native
  /** @type {boolean} Indicates whether this Room requires a password to be joined or not. */
  /* CompleteClass */
  override var isPasswordProtected: Boolean = js.native
  /** @type {Requests.MMO.MapLimits} Returns the lower coordinates limit of the virtual environment represented by the MMORoom along the X,Y,Z axes. If null is returned, no limits were set at Room creation time. */
  /* CompleteClass */
  override var lowerMapLimit: MapLimits = js.native
  /** @type {number} Returns the maximum number of spectators allowed in this Room (Game Rooms only). */
  /* CompleteClass */
  override var maxSpectators: Double = js.native
  /** @type {number} Returns the maximum number of users allowed in this Room. */
  /* CompleteClass */
  override var maxUsers: Double = js.native
  /** @type {string} Indicates the name of this Room. */
  /* CompleteClass */
  override var name: String = js.native
  /** @type {Object} Defines a generic utility object that can be used to store custom Room data. */
  /* CompleteClass */
  override var properties: js.Object = js.native
  /**
    * Indicates whether the specified user is currently inside this Room or not.
    * @param  {SFSUser} user The SFSUser object representing the user whose presence in this Room must be checked.
    * @return {boolean}      Returns: true if the user is inside this Room; false otherwise.
    */
  /* CompleteClass */
  override def containsUser(user: typings.smartFoxServer.SFS2X.Entities.SFSUser): Boolean = js.native
  /**
    * Indicates whether this Room has the specified Room Variable set or not.
    * @param  {string}  varName The name of the Room Variable whose existance in this Room must be checked.
    * @return {boolean}         Returns: true if a Room Variable with the passed name exists in this Room.
    */
  /* CompleteClass */
  override def containsVariable(varName: String): Boolean = js.native
  /**
    * Returns the maximum amount of users, including spectators, that can be contained in this Room.
    * @return {number} Returns: Maximum number of users that can enter the Room.
    */
  /* CompleteClass */
  override def getCapacity(): Double = js.native
  /**
    * Retrieves an MMOItem object from its id property. The item is available to the current user if it falls within their Area of Interest only.
    * @param  {number}  id The id of the item to be retrieved.
    * @return {MMOItem}    Returns: An MMOItem object, or null if the item with the passed id is not in proximity of the current user.
    */
  /* CompleteClass */
  override def getMMOItem(id: Double): typings.smartFoxServer.SFS2X.Entities.MMOItem = js.native
  /**
    * Retrieves all MMOItem object in the MMORoom that fall within the current user's Area of Interest.
    * @return {MMOItem[]} Returns: A list of MMOItem objects, or an empty list if no item is in proximity of the current user.
    */
  /* CompleteClass */
  override def getMMOItems(): js.Array[typings.smartFoxServer.SFS2X.Entities.MMOItem] = js.native
  /**
    * Retrieves the list of SFSUser objects representing the players currently inside this Room (Game Rooms only).
    * @return {SFSUser[]} Returns: The list of SFSUser objects representing the users who joined the Room as players.
    */
  /* CompleteClass */
  override def getPlayerList(): js.Array[typings.smartFoxServer.SFS2X.Entities.SFSUser] = js.native
  /**
    * Retrieves a reference to the Room Manager which manages this Room.
    * @return {Managers.RoomManager} Returns: The Room Manager to which this Room is associated.
    */
  /* CompleteClass */
  override def getRoomManager(): RoomManager = js.native
  /**
    * Returns the current number of spectators in this Room (Game Rooms only).
    * @return {number} Returns: Current number of spectators in the Room.
    */
  /* CompleteClass */
  override def getSpectatorCount(): Double = js.native
  /**
    * Retrieves the list of SFSUser objects representing the spectators currently inside this Room (Game Rooms only).
    * @return {SFSUser[]} Returns: The list of SFSUser objects representing the users who joined the Room as spectators.
    */
  /* CompleteClass */
  override def getSpectatorList(): js.Array[typings.smartFoxServer.SFS2X.Entities.SFSUser] = js.native
  /**
    * Retrieves a SFSUser object from its id property.
    * @param  {number}  id The id of the user to be found.
    * @return {SFSUser}    Returns: An object representing the user, or null if no user with the passed id exists in this Room.
    */
  /* CompleteClass */
  override def getUserById(id: Double): typings.smartFoxServer.SFS2X.Entities.SFSUser = js.native
  /**
    * Retrieves a SFSUser object from its name property.
    * @param  {string}  name The name of the user to be found.
    * @return {SFSUser}      Returns: An object representing the user, or null if no user with the passed name exists in this Room.
    */
  /* CompleteClass */
  override def getUserByName(name: String): typings.smartFoxServer.SFS2X.Entities.SFSUser = js.native
  /**
    * Returns the current number of users in this Room. In case of Game Rooms, this is the number of players.
    * @return {number} Returns: Current number of users in the Room.
    */
  /* CompleteClass */
  override def getUserCount(): Double = js.native
  /**
    * Returns the current number of users in this Room. In case of Game Rooms, this is the number of players.
    * @return {SFSUser[]} Returns: Current number of users in the Room.
    */
  /* CompleteClass */
  override def getUserList(): js.Array[typings.smartFoxServer.SFS2X.Entities.SFSUser] = js.native
  /**
    * Retrieves a Room Variable from its name.
    * @param  {string}                    varName The name of the Room Variable to be retrieved.
    * @return {Variables.SFSRoomVariable}         Returns: The object representing the Room Variable, or null if no Room Variable with the passed name exists in this Room.
    */
  /* CompleteClass */
  override def getVariable(varName: String): SFSRoomVariable = js.native
  /**
    * Retrieves all the Room Variables of this Room.
    * @return {Variables.SFSRoomVariable[]} Returns: The list of SFSRoomVariable objects associated with this Room.
    */
  /* CompleteClass */
  override def getVariables(): js.Array[SFSRoomVariable] = js.native
}

