package typings
package smartDashFoxDashServerLib.SFS2XNs

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
  var buddyManager: smartDashFoxDashServerLib.SFS2XNs.ManagersNs.BuddyManager = js.native
  /** @type {IconfigObj} Returns the client configuration object passed during the SmartFox instance creation. */
  var config: IconfigObj = js.native
  /** @type {boolean} Indicates whether the client-server messages console debug is enabled or not. */
  var debug: scala.Boolean = js.native
  /** @type {Entities.SFSRoom} Returns the object representing the last Room joined by the client, if any. */
  var lastJoinedRoom: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSRoom = js.native
  /** @type {Logger} Returns a reference to the internal Logger instance used by SmartFoxServer 2X. */
  var logger: Logger = js.native
  /** @type {Entities.SFSUser} Returns the SFSUser object representing the client itself when connected to a SmartFoxServer 2X instance. */
  var mySelf: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSUser = js.native
  /** @type {Managers.RoomManager} Returns a reference to the Room Manager. */
  var roomManager: smartDashFoxDashServerLib.SFS2XNs.ManagersNs.RoomManager = js.native
  /** @type {string} Returns the unique session token of the client. */
  var sessionToken: java.lang.String = js.native
  /** @type {Managers.UserManager} Returns a reference to the User Manager. */
  var userManager: smartDashFoxDashServerLib.SFS2XNs.ManagersNs.UserManager = js.native
  /** @type {string} Returns the current version of the SmartFoxServer 2X JavaScript API. */
  var version: java.lang.String = js.native
  /**
    * Registers an event listener function that will receive notification of an event.
    * @param {string}   evtType  The type of event to listen to, among those available in the SFSevent and SFSBuddyEvent classes.
    * @param {Function} listener The listener function that processes the event. This function should accept an object as its only parameter, which in turn contains the event parameters.
    * @param {number}   scope    The object that acts as a context for the event listener: it is the object that acts as a "parent scope" for the callback function, thus providing context (i.e. access to variables and other mehtods) to the function itself.
    */
  def addEventListener(evtType: java.lang.String, listener: js.Function, scope: scala.Double): scala.Unit = js.native
  /**
    * Establishes a connection between the client and a SmartFoxServer 2X instance.
    * @param {string}  [host]   The address of the server to connect to.
    * @param {number}  [port]   The TCP port to connect to.
    * @param {boolean} [useSSL] Use an encrypted SSL connection.
    */
  def connect(): scala.Unit = js.native
  def connect(host: java.lang.String): scala.Unit = js.native
  def connect(host: java.lang.String, port: scala.Double): scala.Unit = js.native
  def connect(host: java.lang.String, port: scala.Double, useSSL: scala.Boolean): scala.Unit = js.native
  /**
    * Closes the connection between the client and the SmartFoxServer 2X instance.
    */
  def disconnect(): scala.Unit = js.native
  /**
    * Enables the automatic realtime monitoring of the lag between the client and the server (round robin).
    * @param {boolean} enabled   The lag monitoring status: true to start the monitoring, false to stop it.
    * @param {number}  [interval=4]  The amount of seconds to wait between each query (recommended 3-4s).
    * @param {number}  [queueSize=10] The amount of values stored temporarily and used to calculate the average lag.
    */
  def enableLagMonitor(enabled: scala.Boolean): scala.Unit = js.native
  def enableLagMonitor(enabled: scala.Boolean, interval: scala.Double): scala.Unit = js.native
  def enableLagMonitor(enabled: scala.Boolean, interval: scala.Double, queueSize: scala.Double): scala.Unit = js.native
  /**
    * Returns a list of SFSRoom objects representing the Rooms currently joined by the client.
    * @return {Entities.SFSRoom[]} Returns: The list of SFSRoom objects representing the Rooms joined by the client.
    */
  def getJoinedRooms(): js.Array[smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSRoom] = js.native
  /**
    * Returns the maximum size of messages allowed by the server.
    * @return {number} Returns: The maximum size of messages allowed by the server.
    */
  def getMaxMessageSize(): scala.Double = js.native
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
    * Returns the list of SFSRoom objects representing the Rooms currently "watched" by the client.
    * @return {Entities.SFSRoom[]} Returns: The list of SFSRoom objects representing the Rooms available on the client.
    */
  def getRoomList(): js.Array[smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSRoom] = js.native
  /**
    * Retrieves the list of Rooms which are part of the specified Room Group.
    * @param  {string}           groupId The name of the Group.
    * @return {Entities.SFSRoom}         Returns: The list of SFSRoom objects belonging to the passed Group.
    */
  def getRoomListFromGroup(groupId: java.lang.String): smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSRoom = js.native
  /**
    * Indicates whether the client is connected to the server or not.
    * @return {boolean} Returns: true if the client is connected.
    */
  def isConnected(): scala.Boolean = js.native
  /**
    * Removes an event listener.
    * @param {string}   evtType  The type of event to remove, among those available in the SFSevent and SFSBuddyEvent classes.
    * @param {Function} listener The listener function to be removed.
    */
  def removeEventListener(evtType: java.lang.String, listener: js.Function): scala.Unit = js.native
  /**
    * Sends a request to the server.
    * @param {(Requests.BuddyList.AddBuddyRequest | Requests.BuddyList.BlockBuddyRequest | Requests.BuddyList.BuddyMessageRequest | Requests.BuddyList.GoOnlineRequest | Requests.BuddyList.InitBuddyListRequest | Requests.BuddyList.RemoveBuddyRequest | Requests.BuddyList.SetBuddyVariablesRequest | Requests.Game.CreateSFSGameRequest | Requests.Game.InvitationReplyRequest | Requests.Game.InviteUsersRequest | Requests.Game.QuickJoinGameRequest | Requests.MMO.SetUserPositionRequest | Requests.System.AdminMessageRequest | Requests.System.BanUserRequest | Requests.System.ChangeRoomCapacityRequest | Requests.System.ChangeRoomNameRequest | Requests.System.ChangeRoomPasswordStateRequest | Requests.System.CreateRoomRequest | Requests.System.ExtensionRequest | Requests.System.FindRoomsRequest | Requests.System.FindUsersRequest | Requests.System.JoinRoomRequest | Requests.System.KickUserRequest | Requests.System.LeaveRoomRequest | Requests.System.LoginRequest | Requests.System.LogoutRequest | Requests.System.ModeratorMessageRequest | Requests.System.ObjectMessageRequest | Requests.System.PlayerToSpectatorRequest | Requests.System.PrivateMessageRequest | Requests.System.PublicMessageRequest | Requests.System.SetRoomVariablesRequest | Requests.System.SetUserVariablesRequest | Requests.System.SpectatorToPlayerRequest | Requests.System.SubscribeRoomGroupRequest | Requests.System.UnsubscribeRoomGroupRequest)} request Sends a request to the server.
    */
  def send(
    request: smartDashFoxDashServerLib.SFS2XNs.RequestsNs.BuddyListNs.AddBuddyRequest | smartDashFoxDashServerLib.SFS2XNs.RequestsNs.BuddyListNs.BlockBuddyRequest | smartDashFoxDashServerLib.SFS2XNs.RequestsNs.BuddyListNs.BuddyMessageRequest | smartDashFoxDashServerLib.SFS2XNs.RequestsNs.BuddyListNs.GoOnlineRequest | smartDashFoxDashServerLib.SFS2XNs.RequestsNs.BuddyListNs.InitBuddyListRequest | smartDashFoxDashServerLib.SFS2XNs.RequestsNs.BuddyListNs.RemoveBuddyRequest | smartDashFoxDashServerLib.SFS2XNs.RequestsNs.BuddyListNs.SetBuddyVariablesRequest | smartDashFoxDashServerLib.SFS2XNs.RequestsNs.GameNs.CreateSFSGameRequest | smartDashFoxDashServerLib.SFS2XNs.RequestsNs.GameNs.InvitationReplyRequest | smartDashFoxDashServerLib.SFS2XNs.RequestsNs.GameNs.InviteUsersRequest | smartDashFoxDashServerLib.SFS2XNs.RequestsNs.GameNs.QuickJoinGameRequest | smartDashFoxDashServerLib.SFS2XNs.RequestsNs.MMONs.SetUserPositionRequest | smartDashFoxDashServerLib.SFS2XNs.RequestsNs.SystemNs.AdminMessageRequest | smartDashFoxDashServerLib.SFS2XNs.RequestsNs.SystemNs.BanUserRequest | smartDashFoxDashServerLib.SFS2XNs.RequestsNs.SystemNs.ChangeRoomCapacityRequest | smartDashFoxDashServerLib.SFS2XNs.RequestsNs.SystemNs.ChangeRoomNameRequest | smartDashFoxDashServerLib.SFS2XNs.RequestsNs.SystemNs.ChangeRoomPasswordStateRequest | smartDashFoxDashServerLib.SFS2XNs.RequestsNs.SystemNs.CreateRoomRequest | smartDashFoxDashServerLib.SFS2XNs.RequestsNs.SystemNs.ExtensionRequest | smartDashFoxDashServerLib.SFS2XNs.RequestsNs.SystemNs.FindRoomsRequest | smartDashFoxDashServerLib.SFS2XNs.RequestsNs.SystemNs.FindUsersRequest | smartDashFoxDashServerLib.SFS2XNs.RequestsNs.SystemNs.JoinRoomRequest | smartDashFoxDashServerLib.SFS2XNs.RequestsNs.SystemNs.KickUserRequest | smartDashFoxDashServerLib.SFS2XNs.RequestsNs.SystemNs.LeaveRoomRequest | smartDashFoxDashServerLib.SFS2XNs.RequestsNs.SystemNs.LoginRequest | smartDashFoxDashServerLib.SFS2XNs.RequestsNs.SystemNs.LogoutRequest | smartDashFoxDashServerLib.SFS2XNs.RequestsNs.SystemNs.ModeratorMessageRequest | smartDashFoxDashServerLib.SFS2XNs.RequestsNs.SystemNs.ObjectMessageRequest | smartDashFoxDashServerLib.SFS2XNs.RequestsNs.SystemNs.PlayerToSpectatorRequest | smartDashFoxDashServerLib.SFS2XNs.RequestsNs.SystemNs.PrivateMessageRequest | smartDashFoxDashServerLib.SFS2XNs.RequestsNs.SystemNs.PublicMessageRequest | smartDashFoxDashServerLib.SFS2XNs.RequestsNs.SystemNs.SetRoomVariablesRequest | smartDashFoxDashServerLib.SFS2XNs.RequestsNs.SystemNs.SetUserVariablesRequest | smartDashFoxDashServerLib.SFS2XNs.RequestsNs.SystemNs.SpectatorToPlayerRequest | smartDashFoxDashServerLib.SFS2XNs.RequestsNs.SystemNs.SubscribeRoomGroupRequest | smartDashFoxDashServerLib.SFS2XNs.RequestsNs.SystemNs.UnsubscribeRoomGroupRequest
  ): scala.Unit = js.native
  /**
    * Allows to specify custom client details that will be used to gather statistics about the client platform via the AdminTool's Analytics Module.
    * @param {string} platformId An identification string for the client, like the browser name for example.
    * @param {string} version    An additional string to describe the client version, like the browser version for example.
    */
  def setClientDetails(platformId: java.lang.String, version: java.lang.String): scala.Unit = js.native
}

