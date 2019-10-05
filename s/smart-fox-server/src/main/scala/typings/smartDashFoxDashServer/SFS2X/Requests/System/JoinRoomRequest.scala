package typings.smartDashFoxDashServer.SFS2X.Requests.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Requests.System.JoinRoomRequest")
@js.native
class JoinRoomRequest protected () extends js.Object {
  /**
    * Creates a new JoinRoomRequest instance.
    * @param {any}     room          The id or the name of the Room to be joined.
    * @param {string}  [password]      The password of the Room, in case it is password protected.
    * @param {number}  [roomIdToLeave] The id of a previously joined Room that the user should leave when joining the new Room. By default, the last joined Room is left; if a negative number is passed, no previous Room is left.
    * @param {boolean} [asSpect=false]       true to join the Room as a spectator (in Game Rooms only).
    */
  def this(room: js.Any) = this()
  def this(room: js.Any, password: String) = this()
  def this(room: js.Any, password: String, roomIdToLeave: Double) = this()
  def this(room: js.Any, password: String, roomIdToLeave: Double, asSpect: Boolean) = this()
}

