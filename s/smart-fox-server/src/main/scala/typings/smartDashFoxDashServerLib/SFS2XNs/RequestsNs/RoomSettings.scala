package typings
package smartDashFoxDashServerLib.SFS2XNs.RequestsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Requests.RoomSettings")
@js.native
class RoomSettings protected () extends js.Object {
  /**
               * Creates a new RoomSettings instance.
               * @param {string} name The name of the Room to be created.
               */
  def this(name: java.lang.String) = this()
  /** @type {RoomEvents} Sets the flags indicating which events related to the Room are dispatched by the SmartFox client. */
  var events: RoomEvents = js.native
  /** @type {RoomExtension} Sets the Extension that must be attached to the Room on the server-side, and its settings. */
  var extension: RoomExtension = js.native
  /** @type {string} Sets the id of the Group to which the Room should belong. */
  var groupId: java.lang.String = js.native
  /** @type {boolean} Sets whether the Room is a Game Room or not. */
  var isGame: scala.Boolean = js.native
  /** @type {number} Sets the maximum number of spectators allowed in the Room (only for Game Rooms). */
  var maxSpectators: scala.Double = js.native
  /** @type {number} Sets the maximum number of users allowed in the Room. */
  var maxUsers: scala.Double = js.native
  /** @type {number} Sets the maximum number of Room Variables allowed for the Room. */
  var maxVariables: scala.Double = js.native
  /** @type {string} Defines the name of the Room. */
  var name: java.lang.String = js.native
  /** @type {string} Sets the password of the Room. */
  var password: java.lang.String = js.native
  /** @type {RoomPermissions} Sets the flags indicating which operations are permitted on the Room. */
  var permissions: RoomPermissions = js.native
  /** @type {Entities.Variables.ReservedRoomVariables[]} Sets a list of SFSRooomVariable objects to be attached to the Room. */
  var variables: js.Array[smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.VariablesNs.ReservedRoomVariables] = js.native
}

