package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.RoleDefinition")
@js.native
class RoleDefinition () extends ClientObject {
  def deleteObject(): scala.Unit = js.native
  def get_basePermissions(): BasePermissions = js.native
  def get_description(): java.lang.String = js.native
  def get_hidden(): scala.Boolean = js.native
  def get_id(): scala.Double = js.native
  def get_name(): java.lang.String = js.native
  def get_order(): scala.Double = js.native
  def get_roleTypeKind(): RoleType = js.native
  def set_basePermissions(value: BasePermissions): scala.Unit = js.native
  def set_description(value: java.lang.String): scala.Unit = js.native
  def set_name(value: java.lang.String): scala.Unit = js.native
  def set_order(value: scala.Double): scala.Unit = js.native
  def update(): scala.Unit = js.native
}

