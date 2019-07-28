package typings.smartDashFoxDashServer.SFS2XNs

import typings.smartDashFoxDashServer.SFS2XNs.EntitiesNs.SFSRoom
import typings.smartDashFoxDashServer.SFS2XNs.EntitiesNs.SFSUser
import typings.smartDashFoxDashServer.SFS2XNs.ManagersNs.BuddyManager
import typings.smartDashFoxDashServer.SFS2XNs.ManagersNs.RoomManager
import typings.smartDashFoxDashServer.SFS2XNs.ManagersNs.UserManager
import typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.BuddyListNs.AddBuddyRequest
import typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.BuddyListNs.BlockBuddyRequest
import typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.BuddyListNs.BuddyMessageRequest
import typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.BuddyListNs.GoOnlineRequest
import typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.BuddyListNs.InitBuddyListRequest
import typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.BuddyListNs.RemoveBuddyRequest
import typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.BuddyListNs.SetBuddyVariablesRequest
import typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.GameNs.CreateSFSGameRequest
import typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.GameNs.InvitationReplyRequest
import typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.GameNs.InviteUsersRequest
import typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.GameNs.QuickJoinGameRequest
import typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.MMONs.SetUserPositionRequest
import typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.SystemNs.AdminMessageRequest
import typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.SystemNs.BanUserRequest
import typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.SystemNs.ChangeRoomCapacityRequest
import typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.SystemNs.ChangeRoomNameRequest
import typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.SystemNs.ChangeRoomPasswordStateRequest
import typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.SystemNs.CreateRoomRequest
import typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.SystemNs.ExtensionRequest
import typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.SystemNs.FindRoomsRequest
import typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.SystemNs.FindUsersRequest
import typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.SystemNs.JoinRoomRequest
import typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.SystemNs.KickUserRequest
import typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.SystemNs.LeaveRoomRequest
import typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.SystemNs.LoginRequest
import typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.SystemNs.LogoutRequest
import typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.SystemNs.ModeratorMessageRequest
import typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.SystemNs.ObjectMessageRequest
import typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.SystemNs.PlayerToSpectatorRequest
import typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.SystemNs.PrivateMessageRequest
import typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.SystemNs.PublicMessageRequest
import typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.SystemNs.SetRoomVariablesRequest
import typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.SystemNs.SetUserVariablesRequest
import typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.SystemNs.SpectatorToPlayerRequest
import typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.SystemNs.SubscribeRoomGroupRequest
import typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.SystemNs.UnsubscribeRoomGroupRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.SmartFox")
@js.native
/**
  * Creates a new SmartFox instance.
  * @param {IconfigObj} configObj The SmartFox instance can be configured through a configuration object with the following properties (all optional).
  */
class SmartFox () extends js.Object {
  def this(configObj: IconfigObj) = this()
  /** @type {Managers.BuddyManager} Returns a reference to the Buddy Manager. */
  var buddyManager: BuddyManager = js.native
  /** @type {IconfigObj} Returns the client configuration object passed during the SmartFox instance creation. */
  var config: IconfigObj = js.native
  /** @type {boolean} Indicates whether the client-server messages console debug is enabled or not. */
  var debug: Boolean = js.native
  /** @type {Entities.SFSRoom} Returns the object representing the last Room joined by the client, if any. */
  var lastJoinedRoom: SFSRoom = js.native
  /** @type {Logger} Returns a reference to the internal Logger instance used by SmartFoxServer 2X. */
  var logger: Logger = js.native
  /** @type {Entities.SFSUser} Returns the SFSUser object representing the client itself when connected to a SmartFoxServer 2X instance. */
  var mySelf: SFSUser = js.native
  /** @type {Managers.RoomManager} Returns a reference to the Room Manager. */
  var roomManager: RoomManager = js.native
  /** @type {string} Returns the unique session token of the client. */
  var sessionToken: String = js.native
  /** @type {Managers.UserManager} Returns a reference to the User Manager. */
  var userManager: UserManager = js.native
  /** @type {string} Returns the current version of the SmartFoxServer 2X JavaScript API. */
  var version: String = js.native
  /**
    * Registers an event listener function that will receive notification of an event.
    * @param {string}   evtType  The type of event to listen to, among those available in the SFSevent and SFSBuddyEvent classes.
    * @param {Function} listener The listener function that processes the event. This function should accept an object as its only parameter, which in turn contains the event parameters.
    * @param {number}   scope    The object that acts as a context for the event listener: it is the object that acts as a "parent scope" for the callback function, thus providing context (i.e. access to variables and other mehtods) to the function itself.
    */
  def addEventListener(evtType: String, listener: js.Function, scope: Double): Unit = js.native
  /**
    * Establishes a connection between the client and a SmartFoxServer 2X instance.
    * @param {string}  [host]   The address of the server to connect to.
    * @param {number}  [port]   The TCP port to connect to.
    * @param {boolean} [useSSL] Use an encrypted SSL connection.
    */
  def connect(): Unit = js.native
  def connect(host: String): Unit = js.native
  def connect(host: String, port: Double): Unit = js.native
  def connect(host: String, port: Double, useSSL: Boolean): Unit = js.native
  /**
    * Closes the connection between the client and the SmartFoxServer 2X instance.
    */
  def disconnect(): Unit = js.native
  /**
    * Enables the automatic realtime monitoring of the lag between the client and the server (round robin).
    * @param {boolean} enabled   The lag monitoring status: true to start the monitoring, false to stop it.
    * @param {number}  [interval=4]  The amount of seconds to wait between each query (recommended 3-4s).
    * @param {number}  [queueSize=10] The amount of values stored temporarily and used to calculate the average lag.
    */
  def enableLagMonitor(enabled: Boolean): Unit = js.native
  def enableLagMonitor(enabled: Boolean, interval: Double): Unit = js.native
  def enableLagMonitor(enabled: Boolean, interval: Double, queueSize: Double): Unit = js.native
  /**
    * Returns a list of SFSRoom objects representing the Rooms currently joined by the client.
    * @return {Entities.SFSRoom[]} Returns: The list of SFSRoom objects representing the Rooms joined by the client.
    */
  def getJoinedRooms(): js.Array[SFSRoom] = js.native
  /**
    * Returns the maximum size of messages allowed by the server.
    * @return {number} Returns: The maximum size of messages allowed by the server.
    */
  def getMaxMessageSize(): Double = js.native
  /**
    * Retrieves a SFSRoom object from its id.
    * @param  {number}           id The id of the Room.
    * @return {Entities.SFSRoom}    Returns: The object representing the requested Room; null if no SFSRoom object with the passed id exists in the Rooms list.
    */
  def getRoomById(id: Double): SFSRoom = js.native
  /**
    * Retrieves a SFSRoom object from its name.
    * @param  {string}           name The name of the Room.
    * @return {Entities.SFSRoom}      Returns: The object representing the requested Room; null if no SFSRoom object with the passed name exists in the Rooms list.
    */
  def getRoomByName(name: String): SFSRoom = js.native
  /**
    * Returns the list of SFSRoom objects representing the Rooms currently "watched" by the client.
    * @return {Entities.SFSRoom[]} Returns: The list of SFSRoom objects representing the Rooms available on the client.
    */
  def getRoomList(): js.Array[SFSRoom] = js.native
  /**
    * Retrieves the list of Rooms which are part of the specified Room Group.
    * @param  {string}           groupId The name of the Group.
    * @return {Entities.SFSRoom}         Returns: The list of SFSRoom objects belonging to the passed Group.
    */
  def getRoomListFromGroup(groupId: String): SFSRoom = js.native
  /**
    * Indicates whether the client is connected to the server or not.
    * @return {boolean} Returns: true if the client is connected.
    */
  def isConnected(): Boolean = js.native
  /**
    * Removes an event listener.
    * @param {string}   evtType  The type of event to remove, among those available in the SFSevent and SFSBuddyEvent classes.
    * @param {Function} listener The listener function to be removed.
    */
  def removeEventListener(evtType: String, listener: js.Function): Unit = js.native
  /**
    * Sends a request to the server.
    * @param {(Requests.BuddyList.AddBuddyRequest | Requests.BuddyList.BlockBuddyRequest | Requests.BuddyList.BuddyMessageRequest | Requests.BuddyList.GoOnlineRequest | Requests.BuddyList.InitBuddyListRequest | Requests.BuddyList.RemoveBuddyRequest | Requests.BuddyList.SetBuddyVariablesRequest | Requests.Game.CreateSFSGameRequest | Requests.Game.InvitationReplyRequest | Requests.Game.InviteUsersRequest | Requests.Game.QuickJoinGameRequest | Requests.MMO.SetUserPositionRequest | Requests.System.AdminMessageRequest | Requests.System.BanUserRequest | Requests.System.ChangeRoomCapacityRequest | Requests.System.ChangeRoomNameRequest | Requests.System.ChangeRoomPasswordStateRequest | Requests.System.CreateRoomRequest | Requests.System.ExtensionRequest | Requests.System.FindRoomsRequest | Requests.System.FindUsersRequest | Requests.System.JoinRoomRequest | Requests.System.KickUserRequest | Requests.System.LeaveRoomRequest | Requests.System.LoginRequest | Requests.System.LogoutRequest | Requests.System.ModeratorMessageRequest | Requests.System.ObjectMessageRequest | Requests.System.PlayerToSpectatorRequest | Requests.System.PrivateMessageRequest | Requests.System.PublicMessageRequest | Requests.System.SetRoomVariablesRequest | Requests.System.SetUserVariablesRequest | Requests.System.SpectatorToPlayerRequest | Requests.System.SubscribeRoomGroupRequest | Requests.System.UnsubscribeRoomGroupRequest)} request Sends a request to the server.
    */
  def send(
    request: AddBuddyRequest | BlockBuddyRequest | BuddyMessageRequest | GoOnlineRequest | InitBuddyListRequest | RemoveBuddyRequest | SetBuddyVariablesRequest | CreateSFSGameRequest | InvitationReplyRequest | InviteUsersRequest | QuickJoinGameRequest | SetUserPositionRequest | AdminMessageRequest | BanUserRequest | ChangeRoomCapacityRequest | ChangeRoomNameRequest | ChangeRoomPasswordStateRequest | CreateRoomRequest | ExtensionRequest | FindRoomsRequest | FindUsersRequest | JoinRoomRequest | KickUserRequest | LeaveRoomRequest | LoginRequest | LogoutRequest | ModeratorMessageRequest | ObjectMessageRequest | PlayerToSpectatorRequest | PrivateMessageRequest | PublicMessageRequest | SetRoomVariablesRequest | SetUserVariablesRequest | SpectatorToPlayerRequest | SubscribeRoomGroupRequest | UnsubscribeRoomGroupRequest
  ): Unit = js.native
  /**
    * Allows to specify custom client details that will be used to gather statistics about the client platform via the AdminTool's Analytics Module.
    * @param {string} platformId An identification string for the client, like the browser name for example.
    * @param {string} version    An additional string to describe the client version, like the browser version for example.
    */
  def setClientDetails(platformId: String, version: String): Unit = js.native
}

