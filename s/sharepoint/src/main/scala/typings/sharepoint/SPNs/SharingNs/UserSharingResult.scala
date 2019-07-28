package typings.sharepoint.SPNs.SharingNs

import typings.sharepoint.SPNs.ClientValueObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Sharing.UserSharingResult")
@js.native
class UserSharingResult () extends ClientValueObject {
  def get_allowedRoles(): js.Array[Role] = js.native
  def get_currentRole(): Role = js.native
  def get_isUserKnown(): Boolean = js.native
  def get_message(): String = js.native
  def get_status(): Boolean = js.native
  def get_user(): String = js.native
}

