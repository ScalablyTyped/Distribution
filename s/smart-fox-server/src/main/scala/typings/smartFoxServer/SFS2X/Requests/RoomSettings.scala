package typings.smartFoxServer.SFS2X.Requests

import typings.smartFoxServer.SFS2X.Entities.Variables.ReservedRoomVariables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoomSettings extends StObject {
  
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
  implicit class RoomSettingsMutableBuilder[Self <: RoomSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: RoomEvents): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtension(value: RoomExtension): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsGame(value: Boolean): Self = StObject.set(x, "isGame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSpectators(value: Double): Self = StObject.set(x, "maxSpectators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUsers(value: Double): Self = StObject.set(x, "maxUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxVariables(value: Double): Self = StObject.set(x, "maxVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissions(value: RoomPermissions): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariables(value: js.Array[ReservedRoomVariables]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariablesVarargs(value: ReservedRoomVariables*): Self = StObject.set(x, "variables", js.Array(value :_*))
  }
}
