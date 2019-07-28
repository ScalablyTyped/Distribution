package typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.SystemNs

import typings.smartDashFoxDashServer.SFS2XNs.EntitiesNs.SFSRoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Requests.System.ChangeRoomNameRequest")
@js.native
class ChangeRoomNameRequest protected () extends js.Object {
  /**
    * Creates a new ChangeRoomNameRequest instance.
    * @param {Entities.SFSRoom} room    The SFSRoom object corresponding to the Room whose name should be changed.
    * @param {string}           newName The new name to be assigned to the Room.
    */
  def this(room: SFSRoom, newName: String) = this()
}

