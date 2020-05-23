package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurableObject extends ClientObject {
  def breakRoleInheritance(copyRoleAssignments: Boolean, clearSubscopes: Boolean): Unit = js.native
  def get_firstUniqueAncestorSecurableObject(): SecurableObject = js.native
  def get_hasUniqueRoleAssignments(): Boolean = js.native
  def get_roleAssignments(): RoleAssignmentCollection = js.native
  def resetRoleInheritance(): Unit = js.native
}

