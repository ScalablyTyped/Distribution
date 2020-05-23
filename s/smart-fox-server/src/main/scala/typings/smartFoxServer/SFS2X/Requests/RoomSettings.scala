package typings.smartFoxServer.SFS2X.Requests

import typings.smartFoxServer.SFS2X.Entities.Variables.ReservedRoomVariables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomSettings extends js.Object {
  /** @type {RoomEvents} Sets the flags indicating which events related to the Room are dispatched by the SmartFox client. */
  var events: RoomEvents
  /** @type {RoomExtension} Sets the Extension that must be attached to the Room on the server-side, and its settings. */
  var extension: RoomExtension
  /** @type {string} Sets the id of the Group to which the Room should belong. */
  var groupId: String
  /** @type {boolean} Sets whether the Room is a Game Room or not. */
  var isGame: Boolean
  /** @type {number} Sets the maximum number of spectators allowed in the Room (only for Game Rooms). */
  var maxSpectators: Double
  /** @type {number} Sets the maximum number of users allowed in the Room. */
  var maxUsers: Double
  /** @type {number} Sets the maximum number of Room Variables allowed for the Room. */
  var maxVariables: Double
  /** @type {string} Defines the name of the Room. */
  var name: String
  /** @type {string} Sets the password of the Room. */
  var password: String
  /** @type {RoomPermissions} Sets the flags indicating which operations are permitted on the Room. */
  var permissions: RoomPermissions
  /** @type {Entities.Variables.ReservedRoomVariables[]} Sets a list of SFSRooomVariable objects to be attached to the Room. */
  var variables: js.Array[ReservedRoomVariables]
}

object RoomSettings {
  @scala.inline
  def apply(
    events: RoomEvents,
    extension: RoomExtension,
    groupId: String,
    isGame: Boolean,
    maxSpectators: Double,
    maxUsers: Double,
    maxVariables: Double,
    name: String,
    password: String,
    permissions: RoomPermissions,
    variables: js.Array[ReservedRoomVariables]
  ): RoomSettings = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], extension = extension.asInstanceOf[js.Any], groupId = groupId.asInstanceOf[js.Any], isGame = isGame.asInstanceOf[js.Any], maxSpectators = maxSpectators.asInstanceOf[js.Any], maxUsers = maxUsers.asInstanceOf[js.Any], maxVariables = maxVariables.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomSettings]
  }
}

