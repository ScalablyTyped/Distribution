package typings
package sharepointLib.SPNs.SharingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Sharing.UserSharingResult")
@js.native
class UserSharingResult ()
  extends sharepointLib.SPNs.ClientValueObject {
  def get_allowedRoles(): js.Array[Role] = js.native
  def get_currentRole(): Role = js.native
  def get_isUserKnown(): scala.Boolean = js.native
  def get_message(): java.lang.String = js.native
  def get_status(): scala.Boolean = js.native
  def get_user(): java.lang.String = js.native
}

