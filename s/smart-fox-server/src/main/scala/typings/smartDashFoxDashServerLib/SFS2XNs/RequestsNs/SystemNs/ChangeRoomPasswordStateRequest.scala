package typings
package smartDashFoxDashServerLib.SFS2XNs.RequestsNs.SystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Requests.System.ChangeRoomPasswordStateRequest")
@js.native
class ChangeRoomPasswordStateRequest protected () extends js.Object {
  /**
    * Creates a new ChangeRoomPasswordStateRequest instance.
    * @param {Entities.SFSRoom} room    The SFSRoom object corresponding to the Room whose password should be changed.
    * @param {string}           newPass The new password to be assigned to the Room; an empty string or the null value can be passed to remove the Room's password.
    */
  def this(room: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSRoom, newPass: java.lang.String) = this()
}

