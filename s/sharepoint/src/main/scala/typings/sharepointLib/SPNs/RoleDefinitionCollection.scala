package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoleDefinitionCollection extends ClientObjectCollection[RoleDefinition] {
  def add(parameters: RoleDefinitionCreationInformation): RoleDefinition = js.native
  def getById(id: scala.Double): RoleDefinition = js.native
  def getByName(name: java.lang.String): RoleDefinition = js.native
  def getByType(roleType: RoleType): RoleDefinition = js.native
  def get_item(index: scala.Double): RoleDefinition = js.native
  def itemAt(index: scala.Double): RoleDefinition = js.native
}

