package typings.sharepoint.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.RoleAssignment")
@js.native
class RoleAssignment () extends ClientObject {
  def deleteObject(): Unit = js.native
  def get_member(): Principal = js.native
  def get_principalId(): Double = js.native
  def get_roleDefinitionBindings(): RoleDefinitionBindingCollection = js.native
  def importRoleDefinitionBindings(roleDefinitionBindings: RoleDefinitionBindingCollection): Unit = js.native
  def update(): Unit = js.native
}

