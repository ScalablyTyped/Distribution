package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.SecurableObject")
@js.native
class SecurableObject () extends ClientObject {
  def breakRoleInheritance(copyRoleAssignments: scala.Boolean, clearSubscopes: scala.Boolean): scala.Unit = js.native
  def get_firstUniqueAncestorSecurableObject(): SecurableObject = js.native
  def get_hasUniqueRoleAssignments(): scala.Boolean = js.native
  def get_roleAssignments(): RoleAssignmentCollection = js.native
  def resetRoleInheritance(): scala.Unit = js.native
}

