package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.RoleDefinitionBindingCollection")
@js.native
class RoleDefinitionBindingCollection protected () extends ClientObjectCollection[RoleDefinition] {
  def this(context: ClientRuntimeContext) = this()
  def add(roleDefinition: RoleDefinition): Unit = js.native
  def get_item(index: Double): RoleDefinition = js.native
  def itemAt(index: Double): RoleDefinition = js.native
  def remove(roleDefinition: RoleDefinition): Unit = js.native
  def removeAll(): Unit = js.native
}

/* static members */
@JSGlobal("SP.RoleDefinitionBindingCollection")
@js.native
object RoleDefinitionBindingCollection extends js.Object {
  def newObject(context: ClientRuntimeContext): RoleDefinitionBindingCollection = js.native
}

