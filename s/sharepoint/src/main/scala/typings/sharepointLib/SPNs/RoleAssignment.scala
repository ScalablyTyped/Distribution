package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.RoleAssignment")
@js.native
class RoleAssignment () extends ClientObject {
  def deleteObject(): scala.Unit = js.native
  def get_member(): Principal = js.native
  def get_principalId(): scala.Double = js.native
  def get_roleDefinitionBindings(): RoleDefinitionBindingCollection = js.native
  def importRoleDefinitionBindings(roleDefinitionBindings: RoleDefinitionBindingCollection): scala.Unit = js.native
  def update(): scala.Unit = js.native
}

