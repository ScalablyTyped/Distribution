package typings.pulumiAws.inputMod.organizations

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationAccount extends js.Object {
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
  /**
    * The status of the policy type as it relates to the associated root
    */
  var status: js.UndefOr[Input[String]] = js.native
}

object OrganizationAccount {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    email: Input[String] = null,
    id: Input[String] = null,
    name: Input[String] = null,
    status: Input[String] = null
  ): OrganizationAccount = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationAccount]
  }
}

