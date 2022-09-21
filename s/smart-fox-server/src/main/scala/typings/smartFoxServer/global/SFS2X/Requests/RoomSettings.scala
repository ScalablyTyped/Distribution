package typings.smartFoxServer.global.SFS2X.Requests

import typings.smartFoxServer.SFS2X.Entities.Variables.ReservedRoomVariables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SFS2X.Requests.RoomSettings")
@js.native
open class RoomSettings protected ()
  extends StObject
     with typings.smartFoxServer.SFS2X.Requests.RoomSettings {
  /**
    * Creates a new RoomSettings instance.
    * @param {string} name The name of the Room to be created.
    */
  def this(name: String) = this()
  
  /** @type {RoomEvents} Sets the flags indicating which events related to the Room are dispatched by the SmartFox client. */
  /* CompleteClass */
  var events: typings.smartFoxServer.SFS2X.Requests.RoomEvents = js.native
  
  /** @type {RoomExtension} Sets the Extension that must be attached to the Room on the server-side, and its settings. */
  /* CompleteClass */
  var `extension`: typings.smartFoxServer.SFS2X.Requests.RoomExtension = js.native
  
  /** @type {string} Sets the id of the Group to which the Room should belong. */
  /* CompleteClass */
  var groupId: String = js.native
  
  /** @type {boolean} Sets whether the Room is a Game Room or not. */
  /* CompleteClass */
  var isGame: Boolean = js.native
  
  /** @type {number} Sets the maximum number of spectators allowed in the Room (only for Game Rooms). */
  /* CompleteClass */
  var maxSpectators: Double = js.native
  
  /** @type {number} Sets the maximum number of users allowed in the Room. */
  /* CompleteClass */
  var maxUsers: Double = js.native
  
  /** @type {number} Sets the maximum number of Room Variables allowed for the Room. */
  /* CompleteClass */
  var maxVariables: Double = js.native
  
  /** @type {string} Defines the name of the Room. */
  /* CompleteClass */
  var name: String = js.native
  
  /** @type {string} Sets the password of the Room. */
  /* CompleteClass */
  var password: String = js.native
  
  /** @type {RoomPermissions} Sets the flags indicating which operations are permitted on the Room. */
  /* CompleteClass */
  var permissions: typings.smartFoxServer.SFS2X.Requests.RoomPermissions = js.native
  
  /** @type {Entities.Variables.ReservedRoomVariables[]} Sets a list of SFSRooomVariable objects to be attached to the Room. */
  /* CompleteClass */
  var variables: js.Array[ReservedRoomVariables] = js.native
}
