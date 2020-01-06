package typings.atPulumiAws.organizationsOrganizationalUnitMod

import typings.atPulumiAws.typesInputMod.organizations.OrganizationalUnitAccount
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationalUnitState extends js.Object {
  /**
    * List of child accounts for this Organizational Unit. Does not return account information for child Organizational Units. All elements have these attributes:
    */
  val accounts: js.UndefOr[Input[js.Array[Input[OrganizationalUnitAccount]]]] = js.native
  /**
    * ARN of the organizational unit
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The name for the organizational unit
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * ID of the parent organizational unit, which may be the root
    */
  val parentId: js.UndefOr[Input[String]] = js.native
}

object OrganizationalUnitState {
  @scala.inline
  def apply(
    accounts: Input[js.Array[Input[OrganizationalUnitAccount]]] = null,
    arn: Input[String] = null,
    name: Input[String] = null,
    parentId: Input[String] = null
  ): OrganizationalUnitState = {
    val __obj = js.Dynamic.literal()
    if (accounts != null) __obj.updateDynamic("accounts")(accounts.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parentId != null) __obj.updateDynamic("parentId")(parentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationalUnitState]
  }
}

