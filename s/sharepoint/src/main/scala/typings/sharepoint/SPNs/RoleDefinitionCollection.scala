package typings.sharepoint.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoleDefinitionCollection extends ClientObjectCollection[RoleDefinition] {
  def add(parameters: RoleDefinitionCreationInformation): RoleDefinition = js.native
  def getById(id: Double): RoleDefinition = js.native
  def getByName(name: String): RoleDefinition = js.native
  def getByType(roleType: RoleType): RoleDefinition = js.native
  def get_item(index: Double): RoleDefinition = js.native
  def itemAt(index: Double): RoleDefinition = js.native
}

