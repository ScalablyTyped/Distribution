package typings.atPulumiAws.organizationsOrganizationalUnitMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrganizationalUnitArgs extends js.Object {
  /**
    * The name for the organizational unit
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * ID of the parent organizational unit, which may be the root
    */
  val parentId: Input[String]
}

object OrganizationalUnitArgs {
  @scala.inline
  def apply(parentId: Input[String], name: Input[String] = null): OrganizationalUnitArgs = {
    val __obj = js.Dynamic.literal(parentId = parentId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationalUnitArgs]
  }
}

