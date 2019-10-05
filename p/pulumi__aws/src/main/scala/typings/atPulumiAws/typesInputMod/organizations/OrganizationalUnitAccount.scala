package typings.atPulumiAws.typesInputMod.organizations

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrganizationalUnitAccount extends js.Object {
  /**
    * ARN of the organizational unit
    */
  var arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * Email of the account
    */
  var email: js.UndefOr[Input[String]] = js.undefined
  /**
    * Identifier of the organization unit
    */
  var id: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name for the organizational unit
    */
  var name: js.UndefOr[Input[String]] = js.undefined
}

object OrganizationalUnitAccount {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    email: Input[String] = null,
    id: Input[String] = null,
    name: Input[String] = null
  ): OrganizationalUnitAccount = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationalUnitAccount]
  }
}

