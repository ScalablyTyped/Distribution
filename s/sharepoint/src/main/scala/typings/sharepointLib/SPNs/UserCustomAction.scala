package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.UserCustomAction")
@js.native
class UserCustomAction () extends ClientObject {
  def deleteObject(): scala.Unit = js.native
  def get_commandUIExtension(): java.lang.String = js.native
  def get_description(): java.lang.String = js.native
  def get_group(): java.lang.String = js.native
  def get_id(): Guid = js.native
  def get_imageUrl(): java.lang.String = js.native
  def get_location(): java.lang.String = js.native
  def get_name(): java.lang.String = js.native
  def get_registrationId(): java.lang.String = js.native
  def get_registrationType(): UserCustomActionRegistrationType = js.native
  def get_rights(): BasePermissions = js.native
  def get_scope(): UserCustomActionScope = js.native
  def get_scriptBlock(): java.lang.String = js.native
  def get_scriptSrc(): java.lang.String = js.native
  def get_sequence(): scala.Double = js.native
  def get_title(): java.lang.String = js.native
  def get_url(): java.lang.String = js.native
  def get_versionOfUserCustomAction(): java.lang.String = js.native
  def set_commandUIExtension(value: java.lang.String): scala.Unit = js.native
  def set_description(value: java.lang.String): scala.Unit = js.native
  def set_group(value: java.lang.String): scala.Unit = js.native
  def set_imageUrl(value: java.lang.String): scala.Unit = js.native
  def set_location(value: java.lang.String): scala.Unit = js.native
  def set_name(value: java.lang.String): scala.Unit = js.native
  def set_registrationId(value: java.lang.String): scala.Unit = js.native
  def set_registrationType(value: UserCustomActionRegistrationType): scala.Unit = js.native
  def set_rights(value: BasePermissions): scala.Unit = js.native
  def set_scriptBlock(value: java.lang.String): scala.Unit = js.native
  def set_scriptSrc(value: java.lang.String): scala.Unit = js.native
  def set_sequence(value: scala.Double): scala.Unit = js.native
  def set_title(value: java.lang.String): scala.Unit = js.native
  def set_url(value: java.lang.String): scala.Unit = js.native
  def update(): scala.Unit = js.native
}

