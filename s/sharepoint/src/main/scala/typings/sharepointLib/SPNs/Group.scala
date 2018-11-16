package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Group")
@js.native
class Group () extends Principal {
  def get_allowMembersEditMembership(): scala.Boolean = js.native
  def get_allowRequestToJoinLeave(): scala.Boolean = js.native
  def get_autoAcceptRequestToJoinLeave(): scala.Boolean = js.native
  def get_canCurrentUserEditMembership(): scala.Boolean = js.native
  def get_canCurrentUserManageGroup(): scala.Boolean = js.native
  def get_canCurrentUserViewMembership(): scala.Boolean = js.native
  def get_description(): java.lang.String = js.native
  def get_onlyAllowMembersViewMembership(): scala.Boolean = js.native
  def get_owner(): Principal = js.native
  def get_ownerTitle(): java.lang.String = js.native
  def get_requestToJoinLeaveEmailSetting(): java.lang.String = js.native
  def get_users(): UserCollection = js.native
  def set_allowMembersEditMembership(value: scala.Boolean): scala.Unit = js.native
  def set_allowRequestToJoinLeave(value: scala.Boolean): scala.Unit = js.native
  def set_autoAcceptRequestToJoinLeave(value: scala.Boolean): scala.Unit = js.native
  def set_description(value: java.lang.String): scala.Unit = js.native
  def set_onlyAllowMembersViewMembership(value: scala.Boolean): scala.Unit = js.native
  def set_owner(value: Principal): scala.Unit = js.native
  def set_requestToJoinLeaveEmailSetting(value: java.lang.String): scala.Unit = js.native
  def update(): scala.Unit = js.native
}

