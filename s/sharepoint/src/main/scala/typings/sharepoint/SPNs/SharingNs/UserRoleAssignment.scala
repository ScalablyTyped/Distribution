package typings.sharepoint.SPNs.SharingNs

import typings.sharepoint.SPNs.ClientValueObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Sharing.UserRoleAssignment")
@js.native
class UserRoleAssignment () extends ClientValueObject {
  def get_role(): Role = js.native
  def get_userId(): String = js.native
  def set_role(value: Role): Unit = js.native
  def set_userId(value: String): Unit = js.native
}

