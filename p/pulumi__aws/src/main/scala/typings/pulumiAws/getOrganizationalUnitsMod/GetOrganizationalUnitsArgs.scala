package typings.pulumiAws.getOrganizationalUnitsMod

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
  @scala.inline
  implicit class GetOrganizationalUnitsArgsOps[Self <: GetOrganizationalUnitsArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setParentId(value: String): Self = this.set("parentId", value.asInstanceOf[js.Any])
  }
  
}

