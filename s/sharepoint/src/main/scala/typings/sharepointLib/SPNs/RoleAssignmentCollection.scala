package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoleAssignmentCollection extends ClientObjectCollection[RoleAssignment] {
  def add(principal: Principal, roleBindings: RoleDefinitionBindingCollection): RoleAssignment = js.native
  def getByPrincipal(principalToFind: Principal): RoleAssignment = js.native
  def getByPrincipalId(principalId: scala.Double): RoleAssignment = js.native
  def get_groups(): GroupCollection = js.native
  def get_item(index: scala.Double): RoleAssignment = js.native
  def itemAt(index: scala.Double): RoleAssignment = js.native
}

