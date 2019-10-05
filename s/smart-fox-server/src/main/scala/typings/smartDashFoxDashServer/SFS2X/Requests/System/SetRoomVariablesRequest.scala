package typings.smartDashFoxDashServer.SFS2X.Requests.System

import typings.smartDashFoxDashServer.SFS2X.Entities.SFSRoom
import typings.smartDashFoxDashServer.SFS2X.Entities.Variables.SFSRoomVariable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Requests.System.SetRoomVariablesRequest")
@js.native
class SetRoomVariablesRequest protected () extends js.Object {
  /**
    * Creates a new SetRoomVariablesRequest instance.
    * @param {Entities.Variables.SFSRoomVariable[]} roomVariables A list of SFSRoomVariable objects representing the Room Variables to be set.
    * @param {Entities.SFSRoom}                     [room=null]          A SFSRoom object representing the Room where to set the Room Variables; if null, the last Room joined by the current user is used.
    */
  def this(roomVariables: js.Array[SFSRoomVariable], room: SFSRoom) = this()
}

