package typings.atPulumiAws.organizationsGetOrganizationalUnitsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOrganizationalUnitsArgs extends js.Object {
  /**
    * The parent ID of the organizational unit.
    */
  val parentId: String = js.native
}

object GetOrganizationalUnitsArgs {
  @scala.inline
  def apply(parentId: String): GetOrganizationalUnitsArgs = {
    val __obj = js.Dynamic.literal(parentId = parentId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetOrganizationalUnitsArgs]
  }
}

