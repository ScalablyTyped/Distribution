package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.RoleDefinitionBindingCollection")
@js.native
class RoleDefinitionBindingCollection protected () extends ClientObjectCollection[RoleDefinition] {
  def this(context: ClientRuntimeContext) = this()
  def add(roleDefinition: RoleDefinition): scala.Unit = js.native
  def get_item(index: scala.Double): RoleDefinition = js.native
  def itemAt(index: scala.Double): RoleDefinition = js.native
  def remove(roleDefinition: RoleDefinition): scala.Unit = js.native
  def removeAll(): scala.Unit = js.native
}

@JSGlobal("SP.RoleDefinitionBindingCollection")
@js.native
object RoleDefinitionBindingCollection extends js.Object {
  def newObject(context: sharepointLib.SPNs.ClientRuntimeContext): sharepointLib.SPNs.RoleDefinitionBindingCollection = js.native
}

