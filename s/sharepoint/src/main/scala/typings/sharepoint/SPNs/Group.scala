package typings.sharepoint.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Group")
@js.native
class Group () extends Principal {
  def get_allowMembersEditMembership(): Boolean = js.native
  def get_allowRequestToJoinLeave(): Boolean = js.native
  def get_autoAcceptRequestToJoinLeave(): Boolean = js.native
  def get_canCurrentUserEditMembership(): Boolean = js.native
  def get_canCurrentUserManageGroup(): Boolean = js.native
  def get_canCurrentUserViewMembership(): Boolean = js.native
  def get_description(): String = js.native
  def get_onlyAllowMembersViewMembership(): Boolean = js.native
  def get_owner(): Principal = js.native
  def get_ownerTitle(): String = js.native
  def get_requestToJoinLeaveEmailSetting(): String = js.native
  def get_users(): UserCollection = js.native
  def set_allowMembersEditMembership(value: Boolean): Unit = js.native
  def set_allowRequestToJoinLeave(value: Boolean): Unit = js.native
  def set_autoAcceptRequestToJoinLeave(value: Boolean): Unit = js.native
  def set_description(value: String): Unit = js.native
  def set_onlyAllowMembersViewMembership(value: Boolean): Unit = js.native
  def set_owner(value: Principal): Unit = js.native
  def set_requestToJoinLeaveEmailSetting(value: String): Unit = js.native
  def update(): Unit = js.native
}

