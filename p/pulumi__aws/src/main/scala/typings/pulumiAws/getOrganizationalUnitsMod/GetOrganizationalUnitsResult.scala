package typings.pulumiAws.getOrganizationalUnitsMod

import typings.pulumiAws.outputMod.organizations.GetOrganizationalUnitsChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOrganizationalUnitsResult extends js.Object {
  /**
    * List of child organizational units, which have the following attributes:
    */
  val childrens: js.Array[GetOrganizationalUnitsChildren] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val parentId: String = js.native
}

object GetOrganizationalUnitsResult {
  @scala.inline
  def apply(childrens: js.Array[GetOrganizationalUnitsChildren], id: String, parentId: String): GetOrganizationalUnitsResult = {
    val __obj = js.Dynamic.literal(childrens = childrens.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOrganizationalUnitsResult]
  }
}

