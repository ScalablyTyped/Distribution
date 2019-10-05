package typings.smartDashFoxDashServer.SFS2X.Requests.System

import typings.smartDashFoxDashServer.SFS2X.Entities.SFSRoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Requests.System.LeaveRoomRequest")
@js.native
/**
  * Creates a new LeaveRoomRequest instance.
  * @param {Entities.SFSRoom} [room=null] The SFSRoom object corresponding to the Room that the current user must leave. If null, the last Room joined by the user is left.
  */
class LeaveRoomRequest () extends js.Object {
  def this(room: SFSRoom) = this()
}

