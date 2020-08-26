package typings.smartFoxServer.SFS2X.Requests

import typings.smartFoxServer.SFS2X.Entities.Variables.ReservedRoomVariables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoomSettings extends js.Object {
  /** @type {RoomEvents} Sets the flags indicating which events related to the Room are dispatched by the SmartFox client. */
  var events: RoomEvents = js.native
  /** @type {RoomExtension} Sets the Extension that must be attached to the Room on the server-side, and its settings. */
  var extension: RoomExtension = js.native
  /** @type {string} Sets the id of the Group to which the Room should belong. */
  var groupId: String = js.native
  /** @type {boolean} Sets whether the Room is a Game Room or not. */
  var isGame: Boolean = js.native
  /** @type {number} Sets the maximum number of spectators allowed in the Room (only for Game Rooms). */
  var maxSpectators: Double = js.native
  /** @type {number} Sets the maximum number of users allowed in the Room. */
  var maxUsers: Double = js.native
  /** @type {number} Sets the maximum number of Room Variables allowed for the Room. */
  var maxVariables: Double = js.native
  /** @type {string} Defines the name of the Room. */
  var name: String = js.native
  /** @type {string} Sets the password of the Room. */
  var password: String = js.native
  /** @type {RoomPermissions} Sets the flags indicating which operations are permitted on the Room. */
  var permissions: RoomPermissions = js.native
  /** @type {Entities.Variables.ReservedRoomVariables[]} Sets a list of SFSRooomVariable objects to be attached to the Room. */
  var variables: js.Array[ReservedRoomVariables] = js.native
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
  @scala.inline
  implicit class RoomSettingsOps[Self <: RoomSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEvents(value: RoomEvents): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtension(value: RoomExtension): Self = this.set("extension", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupId(value: String): Self = this.set("groupId", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsGame(value: Boolean): Self = this.set("isGame", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxSpectators(value: Double): Self = this.set("maxSpectators", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxUsers(value: Double): Self = this.set("maxUsers", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxVariables(value: Double): Self = this.set("maxVariables", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermissions(value: RoomPermissions): Self = this.set("permissions", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariablesVarargs(value: ReservedRoomVariables*): Self = this.set("variables", js.Array(value :_*))
    @scala.inline
    def setVariables(value: js.Array[ReservedRoomVariables]): Self = this.set("variables", value.asInstanceOf[js.Any])
  }
  
}

