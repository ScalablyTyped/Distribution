package typings.atPulumiAws.typesInputMod.organizations

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationNonMasterAccount extends js.Object {
  /**
    * ARN of the root
    */
  var arn: js.UndefOr[Input[String]] = js.native
  /**
    * Email of the account
    */
  var email: js.UndefOr[Input[String]] = js.native
  /**
    * Identifier of the root
    */
  var id: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the policy type
    */
  var name: js.UndefOr[Input[String]] = js.native
}

object OrganizationNonMasterAccount {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    email: Input[String] = null,
    id: Input[String] = null,
    name: Input[String] = null
  ): OrganizationNonMasterAccount = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationNonMasterAccount]
  }
}

